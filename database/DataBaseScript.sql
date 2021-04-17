--USE master
--DROP DATABASE Code_Task_Force_Software
CREATE DATABASE Code_Task_Force_Software
GO
USE Code_Task_Force_Software
GO

CREATE TABLE Part (
	id INTEGER IDENTITY(1,1) CONSTRAINT pk_part_id_part PRIMARY KEY ,
	reference VARCHAR(50) CONSTRAINT nn_part_reference NOT NULL,
	designation VARCHAR(50) CONSTRAINT nn_part_designation NOT NULL,
	commercial_designation  VARCHAR(100) CONSTRAINT nn_part_commercialDesignation NOT NULL, 
	batch_size INTEGER CONSTRAINT nn_part_batchSize NOT NULL,
	unit VARCHAR(10) CONSTRAINT nn_part_unit NOT NULL,
	version VARCHAR(50) CONSTRAINT nn_part_version NOT NULL,
	status  VARCHAR(50) CONSTRAINT nn_part_status NOT NULL,
	--falta atributo operations que se relaciona com a tabela Operation
	--falta atributo components que se relaciona com a tabela Component
); 

CREATE TABLE Operation (
	id INTEGER IDENTITY(1,1) CONSTRAINT pk_operation_id PRIMARY KEY,
	name VARCHAR(50) CONSTRAINT nn_operation_name NOT NULL,
	--falta atibuto machine que se relaciona com a tabela Machine
	operators_needed INTEGER CONSTRAINT nn_operation_operators_needed NOT NULL,
	execution_time INTEGER CONSTRAINT nn_operation_execution_time NOT NULL,
	quantity_per_hour INTEGER CONSTRAINT nn_operation_quantity_per_hour NOT NULL,
	instructions VARCHAR(500) CONSTRAINT nn_operation_instructions NOT NULL,
	--falta atributo components que se relaciona com a tabela Component
);