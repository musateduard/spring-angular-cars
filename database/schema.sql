-- create main schema
CREATE SCHEMA main;


-- create owners table
/* sdfjkhkjhsdfkhweuifghweuifhweuifh */
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
    -- start_date
    -- end_date

    -- date constraints
    -- start_date < end_date by at least 1 day, always
    -- gaps in ownership? allowed
    -- overlap in ownership? not allowed
    -- end_date in future? not allowed
    -- end_date null? allowed
    -- start_date in future? not allowed
    -- start_date, end_date in past? allowed
