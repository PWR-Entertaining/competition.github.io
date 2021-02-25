package by.vtb.Competitions.boots.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "place")
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Competition competition;
    @ManyToOne
    private Participant participant;
    
    public int getId() {
        return id;
    }
    public Competition getCompetition() {
        return competition;
    }
    public Participant getParticipant() {
        return participant;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setCompetition(Competition competition) {
        this.competition = competition;
    }
    public void setParticipant(Participant participant) {
        this.participant = participant;
    }
    
}
