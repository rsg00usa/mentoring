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

INSERT INTO employee (firstName, lastName, email, password, title, team, beMentor, beMentee, registerDate) 
VALUES
    ('scott', 'glaser', 'sglaser@salesforce.com', 'scott', 'AMTS', 'EI', 'true', 'true', '2012-04-14'),
    ('John', 'Smith', 'john@smith.com', 'john', 'MTS', 'EI', 'true', 'false', '2012-04-14'),
    ('Joe', 'Blow', 'joe@blow.com', 'joe','SMTS', 'EI', 'false', 'true', '2012-04-14'),
    ('Jane', 'West', 'jane@west.com', 'jane', 'LMTS', 'EI', 'false', 'false', '2012-04-14');
