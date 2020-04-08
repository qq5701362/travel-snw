/*
Navicat MySQL Data Transfer

Source Server         : travel_snw
Source Server Version : 80015
Source Host           : localhost:3306
Source Database       : travel_snw

Target Server Type    : MYSQL
Target Server Version : 80015
File Encoding         : 65001

Date: 2020-04-09 00:53:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for product_list
-- ----------------------------
DROP TABLE IF EXISTS `product_list`;
CREATE TABLE `product_list` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `userId` int(11) DEFAULT NULL COMMENT '用户id',
  `name` varchar(50) DEFAULT NULL COMMENT '商品名称',
  `price` varchar(10) DEFAULT NULL COMMENT '商品价格',
  `type` varchar(10) DEFAULT NULL COMMENT '商品类型',
  `message` varchar(100) DEFAULT NULL COMMENT '商品描述',
  `createTime` datetime NOT NULL COMMENT '创建时间',
  `updateTime` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品列表';

-- ----------------------------
-- Records of product_list
-- ----------------------------
