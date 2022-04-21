--liquibase formatted sql

--changeset krzysiek:6
ALTER TABLE vehicles ADD CONSTRAINT vehicles_marks_fk FOREIGN KEY (mark_id) REFERENCES marks (id);
ALTER TABLE vehicles ADD CONSTRAINT vehicles_models_fk FOREIGN KEY (model_id) REFERENCES models (id);
ALTER TABLE vehicles ADD CONSTRAINT vehicles_generations_fk FOREIGN KEY (generation_id) REFERENCES generations (id);