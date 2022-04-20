--liquibase formatted sql

--changeset krzysiek:4
CREATE TABLE generations (
    id BIGINT AUTO_INCREMENT NOT NULL,
    generation VARCHAR(50) NOT NULL,
    model_id BIGINT NOT NULL,
    CONSTRAINT pk_cars PRIMARY KEY (id),
    FOREIGN KEY (model_id) REFERENCES models(id)
);