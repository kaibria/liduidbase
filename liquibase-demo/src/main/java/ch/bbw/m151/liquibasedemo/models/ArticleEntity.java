package ch.bbw.m151.liquibasedemo.models;

import java.sql.*;
import java.util.UUID ;

import jakarta.persistence.*;
import lombok.Getter ;
import lombok.Setter ;
import org.hibernate.annotations.CreationTimestamp;


/**
 * Entity Klass für Articles
 */
@Getter
@Setter
@Entity
@Table(name = "articles", indexes = {@Index(name = "title_idx", columnList = "title")})
public class ArticleEntity {

    //Id des Artikels
    @Id
    @GeneratedValue
    @Column ( columnDefinition = "uuid" )
    private UUID id ;

    //Artikel Titel
    @Column ( nullable = false)
    String title;

    //Artikel Text
    @Column
    String text;

    //Timestamp wann es erstellt wurde
    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    Timestamp createdTs;

    //Version
    @Column
    @Version
    int version;

    //Schlüssel für Category
    @Column
    int category;

}