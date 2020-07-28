psql -d mentor -f schema.sql
psql -d mentor -c "select * from employee"
psql -d mentor -f test-data.sql
psql -d mentor -c "select * from employee"
