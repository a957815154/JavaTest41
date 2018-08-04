DROP database IF EXISTS test;
CREATE database test;
USE test;

DROP TABLE IF EXISTS test;
CREATE TABLE test(
id int not null,
name varchar(25)
);
insert into test(id,name) values(1,"bb");
