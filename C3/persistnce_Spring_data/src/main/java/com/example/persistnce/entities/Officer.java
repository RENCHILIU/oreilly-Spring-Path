package com.example.persistnce.entities;

import javax.persistence.*;

//TODO: hibernate by default reads the @Entity class and generates a database schema for you !
//TODO: so the data.sql and schema.sql will be ignored
//TODO: you have to do the config in the application.yml
@Entity
@Table(name = "officers")
public class Officer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; //TODO: using wrapper class instead of int, for hiberate .

    @Enumerated(EnumType.STRING)
    private Rank rank;

    @Column(name = "first_name", nullable = false)
    private String first;

    @Column(name = "last_name", nullable = false)
    private String last;

    public Officer(Rank rank, String first, String last) {
        this.rank = rank;
        this.first = first;
        this.last = last;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public Officer() {}

    public Officer(Integer id, Rank rank, String first, String last) {
        this.id = id;
        this.rank = rank;
        this.first = first;
        this.last = last;
    }
}
