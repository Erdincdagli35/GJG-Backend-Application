package com.example.GJG.model;

import java.io.Serializable;
import java.time.LocalTime;
import javax.persistence.*;

@Entity
@Table(name="score")
public class Score implements Serializable {

    //variables : userID,scoreWorth,timestamp
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scoreID;

    @Column(name="score_worth")
    private double scoreWorth;

    //specific variable : used LocalTime Library for "timestamp"
    @Column(name="timestamp")
    LocalTime timestamp = LocalTime.now();

    //Created Default Constructor
    public Score() {
    }

    //Created Constructor for Score
    public Score(Long scoreID, double scoreWorth, LocalTime timestamp) {
        this.scoreID = scoreID;
        this.scoreWorth = scoreWorth;
        this.timestamp = timestamp;
    }

    //Getter and Setter
    public double getScoreWorth() {
        return scoreWorth;
    }
    public void setScoreWorth(double scoreWorth) {
        this.scoreWorth = scoreWorth;
    }
    public LocalTime getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(LocalTime timestamp) {
        this.timestamp = timestamp;
    }
    public Long getScoreID() {
        return scoreID;
    }
    public void setScoreID(Long scoreID) {
        this.scoreID = scoreID;
    }

}
