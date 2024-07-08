package com.example.demo.BootStrapData;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Customer;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class BootstrapData {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private DivisionRepository divisionRepository;

    @PostConstruct
    public void loadInitialData() {

        if(customerRepository.count() == 1) {



            Customer customer1 = new Customer();
            customer1.setFirstName("Pablo");
            customer1.setLastName("Sondra");
            customer1.setPostal_code("45678");
            customer1.setAddress("444 Ave");
            customer1.setPhone("(512)313-1234");
            customer1.setDivision(divisionRepository.findAll().get(7));
            customer1.setCreate_date(new Date());
            customer1.setLast_update(new Date());

            Customer customer2 = new Customer();
            customer2.setFirstName("Lucas");
            customer2.setLastName("Escudo");
            customer2.setPostal_code("78910");
            customer2.setAddress("888 Ave");
            customer2.setPhone("(591)321-1481");
            customer2.setDivision(divisionRepository.findAll().get(7));
            customer2.setCreate_date(new Date());
            customer2.setLast_update(new Date());

            Customer customer3 = new Customer();
            customer3.setFirstName("Troy");
            customer3.setLastName("Will");
            customer3.setPostal_code("50123");
            customer3.setAddress("999 Ave");
            customer3.setPhone("(591)123-9101");
            customer3.setDivision(divisionRepository.findAll().get(5));
            customer3.setCreate_date(new Date());
            customer3.setLast_update(new Date());

            Customer customer4 = new Customer();
            customer4.setFirstName("Ernest");
            customer4.setLastName("Machine");
            customer4.setPostal_code("51235");
            customer4.setPhone("(512)333-1121");
            customer4.setAddress("414 Ave");
            customer4.setDivision(divisionRepository.findAll().get(2));
            customer4.setCreate_date(new Date());
            customer4.setLast_update(new Date());

            Customer customer5 = new Customer();
            customer5.setFirstName("Kyle");
            customer5.setLastName("Little");
            customer5.setPostal_code("51234");
            customer5.setAddress("591 Ave");
            customer5.setPhone("(812)123-3141");
            customer5.setDivision(divisionRepository.findAll().get(3));
            customer5.setCreate_date(new Date());
            customer5.setLast_update(new Date());

            customerRepository.save(customer1);
            customerRepository.save(customer2);
            customerRepository.save(customer3);
            customerRepository.save(customer4);
            customerRepository.save(customer5);

            System.out.println("Sample customers added!");
        } else {
            System.out.println("Sample customers already exist!");
        }
    }
}