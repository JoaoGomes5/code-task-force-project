USE Teste
GO

CREATE TABLE Client(
  id INT IDENTITY(1,1) CONSTRAINT PK_client_id PRIMARY KEY,
  main_contact VARCHAR(55) CONSTRAINT FK_client_main_contact REFERENCES Contact(id),
  nif VARCHAR(9) CONSTRAINT NN_client_nif NOT NULL,
  name VARCHAR(55) CONSTRAINT NN_client_name  NOT NULL ,
  annotations VARCHAR(55) CONSTRAINT NN_client_annotations NOT NULL,
);

GOa

CREATE TABLE Part (
  id INT IDENTITY(1,1) CONSTRAINT PK_part_id PRIMARY KEY,
  reference VARCHAR(55) CONSTRAINT NN_part_reference NOT NULL,
  designation VARCHAR(100) CONSTRAINT NN_part_designation NOT NULL,
  commercial_designation  VARCHAR(100) CONSTRAINT NN_part_commercial_designation NOT NULL,
  batch_size INT CONSTRAINT NN_part_batch_size NOT NULL,
  unit VARCHAR(10) CONSTRAINT NN_part_unit NOT NULL,
  version VARCHAR(10) CONSTRAINT NN_part_version NOT NULL,
  status  VARCHAR(10) CONSTRAINT NN_part_status NOT NULL,
);

GO

CREATE TABLE Component (
  id INT IDENTITY(1,1) CONSTRAINT PK_component_id PRIMARY KEY,
  reference VARCHAR(55) CONSTRAINT NN_component_reference NOT NULL,
  commercial_designation VARCHAR(100) CONSTRAINT NN_component_commercial_designation NOT NULL,
  version VARCHAR(10) CONSTRAINT NN_component_version NOT NULL,  
  quantity_needed FLOAT CONSTRAINT NN_component_stock_quantity NOT NULL,
  measure_unit VARCHAR(55)  CONSTRAINT NN_component_measureUnit NOT NULL,
  alternative VARCHAR(10) CONSTRAINT NN_component_alternative NOT NULL
);

GO

CREATE TABLE Machine (
  id INT IDENTITY(1,1) CONSTRAINT PK_machine_id  PRIMARY KEY,
  code VARCHAR(10)  CONSTRAINT NN_machine_code NOT NULL,
  name VARCHAR(10) CONSTRAINT NN_machine_name NOT NULL,
  status VARCHAR(10) CONSTRAINT NN_machine_status NOT NULL,

  monday_start DATETIME CONSTRAINT NN_operator_schedule__start NOT NULL, 
  tuesday_start DATETIME CONSTRAINT NN_operator_schedule_tuesday_start NOT NULL, 
  wednesday_start DATETIME CONSTRAINT NN_operator_schedule_wednesday_start NOT NULL, 
  thursday_start DATETIME CONSTRAINT NN_operator_schedule_thursday_start NOT NULL, 
  friday_start DATETIME CONSTRAINT NN_operator_schedule_friday_start NOT NULL, 

  monday_end DATETIME CONSTRAINT NN_operator_schedule_monday_end NOT NULL, 
  tuesday_end DATETIME CONSTRAINT NN_operator_schedule_tuesday_end NOT NULL, 
  wednesday_end DATETIME CONSTRAINT NN_operator_schedule_wednesday_end NOT NULL, 
  thursday_end DATETIME CONSTRAINT NN_operator_schedule_thursday_end NOT NULL, 
  friday_end DATETIME CONSTRAINT NN_operator_schedule_friday_end NOT NULL,
);

GO

CREATE TABLE Operation (
      id                INT  IDENTITY(1,1)  CONSTRAINT PK_operation_id  PRIMARY KEY,
      part_id           INT  CONSTRAINT FK_operation_part_id  FOREIGN KEY REFERENCES Part(id),
      machine_code      INT CONSTRAINT FK_operation_machineCode FOREIGN KEY REFERENCES Machine(id),
      code              VARCHAR(10)  CONSTRAINT NN_operation_code NOT NULL,
      execution_order             VARCHAR(10)  CONSTRAINT NN_operation_order NOT NULL,
      name              VARCHAR(20)  CONSTRAINT NN_operation_name NOT NULL,
      operators_needed  INT  CONSTRAINT NN_operation_operatorsNeeded NOT NULL,
      execution_time    INT  CONSTRAINT NN_operation_executionTime NOT NULL,
      quantity_per_hour INT  CONSTRAINT NN_operation_quantity_per_hour NOT NULL,
      instructions      VARCHAR(100) CONSTRAINT NN_operation_instructions NOT NULL,
      description       VARCHAR(100) CONSTRAINT NN_operation_description NOT NULL,
      operation_instructions      VARCHAR(100) CONSTRAINT NN_operation_instructions NOT NULL,
      type						  VARCHAR(10)  CONSTRAINT NN_operation_type NOT NULL
);

