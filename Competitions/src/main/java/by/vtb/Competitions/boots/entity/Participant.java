package by.vtb.Competitions.boots.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "participant")
public class Participant {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstname;
    private String lastname;
    @OneToMany
    private List<Sport> sports;
    private String sex;
    private int growth;
    private double weight;
    private Date dateBirth;
    private String passport;
    @ManyToOne
    private Trainer trainer;
    
    public int getId() {
        return id;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public List<Sport> getSports() {
        return sports;
    }
    public String getSex() {
        return sex;
    }
    public int getGrowth() {
        return growth;
    }
    public double getWeight() {
        return weight;
    }
    public Date getDateBirth() {
        return dateBirth;
    }
    public String getPassport() {
        return passport;
    }
    public Trainer getTrainer() {
        return trainer;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setSports(List<Sport> sports) {
        this.sports = sports;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public void setGrowth(int growth) {
        this.growth = growth;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }
    public void setPassport(String passport) {
        this.passport = passport;
    }
    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }
    
    
}
