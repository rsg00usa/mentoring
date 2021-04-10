# run this script to start and load database
database=mentor
rundb.sh $database stop start load schema.sql test-data.sql
psql -d $database -c "select * from employee"
