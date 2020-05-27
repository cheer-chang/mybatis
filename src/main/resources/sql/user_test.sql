/*
 Navicat MySQL Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 27/05/2020 10:12:52
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user_test
-- ----------------------------
DROP TABLE IF EXISTS `user_test`;
CREATE TABLE `user_test`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `age` int(11) NOT NULL,
  `name` varchar(255) CHARACTER SET utf16 COLLATE utf16_bin NOT NULL,
  `creator_id` int(11) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf16 COLLATE = utf16_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_test
-- ----------------------------
INSERT INTO `user_test` VALUES (41, 100, 'JJJ', 1);
INSERT INTO `user_test` VALUES (40, 90, 'III', 1);
INSERT INTO `user_test` VALUES (39, 80, 'HHH', 1);
INSERT INTO `user_test` VALUES (38, 70, 'GGG', 1);
INSERT INTO `user_test` VALUES (37, 60, 'FFF', 1);
INSERT INTO `user_test` VALUES (36, 50, 'EEE', 1);
INSERT INTO `user_test` VALUES (35, 40, 'DDD', 1);
INSERT INTO `user_test` VALUES (34, 30, 'CCC', 1);
INSERT INTO `user_test` VALUES (33, 20, 'BBB', 1);

SET FOREIGN_KEY_CHECKS = 1;
