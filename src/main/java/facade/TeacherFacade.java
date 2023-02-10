package facade;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TeacherFacade {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    public static void main(String[] args) {
        TeacherFacade facade = new TeacherFacade();
    }
}
