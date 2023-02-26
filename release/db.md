1. 创建console数据库：`create database console;`
2. 创建account表：
   CREATE TABLE `account` (
      `id` int(11) NOT NULL AUTO_INCREMENT,
      `create_time` DateTime,
      `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后修改时间',
      `guid` varchar(255) NOT NULL,
      `name` varchar(255) DEFAULT NULL,
      `phone` varchar(50) NOT NULL,
      `password` varchar(255) DEFAULT NULL,
      `email` varchar(50) NOT NULL,
      `description` varchar(255) DEFAULT NULL,
      PRIMARY KEY (`id`) USING BTREE
      ) ENGINE=InnoDB DEFAULT CHARSET=utf8;