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
    private String model;

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

    public String getModel() {
        return model;
    }

    void setModel(final String model) {
        this.model = model;
    }
}
