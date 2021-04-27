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
      


# Classes

## Peça/Produto - Part
    - Referencia - reference - String
    - Designação - designation - String 
    - Designação comercial - commercialDesignation - String
    - Quantidade Lote (é a quantidade que será desenvolvida para vez que a peça é produzida) - batchSize - integer
    - Unidade - unit - String
    - Versão - version - String
    - Estado (ativo ou inativo) - status - boolean
    - Operações - operations - ArrayList<Operation> 
    - Componentes - components - ArrayList<Component>

## Operação - Operation
    - Ordem - order - integer
    - Nome - name - String
    - Máquina - Machine - Machine
    - Mão de obra (quantidade de operadores necessários) - operatorsNeeded - integer
    - Tempo (em segundos) - executionTime - integer
    - Quantidade Hora (campo de cálculo para informação de quantidade que  será produzida por hora) - quantityPerHour - integer
    - Instruções técnicas - instructions - String
    - Componentes - components - ArrayList<Component>

## Componente - Component
    - Referencia - reference - String
    - Designação comercial - commercialDesignation - String
    - Versão - version - String
    - Quantidade - quantityNeeded - float
    - Unidade - measureUnit - String - (A quantidade utiliza para construir o componente) 
    - Alternativa - alternative - Part - (caso não exista stock da peça a ser construída pode ser usada a sua alternativa)

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
    -  
    - 
    - 
    - 


## Questões para professores
    - Os tipos das operações da maquina e da operação, criamos um atributo tipo ou defenimos o tipo pelo nome? 
    - A alternativa é do  tipo peça ou do tipo compenente?

# Authors
   - João Gomes - 1200365
   - Gustavo Reis - 1200360
   - Cristiano Martins - 1200351
   - André Marques - 1200345
   - Ricardo Santos - 1200374
    

