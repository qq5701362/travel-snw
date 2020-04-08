/*
Navicat MySQL Data Transfer

Source Server         : travel_snw
Source Server Version : 80015
Source Host           : localhost:3306
Source Database       : travel_snw

Target Server Type    : MYSQL
Target Server Version : 80015
File Encoding         : 65001

Date: 2020-04-09 00:53:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for notes
-- ----------------------------
DROP TABLE IF EXISTS `notes`;
CREATE TABLE `notes` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `parentUserId` int(11) DEFAULT NULL COMMENT '父节点id',
  `userId` int(11) DEFAULT NULL COMMENT '用户id',
  `content` varchar(200) DEFAULT NULL COMMENT '内容',
  `noteStatus` varchar(2) DEFAULT NULL COMMENT '留言状态',
  `isAnonymous` varchar(2) DEFAULT NULL COMMENT '匿名状态',
  `agree` varchar(10) DEFAULT NULL COMMENT '点赞数',
  `createTime` datetime NOT NULL COMMENT '创建时间',
  `updateTime` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='留言';

-- ----------------------------
-- Records of notes
-- ----------------------------
