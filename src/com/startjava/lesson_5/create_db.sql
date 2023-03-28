-- create database
CREATE DATABASE java_start
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1;

--delete table:
DROP TABLE IF EXISTS Jaegers; 

--create table:
CREATE TABLE Jaegers(
    id SERIAL PRIMARY KEY, 
    modelName VARCHAR(30),
    mark  VARCHAR(25), 
    height DECIMAL (7, 3),
    weight DECIMAL (7, 3),
    status  VARCHAR(15),
    origin VARCHAR(50),
    launch DATE,
    kaijuKill INTEGER
);

--connect to database:
\c java_start

set client_encoding='WIN866';

--run init & queries
\ir init_db.sql

\ir queries.sql 

--run from console
--psql -U postgres -d java_start -f "C:\Users\n.zhitnikova\Downloads\cmder\StartJava\src\com\startjava\lesson_5\create_db.sql" -e -a
