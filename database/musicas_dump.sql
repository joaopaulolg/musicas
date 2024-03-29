-- MySQL dump 10.16  Distrib 10.3.9-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: musicas
-- ------------------------------------------------------
-- Server version	10.3.9-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `album`
--

DROP TABLE IF EXISTS `album`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `album` (
  `ID_ALBUM` int(11) NOT NULL AUTO_INCREMENT,
  `NM_ALBUM` varchar(200) NOT NULL,
  `ID_ARTISTA` int(11) DEFAULT NULL,
  `ID_ESTILO` int(11) NOT NULL,
  `ID_PRODUTOR` int(11) NOT NULL,
  `DT_LANCAMENTO` datetime NOT NULL,
  `ST_COLETANEA` char(1) NOT NULL,
  PRIMARY KEY (`ID_ALBUM`),
  KEY `FK_ALBUM_01` (`ID_ARTISTA`),
  KEY `FK_ALBUM_02` (`ID_ESTILO`),
  KEY `FK_ALBUM_03` (`ID_PRODUTOR`),
  CONSTRAINT `FK_ALBUM_01` FOREIGN KEY (`ID_ARTISTA`) REFERENCES `artista` (`ID_ARTISTA`),
  CONSTRAINT `FK_ALBUM_02` FOREIGN KEY (`ID_ESTILO`) REFERENCES `estilo` (`ID_ESTILO`),
  CONSTRAINT `FK_ALBUM_03` FOREIGN KEY (`ID_PRODUTOR`) REFERENCES `artista` (`ID_ARTISTA`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `album`
--

LOCK TABLES `album` WRITE;
/*!40000 ALTER TABLE `album` DISABLE KEYS */;
INSERT INTO `album` VALUES (1,'Heaven And Hell',3,2,9,'1980-04-25 00:00:00','N');
/*!40000 ALTER TABLE `album` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `artista`
--

DROP TABLE IF EXISTS `artista`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `artista` (
  `ID_ARTISTA` int(11) NOT NULL AUTO_INCREMENT,
  `NM_ARTISTA` varchar(100) NOT NULL,
  PRIMARY KEY (`ID_ARTISTA`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `artista`
--

LOCK TABLES `artista` WRITE;
/*!40000 ALTER TABLE `artista` DISABLE KEYS */;
INSERT INTO `artista` VALUES (1,'Led Zeppelin'),(2,'Deep Purple'),(3,'Black Sabbath'),(4,'Metallica'),(5,'Ozzy Osbourne'),(6,'Tony Iommi'),(7,'Geezer Butler'),(8,'Bill Ward'),(9,'Martin Birch');
/*!40000 ALTER TABLE `artista` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `artista_individual`
--

DROP TABLE IF EXISTS `artista_individual`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `artista_individual` (
  `ID_ARTISTA_INDIVIDUAL` int(11) NOT NULL AUTO_INCREMENT,
  `ID_ARTISTA` int(11) NOT NULL,
  `NM_REAL` varchar(100) NOT NULL,
  `DT_NASCIMENTO` datetime NOT NULL,
  PRIMARY KEY (`ID_ARTISTA_INDIVIDUAL`),
  KEY `FK_ARTISTA_INDIVIDUAL_01` (`ID_ARTISTA`),
  CONSTRAINT `FK_ARTISTA_INDIVIDUAL_01` FOREIGN KEY (`ID_ARTISTA`) REFERENCES `artista` (`ID_ARTISTA`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `artista_individual`
--

LOCK TABLES `artista_individual` WRITE;
/*!40000 ALTER TABLE `artista_individual` DISABLE KEYS */;
INSERT INTO `artista_individual` VALUES (1,5,'John Michael Osbourne','1948-12-03 00:00:00'),(2,6,'Anthony Frank Iommi','1948-02-19 00:00:00'),(3,7,'Terence Michael Joseph Butler','1949-07-17 00:00:00'),(4,8,'William Thomas Ward','1948-05-05 00:00:00');
/*!40000 ALTER TABLE `artista_individual` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `banda`
--

DROP TABLE IF EXISTS `banda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `banda` (
  `ID_BANDA` int(11) NOT NULL AUTO_INCREMENT,
  `ID_ARTISTA` int(11) NOT NULL,
  `DT_CRIACAO` datetime NOT NULL,
  PRIMARY KEY (`ID_BANDA`),
  KEY `FK_BANDA_01` (`ID_ARTISTA`),
  CONSTRAINT `FK_BANDA_01` FOREIGN KEY (`ID_ARTISTA`) REFERENCES `artista` (`ID_ARTISTA`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banda`
--

LOCK TABLES `banda` WRITE;
/*!40000 ALTER TABLE `banda` DISABLE KEYS */;
INSERT INTO `banda` VALUES (1,3,'1968-06-01 00:00:00');
/*!40000 ALTER TABLE `banda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estilo`
--

DROP TABLE IF EXISTS `estilo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estilo` (
  `ID_ESTILO` int(11) NOT NULL AUTO_INCREMENT,
  `NM_ESTILO` varchar(100) NOT NULL,
  PRIMARY KEY (`ID_ESTILO`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estilo`
--

LOCK TABLES `estilo` WRITE;
/*!40000 ALTER TABLE `estilo` DISABLE KEYS */;
INSERT INTO `estilo` VALUES (1,'Rock'),(2,'Heavy Metal'),(3,'Thrash Metal'),(4,'Hard Rock');
/*!40000 ALTER TABLE `estilo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gravadora`
--

DROP TABLE IF EXISTS `gravadora`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gravadora` (
  `ID_GRAVADORA` int(11) NOT NULL AUTO_INCREMENT,
  `NM_GRAVADORA` varchar(100) NOT NULL,
  `ANO_FUNDACAO` int(11) NOT NULL,
  PRIMARY KEY (`ID_GRAVADORA`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gravadora`
--

LOCK TABLES `gravadora` WRITE;
/*!40000 ALTER TABLE `gravadora` DISABLE KEYS */;
INSERT INTO `gravadora` VALUES (1,'EMI',1931),(2,'Warner Music Group',1958),(3,'Decca Records',1934),(4,'Nuclear Blast',1987);
/*!40000 ALTER TABLE `gravadora` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `membros_banda`
--

DROP TABLE IF EXISTS `membros_banda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `membros_banda` (
  `ID_MEMBROS_BANDA` int(11) NOT NULL AUTO_INCREMENT,
  `ID_BANDA` int(11) NOT NULL,
  `ID_ARTISTA_INDIVIDUAL` int(11) NOT NULL,
  `DT_INICIO` datetime NOT NULL,
  `DT_FIM` datetime DEFAULT NULL,
  PRIMARY KEY (`ID_MEMBROS_BANDA`),
  KEY `FK_MEMBROS_BANDA_01` (`ID_BANDA`),
  KEY `FK_MEMBROS_BANDA_02` (`ID_ARTISTA_INDIVIDUAL`),
  CONSTRAINT `FK_MEMBROS_BANDA_01` FOREIGN KEY (`ID_BANDA`) REFERENCES `banda` (`ID_BANDA`),
  CONSTRAINT `FK_MEMBROS_BANDA_02` FOREIGN KEY (`ID_ARTISTA_INDIVIDUAL`) REFERENCES `artista_individual` (`ID_ARTISTA_INDIVIDUAL`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `membros_banda`
--

LOCK TABLES `membros_banda` WRITE;
/*!40000 ALTER TABLE `membros_banda` DISABLE KEYS */;
INSERT INTO `membros_banda` VALUES (1,1,1,'1968-06-01 00:00:00',NULL),(2,1,2,'1968-06-01 00:00:00',NULL),(3,1,3,'1968-06-01 00:00:00',NULL),(4,1,4,'1968-06-01 00:00:00',NULL);
/*!40000 ALTER TABLE `membros_banda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `musica`
--

DROP TABLE IF EXISTS `musica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `musica` (
  `ID_MUSICA` int(11) NOT NULL AUTO_INCREMENT,
  `NM_MUSICA` varchar(200) NOT NULL,
  `ID_ARTISTA` int(11) NOT NULL,
  `ID_ALBUM` int(11) DEFAULT NULL,
  `NR_ORDEM` int(11) NOT NULL,
  `NR_DISCO` int(11) NOT NULL,
  `NR_DURACAO` int(11) NOT NULL,
  PRIMARY KEY (`ID_MUSICA`),
  KEY `FK_MUSICA_01` (`ID_ARTISTA`),
  KEY `FK_MUSICA_02` (`ID_ALBUM`),
  CONSTRAINT `FK_MUSICA_01` FOREIGN KEY (`ID_ARTISTA`) REFERENCES `artista` (`ID_ARTISTA`),
  CONSTRAINT `FK_MUSICA_02` FOREIGN KEY (`ID_ALBUM`) REFERENCES `album` (`ID_ALBUM`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `musica`
--

LOCK TABLES `musica` WRITE;
/*!40000 ALTER TABLE `musica` DISABLE KEYS */;
INSERT INTO `musica` VALUES (1,'Neon Knights',3,1,1,1,233),(2,'Children Of The Sea',3,1,1,1,334),(3,'Lady Evil',3,1,1,1,266),(4,'Heaven And Hell',3,1,1,1,419),(5,'Wishing Well',3,1,1,1,247),(6,'Die Young',3,1,1,1,285),(7,'Walk Away',3,1,1,1,265),(8,'Lonely Is The Word',3,1,1,1,351);
/*!40000 ALTER TABLE `musica` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-08-19 20:53:09
