package com.rest.demo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@RestController
public class DemoController {

    @Autowired
    public Demorepo repo;

    @RequestMapping("/")
    public List<Customer> getCustomer(){
        List<Customer> customers = List.of(
                new Customer(1L, "pradeepa"),
                new Customer(2L, "Raksha"),
                new Customer(3L, "Remi")
        );
        return repo.saveAll(customers);
    }
    @RequestMapping("/add")
    public List<Customer> addCustomer(){
        Customer c=new Customer(4L,"Divya");
                repo.save(c);
                return repo.findAll();
    }
}