GO

CREATE TABLE Operator (
  id VARCHAR(10) CONSTRAINT PK_operator_id PRIMARY KEY,
  code varchar(10) CONSTRAINT NN_operator_code  NOT NULL,
  name varchar(55) CONSTRAINT NN_operator_name NOT NULL,
  state varchar(55) CONSTRAINT NN_operator_state NOT NULL,

  monday_morning_entrance DATETIME CONSTRAINT NN_operator_schedule__morning_entrance NOT NULL, 
  tuesday_morning_entrance DATETIME CONSTRAINT NN_operator_schedule_tuesday_morning_entrance NOT NULL, 
  wednesday_morning_entrance DATETIME CONSTRAINT NN_operator_schedule_wednesday_morning_entrance NOT NULL, 
  thursday_morning_entrance DATETIME CONSTRAINT NN_operator_schedule_thursday_morning_entrance NOT NULL, 
  friday_morning_entrance DATETIME CONSTRAINT NN_operator_schedule_friday_morning_entrance NOT NULL, 

  monday_morning_exit DATETIME CONSTRAINT NN_operator_schedule_monday_morning_exit NOT NULL, 
  tuesday_morning_exit DATETIME CONSTRAINT NN_operator_schedule_tuesday_morning_exit NOT NULL, 
  wednesday_morning_exit DATETIME CONSTRAINT NN_operator_schedule_wednesday_morning_exit NOT NULL, 
  thursday_morning_exit DATETIME CONSTRAINT NN_operator_schedule_thursday_morning_exit NOT NULL, 
  friday_morning_exit DATETIME CONSTRAINT NN_operator_schedule_friday_morning_exit NOT NULL,
  
  monday_afternoon_entrance DATETIME CONSTRAINT NN_operator_schedule__afternoon_entrance NOT NULL, 
  tuesday_afternoon_entrance DATETIME CONSTRAINT NN_operator_schedule_tuesday_afternoon_entrance NOT NULL, 
  wednesday_afternoon_entrance DATETIME CONSTRAINT NN_operator_schedule_wednesday_afternoon_entrance NOT NULL, 
  thursday_afternoon_entrance DATETIME CONSTRAINT NN_operator_schedule_thursday_afternoon_entrance NOT NULL, 
  friday_afternoon_entrance DATETIME CONSTRAINT NN_operator_schedule_friday_afternoon_entrance NOT NULL, 

  monday_afternoon_exit DATETIME CONSTRAINT NN_operator_schedule_monday_afternoon_exit NOT NULL, 
  tuesday_afternoon_exit DATETIME CONSTRAINT NN_operator_schedule_tuesday_afternoon_exit NOT NULL, 
  wednesday_afternoon_exit DATETIME CONSTRAINT NN_operator_schedule_wednesday_afternoon_exit NOT NULL, 
  thursday_afternoon_exit DATETIME CONSTRAINT NN_operator_schedule_thursday_afternoon_exit NOT NULL, 
  friday_afternoon_exit DATETIME CONSTRAINT NN_operator_schedule_friday_afternoon_exit NOT NULL,

);

GO

CREATE TABLE Contact (
  id INT IDENTITY(1,1) CONSTRAINT PK_contact_id  PRIMARY KEY,
  client_id INT CONSTRAINT FK_contact_client_id  REFERENCES Client(id),
  contact VARCHAR(30)  CONSTRAINT NN_contact_contact  NOT NULL,
  contact_type VARCHAR(10)  CONSTRAINT NN_contact_contact_type  NOT NULL,
  observation VARCHAR(10)  CONSTRAINT NN_contact_observation  NOT NULL,
);

