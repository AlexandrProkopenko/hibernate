package xml.onetoone.entity;

public class Car {

    private Long id;
    private String model;
    private String number;
    private Man man;

    public Car() {
    }

    public Car(String model, String number, Man man) {
        this.model = model;
        this.number = number;
        this.man = man;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Man getMan() {
        return man;
    }

    public void setMan(Man man) {
        this.man = man;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", number='" + number + '\'' +
                ", man=" + man.getName() +
                '}';
    }
}
