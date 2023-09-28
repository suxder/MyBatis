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
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `t_user` */

insert  into `t_user`(`id`,`username`,`password`,`age`,`gender`,`email`) values 
(1,'宫若梅','456',23,'f','153456@qq.com'),
(2,'marina','456',23,'f','153456@qq.com'),
(3,'marina','456',23,'f','153456@qq.com'),
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
(21,'marina','456',23,'f','153456@qq.com');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