GO

CREATE TABLE MachineSchedule (
  id INT IDENTITY(1,1) CONSTRAINT PK_machine_schedule_id  PRIMARY KEY,
  machine_id INT  CONSTRAINT FK_machine_schedule_machine_id REFERENCES Machine(id),
  monday VARCHAR(10) CONSTRAINT NN_machine_schedule_monday NOT NULL, 
  tuesday VARCHAR(10) CONSTRAINT NN_machine_schedule_tuesday NOT NULL, 
  wednesday VARCHAR(10) CONSTRAINT NN_machine_schedule_wednesday NOT NULL, 
  thursday VARCHAR(10) CONSTRAINT NN_machine_schedule_thursday NOT NULL, 
  friday VARCHAR(10) CONSTRAINT NN_machine_schedule_friday NOT NULL, 
);

GO

CREATE TABLE Address (
  id INT CONSTRAINT PK_address_id PRIMARY KEY,
  client_id INT CONSTRAINT FK_address_client_id REFERENCES Client(id),
  address varchar(10) CONSTRAINT NN_address_address NOT NULL,
  postalCode varchar(10) CONSTRAINT NN_address_postalCode NOT NULL,
  locality varchar(10) CONSTRAINT NN_address_locality NOT NULL,
  country varchar(10) CONSTRAINT NN_address_country NOT NULL
);

GO

CREATE TABLE "Order" (
  id INT IDENTITY(1,1) CONSTRAINT PK_order_id  PRIMARY KEY,
  nif VARCHAR(9) CONSTRAINT NN_order_nif NOT NULL,
  purchase_address INT CONSTRAINT FK_order_purchase_address  REFERENCES Address(id),
  delivery_address INT CONSTRAINT FK_order_delivery_address  REFERENCES Address(id),
  date DATE CONSTRAINT NN_order_date NOT NULL,
  state VARCHAR(50) CONSTRAINT NN_order_state NOT NULL,
  descount VARCHAR(10) CONSTRAINT NN_order_descount NOT NULL,
  total FLOAT CONSTRAINT NN_order_total NOT NULL
);

GO

CREATE TABLE Line (
  id INT IDENTITY(1,1) CONSTRAINT PK_line_id  PRIMARY KEY,
  order_id INT CONSTRAINT FK_line_order_id REFERENCES Order(id) NULL,
  reference VARCHAR(50) CONSTRAINT NN_line_reference NOT NULL,
  description VARCHAR(100) CONSTRAINT NN_line_description NOT NULL,
  version VARCHAR(50) CONSTRAINT NN_line_version NOT NULL,
  quantity INT CONSTRAINT NN_line_quantity NOT NULL,
  unit VARCHAR(10) CONSTRAINT NN_line_unit NOT NULL,
  unit_price FLOAT CONSTRAINT NN_line_unit_price NOT NULL,
  total FLOAT CONSTRAINT NN_line_total NOT NULL,
);

GO

CREATE TABLE ManufacturingOrder (
  id varchar(10) CONSTRAINT PK_manufacturingOrder_id PRIMARY KEY,
  operation_id INT CONSTRAINT FK_manufacturingOrder_operation_id REFERENCES Operation(id)
);

GO


CREATE TABLE Component_Operation (
  id  INT IDENTITY(1,1) CONSTRAINT PK_component_operation_id  PRIMARY KEY,
  component_id INT CONSTRAINT FK_component_operation_component_id  REFERENCES Component(id),
  operation_id INT CONSTRAINT FK_component_operation_operation_id  REFERENCES Operation(id)
);

GO

CREATE TABLE Operation_Operator (
  id  INT IDENTITY(1,1) CONSTRAINT PK_component_operation_id  PRIMARY KEY,
  operation_id INT CONSTRAINT FK_operation_operator_operation_id  REFERENCES Operation(id),
  operator_id INT CONSTRAINT FK_operation_operator_operator_id  REFERENCES Operator(id)
);

GO

CREATE TABLE Part_Operation (
  id INT CONSTRAINT PK_part_operation_id PRIMARY KEY,
  part_id INT CONSTRAINT FK_part_operation_part_id REFERENCES Part(id),
  operation_id INT CONSTRAINT FK_part_operation_operation_id REFERENCES Operation(id),
);

