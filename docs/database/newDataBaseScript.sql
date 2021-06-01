USE [LP2_G3_2021]
GO

CREATE TABLE Client(
  id VARCHAR(10) IDENTITY(1,1) CONSTRAINT PK_client_id PRIMARY KEY,
  nif VARCHAR(9) CONSTRAINT NN_client_nif NOT NULL,
  name VARCHAR(55) CONSTRAINT NN_client_name  NOT NULL ,
  annotations VARCHAR(55) CONSTRAINT NN_client_annotations NOT NULL,
 -- main_contact VARCHAR(55) CONSTRAINT FK_client_main_contact REFERENCES Contact(id)
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
); 

CREATE TABLE Part_Operation (
  id varchar(10) CONSTRAINT PK_part_operation_id PRIMARY KEY
  part_id varchar(55) CONSTRAINT FK_part_operation_part_id REFERENCES Part(id),
  operation_id varchar(55) CONSTRAINT FK_part_operation_operation_id REFERENCES Operation(id),
) 

CREATE TABLE Contact (
  id VARCHAR(10) IDENTITY(1,1) CONSTRAINT PK_contact_id  PRIMARY KEY,
  contact VARCHAR(30)  CONSTRAINT NN_contact_contact  NOT NULL,
  contact_type VARCHAR(10)  CONSTRAINT NN_contact_contact_type  NOT NULL,
  observation VARCHAR(10)  CONSTRAINT NN_contact_observation  NOT NULL,
)
GO
CREATE TABLE Order (
  id VARCHAR(10) IDENTITY(1,1) CONSTRAINT PK_order_id  PRIMARY KEY,
  nif VARCHAR(9) CONSTRAINT NN_order_nif NOT NULL,
  purchase_address INTEGER(10) CONSTRAINT FK_order_purchase_address FOREIGN KEY REFERENCES Address(id),
  delivery_address INTEGER(10) CONSTRAINT FK_order_delivery_address FOREIGN KEY REFERENCES Address(id),
  date DATE CONSTRAINT NN_order_date NOT NULL,
  state VARCHAR(50) CONSTRAINT NN_order_state NOT NULL,
  descount VARCHAR(10) CONSTRAINT NN_order_descount NOT NULL,
  total FLOAT CONSTRAINT NN_order_total NOT NULL
);
GO
CREATE TABLE Line (
  id VARCHAR(10) IDENTITY(1,1) CONSTRAINT PK_line_id  PRIMARY KEY,
  reference VARCHAR(50) CONSTRAINT NN_line_reference NOT NULL,
  description VARCHAR(100) CONSTRAINT NN_line_description NOT NULL,
  version VARCHAR(50) CONSTRAINT NN_line_version NOT NULL,
  quantity INTEGER(10) CONSTRAINT NN_line_quantity NOT NULL,
  unit VARCHAR(10) CONSTRAINT NN_line_unit NOT NULL,
  unit_price FLOAT CONSTRAINT NN_line_unit_price NOT NULL,
  total FLOAT CONSTRAINT NN_line_total NOT NULL,
);

CREATE TABLE Machine (
  id VARCHAR(10) IDENTITY(1,1) CONSTRAINT PK_machine_id  PRIMARY KEY,
  schedule_id varchar(10) CONSTRAINT NN_machine_schedule_id REFERENCES MachineSchedule(id),
  code VARCHAR(10)  CONSTRAINT NN_machine_code NOT NULL,
  name VARCHAR(10) CONSTRAINT NN_machine_name NOT NULL
  status VARCHAR(10) CONSTRAINT NN_machine_status NOT NULL,
)

CREATE TABLE MachineSchedule (
  id VARCHAR(10) IDENTITY(1,1) CONSTRAINT PK_machine_schedule_id  PRIMARY KEY,
  machine_id VARCHAR(10)  CONSTRAINT FK_machine_schedule_machine_id REFERENCES Machine(id),
  monday VARCHAR(10) CONSTRAINT NN_machine_schedule_monday NOT NULL, 
  tuesday VARCHAR(10) CONSTRAINT NN_machine_schedule_tuesday NOT NULL, 
  wednesday VARCHAR(10) CONSTRAINT NN_machine_schedule_wednesday NOT NULL, 
  thursday VARCHAR(10) CONSTRAINT NN_machine_schedule_thursday NOT NULL, 
  friday VARCHAR(10) CONSTRAINT NN_machine_schedule_friday NOT NULL, 
);

CREATE TABLE Address (
  id VARCHAR(10) CONSTRAINT PK_address_id PRIMARY KEY,
  client_id varchar(10) CONSTRAINT FK_address_client_id REFERENCES Client(id),
  address varchar(10) CONSTRAINT NN_address_address NOT NULL,
  postalCode varchar(10) CONSTRAINT NN_address_postalCode NOT NULL,
  locality varchar(10) CONSTRAINT NN_address_locality NOT NULL,
  country varchar(10) CONSTRAINT NN_address_country NOT NULL
) 

CREATE TABLE ManufacturingOrder (
  id varchar(10) CONSTRAINT PK_manufacturingOrder_id PRIMARY KEY,
  operation_id varchar(10) CONSTRAINT FK_manufacturingOrder_operation_id REFERENCES Operation(id)
) 



CREATE TABLE Operator (
  id VARCHAR(10) CONSTRAINT PK_operator_id PRIMARY KEY,
  schedule_id varchar(10) CONSTRAINT FK_operator_schedule_id REFERENCES OperatorSchedule(id),
  code varchar(10) CONSTRAINT NN_operator_code  NOT NULL,
  name varchar(55) CONSTRAINT NN_operator_name NOT NULL,
  state varchar(55) CONSTRAINT NN_operator_state NOT NULL
) ;

CREATE TABLE OperatorSchedule (
  id VARCHAR(10) IDENTITY(1,1) CONSTRAINT PK_operator_schedule_id  PRIMARY KEY,
  operator_id VARCHAR(10)  CONSTRAINT FK_operator_schedule_operator_id REFERENCES Operator(id),
  monday VARCHAR(10) CONSTRAINT NN_operator_schedule_monday NOT NULL, 
  tuesday VARCHAR(10) CONSTRAINT NN_operator_schedule_tuesday NOT NULL, 
  wednesday VARCHAR(10) CONSTRAINT NN_operator_schedule_wednesday NOT NULL, 
  thursday VARCHAR(10) CONSTRAINT NN_operator_schedule_thursday NOT NULL, 
  friday VARCHAR(10) CONSTRAINT NN_operator_schedule_friday NOT NULL, 
);

