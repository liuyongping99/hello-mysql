CREATE TABLE `user` (
	`userId` SMALLINT(5) UNSIGNED NOT NULL AUTO_INCREMENT,
	`userName` VARCHAR(45) NOT NULL,
	`address` VARCHAR(200) NOT NULL,
	`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	PRIMARY KEY (`userId`),
	INDEX `idx_user_userName` (`userName`)
)
ENGINE=InnoDB
ROW_FORMAT=DEFAULT

insert into user(userName, address) values ('王五', '北京市');
insert into user(userName, address) values ('王麻花', '天津市'),('刘麻子', '广州市');
insert into user(userName, address) values ('李大嘴', '恶人谷'),('胡铁花', '广州市');
insert into user(userName, address) values ('张丹枫', '土木堡'),('段誉', '大理国');
insert into user(userName, address) values ('夏洛克', '英国'),('乔丹', '美国');
insert into user(userName, address) values ('钢铁侠', '纽约市'),('蝙蝠侠', '哥谭市');
insert into user(userName, address) values ('霸天虎', '塞伯坦'),('超人', '氪星球');