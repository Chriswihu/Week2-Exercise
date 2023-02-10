package facade;

import entities.Student;

import javax.persistence.*;
import java.util.Set;
import java.util.stream.Collectors;

public class StudentFacade {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    public void createStudent(Student s) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(s);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public Set<Student> getAllStudents(){
        EntityManager em = emf.createEntityManager();
        TypedQuery<Student> tq = em.createQuery("SELECT s FROM Student s", Student.class);
        Set<Student> students = tq.getResultList().stream().collect(Collectors.toSet());
        return students;
    }

    public static void main(String[] args) {
        StudentFacade sf = new StudentFacade();
        sf.getAllStudents().forEach(student -> System.out.println(student));

    }
}
