package onetomany.entity;

import java.util.List;


public class SimcardBox {

    private Integer id;
    private String title;
    private Integer capacity;
    private List<Simcard> simcardList;

    public SimcardBox() {
    }

    public SimcardBox(String title, Integer capacity, List<Simcard> simcardList) {
        this.title = title;
        this.capacity = capacity;
        this.simcardList = simcardList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public List<Simcard> getSimcardList() {
        return simcardList;
    }

    public void setSimcardList(List<Simcard> simcardList) {
        this.simcardList = simcardList;
    }

    @Override
    public String toString() {
        return "SimcardBox{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", capacity=" + capacity +
                ", simcardList=" + simcardList +
                '}';
    }
}
