/* Create the DDL needed for the mentor application
 *
 * NOTE: Order of the schema operations below are important
 * 
 * To run sql file from commandline:
 * % psql -d mentor -f schema.sql
 */

DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
    firstName VARCHAR(30) NOT NULL,
    lastName VARCHAR(30) NOT NULL,
    email TEXT NOT NULL PRIMARY KEY,
    password VARCHAR(100) NOT NULL,
    title VARCHAR(20) NOT NULL,
    team VARCHAR(30) NOT NULL,
    beMentor VARCHAR(10),
    beMentee VARCHAR(10),
    registerDate DATE
);
