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
@Table(name = "trainer")
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String documentTrainer;
    private String firstname;
    private String lastname;
    @OneToMany
    private List<Sport> sports;
    private String organization;
    private  Date dateBirth;
    private String passport;
    
    public int getId() {
        return id;
    }
    public String getDocumentTrainer() {
        return documentTrainer;
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
    public String getOrganization() {
        return organization;
    }
    public Date getDateBirth() {
        return dateBirth;
    }
    public String getPassport() {
        return passport;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setDocumentTrainer(String documentTrainer) {
        this.documentTrainer = documentTrainer;
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
    public void setOrganization(String organization) {
        this.organization = organization;
    }
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }
    public void setPassport(String passport) {
        this.passport = passport;
    }
    
    
}
