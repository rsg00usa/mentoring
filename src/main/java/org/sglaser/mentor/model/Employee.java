package org.sglaser.mentor.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Id
    private String email;
    private String title;    
    private String team;
    private String mentor;
    private String mentee;
    @Column(name = "createdate")
    private LocalDate regDate;

    public Employee () {
        
    }

    public Employee(String firstName, String lastName, String email, String title, String team, String mentor, String mentee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.title = title;
        this.team = team;
        this.mentor = mentor;
        this.mentee = mentee;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTeam() {
        return this.team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getMentor() {
        return this.mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public String getMentee() {
        return this.mentee;
    }

    public void setMentee(String mentee) {
        this.mentee = mentee;
    }


    public LocalDate getRegDate() {
        return this.regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }
 
    @Override
    public String toString() {
        return "{" +
            " email='" + getEmail() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", title='" + getTitle() + "'" +
            ", team='" + getTeam() + "'" +
            ", mentor='" + getMentor() + "'" +
            ", mentee='" + getMentee() + "'" +
            "}";
    }
}