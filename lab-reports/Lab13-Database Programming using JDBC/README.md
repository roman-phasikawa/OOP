Establishing database connectivity to retrieve and display table records.


[CREATE DATABASE mydatabase;
 USE mydatabase;
 CREATE TABLE userinformation (
         userid INT PRIMARY KEY AUTO_INCREMENT,
         userName VARCHAR(50),
         age INT,
         addres VARCHAR(100)
    );
DESC userinformation;
javac -cp ".;mysql-connector-j-9.6.0.jar" MyDbConnection.java
java -cp ".;mysql-connector-j-9.6.0.jar" MyDbConnection]