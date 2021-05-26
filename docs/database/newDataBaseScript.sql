-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 25-Maio-2021 às 22:13
-- Versão do servidor: 8.0.13-4
-- versão do PHP: 7.2.24-0ubuntu0.18.04.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kRlg6QjA5T`
--
CREATE DATABASE IF NOT EXISTS `kRlg6QjA5T` DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;
USE `kRlg6QjA5T`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `Cliente`
--

CREATE TABLE `Client` (
  `id` varchar(10) CONSTRAINT PK_client_id COLLATE utf8_unicode_ci NOT NULL,
  `nif` varchar(10) CONSTRAINT NN_client_nif COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(55) CONSTRAINT NN_client_name CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `annotations` varchar(55) CONSTRAINT NN_client_annotations CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=COMPACT;

--
-- Extraindo dados da tabela `Cliente`
--
-- TODO --
INSERT INTO `Cliente` (`codCliente`, `nome`, `dataNascimento`, `sexo`, `nContribuinte`, `notas`) VALUES
('C0', 'fgfjsyfk', '2019-04-10', 'masculino', 221459876, 'getgq'),
('C1', 'jaime', '2021-04-19', 'masculino', 987654321, 'n1'),
('C2', 'Jaime Figueiredo', '2019-02-04', 'masculino', 123456789, 'Jaime123');

-- --------------------------------------------------------

--
-- Estrutura da tabela `Componente`
--

CREATE TABLE `Component` (
  `id` varchar(10) CONSTRAINT PK_component_id COLLATE utf8_unicode_ci NOT NULL,
  `commercialDesignation` CONSTRAINT NN_component_commercialDesignation varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `version` CONSTRAINT NN_component_version varchar(100) NOT NULL,
  `stockQuantity` CONSTRAINT NN_component_stockQuantity int(11) NOT NULL,
  `measureUnit` CONSTRAINT NN_component_measureUnit varchar(55) COLLATE utf8_unicode_ci NOT NULL,
  `alternative`CONSTRAINT NN_component_alternative varchar(10) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `Componente`
--
-- TODO --
INSERT INTO `Componente` (`codComponente`, `designacaoComercial`, `versao`, `quantidade`, `unidade`, `codAlternativo`) VALUES
('C1', 'safdas', 1, 12, 'm2', ''),
('C2', 'saf', 1, 3, 'l', 'C1'),
('C3', 'saf5', 2, 6, 'kj', ''),
('C4', 'c4dc', 1, 12, 'm2', 'C1'),
('C5', 'c5dc', 1, 15, 'lt', 'C2');

-- --------------------------------------------------------

--
-- Estrutura da tabela `Componente_Operacao`
--

CREATE TABLE `Component_Operation` (
  `componentId` CONSTRAINT FK_component_id varchar(55) COLLATE utf8_unicode_ci NOT NULL,
  `operationId` CONSTRAINT FK_operation_id varchar(55) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `Componente_Operacao`
--
-- TODO --
INSERT INTO `Componente_Operacao` (`codOperacao`, `codComponente`) VALUES
('O3', 'C3'),
('O4', 'C2'),
('O4', 'C4');

-- --------------------------------------------------------

--
-- Estrutura da tabela `Contacto`
--

CREATE TABLE `Contact` (
  `id` CONSTRAINT PK_contact_id varchar(55) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `clientId` CONSTRAINT FK_contact_client_id varchar(55) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `contact` CONSTRAINT NN_contact_contact varchar(55) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `contactType` CONSTRAINT NN_contact_contactType varchar(55) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `observations` varchar(55) CONSTRAINT NN_contact_observation CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `Contacto`
--

INSERT INTO `Contacto` (`codContacto`, `codCliente`, `contacto`, `tipoContacto`, `contactoPrincipal`) VALUES
('CT1', 'C1', '789654321', 'TLM', 1),
('CT2', 'C1', 'mail@jaime.com', 'EML', 0),
('CT3', 'C2', '963258741', 'TLM', 0),
('CT4', 'C2', 'jaime@mail.com', 'EML', 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `Encomenda`
--

CREATE TABLE `Encomenda` (
  `codEncomenda` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `dataEncomenda` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `dataUltimaModificacao` varchar(55) COLLATE utf8_unicode_ci NOT NULL,
  `hora` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `codCliente` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `infoExtra` varchar(55) COLLATE utf8_unicode_ci NOT NULL,
  `estado` varchar(55) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `valorTotal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=COMPACT;

--
-- Extraindo dados da tabela `Encomenda`
--

