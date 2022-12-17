create database transporte
use transporte;

create database transporte
CREATE TABLE `usuarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(40) NOT NULL,
  `senha` varchar(8) NOT NULL,
  `perfil` enum('Administrador','Motorista','Usuário') NOT NULL,
  `Email` varchar(50) NOT NULL,
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
  `tipo_carro` enum('Van','Minivan','Carro') DEFAULT NULL,
  PRIMARY KEY (`id`));
  
  INSERT INTO `usuarios` VALUES (2,'Renato','12345','Motorista','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Masculino','','','','','','','','Ativo','Van'),(6,'Cristiane','868210','Administrador','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Masculino','','','','','','','','Ativo','Van'),(7,'Renan','99999','Motorista','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Masculino','','','','','','','','Ativo','Van'),(8,'Rane','9999','Motorista','Motorista',NULL,NULL,NULL,NULL,'','Motorista','',NULL,'Masculino','','','','','','','','Ativo','Van'),(9,'Helena','246','Motorista','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Masculino','','','','','','','','Ativo','Van'),(10,'Rafaelo','696969','Motorista','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Masculino','','','','','','','','Ativo','Van');
  
ALTER TABLE usuarios
add column `tipo_veiculo` enum('Van ampliada(20 lugares)','Van simples(15 lugares)','Carro de passeio(5 lugares)','Carro de passeio(7 lugares)') DEFAULT NULL,
add column `tel_alternativo` varchar(14) DEFAULT NULL,
add column `estado_civil` enum('Solteiro', 'Casado') DEFAULT NULL,
add column `tipo_sanguineo` varchar(50) DEFAULT NULL,
add column `nacionalidade` varchar(50) DEFAULT NULL,
add column `orgao_exp` varchar(50) DEFAULT NULL,
add column `data_exp` varchar(10) DEFAULT NULL,
add column `passaporte` varchar(50) DEFAULT NULL,
add column `doc_militar` varchar(50) DEFAULT NULL,
add column `certidao` varchar(50) DEFAULT NULL,
add column `numero_responsavel` varchar(50) DEFAULT NULL,
add column `ano` varchar(4) DEFAULT NULL,
add column `versao` varchar(50) DEFAULT NULL,
add column `ano_fabricaçao` varchar(4) DEFAULT NULL,
add column `combustivel` enum('Gasolina', 'Álcool','Gás','Diesel', 'Total Flex') DEFAULT NULL,
add column `potencia` varchar(50) DEFAULT NULL,
add column `responsavel_veiculo` varchar(50) DEFAULT NULL;

select * from usuarios;

ALTER TABLE usuarios
drop column `tipo_carro`;

ALTER TABLE usuarios
add column `chassi` varchar(50) DEFAULT NULL;

ALTER TABLE usuarios
modify column `perfil` enum('Administrador','Motorista','Usuário') default null;
ALTER TABLE usuarios
add column `cnh` varchar(50) default null;

