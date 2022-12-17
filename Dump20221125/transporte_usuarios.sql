-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: transporte
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(40) DEFAULT NULL,
  `senha` varchar(8) DEFAULT NULL,
  `perfil` enum('Administrador','Motorista','Usuário') DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `cep` varchar(50) DEFAULT NULL,
  `Bairro` varchar(50) DEFAULT NULL,
  `Pai` varchar(50) DEFAULT NULL,
  `Mae` varchar(50) DEFAULT NULL,
  `cpf` varchar(15) DEFAULT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  `data_nascimento` varchar(15) DEFAULT NULL,
  `Rg` varchar(25) DEFAULT NULL,
  `sexo` enum('Masculino','Feminino') DEFAULT NULL,
  `placa` varchar(7) DEFAULT NULL,
  `modelo_veiculo` varchar(50) DEFAULT NULL,
  `cor_veiculo` varchar(50) DEFAULT NULL,
  `colegio` varchar(50) DEFAULT NULL,
  `periodo` varchar(50) DEFAULT NULL,
  `horario_entrada` varchar(50) DEFAULT NULL,
  `horario_saida` varchar(50) DEFAULT NULL,
  `status` enum('Ativo','Inativo') DEFAULT NULL,
  `tipo_veiculo` enum('Van ampliada(20 lugares)','Van simples(15 lugares)','Carro de passeio(5 lugares)','Carro de passeio(7 lugares)') DEFAULT NULL,
  `tel_alternativo` varchar(14) DEFAULT NULL,
  `estado_civil` enum('Solteiro','Casado') DEFAULT NULL,
  `tipo_sanguineo` varchar(50) DEFAULT NULL,
  `nacionalidade` varchar(50) DEFAULT NULL,
  `orgao_exp` varchar(50) DEFAULT NULL,
  `data_exp` varchar(10) DEFAULT NULL,
  `passaporte` varchar(50) DEFAULT NULL,
  `doc_militar` varchar(50) DEFAULT NULL,
  `certidao` varchar(50) DEFAULT NULL,
  `numero_responsavel` varchar(50) DEFAULT NULL,
  `ano` varchar(4) DEFAULT NULL,
  `versao` varchar(50) DEFAULT NULL,
  `ano_fabricaçao` varchar(4) DEFAULT NULL,
  `combustivel` enum('Gasolina','Álcool','Gás','Diesel','Total Flex') DEFAULT NULL,
  `potencia` varchar(50) DEFAULT NULL,
  `responsavel_veiculo` varchar(50) DEFAULT NULL,
  `chassi` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (2,'Renato','12345','Motorista','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Masculino','','','','','','','','Ativo',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(6,'Cristiane','868210','Administrador','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Masculino','','','','','','','','Ativo',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(7,'Renan','99999','Motorista','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Masculino','','','','','','','','Ativo',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(8,'Rane','9999','Motorista','Motorista',NULL,NULL,NULL,NULL,'','Motorista','',NULL,'Masculino','','','','','','','','Ativo',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(9,'Helena','246','Motorista','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Masculino','','','','','','','','Ativo',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(10,'Rafaelo','696969','Motorista','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Masculino','','','','','','','','Ativo',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(13,'Yuri Martins','12345678','Motorista','yurimartins@gmail.com','25215395','Rua Matusalem fdskkk',NULL,NULL,'   .   .  -','(21)9839-45403 ','20/07/1992',NULL,'Masculino',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Ativo',NULL,'(21)0000-00000','Casado',NULL,NULL,'','  /  /',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(15,'Meu piru','12345678','Motorista','haha','fodase','casa do caralho',NULL,NULL,'222.222.222-22','(21)9829-38859','(21)9829-38859','12.323.222-2','Masculino',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Ativo',NULL,'(21)4433-35766','Casado','fds','brasil','fodase','22/22/2222',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-25  2:12:45
