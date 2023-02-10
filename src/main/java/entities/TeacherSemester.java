package entities;

import javax.persistence.*;

@Entity
//@NamedQuery(name = "TeacherSemesterEntity.deleteAllRows", query = "DELETE from TEACHER_SEMESTER ")
@Table(name = "TEACHER_SEMESTER", schema = "ExamPreparationJPQL")
public class TeacherSemester {
    @Id
    @ManyToOne
    @JoinColumn(name = "teaching_ID", referencedColumnName = "ID", nullable = false)
    private Semester semesterByTeachingId;
    @ManyToOne
    @JoinColumn(name = "teachers_ID", referencedColumnName = "ID", nullable = false)
    private Teacher teacherByTeachersId;

    public TeacherSemester() {
    }

    public Semester getSemesterByTeachingId() {
        return semesterByTeachingId;
    }

    public void setSemesterByTeachingId(Semester semesterByTeachingId) {
        this.semesterByTeachingId = semesterByTeachingId;
    }

    public Teacher getTeacherByTeachersId() {
        return teacherByTeachersId;
    }

    public void setTeacherByTeachersId(Teacher teacherByTeachersId) {
        this.teacherByTeachersId = teacherByTeachersId;
    }
}
