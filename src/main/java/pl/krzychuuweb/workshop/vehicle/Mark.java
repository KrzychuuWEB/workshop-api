package pl.krzychuuweb.workshop.vehicle;

import javax.persistence.*;

@Entity
@Table(name = "marks")
class Mark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false)
    private String mark;

    public Long getId() {
        return id;
    }

    void setId(Long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    void setMark(final String mark) {
        this.mark = mark;
    }
}
