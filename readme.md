# Code Task Force Project

# Objectives
    - 

# Good Pratices Ideas
    - Todo o codigo produzido / nome commits em inglês 
    - Variaveis explicativas 
    - Cammel Case 
    - Divisão de tarefas equitativa 
    - Não implementar o codigo sem ter uma base estuturada 
    - Usar git como sistema de versionamento 
    - Usar gitHub como repositorio remoto
    - Contacto entre a equipa 
    - SCRUM 
    - Todas as classes teem um handler responsavel pelas atividades da classe
    - O controlo de código fonte deve ser feito com recurso ao Git flow, usando as seguintes nomenclaturas: 
        • Branch name: (feat/fix)-(task_number)-description
          o feat-002-create-classe-xpto
        • Os commits devem conter descrições claras e sucintas 
          o Descrições como “fix task X ou general fix” não são toleráveis 

# Requisitos e regras de negocio 
    - Os seus clientes realizam encomendas à All2You que por sua vez irá satisfazer as mesmas 
    encomendas. Essas encomendas podem ser satisfeitas no ato ou então terão de ser produzidas 
    caso não exista stock.
    - As operações são guardadas com um código, descrição e tipo (o tipo irá filtrar a escolha 
    da máquina) e são carregadas na ficha da peça/produto.      
    - As máquinas são carregadas em cada operação com base no tipo da operação. Por 
    exemplo, as máquinas do tipo Soldadura só podem ser carregadas para operações do tipo 
    Soldadura.
    - As máquinas e os operadores terão de guardar a informação do seu horário de trabalho 
    e do seu estado (ativo ou inativo).
      
# Menu 
 - Menu composto pelas seguintes funcionalidades:   
    - Gestão de Clientes
    - Gestão de Encomendas
    - Fichas técnicas (Ver informação dos artigos)
    - Configurações (CRUD (Create, Read, Update, Delete)) 
    - Sair

# Classes

## Article - Artigo
    - Referencia - reference - String
    - Designação comercial - commercialDesignation - String
    - Versão - version - String
    

## Peça/Produto - Part extends Article 
    - Designação - designation - String 
    - Quantidade Lote (é a quantidade que será desenvolvida para vez que a peça é produzida) - batchSize - integer
    - Unidade - unit - String
    - Estado (ativo ou inativo) - status - boolean
    - Operações - operations - ArrayList<Operation> 


## Componente - Component extends Article 
    - Quantidade - quantityNeeded - float
    - Unidade - measureUnit - String - (A quantidade utiliza para construir o componente) 
    - Alternativa - alternative - Part - (caso não exista stock da peça a ser construída pode ser usada a sua alternativa)

## Operação - Operation 
    - Código - code - String
    - Ordem - order - integer
    - Nome - name - String
    - Máquina - Machine - Machine
    - Mão de obra (quantidade de operadores necessários) - operatorsNeeded - integer
    - Tempo (em segundos) - executionTime - integer
    - Quantidade Hora (campo de cálculo para informação de quantidade que  será produzida por hora) - quantityPerHour - integer
    - Instruções técnicas - instructions - String
    - Componentes - components - ArrayList<Component>
    - Descrição - description - String
    - Tipo - type - String

## Máquina - Machine
    - Codigo - code - String
    - Nome - name - String
    - Horário de trabalho - schedule - Array schedule - (em cada dia da semana as horas que trabalha) 
    - Estado - status

## Operador - Operator
    - Codigo - code - String
    - Nome - name - String
    - Horário de trabalho - schedule - (pausas, horario por dia)
    - Estado - state - boolean (quando fazermos o display do estado colocar Ativo ou Inativo)

## Client - Cliente
    - NIF - nif - String
    - Nome - name - String
    - Moradas (Podemos guardar a morada principal e moradas alternativas) - addresses - ArrayList<Address>
    - Contactos (podemos guardar o contacto principal e contactos alternativos) - contacts - ArrayList<Contact>
    - Notas - annotation - String

## Address - Norada
    - Morada - address - String
    - Código postal - postalCode - String
    - Localidade - locality - String
    - País - country - String

## Contact - Contacto
    - Contacto - contact - String
    - Tipo contacto (e-mail, telefone, telemóvel, etc..) - contactType - String
    - Observações - observations - String 

## Order - Encomenda
    - Informação do cliente 
        (possibilidade de preencher os dados do cliente) 
        (possibilidade de escolher por NIF)
    - Morada de faturação - 
    - Morada de entrega - 
    - Nº de documento - documentNumber - int
    - Data de documento - date - Date
    - Estado - state - String
    - Desconto (em % e/ou valor) - descount - String
    - Valor Total - total - Int
    - Linhas - lines - ArrayList<Line> 
       

## Line - Linha da fatura da encomenda
    - Referência - reference - String
    - Descrição - description - String
    - Versão - version - String
    - Quantidade - quatity - Int
    - Unidade - unit - String
    - Preço unitário - unitPrice - String
    - Valor Total - String

## ManufacturingOrder
    - id - String
    - operation - Operação
    (Conpletar com o que tem no segundo enunciado)

# Controllers exceptions

## Order
    - Converter a data de DD-MM-YYYY para YYYY-MM-DD
    - Gerar

## Line 
## DATA BASE

# MachineSchedule

# Authors
   - João Gomes - 1200365
   - Gustavo Reis - 1200360
   - Cristiano Martins - 1200351
   - André Marques - 1200345
   - Ricardo Santos - 1200374
    

