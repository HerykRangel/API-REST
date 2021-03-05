-- MariaDB dump 10.18  Distrib 10.4.17-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: vehiculos
-- ------------------------------------------------------
-- Server version	10.4.17-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (42);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehiculo`
--

DROP TABLE IF EXISTS `vehiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vehiculo` (
  `tipo_vehiculo` varchar(31) NOT NULL,
  `id` int(11) NOT NULL,
  `marca` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `tipo_combustible` varchar(255) DEFAULT NULL,
  `velocidad_maxima` varchar(255) DEFAULT NULL,
  `cantidad_ruedas` varchar(255) DEFAULT NULL,
  `cantidad_puertas` varchar(255) DEFAULT NULL,
  `cantidad_cilindros` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehiculo`
--

LOCK TABLES `vehiculo` WRITE;
/*!40000 ALTER TABLE `vehiculo` DISABLE KEYS */;
INSERT INTO `vehiculo` VALUES ('Automovil',1,'FIAT','Automovil 2','GASOLINA','200KM',NULL,'5',NULL),('Vehiculo',2,'FIAT','Automovil 2','GASOLINA','200KM',NULL,NULL,NULL),('Motocicleta',3,'FIAT','Automovil 2','GASOLINA','200KM',NULL,NULL,NULL),('Motocicleta',4,'TOYOTA','Motocicleta 1','GASOLINA','200KM',NULL,NULL,'150'),('Autobus',5,'TOYOTA','Autobus 1','GASOLINA','150KM','10',NULL,NULL),('Autobus',6,'TOYOTA','Autobus 2','GASOLINA','150KM','10',NULL,NULL),('Autobus',7,'TOYOTA','Autobus 3','GASOLINA','150KM','10',NULL,NULL),('Autobus',8,'TOYOTA','Autobus 4','GASOLINA','150KM','10',NULL,NULL),('Autobus',9,'RANGEL','Autobus 2','GASOLINA','150KM','10',NULL,NULL),('Automovil',10,'HERYK','Automovil 4','GASOLINA','200KM',NULL,'5',NULL),('Automovil',11,'FIAT','Automovil 4','GASOLINA','200KM',NULL,'5',NULL),('Automovil',12,'FIAT','Automovil 5','GASOLINA','200KM',NULL,'5',NULL),('Automovil',24,'FIAT','Automovil 5','GASOLINA','200KM',NULL,'5',NULL),('Automovil',25,'FIAT','Automovil 5','GASOLINA','200KM',NULL,'5',NULL),('Automovil',26,'FIAT','Automovil 5','GASOLINA','200KM',NULL,'5',NULL),('Automovil',27,'FIAT','Automovil 5','GASOLINA','200KM',NULL,'5',NULL),('Automovil',28,'FIAT','Automovil 5','GASOLINA','200KM',NULL,'5',NULL),('Automovil',29,'FIAT','Automovil 5','GASOLINA','200KM',NULL,'5',NULL),('Automovil',30,'FIAT','Automovil 5','GASOLINA','200KM',NULL,'5',NULL),('Automovil',31,'FIAT','Automovil 5','GASOLINA','200KM',NULL,'5',NULL),('Automovil',32,'FIAT','Automovil 5','GASOLINA','200KM',NULL,'5',NULL),('Automovil',33,'FIAT','Automovil 5','GASOLINA','200KM',NULL,'5',NULL),('Automovil',34,'FIAT','Automovil 5','GASOLINA','200KM',NULL,'5',NULL),('Automovil',35,'FIAT','Automovil 5','GASOLINA','200KM',NULL,'5',NULL),('Automovil',36,'FIAT','Automovil 5','GASOLINA','200KM',NULL,'5',NULL),('Automovil',37,'FIAT','Automovil 5','GASOLINA','200KM',NULL,'5',NULL),('Automovil',38,'FIAT','Automovil 5','GASOLINA','200KM',NULL,'5',NULL),('Automovil',39,'FIAT','Automovil 5000','GASOLINA','200KM',NULL,'5',NULL),('Motocicleta',40,'FIAT','Automovil 5000','GASOLINA','200KM',NULL,NULL,NULL),('Autobus',41,'FIAT','Automovil 5000','GASOLINA','200KM',NULL,NULL,NULL);
/*!40000 ALTER TABLE `vehiculo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-05  7:10:26
