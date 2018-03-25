package annotations.onetomany.entity;

import javax.persistence.*;

@Entity
@Table(name = "toys")
public class Toy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "toy_id")
    private Long id;

    @Column(name = "toy_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Child owner;

    public Toy() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Child getOwner() {
        return owner;
    }

    public void setOwner(Child owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", owner=" + owner +
                '}';
    }
}
