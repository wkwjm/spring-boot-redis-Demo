/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : kdgc-web

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2019-07-26 16:18:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_user`
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) DEFAULT NULL,
  `pass_word` varchar(60) DEFAULT NULL,
  `qq` varchar(50) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `wei_xin` varchar(50) DEFAULT NULL,
  `hobby` varchar(50) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1', '王康', '123456', '575702313@qq.com', '13486842702', '18756968631', '打篮球', '2019-07-21 14:44:24', '2019-07-21 14:44:27');
INSERT INTO `tb_user` VALUES ('5', '测试', '123456', '1234567890@qq.com', '1876548921', 'wei_xin1213', '打篮球', '2019-07-26 16:14:58', '2019-07-26 16:14:58');
