# 🏦 Sistema Bancário em Java

Este projeto consiste em uma aplicação Java para gerenciamento bancário via terminal. O sistema permite a abertura de contas, depósitos com cálculo automático de taxas e saques com validação de saldo. O foco do desenvolvimento foi a aplicação prática dos pilares da Orientação a Objetos, utilizando Classes Abstratas para a estrutura base e Interfaces para padronização dos métodos.

## 📋 Sobre o Projeto

Este projeto simula as operações bancárias essenciais. O usuário pode abrir uma conta (Corrente ou Poupança), realizar depósitos com cálculo de taxas automáticas e efetuar saques com validação de saldo.

## 🚀 Funcionalidades Implementadas

* **Abertura de Conta:** Cadastro de nome e definição do tipo de conta via Enum.
* **Depósito com Regra de Negócio:**
  * *Conta Corrente:* Depósito integral do valor.
  * *Conta Poupança:* Aplicação automática de uma **taxa de 5%** sobre o valor depositado.
* **Saque Validado:** Verificação se o saldo é suficiente antes de liberar o dinheiro.
* **Consulta de Saldo:** Exibição dos dados do titular e saldo atualizado.
* **Menu de Operações:** Loop contínuo (`while`) permitindo múltiplas operações até o usuário decidir sair.

## 🛠️ Tecnologias e Conceitos

* **Java** (JDK)
* **Abstração:** Uso da classe abstrata `ContaBancaria`.
* **Interfaces:** Contrato definido na interface `Conta`.
* **Polimorfismo:** Comportamentos diferentes para o método `depositar()` dependendo do objeto.
* **Tratamento de Dados:** Uso de `Scanner` com limpeza de buffer (`nextLine`).

## 📂 Estrutura das Classes

### 1. Interface `Conta`
Define os métodos obrigatórios: `consultarSaldo()`, `depositar()` e `sacar()`.

### 2. Classe Abstrata `ContaBancaria`
Implementa a interface e gerencia os atributos comuns:
* `nome` (String)
* `saldo` (double)
* `tipoDeConta` (Enum)

### 3. Enum `TiposDeConta`
Padroniza os tipos disponíveis:
* `CORRENTE`
* `POUPANCA`

### 4. Subclasses (Regras Específicas)

* **`ContaCorrente`:**
  * Herda de `ContaBancaria`.
  * Método `depositar`: Adiciona 100% do valor ao saldo.
  
* **`ContaPoupanca`:**
  * Herda de `ContaBancaria`.
  * Método `depositar`: **Cobra uma taxa de 5%**. (Ex: Ao depositar R$ 100,00, entra R$ 95,00 na conta).

### 5. Classe `Main`
Responsável pela interação com o usuário, instanciando o objeto correto baseado na escolha inicial (1 ou 2) e gerenciando o loop do menu.

---

## 💻 Exemplo de Uso (Simulação)

```text
----------BANCO----------
INFORME SEU NOME: 
Diego
----------TIPO DE CONTA----------
1. CONTA CORRENTE
2. CONTA POUPANÇA
2

CONTA CRIADO COM SUCESSO
DETALHES DA CONTA
NOME: Diego
TIPO DE CONTA: POUPANCA

----------MENU----------
1. DEPOSITAR
2. CONSULTAR SALDO
3. SACAR
4. EXIT
1

INFORME O VALOR A SER DEPOSITADO: R$
100
TAXA DE DEPÓSITO: R$5.0
VALOR R$95.0. DEPOSITADO NA SUA CONTA POUPANÇA COM SUCESSO!
