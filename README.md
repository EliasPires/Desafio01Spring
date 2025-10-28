🧩 # Desafio: Componentes e Injeção de Dependência

Este projeto foi desenvolvido como parte do módulo Java Sprin Professional da Formação em Spring Boot da (DevSuperior).
O objetivo foi construir um pequeno sistema em Java com Spring Boot para calcular o valor total de um pedido, aplicando regras de frete e desconto, de forma organizada e modular através de componentes e injeção de dependência.


🚀 Objetivo do Desafio

Criar um sistema que receba os dados de um pedido (código, valor básico e porcentagem de desconto) e calcule o valor total considerando o frete e o desconto aplicado.

🧮 Regras de Cálculo do Frete

|     Valor básico do pedido | Frete    |
| -------------------------: | :------- |
|        Abaixo de R$ 100.00 | R$ 20.00 |
| De R$ 100.00 até R$ 200.00 | R$ 12.00 |
|          R$ 200.00 ou mais | Grátis   |

🧱 Estrutura do Projeto

O sistema é dividido em componentes (services):

OrderService → responsável pelo cálculo do valor total do pedido.
ShippingService → responsável pelas regras de cálculo do frete.

Ambos os serviços são componentes Spring anotados com @Service, e o OrderService utiliza injeção de dependência para consumir o ShippingService.

💡 Conceitos Aprendidos

Durante este desafio, pude compreender e aplicar de forma prática:

Inversão de Controle (IoC): o próprio Spring é responsável por instanciar e gerenciar os objetos (beans) do sistema. <br>

Injeção de Dependência (DI): o OrderService não cria diretamente uma instância de ShippingService, recebendo-a automaticamente do contêiner do Spring, promovendo baixo acoplamento e alta coesão.

Componentização: cada classe possui uma única responsabilidade, facilitando a manutenção e testabilidade do código. <br>

🧰 Tecnologias Utilizadas
Java 17+ <br>
Spring Boot <br>
Maven <br>

🧪 Como Executar

Clone o repositório:
```bash
git clone https://github.com/seu-usuario/desafio-componentes-injecao.git
```
