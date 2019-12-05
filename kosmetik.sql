/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50505
Source Host           : 127.0.0.1:3306
Source Database       : kosmetik

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2016-12-10 13:29:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for detail_transaksi
-- ----------------------------
DROP TABLE IF EXISTS `detail_transaksi`;
CREATE TABLE `detail_transaksi` (
  `ID_TRANS` int(11) DEFAULT NULL,
  `ID_PRODUK` int(11) DEFAULT NULL,
  `JML_BELI` int(11) DEFAULT NULL,
  `SUB_TOTAL` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of detail_transaksi
-- ----------------------------

-- ----------------------------
-- Table structure for karyawan
-- ----------------------------
DROP TABLE IF EXISTS `karyawan`;
CREATE TABLE `karyawan` (
  `ID_KARYAWAN` int(11) NOT NULL AUTO_INCREMENT,
  `NAMA_KARYAWAN` varchar(25) DEFAULT NULL,
  `ALAMAT` text,
  `NO_TELP` varchar(15) DEFAULT NULL,
  `USERNAME` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`ID_KARYAWAN`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of karyawan
-- ----------------------------
INSERT INTO `karyawan` VALUES ('1', 'Rafi', 'jalan', '081', 'rafi');

-- ----------------------------
-- Table structure for login
-- ----------------------------
DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `USERNAME` varchar(25) NOT NULL,
  `PASSWORD` varchar(32) DEFAULT NULL,
  `LEVEL` int(11) DEFAULT NULL,
  PRIMARY KEY (`USERNAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of login
-- ----------------------------
INSERT INTO `login` VALUES ('admin', '21232f297a57a5a743894a0e4a801fc3', '1');
INSERT INTO `login` VALUES ('rafi', '202cb962ac59075b964b07152d234b70', '2');

-- ----------------------------
-- Table structure for produk
-- ----------------------------
DROP TABLE IF EXISTS `produk`;
CREATE TABLE `produk` (
  `ID_PRODUK` int(11) NOT NULL AUTO_INCREMENT,
  `ID_SUPPLIER` int(11) DEFAULT NULL,
  `PRODUK` varchar(30) DEFAULT NULL,
  `HARGA_KULAK` int(11) DEFAULT NULL,
  `HARGA` int(11) DEFAULT NULL,
  `STOK` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_PRODUK`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of produk
-- ----------------------------

-- ----------------------------
-- Table structure for supplier
-- ----------------------------
DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier` (
  `ID_SUPPLIER` int(11) NOT NULL AUTO_INCREMENT,
  `NAMA_SUPPLIER` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`ID_SUPPLIER`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of supplier
-- ----------------------------
INSERT INTO `supplier` VALUES ('1', 'Rafi');
INSERT INTO `supplier` VALUES ('4', 'Arizki');

-- ----------------------------
-- Table structure for transaksi
-- ----------------------------
DROP TABLE IF EXISTS `transaksi`;
CREATE TABLE `transaksi` (
  `ID_TRANS` int(11) NOT NULL AUTO_INCREMENT,
  `ID_KARYAWAN` int(11) DEFAULT NULL,
  `TOTAL` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_TRANS`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of transaksi
-- ----------------------------
