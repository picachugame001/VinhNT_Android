#set up database ;  
#login mysql
# mysql -u root
CREATE DATABASE IF NOT EXISTS bongda
	DEFAULT COLLATE = utf8_unicode_ci;
#create user
CREATE USER 'picachusays'@'localhost'
	IDENTIFIED BY 'qqqqqqqq';
GRANT ALL PRIVILEGES ON bongda.* TO 'picachusays'@'localhost'
	WITH GRANT OPTION;