INSERT INTO `Encomenda` (`codEncomenda`, `dataEncomenda`, `dataUltimaModificacao`, `hora`, `codCliente`, `infoExtra`, `estado`, `valorTotal`) VALUES
('E1', '2021-04-25', '2021-05-01', '13', 'C0', 'sfrdf', 'as', 5),
('E2', '2021-05-13', '2021-05-02', '13:00', 'C0', 'infoextra', 'recebida', 13),
('E3', '2021-05-03', '2021-05-05', '19:24', 'C2', 'entregar amanha', 'ativo', 1600);

-- --------------------------------------------------------

--
-- Estrutura da tabela `LinhaFatura`
--

CREATE TABLE `LinhaFatura` (
  `codLinha` varchar(55) COLLATE utf8_unicode_ci NOT NULL,
  `codFatura` varchar(55) COLLATE utf8_unicode_ci NOT NULL,
  `codProduto` varchar(55) COLLATE utf8_unicode_ci NOT NULL,
  `quantidade` double NOT NULL,
  `valorTotal` double NOT NULL,
  `nota` varchar(55) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `Maquina`
--

CREATE TABLE `Maquina` (
  `codMaquina` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `descricao` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `horarioFuncionamento` varchar(55) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `Maquina`
--

INSERT INTO `Maquina` (`codMaquina`, `descricao`, `horarioFuncionamento`) VALUES
('m1', 'maquin1', 'st'),
('M2', 'soldador', 'segunda a sabado');

-- --------------------------------------------------------

--
-- Estrutura da tabela `Morada`
--

CREATE TABLE `Morada` (
  `codMorada` varchar(55) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `codCliente` varchar(55) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `Morada` varchar(55) COLLATE utf8_unicode_ci NOT NULL,
  `CodPostal` varchar(55) COLLATE utf8_unicode_ci NOT NULL,
  `Localidade` varchar(55) COLLATE utf8_unicode_ci NOT NULL,
  `Pais` varchar(55) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `Morada`
--

INSERT INTO `Morada` (`codMorada`, `codCliente`, `Morada`, `CodPostal`, `Localidade`, `Pais`) VALUES
('M0', 'C0', 'M', '4', 'P', 'P'),
('M1', 'C1', 'M', '4', 'P', 'P'),
('M2', 'C2', 'M', '4', 'P', 'P'),
('M3', 'T1', 'w', '3', 'w', 'w'),
('M4', 'C1', 'morada', '1000-321', 'porto', 'portugal'),
('M5', 'C2', 'morada jaime', '5241-236', 'porto', 'portugal');

-- --------------------------------------------------------

--
-- Estrutura da tabela `Operacao`
--

CREATE TABLE `Operacao` (
  `codOperacao` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `codProduto` varchar(55) COLLATE utf8_unicode_ci NOT NULL,
  `ordem` int(11) NOT NULL,
  `codMaquina` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `maoObra` int(11) NOT NULL,
  `tempo` int(11) NOT NULL,
  `quantidadeHora` int(11) NOT NULL,
  `intrucoesTecnicas` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=COMPACT;

--
-- Extraindo dados da tabela `Operacao`
--

INSERT INTO `Operacao` (`codOperacao`, `codProduto`, `ordem`, `codMaquina`, `maoObra`, `tempo`, `quantidadeHora`, `intrucoesTecnicas`) VALUES
('O1', 'P0', 1, 'm1', 4, 2, 3, 'sdasa'),
('O2', 'P5', 1, 'm1', 1, 1, 1, 'scxzx'),
('O3', 'P6', 1, 'm1', 1, 1, 1, 'mfvc'),
('O4', 'P7', 1, 'm1', 4, 2, 3, 'cx vcxcx'),
('O5', 'P8', 1, 'm1', 9, 4, 7, 'Instrucoes');

-- --------------------------------------------------------

--
-- Estrutura da tabela `OrdemFabrico`
--

CREATE TABLE `OrdemFabrico` (
  `codOrdem` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `codOperacao` varchar(10) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=COMPACT;

-- --------------------------------------------------------

--
-- Estrutura da tabela `Produto`
--

CREATE TABLE `Produto` (
  `referenciaProduto` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `designacao` varchar(55) COLLATE utf8_unicode_ci NOT NULL,
  `designacaoComercial` varchar(55) COLLATE utf8_unicode_ci NOT NULL,
  `quantidadeLote` int(11) NOT NULL,
  `unidade` varchar(55) COLLATE utf8_unicode_ci NOT NULL,
  `versao` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `Produto`
--

INSERT INTO `Produto` (`referenciaProduto`, `designacao`, `designacaoComercial`, `quantidadeLote`, `unidade`, `versao`, `estado`) VALUES
('p1', 'fds', 'sdf', 5, '2', 2, 1),
('P2', 'd1', 'dc1', 1, 'm2', 1, 0),
('P3', 'd1', 'd3', 1, 'm2', 1, 0),
('P4', 'dass', 'cdssa', 1, 'sa', 1, 0),
('P5', 'dsad', 'sad', 1, 'mr', 1, 1),
('P6', 'dsadsa', 'fdscx', 1, 'mw', 1, 1),
('P7', 'sdxzcfdscxz', 'fsdvcxdscxmw', 1, 'mr', 1, 0),
('P8', 'Produto 8', 'Produto 8 designacao comercial', 5, 'm2', 1, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `Produto_Operacao`
--

CREATE TABLE `Produto_Operacao` (
  `codProduto` varchar(55) COLLATE utf8_unicode_ci NOT NULL,
  `codOperacao` varchar(55) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `Produto_Operacao`
--

INSERT INTO `Produto_Operacao` (`codProduto`, `codOperacao`) VALUES
('p1', 'O3'),
('p1', 'O4'),
('p1', 'O5'),
('P2', 'O1'),
('P3', 'O1'),
('P3', 'O3'),
('P3', 'O4'),
('P3', 'O5'),
('P4', 'O5'),
('P5', 'O3'),
('P6', 'O4');

-- --------------------------------------------------------

--
-- Estrutura da tabela `Trabalhador`
--

CREATE TABLE `Trabalhador` (
  `codTrabalhador` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `nome` varchar(55) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `dataNascimento` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `sexo` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `nContribuinte` int(11) NOT NULL,
  `horarioTrabalho` varchar(55) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=COMPACT;

--
-- Extraindo dados da tabela `Trabalhador`
--

INSERT INTO `Trabalhador` (`codTrabalhador`, `nome`, `dataNascimento`, `sexo`, `nContribuinte`, `horarioTrabalho`) VALUES
('T1', 'a', '2021-03-29', 's', 1, '1');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Cliente`
--
ALTER TABLE `Cliente`
  ADD PRIMARY KEY (`codCliente`),
  ADD UNIQUE KEY `nContribuinte` (`nContribuinte`);

--
-- Indexes for table `Componente`
--
ALTER TABLE `Componente`
  ADD PRIMARY KEY (`codComponente`);

--
-- Indexes for table `Componente_Operacao`
--
ALTER TABLE `Componente_Operacao`
  ADD PRIMARY KEY (`codOperacao`,`codComponente`);

--
-- Indexes for table `Contacto`
--
ALTER TABLE `Contacto`
  ADD PRIMARY KEY (`codContacto`);

--
-- Indexes for table `Encomenda`
--
ALTER TABLE `Encomenda`
  ADD PRIMARY KEY (`codEncomenda`),
  ADD KEY `FK_encomenda_cliente` (`codCliente`);

--
-- Indexes for table `Maquina`
--
ALTER TABLE `Maquina`
  ADD PRIMARY KEY (`codMaquina`);

--
-- Indexes for table `Morada`
--
ALTER TABLE `Morada`
  ADD PRIMARY KEY (`codMorada`);

--
-- Indexes for table `Operacao`
--
ALTER TABLE `Operacao`
  ADD PRIMARY KEY (`codOperacao`),
  ADD KEY `FK_operacao_Maquina` (`codMaquina`);

--
-- Indexes for table `OrdemFabrico`
--
ALTER TABLE `OrdemFabrico`
  ADD PRIMARY KEY (`codOrdem`),
  ADD KEY `FK_ordemFabrico_operacao` (`codOperacao`);

--
-- Indexes for table `Produto`
--
ALTER TABLE `Produto`
  ADD PRIMARY KEY (`referenciaProduto`),
  ADD UNIQUE KEY `designacao` (`designacao`,`designacaoComercial`);

--
-- Indexes for table `Produto_Operacao`
--
ALTER TABLE `Produto_Operacao`
  ADD PRIMARY KEY (`codProduto`,`codOperacao`);

--
-- Indexes for table `Trabalhador`
--
ALTER TABLE `Trabalhador`
  ADD PRIMARY KEY (`codTrabalhador`),
  ADD UNIQUE KEY `nContribuinte` (`nContribuinte`);

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `Encomenda`
--
ALTER TABLE `Encomenda`
  ADD CONSTRAINT `FK_encomenda_cliente` FOREIGN KEY (`codCliente`) REFERENCES `Cliente` (`codcliente`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Limitadores para a tabela `Operacao`
--
ALTER TABLE `Operacao`
  ADD CONSTRAINT `FK_operacao_Maquina` FOREIGN KEY (`codMaquina`) REFERENCES `Maquina` (`codmaquina`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Limitadores para a tabela `OrdemFabrico`
--
ALTER TABLE `OrdemFabrico`
  ADD CONSTRAINT `FK_ordemFabrico_operacao` FOREIGN KEY (`codOperacao`) REFERENCES `Operacao` (`codoperacao`) ON DELETE RESTRICT ON UPDATE RESTRICT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
