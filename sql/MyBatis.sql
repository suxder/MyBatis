/*
SQLyog Ultimate v13.1.1 (64 bit)
MySQL - 8.1.0 : Database - mybatis
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mybatis` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `mybatis`;

/*Table structure for table `t_dept` */

DROP TABLE IF EXISTS `t_dept`;

CREATE TABLE `t_dept` (
  `did` int NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`did`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `t_dept` */

insert  into `t_dept`(`did`,`dept_name`) values 
(1,'武装部'),
(2,'信息部'),
(3,'研发部');

/*Table structure for table `t_emp` */

DROP TABLE IF EXISTS `t_emp`;

CREATE TABLE `t_emp` (
  `eid` int NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(20) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `sex` char(1) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `did` int DEFAULT NULL,
  PRIMARY KEY (`eid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `t_emp` */

insert  into `t_emp`(`eid`,`emp_name`,`age`,`sex`,`email`,`did`) values 
(1,'张怡然',23,'男','1439433131@qq.com',1),
(2,'张文怡 ',24,'女','123@qq.com',2),
(3,'伍六七',21,'男','12314141@163.com',3);

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `gender` char(1) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `t_user` */

insert  into `t_user`(`id`,`username`,`password`,`age`,`gender`,`email`) values 
(4,'marina','456',23,'f','153456@qq.com'),
(5,'marina','456',23,'f','153456@qq.com'),
(6,'marina','456',23,'f','153456@qq.com'),
(7,'marina','456',23,'f','153456@qq.com'),
(8,'marina','456',23,'f','153456@qq.com'),
(9,'marina','456',23,'f','153456@qq.com'),
(10,'marina','456',23,'f','153456@qq.com'),
(11,'marina','456',23,'f','153456@qq.com'),
(12,'marina','456',23,'f','153456@qq.com'),
(13,'marina','456',23,'f','153456@qq.com'),
(14,'marina','456',23,'f','153456@qq.com'),
(15,'marina','456',23,'f','153456@qq.com'),
(16,'marina','456',23,'f','153456@qq.com'),
(17,'marina','456',23,'f','153456@qq.com'),
(18,'marina','456',23,'f','153456@qq.com'),
(19,'marina','456',23,'f','153456@qq.com'),
(20,'marina','456',23,'f','153456@qq.com'),
(21,'marina','456',23,'f','153456@qq.com'),
(22,'marina','456',23,'f','153456@qq.com'),
(23,'叶问','456',23,'m','1439433131@qq.com'),
(24,'叶问','456',23,'m','1439433131@qq.com'),
(25,'叶问','456',23,'m','1439433131@qq.com'),
(26,'Lisa','2000',23,'F','123@163.com');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
