USE [LP2_G3_2021]
GO
--/****** Object:  User [LP2_G3_2021]    Script Date: 28/04/2021 21:19:04 ******/
--CREATE USER [LP2_G3_2021] FOR LOGIN [LP2_G3_2021] WITH DEFAULT_SCHEMA=[dbo]
--GO
--ALTER ROLE [db_owner] ADD MEMBER [LP2_G3_2021]
--GO

--CREATE DATABASE Code_Task_Force_Software
--GO
--USE Code_Task_Force_Software
--GO

CREATE TABLE Part (
                      id INTEGER IDENTITY(1,1) CONSTRAINT pk_part_id PRIMARY KEY ,
                      reference VARCHAR CONSTRAINT nn_part_reference NOT NULL,
                      designation VARCHAR CONSTRAINT nn_part_designation NOT NULL,
                      commercial_designation  VARCHAR(100) CONSTRAINT nn_part_commercialDesignation NOT NULL,
                      batch_size INTEGER CONSTRAINT nn_part_batchSize NOT NULL,
                      unit VARCHAR(10) CONSTRAINT nn_part_unit NOT NULL,
                      version VARCHAR CONSTRAINT nn_part_version NOT NULL,
                      status  VARCHAR CONSTRAINT nn_part_status NOT NULL,
    --falta atributo operations que se relaciona com a tabela Operation
    --falta atributo components que se relaciona com a tabela Component
);
CREATE TABLE Machine (
                         id INTEGER IDENTITY(1,1) CONSTRAINT pk_machine_id PRIMARY KEY ,
                         name VARCHAR(50) CONSTRAINT nn_machine_name NOT NULL,
                         code VARCHAR(50) CONSTRAINT nn_machine_code NOT NULL,
    --schedule DO TIPO ARRAY CONSTRAINT nn_machine_schedule NOT NULL,
                         status VARCHAR CONSTRAINT nn_machine_status NOT NULL

);
CREATE TABLE Operation (
                           id                INTEGER IDENTITY(1,1) CONSTRAINT pk_operation_id PRIMARY KEY ,
                           name              VARCHAR               CONSTRAINT nn_operation_name NOT NULL,
                           machine           INTEGER               CONSTRAINT fk_operation_machine REFERENCES Machine(id) NOT NULL,
                           operators_needed  INTEGER               CONSTRAINT nn_operation_operators_needed NOT NULL,
                           execution_time    INTEGER               CONSTRAINT nn_operation_execution_time NOT NULL,
                           quantity_per_hour INTEGER               CONSTRAINT nn_operation_quantity_per_hour NOT NULL,
                           instructions      VARCHAR               CONSTRAINT nn_operation_instructions NOT NULL,
    --falta atributo components que se relaciona com a tabela Component
);



CREATE TABLE Component (
                           id INTEGER IDENTITY(1,1) CONSTRAINT pk_component_id PRIMARY KEY,
                           reference VARCHAR(10) CONSTRAINT nn_component_reference NOT NULL,
                           commercialDesignation VARCHAR(40) CONSTRAINT nn_component_commercialDesignation NOT NULL,
                           version VARCHAR(5) CONSTRAINT nn_component_commercialDesignation NOT NULL,
                           stock INT CONSTRAINT nn_component_stock NOT NULL,
                           measureUnit VARCHAR(5) CONSTRAINT nn_component_measureUnit NOT NULL,
                           alternative VARCHAR(10) CONSTRAINT nn_component_measureUnit NOT NULL,
);


CREATE TABLE Operator (
                          id INTEGER IDENTITY(1,1) CONSTRAINT pk_operator_id PRIMARY KEY ,
                          code VARCHAR CONSTRAINT nn_operator_code NOT NULL,
    --schedule DO TIPO ARRAY CONSTRAINT nn_operator_schedule NOT NULL,
                          status VARCHAR CONSTRAINT nn_operator_status NOT NULL

);


--INSERTS

--SET IDENTITY_INSERT id ON

INSERT INTO Component (reference, commercialDesignation, version, stock, measureUnit, alternative)
VALUES ('sqtb30302', 'Tubo Quadrado 30x30x2', 1, 500, 'mm', 2)
VALUES ('rdtb03002', 'Tubo Redondo Diam. 30x2', 1, 500, 'mm', 1);
VALUES ('sqtb30302', 'Tubo Quadrado 30x30x2', 1, 500, 'mm', 0002);
VALUES ('sqtb30302', 'Tubo Quadrado 30x30x2', 1, 500, 'mm', 0002);
VALUES ('sqtb30302', 'Tubo Quadrado 30x30x2', 1, 500, 'mm', 0002);
VALUES ('sqtb30302', 'Tubo Quadrado 30x30x2', 1, 500, 'mm', 0002);
VALUES ('sqtb30302', 'Tubo Quadrado 30x30x2', 1, 500, 'mm', 0002);
VALUES ('sqtb30302', 'Tubo Quadrado 30x30x2', 1, 500, 'mm', 0002);

--SET IDENTITY_INSERT Component OFF
--GO