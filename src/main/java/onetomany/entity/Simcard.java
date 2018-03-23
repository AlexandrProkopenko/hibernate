package onetomany.entity;

public class Simcard {

    private Integer id;
    private String operator;
    private Integer number;
    private Double balance;
    private SimcardBox box;

    public Simcard(String operator, Integer number, Double balance, SimcardBox box) {
        this.operator = operator;
        this.number = number;
        this.balance = balance;
        this.box = box;
    }

    public Simcard(String operator, Integer number, Double balance) {
        this.operator = operator;
        this.number = number;
        this.balance = balance;
    }

    public Simcard() {
    }

    public SimcardBox getBox() {
        return box;
    }

    public void setBox(SimcardBox box) {
        this.box = box;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Simcard{" +
                "id=" + id +
                ", operator='" + operator + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }
}
