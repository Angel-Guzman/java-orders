package com.lambdaschool.crudyorders.repositories;

import com.lambdaschool.crudyorders.models.Customers;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<Customers, Long>
{
}
