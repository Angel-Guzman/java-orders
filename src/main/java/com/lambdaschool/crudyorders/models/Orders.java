package com.lambdaschool.crudyorders.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders
{
    @Column(nullable = false)
    private long ordnum;

    private double ordamount;
    private double advanceamount;

    @Column(nullable = false)
    private long custcode;

    private String orderdescription;
}
