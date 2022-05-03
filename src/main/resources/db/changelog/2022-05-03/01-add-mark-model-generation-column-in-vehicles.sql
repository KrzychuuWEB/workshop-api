--liquibase formatted sql

--changeset krzysiek:7
ALTER TABLE marks CHANGE mark name VARCHAR(50);
ALTER TABLE models CHANGE model name VARCHAR(50);
ALTER TABLE generations CHANGE generation name VARCHAR(50);