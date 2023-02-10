package entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "TEACHER", schema = "ExamPreparationJPQL")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "FIRST_NAME", nullable = false, length = 45)
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false, length = 45)
    private String lastName;

//    @OneToMany(mappedBy = "teacherByTeachersId")
//    private Collection<TeacherSemester> teacherSemestersById;

    public Teacher() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public Collection<TeacherSemester> getTeacherSemestersById() {
//        return teacherSemestersById;
//    }
//
//    public void setTeacherSemestersById(Collection<TeacherSemester> teacherSemestersById) {
//        this.teacherSemestersById = teacherSemestersById;
}
