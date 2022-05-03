package pl.krzychuuweb.workshop.vehicle;

import javax.persistence.*;

@Entity
@Table(name = "models")
class Model {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "mark_id")
    private Mark mark;
    @Column(nullable = false)
    private String name;

    public Long getId() {
        return id;
    }

    void setId(Long id) {
        this.id = id;
    }

    public Mark getMark() {
        return mark;
    }

    void setMark(final Mark mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    void setName(final String name) {
        this.name = name;
    }
}
