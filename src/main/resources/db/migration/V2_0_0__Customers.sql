CREATE TABLE customer_product
(
    customer_id int NOT NULL,
    product_id  int NOT NULL,
    primary key (customer_id, product_id)
);


ALTER TABLE vendor
    ADD CONSTRAINT fk_customer_product FOREIGN KEY (product_id) REFERENCES product (id);

ALTER TABLE vendor
    drop column customer_id;

ALTER TABLE product
    add CONSTRAINT fk_vendor_customer FOREIGN KEY (customer_id) REFERENCES customer (id);

alter table vendor
    drop product_id;

alter table customer
    drop product_id;

alter table customer
    drop vendor_id;