#!/bin/bash

dropdb --if-exists car_parts &&
createdb --template template0 --encoding "UTF8" --locale "en_US.UTF-8" --owner user1 car_parts &&
psql -a car_parts user1 < schema.sql
