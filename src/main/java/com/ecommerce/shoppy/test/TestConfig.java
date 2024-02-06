package com.ecommerce.shoppy.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ecommerce.shoppy.entities.Customer;
import com.ecommerce.shoppy.entities.Order;
import com.ecommerce.shoppy.entities.Products;
import com.ecommerce.shoppy.entities.UserModel;
import com.ecommerce.shoppy.enums.OrderStatus;
import com.ecommerce.shoppy.repositories.CustomerRepository;
import com.ecommerce.shoppy.repositories.OrderRepository;
import com.ecommerce.shoppy.repositories.ProductRepository;
import com.ecommerce.shoppy.repositories.UserRepository;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    private final CustomerRepository customerRepository;
    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;

    public TestConfig(CustomerRepository customerRepository, OrderRepository orderRepository, ProductRepository productRepository) {
        this.customerRepository = customerRepository;
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        
        Customer cust001 = new Customer("Zéca Camergo", "zecota@gmai.com", "344ttd", "Rua da Amargura, 344", "555666");
        Customer cust002 = new Customer("Benicio del Toro","toroto@gmai.com", "344ttd", "Rua da Amargura, 344", "555666");
        Customer cust003 = new Customer("Benji Toba", "zsfefsdf@gmai.com", "344ttd", "Rua da Amargura, 344", "555666");
        Customer cust004 = new Customer("Carlota Maricota", "cacara@gmai.com", "344ttd", "Rua da Amargura, 344", "555666");

        Products prod01 = new Products("Garrafa", "Garrafinha vagabunda", 30, 12, 50.0, "http://img.com");
        Products prod02 = new Products("Bazuca", "Bazukinha básica para carregar na bolsa", 34530, 22, 3300.0, "http://img.com");

        Order oor01 = new Order(cust001, 0.0, 0.0, 0.0, new ArrayList<>(), Instant.parse("2024-09-27T08:08:08Z"), OrderStatus.AWAITING_PAYMENT);
        Order oor02 = new Order(cust002, 80.0, 0.0, 0.0, new ArrayList<>(), Instant.parse("2024-09-27T08:08:08Z"), OrderStatus.SENT);
        Order oor999 = new Order(cust003, prod02.getPrice(), 0.0, 0.0, new ArrayList<>(), Instant.parse("2024-09-27T08:08:08Z"), OrderStatus.PICKING);

        customerRepository.saveAll(Arrays.asList(cust001, cust002, cust003));
        orderRepository.saveAll(Arrays.asList(oor01, oor02, oor999));
        productRepository.saveAll(Arrays.asList(prod01, prod02));
    }
}