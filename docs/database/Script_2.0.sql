Use master
--DROP DATABASE LP2
CREATE DATABASE LP2
-- USE Teste

-- !!!!!!!!
CREATE TABLE Address (
  id INT IDENTITY(1,1) CONSTRAINT PK_Address_id PRIMARY KEY,
  client_id VARCHAR(9) CONSTRAINT FK_Address_client_id REFERENCES Client(nif) ON UPDATE CASCADE ON DELETE CASCADE,
  address VARCHAR(255)  NOT NULL,
  postal_code VARCHAR(255) NOT NULL,
  locality VARCHAR(255) NOT NULL,
  country VARCHAR(255) NOT NULL,
  importance_type VARCHAR(255) NOT NULL,
  CONSTRAINT CHK_Address_importance_type
  CHECK (
    importance_type='principal' 
    OR 
    importance_type='secundaria'
  )
);

-- !!!!!!!
CREATE TABLE Contact (
  id INT IDENTITY(1,1) CONSTRAINT PK_Contact_id  PRIMARY KEY,
  client_id VARCHAR(9) CONSTRAINT FK_Contact_client_id REFERENCES Client(nif) ON UPDATE CASCADE ON DELETE CASCADE ,
  contact VARCHAR(255) UNIQUE NOT NULL,
  contact_type VARCHAR(255)  NOT NULL,
  observation VARCHAR(255) NOT NULL,
  importance_type VARCHAR(255) NOT NULL,
  CONSTRAINT CHK_Contact_importance_type 
   CHECK (
      importance_type='principal' 
      OR 
      importance_type='secundario'
      )
);

-- !!!!!!!
CREATE TABLE Client (
  nif VARCHAR(9) CONSTRAINT PK_Client_nif PRIMARY KEY,
  name VARCHAR(255) NOT NULL ,
  annotations VARCHAR(255) NOT NULL,
);

-- !!!!!!!
CREATE TABLE "Order" (
  id INT IDENTITY(1,1) CONSTRAINT PK_Order_id  PRIMARY KEY,
  client_nif VARCHAR(9) CONSTRAINT FK_Order_client_nif  REFERENCES Client(nif) ON UPDATE CASCADE ON DELETE CASCADE,
  purchase_address INT CONSTRAINT FK_Order_purchase_address  REFERENCES Address(id) ,
  delivery_address INT CONSTRAINT FK_Order_delivery_address  REFERENCES Address(id) ,
  date  DATETIME NOT NULL ,
  state VARCHAR(255) NOT NULL,
  descount DECIMAL(5,3) NOT NULL,
  total FLOAT NOT NULL,
  CONSTRAINT CHK_Order_state 
   CHECK (
      state='registada' 
      OR 
      state='finalizada'
      OR
      state='entregue'
      OR
      state='cancelada'
      ),
  CONSTRAINT CHK_Order_date 
  CHECK (
    date LIKE 'AAAA-MM-DD [HH:MM[:SS[.mmm]]]'
    ),
);


CREATE TABLE Line (
  reference VARCHAR(255) CONSTRAINT PK_Line_id PRIMARY KEY,
  order_id INT CONSTRAINT FK_Line_order_id REFERENCES "Order"(id) ON UPDATE CASCADE ON DELETE CASCADE,
  description VARCHAR(255) NOT NULL,
  version VARCHAR(255)  NOT NULL,
  quantity INT  NOT NULL,
  unit VARCHAR(10) NOT NULL,
  unit_price FLOAT NOT NULL,
  total FLOAT NOT NULL,
);

-- !!!!!!!
CREATE TABLE Part (
  reference VARCHAR(255) CONSTRAINT PK_Part_reference PRIMARY KEY,
  order_id  INT CONSTRAINT FK_Part_order_id REFERENCES "Order"(id) ON UPDATE CASCADE ON DELETE CASCADE,
  designation VARCHAR(255) NOT NULL,
  commercial_designation VARCHAR(255) NOT NULL,
  batch_size INT  NOT NULL,
  unit VARCHAR(255) NOT NULL,
  version VARCHAR(255) NOT NULL,
  status  VARCHAR(10) NOT NULL,
  CONSTRAINT CHK_Part_status
  CHECK (
    status='ativo' 
    OR 
    status='inativo'
    )
);

-- !!!!!!!!
CREATE TABLE Operation (
      code              VARCHAR(255)  CONSTRAINT PK_Operation_code PRIMARY KEY,
      machine_code      VARCHAR(255) CONSTRAINT FK_operation_machine_code REFERENCES Machine(code) ON UPDATE CASCADE ON DELETE CASCADE,
      execution_order   INT NOT NULL,
      name              VARCHAR(255) NOT NULL,
      operators_needed  INT NOT NULL,
      execution_time    INT NOT NULL,
      quantity_per_hour INT  NOT NULL,
      instructions      VARCHAR(255) NOT NULL,
      description       VARCHAR(255) NOT NULL,
      operation_instructions      VARCHAR(255) NOT NULL,
      type						  VARCHAR(255) NOT NULL
);

