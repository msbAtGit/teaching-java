use fssa_hacker;


create table users (
	user_id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	user_name varchar(255) NOT NULL,
	email_id varchar(320),
	additional_info varchar(255),
	password varchar(255)
);



DELETE FROM users WHERE user_id >= 1;
ALTER TABLE users
ADD CONSTRAINT UC_users UNIQUE (user_name);


SELECT user_name, email_id, additional_info FROM users WHERE user_name = 'bharath_sound';

SELECT * FROM users;

INSERT INTO USERS (user_name, email_id, additional_info, password) VALUES ("bharath_sound","bharathwaj.soundararajan@gmail.com","Instructor FSSA", "password007");

INSERT INTO USERS (user_name, email_id, additional_info, password) VALUES ( 'surya_coach', 'surya@freshworks.com', 'Coach' ,'password007' );
create table students (
);

create table content_creators (
);

create table assignments (
);


INSERT INTO USERS (user_name, email_id, additional_info, password) VALUES ( 'surya_coach', 'surya@freshworks.com', 'Coach' ,'password007' );


