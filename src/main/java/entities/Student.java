package entities;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT", schema = "ExamPreparationJPQL")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "FIRSTNAME", nullable = false, length = 30)
    private String firstName;

    @Column(name = "LASTNAME", nullable = false, length = 30)
    private String lastName;

    @Basic
    @Column(name = "CURRENTSEMESTER_ID")
    private Long currentsemesterId;
//    @ManyToOne
//    @JoinColumn(name = "CURRENTSEMESTER_ID", unique = true)
//    private Semester currentsemesterId;

    public Student(String firstName, String lastName, Semester currentsemesterId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.currentsemesterId = currentsemesterId.getId();
    }

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getCurrentsemesterId() {
        return currentsemesterId;
    }

    public void setCurrentsemesterId(Semester currentsemesterId) {
        this.currentsemesterId = currentsemesterId.getId();
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Student that = (Student) o;
//
//        if (currentsemesterId != null ? !currentsemesterId.equals(that.currentsemesterId) : that.currentsemesterId != null)
//            return false;
//
//        return true;
//    }

//    @Override
//    public int hashCode() {
//        return currentsemesterId != null ? currentsemesterId.hashCode() : 0;
//    }

//    public Semester getSemesterByCurrentsemesterId() {
//        return semesterByCurrentsemesterId;
//    }
//
//    public void setSemesterByCurrentsemesterId(Semester semesterByCurrentsemesterId) {
//        this.semesterByCurrentsemesterId = semesterByCurrentsemesterId;
//    }

    @Override
    public String toString() {
        return "Student: " +
                "id = " + id +
                ", firstName = " + firstName + '\'' +
                ", lastName = " + lastName + '\'' +
                ", currentsemesterId = " + currentsemesterId;
    }
}
