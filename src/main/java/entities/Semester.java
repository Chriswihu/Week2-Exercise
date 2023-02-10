package entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "SEMESTER", schema = "ExamPreparationJPQL")
public class Semester {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "DESCRIPTION", nullable = false, length = 45)
    private String description;

    @Column(name = "name", nullable = false, length = 45)
    private String name;

    public Semester(){

    }

    public Semester(Long id, String description, String name) {
        this.id = id;
        this.description = description;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
