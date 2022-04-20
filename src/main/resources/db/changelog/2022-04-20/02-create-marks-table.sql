--liquibase formatted sql

--changeset krzysiek:2
CREATE TABLE marks (
    id BIGINT AUTO_INCREMENT NOT NULL,
    mark VARCHAR(50) NOT NULL,
    CONSTRAINT pk_cars PRIMARY KEY (id)
);