package ch.bbw.m151.liquibasedemo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * Entity Klass für Comments
 */
@Getter
@Setter
@Entity
@Table(name = "comments")
public class CommentEntity {
    //Id von Kommentar
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    //Text für den Kommentar
    @Column(nullable = false)
    private String text;

    //ManyToOne verbindung zu Articles um mehrere Zeilen zu haben
    @ManyToOne(cascade = CascadeType.ALL)
    private ArticleEntity article;

}
