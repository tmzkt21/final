package org.zerock.j08.entity;

import javax.persistence.*;

@Entity
public class FoodTruck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tno;

    @ManyToOne
    private FoodMenu mainMenu;
}
