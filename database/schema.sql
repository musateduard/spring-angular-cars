

-- init database
DROP DATABASE car_parts;
CREATE DATABASE car_parts WITH TEMPLATE template0 ENCODING 'UTF8' LOCALE 'en_US.UTF-8' OWNER user1;

\connect car_parts user1
CREATE SCHEMA main AUTHORIZATION user1;


-- create engines table
CREATE TABLE IF NOT EXISTS main.engines (
    id BIGSERIAL PRIMARY KEY,
    manufacturer VARCHAR(255) NOT NULL,
    year INT NOT NULL,
    capacity INT NOT NULL,
    horsepower INT NOT NULL);


-- create owners table
CREATE TABLE IF NOT EXISTS main.owners (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    age INT NOT NULL);


-- create cars table
CREATE TABLE IF NOT EXISTS main.cars (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    color VARCHAR(255) NOT NULL,
    year INT NOT NULL,
    engine INT NOT NULL REFERENCES main.engines(id),
    owner INT NOT NULL REFERENCES main.owners(id));


-- create cars_owners table
CREATE TABLE IF NOT EXISTS main.cars_owners (
    car INT NOT NULL REFERENCES main.cars(id) ON DELETE CASCADE,  -- should we cascade?
    owner INT NOT NULL REFERENCES main.owners(id) ON DELETE CASCADE,  -- should we cascade?
    UNIQUE (car, owner));
