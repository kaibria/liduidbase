package ch.bbw.m151.liquibasedemo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * Entity Klasse für Category
 */
@Getter
@Setter
@Entity
@Table(name = "category")
public class CategoryEntity {

    //Category name
    @Id
    private String name;

    //Category description
    @Column
    private String description;
}
