/*
Navicat MySQL Data Transfer

Source Server         : aimee
Source Server Version : 50560
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50560
File Encoding         : 65001

Date: 2018-07-17 16:51:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for process
-- ----------------------------
DROP TABLE IF EXISTS `process`;
CREATE TABLE `process` (
  `tid` varchar(100) DEFAULT NULL,
  `question` varchar(255) DEFAULT NULL,
  `optA` varchar(255) DEFAULT NULL,
  `optB` varchar(255) DEFAULT NULL,
  `optC` varchar(255) DEFAULT NULL,
  `optD` varchar(255) DEFAULT NULL,
  `answer` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of process
-- ----------------------------
INSERT INTO `process` VALUES ('1', '1840年鸦片战争前，中国社会的性质是( )。', '奴隶社会', '封建社会', '半殖民地半封建社会', '资本主义社会', 'B');
INSERT INTO `process` VALUES ('2', '鸦片战争后，提出“师夷长技以制夷”思想的是( )。', '龚自珍', '林则徐', '魏源', '王韬', 'C');
INSERT INTO `process` VALUES ('3', '洋务运动时期最早创办的翻译学堂的是( )。', '同文馆', '广方言馆', '译书局', '译书馆', 'A');
INSERT INTO `process` VALUES ('4', '1911年，在保路运动中规模最大、斗争最激烈的省份是( )。', '湖北', '湖南', '广东', '四川', 'D');
INSERT INTO `process` VALUES ('5', '中国历史上第一步具有资产阶级共和国宪法性质的法典是( )。', '《中华民国临时约法》', '《钦定宪法大纲》', '《中华民国约法》', '《中华民国宪法》', 'A');

-- ----------------------------
-- Table structure for result
-- ----------------------------
DROP TABLE IF EXISTS `result`;
CREATE TABLE `result` (
  `id` int(11) DEFAULT NULL,
  `userid` varchar(255) DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  `time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of result
-- ----------------------------

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `dept` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1705050111', '李子俊', '18', '宿管部', '湘潭');
INSERT INTO `student` VALUES ('1705050109', '李奇', '18', '组宣', '长沙');
INSERT INTO `student` VALUES ('1705050127', '李倩', '20', '组织部', '郴州');
INSERT INTO `student` VALUES ('1705050128', '杨娟', '20', '宿管部', '邵阳');
INSERT INTO `student` VALUES ('1705050130', '赵媛', '20', '文艺部', '内蒙古');
INSERT INTO `student` VALUES ('1507', 'Tom', '20', '计算机', '湖南');
INSERT INTO `student` VALUES ('1507', 'Tom', '20', '计算机', '湖南');
INSERT INTO `student` VALUES ('1507', 'Tom', '20', '计算机', '湖南');
