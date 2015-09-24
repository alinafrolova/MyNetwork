package net.frolova.api.model;

import javax.persistence.*;import javax.persistence.Column;import javax.persistence.Entity;import javax.persistence.GeneratedValue;import javax.persistence.Id;import javax.persistence.Table;import java.lang.Integer;import java.lang.String;

/**
 * Created by Frolova.A on 9/23/15.
 */
@Entity
@Table(name = "HOBBIES")

public class Hobby {
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "DESCRIPTION")
    private String description;

    public void settitle(String title) {
        this.title = title;
    }
    public void setdescription(String description) {
        this.description = description;
    }


}
