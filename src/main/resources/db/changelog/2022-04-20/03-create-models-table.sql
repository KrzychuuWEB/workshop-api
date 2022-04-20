--liquibase formatted sql

--changeset krzysiek:3
CREATE TABLE models (
    id BIGINT AUTO_INCREMENT NOT NULL,
    model VARCHAR(50) NOT NULL,
    mark_id BIGINT NOT NULL,
    CONSTRAINT pk_cars PRIMARY KEY (id),
    FOREIGN KEY (mark_id) REFERENCES marks(id)
);