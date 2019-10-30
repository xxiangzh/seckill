CREATE TABLE `order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户ID',
  `product_id` bigint(20) DEFAULT NULL COMMENT '产品ID',
  `status` int(2) DEFAULT '0' COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='订单表';

CREATE TABLE `product` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `product_name` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '产品名',
  `price` decimal(10,2) DEFAULT NULL COMMENT '价格',
  `amount` int(10) DEFAULT NULL COMMENT '库存',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='产品表';

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '用户名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='用户表';