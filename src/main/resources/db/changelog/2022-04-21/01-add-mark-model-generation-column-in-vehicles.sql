--liquibase formatted sql

--changeset krzysiek:5
ALTER TABLE vehicles ADD mark_id BIGINT NULL;
ALTER TABLE vehicles ADD model_id BIGINT NULL;
ALTER TABLE vehicles ADD generation_id BIGINT NULL;