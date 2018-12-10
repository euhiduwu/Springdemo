USE localhostdb;

CREATE TABLE `user_info` (
  `user_info_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '`主键',
  `user_name` VARCHAR(255) NOT NULL DEFAULT '' COMMENT '用户名',
  `user_phone` VARCHAR(255) NOT NULL DEFAULT '' COMMENT '手机号',
  'user_email' VARCHAR(255) NOT NULL DEFAULT '' COMMENT '邮箱',
  `datachange_createtime` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `datachange_lasttime` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`user_info_id`),
  KEY `ix_datachange_lasttime` (`datachange_lasttime`)
) ENGINE = InnoDB AUTO_INCREMENT = 2 DEFAULT CHARSET = utf8 COMMENT '用户信息';

CREATE TABLE `sys_permission` (
  `sys_permission_id` bigint(20) NOT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  `res_name` varchar(50) DEFAULT NULL,
  `res_type` varchar(10) DEFAULT NULL,
  `permission` varchar(20) DEFAULT NULL,
  `url` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`sys_permission_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `sys_role` (
  `role_id` bigint(20) NOT NULL,
  `role_name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `sys_role_permission` (
  `role_id` bigint(20) NOT NULL,
  `permission_id` bigint(20) NOT NULL,
  PRIMARY KEY (`role_id`,`permission_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `sys_user` (
  `user_id` bigint(20) NOT NULL,
  `user_name` varchar(50) DEFAULT NULL,
  `full_name` varchar(20) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `salt` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `sys_user_role` (
  `user_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
