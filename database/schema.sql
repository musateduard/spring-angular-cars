

-- create main schema
CREATE SCHEMA main;


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
    horsepower INT NOT NULL,
    mileage INT NOT NULL,
    current_owner BIGINT NOT NULL REFERENCES main.owners(id));


-- create previous_owners table
CREATE TABLE IF NOT EXISTS main.previous_owners (
    car BIGINT NOT NULL REFERENCES main.cars(id) ON DELETE CASCADE,  -- should we cascade?
    owner BIGINT NOT NULL REFERENCES main.owners(id) ON DELETE CASCADE);  -- should we cascade?
