package com.example.demo.entities;

import javax.persistence.*;

@Entity
public class CustomerProduct  {

        @EmbeddedId
        CustomerProductKey id;

        @ManyToOne
        @MapsId("customerId")
        @JoinColumn(name = "customer_id")
        Customer customer;

        @ManyToOne
        @MapsId("productId")
        @JoinColumn(name = "product_id")
        Product product;

        public CustomerProduct(CustomerProductKey id, Customer customer, Product product) {
                this.id = id;
                this.customer = customer;
                this.product = product;
        }

        public CustomerProduct() {}

        public CustomerProductKey getId() {
                return id;
        }

        public void setId(CustomerProductKey id) {
                this.id = id;
        }

        public Customer getCustomer() {
                return customer;
        }

        public void setCustomer(Customer customer) {
                this.customer = customer;
        }

        public Product getProduct() {
                return product;
        }

        public void setProduct(Product product) {
                this.product = product;
        }
}
