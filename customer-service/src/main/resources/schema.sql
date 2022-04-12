Drop table if exists  tbl_regions;

create table tbl_regions (
    id BIGINT AUTO_INCREMENT  PRIMARY KEY,
    name varchar (250) NOT NULL
);

drop table if exists tbl_customers;

create table tbl_customers (
    id BIGINT AUTO_INCREMENT  PRIMARY KEY,
    number_id VARCHAR(250) NOT NULL,
    first_name VARCHAR(250) NOT NULL,
    last_name VARCHAR(250) NOT NULL,
    email VARCHAR(250) NOT NULL,
    photo_url VARCHAR(250) NOT NULL,
    region_id BIGINT,
    state VARCHAR(250) NOT NULL
);