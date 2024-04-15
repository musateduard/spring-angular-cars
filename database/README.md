# description

this folder contains sql files for database schema definitions and data backups.


# usage

### create database user
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
dropdb -h localhost -U username --if-exists car_parts
```

### create database
```bash
createdb -h localhost -U username --template template0 --encoding "UTF8" --locale "en_US.UTF-8" car_parts
```

### import schema into database
```bash
psql -h localhost -U username -a car_parts < schema.sql
```

### create backup
```bash
pg_dump -h localhost -U username --data-only --no-owner car_parts > data.sql
```

### restore backup
```bash
psql -h localhost -U username car_parts < data.sql
```
