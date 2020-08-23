package com.programadorTaino.sentiriaAPI.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "creation_date")
    private Date creationDate;

    @ManyToOne
    @JoinColumn(name="emotion_id", nullable = false)
    private Emotion emotion;

    @Column(name = "tags")
    private String tags;

    @Column(name = "image")
    private String image;

    @ManyToOne
    @JoinColumn(name="status_id", nullable = false)
    private Status status;

}
