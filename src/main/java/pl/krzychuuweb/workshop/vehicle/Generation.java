package pl.krzychuuweb.workshop.vehicle;

import javax.persistence.*;

@Entity
@Table(name = "generations")
class Generation {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;
    @Column(nullable = false)
    private String name;

    public Long getId() {
        return id;
    }

    void setId(Long id) {
        this.id = id;
    }

    public Model getModel() {
        return model;
    }

    void setModel(final Model model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    void setName(final String name) {
        this.name = name;
    }
}
