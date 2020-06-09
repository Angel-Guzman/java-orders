package com.lambdaschool.crudyorders.models;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Orders
{
    @Column(nullable = false)
    private long ordnum;

    private double ordamount;
    private double advanceamount;

    @ManyToOne
    @JoinColumn(name = "custcode", nullable = false)
    private Customers customers;

    private String orderdescription;


}
