#! /bin/bash

usage() { echo "Usage: $(basename $0) database {start|stop|load <schema-file> <data-file>|help} 
   database - name of database (must be first argument)
      start - to start database
       stop - to stop dtatabase
       load - load schema and data in database
       help - display command usage"
exit $1; }

[ $# -eq 0 ] && usage 1

database=$1
shift
echo "Database is $database"

while [[ $# > 0 ]]; do
  case $1 in
    "start") 
      echo "Starting postgres"
      pg_ctl -D /usr/local/var/postgres $1
      ;;
    "stop") 
      echo "Stopping postgres"
      pg_ctl -D /usr/local/var/postgres $1
      ;;
    "load")
      shift
      [[ -f $1 ]] || usage 1
      echo "Loading db schema: $1"
      psql -d $database -f $1
      shift
      [[ -f $1 ]] || usage 1
      echo "Loading db data: $1"
      psql -d $database -f $1
      ;;
    "help"|*)
      usage 0
      ;;
  esac
    shift
done
