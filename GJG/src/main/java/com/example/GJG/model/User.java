package com.example.GJG.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="user")
public  class User implements Serializable {

    //variables : userID,displayName,points,rank
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userID;

    @Column(name="display_name")
    private String displayName;

    @Column(name = "points")
    private  int points;

    //@Column(name = "rank")
    //private int rank ;

    //OneToMany : One User - Many Score
    @OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name="user_id_fk",referencedColumnName = "user_id")
    private Set<Score> score ;

    //Created Default Constructor
    public User() {
    }

    //Created Constructor for User
    public User(int userID ,String displayName, int points) {
        this.userID = userID;
        this.displayName = displayName;
        this.points = points;
        //this.rank = rank;
    }

    //Getter and Setter
    public int getUserID() {return userID; }
    public void setUserID(int userID) {
        this.userID = userID;
    }
    public String getDisplayName() {
        return displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    public Set<Score> getScore() {
        return score;
    }
    public void setScore(Set<Score> score) {
        this.score = score;
    }

}
