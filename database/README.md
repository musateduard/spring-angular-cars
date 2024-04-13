

# description

this folder contains sql files for database definitions and data backups.


# usage

### init database
```bash
psql postgres user1 < schema.sql
```

### create backup
```bash
pg_dump --data-only car_parts > data.sql
```

### restore backup
```bash
psql car_parts user1 < data.sql
```
