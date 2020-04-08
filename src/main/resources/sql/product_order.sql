/*
Navicat MySQL Data Transfer

Source Server         : travel_snw
Source Server Version : 80015
Source Host           : localhost:3306
Source Database       : travel_snw

Target Server Type    : MYSQL
Target Server Version : 80015
File Encoding         : 65001

Date: 2020-04-09 00:53:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for product_order
-- ----------------------------
DROP TABLE IF EXISTS `product_order`;
CREATE TABLE `product_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `userId` int(11) DEFAULT NULL COMMENT '用户id',
  `payment` varchar(10) DEFAULT NULL COMMENT '订单价格',
  `orderType` varchar(2) DEFAULT NULL COMMENT '订单类型',
  `payStatus` varchar(2) DEFAULT NULL COMMENT '支付状态',
  `orderStatus` varchar(2) DEFAULT NULL COMMENT '订单状态',
  `createTime` datetime NOT NULL COMMENT '创建时间',
  `updateTime` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单列表';

-- ----------------------------
-- Records of product_order
-- ----------------------------
