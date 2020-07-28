/* Provide the DML needed for mentor application
 *
 * NOTE: Order of the schema operations below are important
 * 
 * To run sql file from commandline:
 * % psql -d mentor -f test-data.sql
 * 
 * To run sql cmd from commandline:
 * % psql -d mentor -c "select * from employee"
 */

INSERT INTO employee (firstName, lastName, email, title, team, mentor, mentee, createDate) 
VALUES
    ('scott', 'glaser', 'sglaser@salesforce.com', 'AMTS', 'EI', 'true', 'true', '2012-04-14'),
    ('John', 'Smith', 'john@smith.com', 'MTS', 'EI', 'true', 'false', '2012-04-14'),
    ('joe', 'blow', 'joe@blow.com', 'SMTS', 'EI', 'false', 'true', '2012-04-14'),
    ('Jane', 'West', 'jane@west.com', 'LMTS', 'EI', 'false', 'false', '2012-04-14');
