package org.sglaser.mentor.dto;

import java.time.LocalDate;
import java.util.Objects;

public class EmployeeRegistrationDto {
    
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String title;
    private String team;
    private String beMentor;
    private String beMentee;
    private LocalDate regDate;

    public EmployeeRegistrationDto() {
    }

    public EmployeeRegistrationDto(String firstName, String lastName, String email, String password, String title, String team, String beMentor, String beMentee, LocalDate regDate) {
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

    public EmployeeRegistrationDto firstName(String firstName) {
        setFirstName(firstName);
        return this;
    }

    public EmployeeRegistrationDto lastName(String lastName) {
        setLastName(lastName);
        return this;
    }

    public EmployeeRegistrationDto email(String email) {
        setEmail(email);
        return this;
    }

    public EmployeeRegistrationDto password(String password) {
        setPassword(password);
        return this;
    }

    public EmployeeRegistrationDto title(String title) {
        setTitle(title);
        return this;
    }

    public EmployeeRegistrationDto team(String team) {
        setTeam(team);
        return this;
    }

    public EmployeeRegistrationDto beMentor(String beMentor) {
        setBeMentor(beMentor);
        return this;
    }

    public EmployeeRegistrationDto beMentee(String beMentee) {
        setBeMentee(beMentee);
        return this;
    }

    public EmployeeRegistrationDto regDate(LocalDate regDate) {
        setRegDate(regDate);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EmployeeRegistrationDto)) {
            return false;
        }
        EmployeeRegistrationDto employeeRegistrationDto = (EmployeeRegistrationDto) o;
        return Objects.equals(firstName, employeeRegistrationDto.firstName) && Objects.equals(lastName, employeeRegistrationDto.lastName) && Objects.equals(email, employeeRegistrationDto.email) && Objects.equals(password, employeeRegistrationDto.password) && Objects.equals(title, employeeRegistrationDto.title) && Objects.equals(team, employeeRegistrationDto.team) && Objects.equals(beMentor, employeeRegistrationDto.beMentor) && Objects.equals(beMentee, employeeRegistrationDto.beMentee) && Objects.equals(regDate, employeeRegistrationDto.regDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, password, title, team, beMentor, beMentee, regDate);
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