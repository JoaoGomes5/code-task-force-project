--USE master
--DROP DATABASE Code_Task_Force_Software
CREATE DATABASE Code_Task_Force_Software
GO
USE Code_Task_Force_Software
GO

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

CREATE TABLE Operation (
                           id INTEGER IDENTITY(1,1) CONSTRAINT pk_operation_id PRIMARY KEY,
                           name VARCHAR CONSTRAINT nn_operation_name NOT NULL,
                           machine VARCHAR CONSTRAINT fk_operation_machine REFERENCES ,
                           operators_needed INTEGER CONSTRAINT nn_operation_operators_needed NOT NULL,
                           execution_time INTEGER CONSTRAINT nn_operation_execution_time NOT NULL,
                           quantity_per_hour INTEGER CONSTRAINT nn_operation_quantity_per_hour NOT NULL,
                           instructions VARCHAR CONSTRAINT nn_operation_instructions NOT NULL,
    --falta atributo components que se relaciona com a tabela Component
);

CREATE TABLE Machine (
                         id INTEGER IDENTITY(1,1) CONSTRAINT pk_machine_id PRIMARY KEY ,
                         code VARCHAR CONSTRAINT nn_machine_code NOT NULL,
    --schedule DO TIPO ARRAY CONSTRAINT nn_machine_schedule NOT NULL,
                         status VARCHAR CONSTRAINT nn_machine_status NOT NULL

);

CREATE TABLE Component (
                           id INTEGER IDENTITY(1,1) CONSTRAINT pk_component_id PRIMARY KEY,
                           reference VARCHAR CONSTRAINT nn_component_reference NOT NULL,
                           commercialDesignation VARCHAR CONSTRAINT nn_component_commercialDesignation NOT NULL,
                           version VARCHAR CONSTRAINT nn_component_commercialDesignation NOT NULL,
                           quantityNeeded FLOAT CONSTRAINT nn_component_quantityNeeded NOT NULL,
                           measureUnit VARCHAR CONSTRAINT nn_component_measureUnit NOT NULL,
                           alternative VARCHAR CONSTRAINT nn_component_measureUnit NOT NULL,
);


CREATE TABLE Operator (
                          id INTEGER IDENTITY(1,1) CONSTRAINT pk_operator_id PRIMARY KEY ,
                          code VARCHAR CONSTRAINT nn_operator_code NOT NULL,
    --schedule DO TIPO ARRAY CONSTRAINT nn_operator_schedule NOT NULL,
                          status VARCHAR CONSTRAINT nn_operator_status NOT NULL

);