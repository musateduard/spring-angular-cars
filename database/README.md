

# description

this folder contains sql files for database schema definitions and data backups.


# usage

### create postgres user
```bash
createuser -h localhost -U postgres --login --createdb --pwprompt username
```

### create entry in .pg_service.conf
```ini
[car_parts]
host=localhost
user=username
dbname=car_parts
port=5432
```

### create entry in .pgpass
```
localhost:5432:car_parts:username:password
```

### drop database
```bash
dropdb --if-exists car_parts
```

### create database
```bash
createdb -h localhost -U username --template template0 --encoding "UTF8" --locale "en_US.UTF-8" --owner username car_parts
```

### import schema into database
```bash
psql -h localhost -a car_parts username < schema.sql
```

### create backup
```bash
pg_dump --data-only car_parts > data.sql
```

### restore backup
```bash
psql -h localhost car_parts username < data.sql
```
