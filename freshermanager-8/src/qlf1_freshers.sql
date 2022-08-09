-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: qlf1
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `freshers`
--

DROP TABLE IF EXISTS `freshers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `freshers` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `pl` varchar(255) NOT NULL,
  `center_id` int DEFAULT NULL,
  `dob` date NOT NULL,
  `averagepoint` float DEFAULT NULL,
  `point1` float DEFAULT NULL,
  `point2` float DEFAULT NULL,
  `point3` float DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKo1dgicclo4p5jnj4kyl8c45ny` (`center_id`),
  CONSTRAINT `FKo1dgicclo4p5jnj4kyl8c45ny` FOREIGN KEY (`center_id`) REFERENCES `centers` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `freshers`
--

LOCK TABLES `freshers` WRITE;
/*!40000 ALTER TABLE `freshers` DISABLE KEYS */;
INSERT INTO `freshers` VALUES (1,'hai@gmail.com','hai','java',1,'2000-02-02',3,3,3,3),(2,'hai@gmail.com','hải','java',1,'2000-02-02',NULL,NULL,NULL,NULL),(3,'hai@gmail.com','hai','php',1,'2000-02-02',NULL,NULL,NULL,NULL),(4,'hai@gmail.com','14','php',1,'2000-02-02',NULL,NULL,NULL,NULL),(5,'hai@gmail.com','22','java',2,'2000-02-02',NULL,NULL,NULL,NULL),(6,'hai@gmail.com','17','c ++',1,'2000-02-02',NULL,NULL,NULL,NULL),(7,'hai@gmail.com','15','c--',1,'2000-02-02',NULL,NULL,NULL,NULL),(8,'hai@gmail.com','20','c',1,'2000-02-02',NULL,NULL,NULL,NULL),(9,'hai@gmail.com','21','c++',1,'2000-02-02',NULL,NULL,NULL,NULL),(10,'hai@gmail.com','22','c++',1,'2000-02-02',NULL,NULL,NULL,NULL),(11,'hai1@gmail.com','hai','java',1,'2000-02-02',3,3,3,3);
/*!40000 ALTER TABLE `freshers` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-09 18:38:10
