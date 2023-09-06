package pl.zste.rest.model;

import jakarta.persistence.*;

@Entity
@NamedQueries({@NamedQuery(name = "FindPhotoOfStudent", query = "select p from StudentPhoto p where p.student.id = :studentId")})
public class StudentPhoto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    private Long version;

    @Column(length = 1048576, nullable = true, columnDefinition = "VARBINARY(MAX)")
    @Lob
    private byte[] photo;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Student student;

    public Long getId() {
        return id;
    }

    public Long getVersion() {
        return version;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
