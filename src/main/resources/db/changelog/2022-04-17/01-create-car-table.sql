--liquibase formatted sql

--changeset krzysiek:1
CREATE TABLE cars (
    id BIGINT AUTO_INCREMENT NOT NULL,
    registration_number VARCHAR(10) NOT NULL,
    vehicle_category INT NOT NULL,
    mark VARCHAR(40) NOT NULL,
    model VARCHAR(40) NOT NULL,
    color VARCHAR(40) NOT NULL,
    vin_number VARCHAR(17) NOT NULL,
    capacity FLOAT(4) NOT NULL,
    engine_power INT NOT NULL,
    production_year INT NOT NULL,
    CONSTRAINT pk_cars PRIMARY KEY (id)
);