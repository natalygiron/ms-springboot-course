drop table if exists tbl_invoices;

create table tlb_invoices (
    id BIGINT AUTO_INCREMENT  PRIMARY KEY,
    number_invoice double NOT NULL,
    description varchar(259),
    customer_id BIGINT NOT NULL,
    create_at TIMESTAMP ,
    state varchar(259) NOT NULL
);

drop table if exists tbl_invoice_items;

create table tbl_invoice_items (
    invoice_id BIGINT  NOT NULL,
    product_id BIGINT NOT NULL,
    quantity DOUBLE NOT NULL,
    price DOUBLE NOT NULL
);

