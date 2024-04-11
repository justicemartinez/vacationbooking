package com.example.demo.BootStrapData;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Customer;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class BootStrapData {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private DivisionRepository divisionRepository;
    @PostConstruct
    public void checkDataEmpty() {

        if(customerRepository.count() == 1) {
            Customer customer1 = new Customer();
            customer1.setFirstName("Joe");
            customer1.setLastName("Peluso");
            customer1.setAddress("111 Mountain");
            customer1.setPostal_code("11111");
            customer1.setPhone("(111) 111-1111");
            customer1.setDivision(divisionRepository.findAll().get(1));
            customer1.setCreate_date(new Date());
            customer1.setLast_update(new Date());

            Customer customer2 = new Customer();
            customer2.setFirstName("John");
            customer2.setLastName("Quinn");
            customer2.setAddress("222 Penn");
            customer2.setPostal_code("11111");
            customer2.setPhone("(222) 222-2222");
            customer2.setDivision(divisionRepository.findAll().get(2));
            customer2.setCreate_date(new Date());
            customer2.setLast_update(new Date());

            Customer customer3 = new Customer();
            customer3.setFirstName("Nick");
            customer3.setLastName("Nist");
            customer3.setAddress("333 Albion");
            customer3.setPostal_code("11111");
            customer3.setPhone("(333) 333-3333");
            customer3.setDivision(divisionRepository.findAll().get(3));
            customer3.setCreate_date(new Date());
            customer3.setLast_update(new Date());

            Customer customer4 = new Customer();
            customer4.setFirstName("Andy");
            customer4.setLastName("Hester");
            customer4.setAddress("444 Colfax");
            customer4.setPostal_code("11111");
            customer4.setPhone("(444) 444-4444");
            customer4.setDivision(divisionRepository.findAll().get(4));
            customer4.setCreate_date(new Date());
            customer4.setLast_update(new Date());

            Customer customer5 = new Customer();
            customer5.setFirstName("Schuyler");
            customer5.setLastName("Conover");
            customer5.setAddress("555 Essex");
            customer5.setPostal_code("11111");
            customer5.setPhone("(555) 555-5555");
            customer5.setDivision(divisionRepository.findAll().get(5));
            customer5.setCreate_date(new Date());
            customer5.setLast_update(new Date());

            customerRepository.save(customer1);
            customerRepository.save(customer2);
            customerRepository.save(customer3);
            customerRepository.save(customer4);
            customerRepository.save(customer5);

            System.out.println("Example Customers Added to Database");
        } else {
            System.out.println("Customers already exist in the database.");
        }
    }
}
