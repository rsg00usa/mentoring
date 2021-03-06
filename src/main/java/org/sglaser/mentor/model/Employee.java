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
    private String password;
    private String title;    
    private String team;
    @Column(name = "bementor")
    private String beMentor;
    @Column(name = "bementee")
    private String beMentee;
    @Column(name = "registerdate")
    private LocalDate regDate;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String email, String password, String title, String team, String beMentor, String beMentee, LocalDate regDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.title = title;
        this.team = team;
        this.beMentor = beMentor;
        this.beMentee = beMentee;
        this.regDate = regDate;
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

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getBeMentor() {
        return this.beMentor;
    }

    public void setBeMentor(String beMentor) {
        this.beMentor = beMentor;
    }

    public String getBeMentee() {
        return this.beMentee;
    }

    public void setBeMentee(String beMentee) {
        this.beMentee = beMentee;
    }

    public LocalDate getRegDate() {
        return this.regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    public Employee firstName(String firstName) {
        setFirstName(firstName);
        return this;
    }

    public Employee lastName(String lastName) {
        setLastName(lastName);
        return this;
    }

    public Employee email(String email) {
        setEmail(email);
        return this;
    }

    public Employee password(String password) {
        setPassword(password);
        return this;
    }

    public Employee title(String title) {
        setTitle(title);
        return this;
    }

    public Employee team(String team) {
        setTeam(team);
        return this;
    }

    public Employee beMentor(String beMentor) {
        setBeMentor(beMentor);
        return this;
    }

    public Employee beMentee(String beMentee) {
        setBeMentee(beMentee);
        return this;
    }

    public Employee regDate(LocalDate regDate) {
        setRegDate(regDate);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            ", title='" + getTitle() + "'" +
            ", team='" + getTeam() + "'" +
            ", beMentor='" + getBeMentor() + "'" +
            ", beMentee='" + getBeMentee() + "'" +
            ", regDate='" + getRegDate() + "'" +
            "}";
    }    
}