1. 创建console数据库：`create database console;`
2. 创建account表：
  `` CREATE TABLE `account` (
   `id` int(11) NOT NULL AUTO_INCREMENT,
   `guid` bigint(20) NOT NULL,
   `name` varchar(255) DEFAULT NULL,
   `avatar` varchar(255) DEFAULT NULL,
   `mobileNumber` varchar(50) NOT NULL,
   `age` int(11) DEFAULT NULL,
   `description` varchar(255) DEFAULT NULL,
   `gender` tinyint(1) DEFAULT '0' COMMENT '0代表女性,1代表女性',
   PRIMARY KEY (`id`) USING BTREE
   ) ENGINE=InnoDB DEFAULT CHARSET=latin1``