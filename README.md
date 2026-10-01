# 🚀 Estudos em Java & POO | FATEC Franca

Repositório dedicado ao armazenamento de códigos, exercícios e projetos práticos focados no aprendizado de **Programação Orientada a Objetos (POO)** com **Java**, desenvolvidos durante o curso de **ADS - Análise e Desenvolvimento de Sistemas** na **FATEC Franca - Dr. Thomaz Novelino**.

---

## 📌 Conteúdos Estudados

- [x] **Fundamentos do Java:** Sintaxe, variáveis, operadores e controle de fluxo (`if/else`, `switch case`, `do-while`).
- [x] **Entrada e Saída de Dados:** Manipulação do console utilizando a classe `Scanner` e formatação de saída com `printf`/`println`.
- [x] **Abstração & Encapsulamento:** Criação de classes, atributos, métodos de instância e estáticos, com `private`, getters e setters.
- [x] **Sobrecarga de Métodos e Construtores:** Implementação de múltiplos construtores para flexibilizar a criação de objetos.
- [x] **Associação, Agregação e Composição:** Relacionamentos todo-parte entre classes e diferença entre vínculo fraco e forte.
- [x] **Classe de Associação (N:N):** Modelagem de relações muitos-para-muitos com uma classe intermediária.
- [x] **Herança:** Reutilização de código através da extensão de classes pai (`extends`, `super`, `protected`).
- [x] **Polimorfismo:** Sobrescrita de métodos (`@Override`) para especialização de comportamentos.

---

## 📁 Estrutura do Repositório

```
.
└── src/
  ├── Animais/          # Herança e polimorfismo
  ├── Biblioteca/       # Livro e BibliotecaApp
  ├── Casa/             # Composição
  ├── DiretorFilme/     # Classe de associação (N:N)
  ├── Escola/           # Associação entre classes
  ├── Hospital/         # Classe de associação (N:N)
  ├── Jogadores/        # Agregação
  ├── Mecanica/         # Agregação e composição
  ├── SistemaBanco/     # ContaBancaria e TestaCB
  ├── SistemaEstoque/   # Produto e ProdutoApp
  └── SistemaRH/        # Herança de funcionários
```

---

## 💻 Projetos & Exemplos no Repositório

### 🏦 Sistema Bancário Interativo (`SistemaBanco`)
Aplicação via terminal (`ContaBancaria` & `TestaCB`) desenvolvida para simular a gestão e movimentação financeira de múltiplas contas bancárias:
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

### 📚 Sistema de Controle de Biblioteca (`Biblioteca`)
Aplicação via terminal (`Livro` & `BibliotecaApp`) desenvolvida para gerenciar o acervo e a disponibilidade de livros em uma biblioteca:
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

### 📦 Sistema de Gestão de Estoque e Vendas (`SistemaEstoque`)
Aplicação via terminal (`Produto` & `ProdutoApp`) desenvolvida no pacote `SistemaEstoque` para gerenciar produtos em estoque e simular operações de venda e reposição com controle financeiro:
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

### 👔 Sistema de RH (`SistemaRH`)
Hierarquia de funcionários que pratica herança, sobrescrita e polimorfismo:
- **Operações:**
  - Exibição dos dados de cada funcionário com salário e bônus.
  - Cálculo do bônus de forma diferente em cada tipo de funcionário.
- **Conceitos de POO Aplicados:**
  - **Herança (`extends`) e `protected`:** As subclasses reaproveitam os atributos e métodos da superclasse `Funcionario`.
  - **Chamada à superclasse (`super`):** `super(...)` nos construtores e `super.calcularBonus()` nos métodos sobrescritos.
  - **Sobrescrita e Polimorfismo (`@Override`):** Uma `ArrayList` do tipo da superclasse executa a versão correta do método para cada objeto.

---

### 🐾 Animais (`Animais`)
Hierarquia de classes de animais com mais de um nível de herança:
- **Conceitos de POO Aplicados:**
  - **Herança em cadeia:** Cada nível herda tudo dos níveis acima e acrescenta o que é específico dele.
  - **Sobrescrita (`@Override`):** Métodos especializados em cada subclasse.
  - **Polimorfismo:** Coleção do tipo da superclasse mais genérica, com despacho dinâmico em tempo de execução.

---

### 🏠 Casa (`Casa`)
Exemplo de **composição** entre classes:
- **Conceitos de POO Aplicados:**
  - **Composição:** Os objetos que compõem a classe principal são criados dentro do construtor dela e não existem fora dela.
  - **Coleções (`ArrayList`):** Armazenamento dos componentes e listagem com nome e área.

---

### 🏀 Jogadores (`Jogadores`)
Exemplo de **agregação** entre classes:
- **Conceitos de POO Aplicados:**
  - **Agregação:** O jogador já existe e é recebido de fora pelo time (`adicionarJogador()`).
  - **Coleções (`ArrayList`):** Lista de jogadores do time e listagem dos nomes.

---

### 🔧 Mecânica (`Mecanica`)
Relacionamento entre classes no contexto de uma oficina mecânica:
- **Conceitos de POO Aplicados:**
  - **Agregação e composição:** Diferença entre partes que existem de forma independente e partes que nascem junto com o todo.
  - **Encapsulamento:** Atributos `private` com acesso por getters.

---

### 🏫 Escola (`Escola`)
Relacionamento entre classes no contexto escolar:
- **Conceitos de POO Aplicados:**
  - **Associação entre classes:** Uma classe guarda a referência de outra como atributo.
  - **Coleções (`ArrayList`):** Listagem dos objetos relacionados.

---

### 🏥 Hospital (`Hospital`)
Exemplo de relação **muitos-para-muitos (N:N)** com classe de associação:
- **Conceitos de POO Aplicados:**
  - **Classe de associação:** A classe intermediária guarda os dados que pertencem ao vínculo (como data e motivo) e referencia as duas pontas.
  - **Sincronização das duas pontas:** Método estático que cria o vínculo e registra nos dois lados de uma só vez.

---

### 🎬 Diretor e Filme (`DiretorFilme`)
Exemplo de relação **muitos-para-muitos (N:N)** com classe de associação:
- **Conceitos de POO Aplicados:**
  - **Classe de associação:** Liga `Diretor` e `Filme` e guarda os dados do vínculo.
  - **Navegação pelas duas pontas:** Listagem dos filmes de um diretor e dos diretores de um filme.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (JDK 17+)
* **IDE:** IntelliJ IDEA
* **Controle de Versão:** Git & GitHub
