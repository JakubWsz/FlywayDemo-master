CREATE TABLE customer
(
    id         INT     NOT NULL PRIMARY KEY,
    name       VARCHAR NOT NULL,
    surname    VARCHAR NOT NULL,
    age        INT     NOT NULL,
    email      VARCHAR NOT NULL,
    payment    DECIMAL NOT NULL,
    vendor_id  INT     NOT NULL,
    product_id INT     NOT NULL
);

CREATE TABLE vendor
(
    id           INT     NOT NULL PRIMARY KEY,
    company_name VARCHAR NOT NULL,
    customer_id  INT     NOT NULL,
    product_id   INT     NOT NULL
);

CREATE TABLE product
(
    id          INT     NOT NULL PRIMARY KEY,
    name        VARCHAR NOT NULL,
    price       DECIMAL NOT NULL,
    customer_id INT     NOT NULL,
    vendor_id   INT     NOT NULL
);