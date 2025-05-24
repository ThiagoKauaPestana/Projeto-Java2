# Projeto Java - N2

NOME: Thiago Kaua Pestana do Amaral   
TIA: 10420686
## Objetivo
QuickShop: o seu e-commerce preferido 
Descrição e contexto geral: 
Imagine um pequeno e-commerce que precisa gerenciar seu catálogo de produtos e os pedidos feitos pelos 
clientes. Um sistema que permita listar os produtos disponíveis, permitir que um cliente "faça" um pedido 
(selecionando produtos e quantidades) e depois visualizar os pedidos realizados é fundamental para o 
negócio. Este projeto visa simular as funcionalidades essenciais de um sistema de pedidos, focando na 
interação entre produtos, clientes e o processo de criação de um pedido. 

## Requisitos funcionais 
O sistema deve apresentar as seguintes funcionalidades: 
- Cadastro de clientes: para que se possa realizar uma compra na QuickShop a pessoa precisa ter sido 
registrada como cliente em algum momento, usualmente durante sua primeira compra. No formulário 
de Cadastro de Cliente, o usuário deve informar seu nome, dados de contato (e-mail e telefone) e 
endereço. Ao confirmar, recebe do sistema um código de identificação único (ID) concluindo o 
processo de registro na plataforma. Para simplificar, não será necessário login e senha complexos; o 
cliente pode ser identificado por seu ID. 
- Cadastro de produtos: o cadastramento de um novo produto para venda na plataforma é feito de 
maneira simples, bastando registrá-lo com os seguintes dados: fabricante, descrição, preço unitário e 
quantidade em estoque, recebendo um código único e sequencial automaticamente pelo sistema. 
- Visualizar o catálogo de produtos: tanto um visitante quanto um cliente (identificado pelo ID) devem 
ter acesso a lista de produtos disponíveis, visualizando ao menos as informações mínimas dos 
produtos (descrição, preço, estoque). 
- Fazer um pedido: Um cliente pode criar um novo pedido. Durante a criação do pedido, o cliente 
seleciona produtos do catálogo e especifica a quantidade desejada para cada item. O sistema deve 
verificar a disponibilidade em estoque. Ao "finalizar" o pedido, um objeto Pedido é criado, contendo 
os itens selecionados. O estoque dos produtos deve ser atualizado. 
- Visualizar “Meus Pedidos”: Um cliente (identificado pelo ID) pode ver a lista de todos os pedidos que 
ele realizou, incluindo os itens de cada pedido. 
- Menu de opções: Um menu interativo deve apresentar as opções disponíveis, assumindo que o 
usuário atual é um cliente já "logado" (identificado pelo ID).

## Diagrama de Classe

![image](https://github.com/user-attachments/assets/46d994c9-8801-4970-8bb4-9e263a8c43a4)
