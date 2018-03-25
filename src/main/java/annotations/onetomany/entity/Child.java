package annotations.onetomany.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Children")
public class Child {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_child")
    private Long id;

    @Column(name = "child_name")
    private String name;

    @Column(name="chilg_age")
    private Integer age;

    @OneToMany(mappedBy = "owner")
    private List<Toy> toys;

    public Child() {
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Toy> getToys() {
        return toys;
    }

    public void setToys(List<Toy> toys) {
        this.toys = toys;
    }

    @Override
    public String toString() {
        return "Child{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", toys=" + toys +
                '}';
    }
}
