package gour.indrajeet.repository;

import gour.indrajeet.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<Customer>();
        Customer customer = new Customer();
        customer.setFirstname("Indrajeet");
        customer.setLastname("Gour");

        customers.add(customer);
        return customers;
    }

}
