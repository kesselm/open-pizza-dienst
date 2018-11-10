package de.hanser.buch.opiz.domain;

import javax.persistence.*;

/**
 * @project Opiz
 * @author${user} on ${Date}.
 */
@Entity
@Table(name="pizza")
public class Pizza {

    private Integer id;
    private String name;

    public Pizza(){
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId(){
        return id;
    }

    public void setId(Integer anId){
        this.id = anId;
    }

    @Column(name = "name")
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


}
