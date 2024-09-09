#######################################################
################# eciga_db 계정 ####################


drop user 'eciga'@'%';

create user 'eciga'@'%' identified by 'eciga';

grant all privileges on eciga_db.* to 'eciga'@'%';

flush privileges;


#######################################################
################# eciga_db DB생성 ##################


drop database eciga_db;

create database eciga_db
	default character set utf8mb4
    collate utf8mb4_general_ci
    default encryption='n'
;

show databases;

use eciga_db;