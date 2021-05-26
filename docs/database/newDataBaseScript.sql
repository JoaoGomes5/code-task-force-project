USE [LP2_G3_2021]
GO

CREATE TABLE Client(
  id VARCHAR(10) IDENTITY(1,1) CONSTRAINT PK_client_id PRIMARY KEY,
  nif VARCHAR(9) CONSTRAINT NN_client_nif NOT NULL,
  name VARCHAR(55) CONSTRAINT NN_client_name  NOT NULL ,
  annotations VARCHAR(55) CONSTRAINT NN_client_annotations NOT NULL,
) 

CREATE TABLE Part (
  id INTEGER(10) IDENTITY(1,1) CONSTRAINT PK_part_id PRIMARY KEY,
  reference VARCHAR(55) CONSTRAINT NN_part_reference NOT NULL,
  designation VARCHAR(100) CONSTRAINT NN_part_designation NOT NULL,
  commercial_designation  VARCHAR(100) CONSTRAINT NN_part_commercial_designation NOT NULL,
  batch_size INTEGER(10) CONSTRAINT NN_part_batch_size NOT NULL,
  unit VARCHAR(10) CONSTRAINT NN_part_unit NOT NULL,
  version VARCHAR(10) CONSTRAINT NN_part_version NOT NULL,
  status  VARCHAR(10) CONSTRAINT NN_part_status NOT NULL,
);

CREATE TABLE Component (
  id VARCHAR(10) IDENTITY(1,1) CONSTRAINT PK_component_id PRIMARY KEY,
  reference VARCHAR(55) CONSTRAINT NN_component_reference NOT NULL,
  commercial_designation VARCHAR(100) CONSTRAINT NN_component_commercial_designation NOT NULL,
  version VARCHAR(10) CONSTRAINT NN_component_version NOT NULL,  
  quantity_needed FLOAT CONSTRAINT NN_component_stock_quantity NOT NULL,
  measure_unit VARCHAR(55)  CONSTRAINT NN_component_measureUnit NOT NULL,
  alternative VARCHAR(10) CONSTRAINT NN_component_alternative NOT NULL
) 

CREATE TABLE Operation (
      id                VARCHAR(10)  IDENTITY(1,1)  CONSTRAINT PK_operation_id  PRIMARY KEY,
      part_id           VARCHAR(55)  CONSTRAINT FK_operation_part_id  FOREIGN KEY REFERENCES Part(id),
      machine_code      VARCHAR(10)  CONSTRAINT FK_operation_machineCode FOREIGN KEY REFERENCES Machine(id),
      code              VARCHAR(10)  CONSTRAINT NN_operation_code NOT NULL,
      order             VARCHAR(10)  CONSTRAINT NN_operation_order NOT NULL,
      name              VARCHAR(20)  CONSTRAINT NN_operation_name NOT NULL,
      operators_needed  INTEGER(10)  CONSTRAINT NN_operation_operatorsNeeded NOT NULL,
      execution_time    INTEGER(10)  CONSTRAINT NN_operation_executionTime NOT NULL,
      quantity_per_hour INTEGER(10)  CONSTRAINT NN_operation_quantity_per_hour NOT NULL,
      instructions      VARCHAR(100) CONSTRAINT NN_operation_instructions NOT NULL,
      description       VARCHAR(100) CONSTRAINT NN_operation_description NOT NULL,
      instructions      VARCHAR(100) CONSTRAINT NN_operation_instructions NOT NULL,
      type              VARCHAR(10)  CONSTRAINT NN_operation_type NOT NULL
);


CREATE TABLE Component_Operation (
  id  VARCHAR(10) IDENTITY(1,1) CONSTRAINT PK_component_operation_id  PRIMARY KEY,
  component_id VARCHAR(10) CONSTRAINT FK_component_operation_component_id  FOREIGN KEY REFERENCES Component(id),
  operation_id VARCHAR(10) CONSTRAINT FK_component_operation_operation_id  FOREIGN KEY REFERENCES Operation(id)
) 


CREATE TABLE `Contact` (
  `id` CONSTRAINT PK_contact_id varchar(55) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `clientId` CONSTRAINT FK_contact_client_id varchar(55) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `contact` CONSTRAINT NN_contact_contact varchar(55) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `contactType` CONSTRAINT NN_contact_contactType varchar(55) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `observations` varchar(55) CONSTRAINT NN_contact_observation CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;


CREATE TABLE `Order` (
  `codEncomenda` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `dataEncomenda` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `dataUltimaModificacao` varchar(55) COLLATE utf8_unicode_ci NOT NULL,
  `hora` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `codCliente` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `infoExtra` varchar(55) COLLATE utf8_unicode_ci NOT NULL,
  `estado` varchar(55) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `valorTotal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=COMPACT;

CREATE TABLE `Line` (
  `codLinha` varchar(55) COLLATE utf8_unicode_ci NOT NULL,
  `codFatura` varchar(55) COLLATE utf8_unicode_ci NOT NULL,
  `codProduto` varchar(55) COLLATE utf8_unicode_ci NOT NULL,
  `quantidade` double NOT NULL,
  `valorTotal` double NOT NULL,
  `nota` varchar(55) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `Machine` (
  `codMaquina` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `descricao` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `horarioFuncionamento` varchar(55) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `Address` (
  `codMorada` varchar(55) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `codCliente` varchar(55) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `Morada` varchar(55) COLLATE utf8_unicode_ci NOT NULL,
  `CodPostal` varchar(55) COLLATE utf8_unicode_ci NOT NULL,
  `Localidade` varchar(55) COLLATE utf8_unicode_ci NOT NULL,
  `Pais` varchar(55) COLLATE utf8_unicode_ci NOT NULL
) 

CREATE TABLE `OrdemFabrico` (
  `codOrdem` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `codOperacao` varchar(10) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=COMPACT;

CREATE TABLE `Produto_Operacao` (
  `codProduto` varchar(55) COLLATE utf8_unicode_ci NOT NULL,
  `codOperacao` varchar(55) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

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