-- !!!!!!!!!!
CREATE TABLE Component (
  reference VARCHAR(255) CONSTRAINT PK_Component_reference PRIMARY KEY,
  commercial_designation VARCHAR(255) NOT NULL,
  version VARCHAR(255) NOT NULL,  
  quantity_needed FLOAT NOT NULL,
  measure_unit VARCHAR(255) NOT NULL,
  alternative VARCHAR(255) NOT NULL
);

-- !!!!!!!!!!
CREATE TABLE Machine (
  code VARCHAR(255)  CONSTRAINT PK_Machine_code PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  status VARCHAR(255) NOT NULL,

  monday_start DATETIME  NOT NULL, 
  tuesday_start DATETIME  NOT NULL, 
  wednesday_start DATETIME NOT NULL, 
  thursday_start DATETIME NOT NULL, 
  friday_start DATETIME NOT NULL, 

  monday_end DATETIME NOT NULL, 
  tuesday_end DATETIME NOT NULL, 
  wednesday_end DATETIME NOT NULL, 
  thursday_end DATETIME NOT NULL, 
  friday_end DATETIME NOT NULL,

  CONSTRAINT CHK_Machine_status
  CHECK (
    status='ativo' 
    OR 
    status='inativo'
    )
);

-- !!!!!!!
CREATE TABLE Operator (
  code varchar(255) CONSTRAINT PK_Operator_code  PRIMARY KEY,
  name varchar(255)NOT NULL,
  state varchar(255) NOT NULL,

  monday_morning_entrance DATETIME NOT NULL, 
  tuesday_morning_entrance DATETIME  NOT NULL, 
  wednesday_morning_entrance DATETIME  NOT NULL, 
  thursday_morning_entrance DATETIME  NOT NULL, 
  friday_morning_entrance DATETIME  NOT NULL, 

  monday_morning_exit DATETIME  NOT NULL, 
  tuesday_morning_exit DATETIME  NOT NULL, 
  wednesday_morning_exit DATETIME  NOT NULL, 
  thursday_morning_exit DATETIME  NOT NULL, 
  friday_morning_exit DATETIME  NOT NULL,
  
  monday_afternoon_entrance DATETIME  NOT NULL, 
  tuesday_afternoon_entrance DATETIME  NOT NULL, 
  wednesday_afternoon_entrance DATETIME  NOT NULL, 
  thursday_afternoon_entrance DATETIME  NOT NULL, 
  friday_afternoon_entrance DATETIME  NOT NULL, 

  monday_afternoon_exit DATETIME  NOT NULL, 
  tuesday_afternoon_exit DATETIME  NOT NULL, 
  wednesday_afternoon_exit DATETIME  NOT NULL, 
  thursday_afternoon_exit DATETIME  NOT NULL, 
  friday_afternoon_exit DATETIME  NOT NULL,

  CONSTRAINT CHK_Operator_status
  CHECK (
    state='ativo'
    OR 
    state='inativo'
    )
);


-- !!!!!!!!
CREATE TABLE ManufacturingOrder (
  reference varchar(255) CONSTRAINT PK_manufacturingOrder_reference PRIMARY KEY,
  operation_id VARCHAR(255) CONSTRAINT FK_manufacturingOrder_operation_id REFERENCES Operation(code)
);


-- !!!!!!
CREATE TABLE Component_Operation (
  component_id VARCHAR(255) NOT NULL,
  operation_id varchar(255)  NOT NULL,
  
  	CONSTRAINT PK_Component_Operation_id PRIMARY KEY (component_id, operation_id),
  		CONSTRAINT FK_Component_Operation_component_id
      		FOREIGN KEY (component_id) REFERENCES  Component(reference) ON UPDATE CASCADE ON DELETE CASCADE,
  		CONSTRAINT FK_Component_Operation_operation_id
      		FOREIGN KEY (operation_id) REFERENCES Operation(code) ON UPDATE CASCADE ON DELETE CASCADE,
);

-- !!!!!!!
CREATE TABLE Operation_Operator (
  operation_id VARCHAR(255) NOT NULL,
  operator_id VARCHAR(255)  NOT NULL,
  
  	CONSTRAINT PK_Operation_Operator_id PRIMARY KEY (operation_id, operator_id),
  		CONSTRAINT FK_Operation_Operator_operation_id
      		FOREIGN KEY (operation_id) REFERENCES  Operation(code) ON UPDATE CASCADE ON DELETE CASCADE,
  		CONSTRAINT FK_Operation_Operator_Operator_id
      		FOREIGN KEY (operator_id) REFERENCES Operator(code) ON UPDATE CASCADE ON DELETE CASCADE,
);


-- !!!!!!
CREATE TABLE Part_Operation (
  part_id VARCHAR(255) NOT NULL,
  operation_id VARCHAR(255)  NOT NULL,
  
  	CONSTRAINT FK_Part_Operation_id  PRIMARY KEY (part_id, operation_id),
  		CONSTRAINT FK_Part_Operation_part_id
      		FOREIGN KEY (part_id) REFERENCES  Part(reference) ON UPDATE CASCADE ON DELETE CASCADE,
  		CONSTRAINT FK_Part_Operation_operation_id
      		FOREIGN KEY (operation_id) REFERENCES Operation(code) ON UPDATE CASCADE ON DELETE CASCADE,
);






