# 🚀 Estudos em Java & POO | FATEC Franca

Repositório dedicado ao armazenamento de códigos, exercícios e projetos práticos focados no aprendizado de **Programação Orientada a Objetos (POO)** com **Java**, desenvolvidos durante o curso de **ADS - Análise e Desenvolvimento de Sistemas** na **FATEC Franca - Dr. Thomaz Novelino**.

---

## 📌 Conteúdos Estudados

- [x] **Fundamentos do Java:** Sintaxe, variáveis, operadores e controle de fluxo (`if/else`, `switch case`, `do-while`).
- [x] **Entrada e Saída de Dados:** Manipulação do console utilizando a classe `Scanner` e formatação de saída com `printf`/`println`.
- [x] **Abstração & Encapsulamento:** Criação de classes, atributos, métodos de instância e estáticos.
- [x] **Sobrecarga de Métodos e Construtores:** Implementação de múltiplos construtores para flexibilizar a criação de objetos.
- [x] **Herança:** Reutilização de código através da extensão de classes pai (`super`).
- [x] **Polimorfismo:** Sobrescrita de métodos (`@Override`) para especialização de comportamentos.

---

## 💻 Projetos & Exemplos no Repositório

### 🏦 Sistema Bancário Interativo (`ContaBancaria` & `TestaCB`)
Aplicação via terminal desenvolvida para simular a gestão e movimentação financeira de múltiplas contas bancárias:
- **Operações:**
  - Consulta detalhada dos dados do titular e saldo em tempo real.
  - Realização de depósitos e saques com validação automática de regras de negócio.
  - Seleção e navegação individualizada entre diferentes contas cadastradas no sistema.
- **Conceitos de POO Aplicados:**
  - **Construtores e Sobrecarga (`this`):** Instanciação flexível de objetos utilizando o construtor padrão ("Sem titular") ou construtores parametrizados com titular, número e saldo inicial.
  - **Atributos e Métodos Estáticos (`static`):** Controle centralizado da contagem total de contas instanciadas (`totalContas`) e definição de taxa de manutenção global.
  - **Encapsulamento e Regras de Negócio:** Proteção do saldo através de métodos de movimentação (`depositar()` e `saque()`), garantindo validações para depósitos negativos e limites de saldo.
- **Estrutura de Controle:**
  - Loop contínuo com `do-while` para manter o sistema ativo até a escolha expressa da opção de saída.
  - Navegação fluida por menus utilizando `switch case` encadeados para controle das operações principais e seleção de contas específicas.

---

### 📚 Sistema de Controle de Biblioteca (`Livro` & `BibliotecaApp`)
Aplicação via terminal desenvolvida para gerenciar o acervo e a disponibilidade de livros em uma biblioteca:
- **Operações:** 
  - Exibição de acervo completo e contagem total de livros instanciados.
  - Empréstimo e devolução de livros com alteração em tempo real do estado (`boolean`).
  - Filtragem dinâmica para listar apenas livros disponíveis ou emprestados conforme a ação do usuário.
- **Conceitos de POO Aplicados:** 
  - **Construtores e Sobrecarga (`this`):** Instanciação flexível de objetos com valores personalizados para título, autor e status de disponibilidade.
  - **Atributos e Métodos Estáticos (`static`):** Controle centralizado da quantidade total de livros (`getTotalLivros()`) e reutilização de métodos auxiliares de exibição e filtragem.
  - **Encapsulamento e Regras de Negócio:** Alteração do status de disponibilidade através de métodos próprios (`emprestar()` e `devolver(int numero)`), exibindo a ficha atualizada após a transação.
- **Estrutura de Controle:**
  - Loop contínuo com `do-while` para manter o sistema rodando até o usuário escolher a opção de saída.
  - Navegação por menus utilizando seleções com `switch case` no menu principal e no fluxo de ações.

---

### 📦 Sistema de Gestão de Estoque e Vendas (`Produto` & `ProdutoApp`)
Aplicação via terminal desenvolvida no pacote `SistemaEstoque` para gerenciar produtos em estoque e simular operações de venda e reposição com controle financeiro:
- **Operações:**
  - Exibição detalhada do catálogo de produtos com nome, preço unitário e quantidade disponível.
  - Venda de itens com validação dupla de regras de negócio (estoque e saldo do comprador).
  - Reposição de quantidade de itens no estoque.
  - Exibição do total global de produtos cadastrados no sistema.
- **Conceitos de POO Aplicados:**
  - **Construtores e Sobrecarga (`this`):** Permite instanciar objetos com valores padrão ("Sem nome", R$ 0.00, 0) ou parametrizados com dados específicos de cada produto.
  - **Atributos e Métodos Estáticos (`static`):** Uso do atributo `totalProdutos` para contagem global da quantidade de itens gerenciados e métodos estáticos auxiliares para exibição em lote do catálogo (`exibirDadosProdutos`).
  - **Lógica de Parâmetros & Retorno:** O método de venda (`vender`) recebe o saldo do cliente como parâmetro, valida se há quantidade em estoque e saldo financeiro suficiente, efetua a dedução e retorna o saldo restante atualizado para o fluxo da aplicação.
- **Estrutura de Controle:**
  - Menu interativo com `switch case` para seleção das operações principais (Vender / Adicionar ao Estoque) e escolha individual do produto desejado.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (JDK 17+)
* **IDE:** IntelliJ IDEA
* **Controle de Versão:** Git & GitHub
