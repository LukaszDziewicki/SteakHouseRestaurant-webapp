package com.restaurant.SteakHouseRestaurant.model;

import javax.persistence.*;

@Entity
public class Reseravation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id")
    private Long id;

    @Column(name = "person_name")
    private String name;

    @Column(name = "person_surname")
    private String surname;

    @Column(name = "person_email")
    private String email;

    @Column(name = "restaurant_location")
    private String location;

    @Column(name = "persons_per_table")
    private String table;

    @Column(name = "hour")
    private String hour;

    @Column(name = "date")
    private String date;

    @Column(name = "howLong")
    private String howLong;

    @Column(name = "message")
    private String message;

    public Reseravation() {
    }

    public Reseravation(Long id, String name, String surname, String email, String location, String table, String hour, String date, String howLong, String message) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.location = location;
        this.table = table;
        this.hour = hour;
        this.date = date;
        this.howLong = howLong;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHowLong() {
        return howLong;
    }

    public void setHowLong(String howLong) {
        this.howLong = howLong;
    }

    @Override
    public String toString() {
        return "Reseravation nr. "+ id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", location='" + location + '\'' +
                ", table='" + table + '\'' +
                ", hour='" + hour + '\'' +
                ", date='" + date + '\'' +
                ", howLong='" + howLong + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
