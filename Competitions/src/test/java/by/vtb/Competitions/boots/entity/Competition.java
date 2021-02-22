package by.vtb.Competitions.boots.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "competition")
public class Competition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date date;
    @OneToMany
    private List<User> responsible;
    @OneToMany
    private List<Sport> sports;
    private String place;
    
    public int getId() {
        return id;
    }
    public Date getDate() {
        return date;
    }
    public List<User> getResponsible() {
        return responsible;
    }
    public List<Sport> getSports() {
        return sports;
    }
    public String getPlace() {
        return place;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setResponsible(List<User> responsible) {
        this.responsible = responsible;
    }
    public void setSports(List<Sport> sports) {
        this.sports = sports;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    
}
