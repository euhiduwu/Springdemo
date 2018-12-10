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