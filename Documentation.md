# Documentação Projeto Gerenciador de Tarefas Com SpringBoot

# Documentação do Código: `GerenciadorTarefasApplicationTests`

## Pacote

```java
package com.example.Gerenciador_Tarefas;
```

Este código pertence ao pacote `com.example.Gerenciador_Tarefas`, que sugere que faz parte de um projeto chamado "Gerenciador de Tarefas". 

## Importações

```java
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
```

### `import org.junit.jupiter.api.Test`
Esta importação é parte do JUnit 5 (Jupiter), uma biblioteca popular para escrever testes unitários em Java. A anotação `@Test` é usada para denotar métodos que representam testes.

### `import org.springframework.boot.test.context.SpringBootTest`
Esta importação vem do Spring Boot, uma ferramenta para criar aplicativos Java baseados em Spring. A anotação `@SpringBootTest` é usada para indicar que a classe é um teste que deve carregar o contexto do Spring Boot.

## Classe

```java
@SpringBootTest
class GerenciadorTarefasApplicationTests {
```

### `@SpringBootTest`
Esta anotação diz ao Spring Boot para carregar o contexto completo da aplicação ao iniciar este teste. Isso é útil para testes de integração que verificam como os diferentes componentes do aplicativo funcionam juntos.

### `GerenciadorTarefasApplicationTests`
Esta é a classe de teste para a aplicação "Gerenciador de Tarefas". O sufixo "Tests" é uma convenção comum para indicar que esta classe contém métodos de teste.

## Método

```java
@Test
void contextLoads() {
}
```

### `@Test`
Esta anotação marca o método `contextLoads` como um método de teste. Quando executado, o JUnit procurará métodos anotados com `@Test` e os executará.

### `void contextLoads()`
Este método está vazio, mas sua presença é importante. Ele é um placeholder que verifica se o contexto da aplicação Spring pode ser carregado corretamente. Se o contexto não puder ser carregado, o teste falhará, indicando que há um problema na configuração do aplicativo.

## Conclusão

A classe `GerenciadorTarefasApplicationTests` é um exemplo básico de um teste de integração no Spring Boot. Ele verifica se o contexto da aplicação pode ser carregado corretamente, o que é um passo crucial para garantir que a configuração básica do aplicativo está correta. Este tipo de teste é útil para detectar problemas de configuração antes de proceder com testes mais específicos.


application.properties

# Documentação do Arquivo `application.properties`

Este arquivo `application.properties` configura várias propriedades para a aplicação "Gerenciador-Tarefas" no contexto do Spring Boot. Aqui estão os detalhes das propriedades configuradas:

## Propriedades da Aplicação

```properties
spring.application.name=Gerenciador-Tarefas
```
- **`spring.application.name`**: Define o nome da aplicação como "Gerenciador-Tarefas". Este nome pode ser utilizado em logs ou para identificação da aplicação em um ambiente de execução.

## Configuração do Datasource

```properties
spring.datasource.url=jdbc:h2:mem:gerenciador_tarefas
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
```
- **`spring.datasource.url`**: Especifica a URL de conexão com o banco de dados H2 em memória. Neste caso, o banco de dados será chamado `gerenciador_tarefas`.
- **`spring.datasource.driverClassName`**: Define a classe do driver JDBC a ser usada. Para o banco de dados H2, a classe é `org.h2.Driver`.
- **`spring.datasource.username`**: Define o nome de usuário para se conectar ao banco de dados. O valor `sa` é o usuário padrão para o banco de dados H2.
- **`spring.datasource.password`**: Define a senha para se conectar ao banco de dados. Aqui, a senha é `password`.

## Configuração do JPA

```properties
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```
- **`spring.jpa.database-platform`**: Define a plataforma de banco de dados a ser usada pelo Hibernate (a implementação padrão de JPA no Spring Boot). `org.hibernate.dialect.H2Dialect` especifica que o Hibernate deve usar o dialeto do banco de dados H2, que contém otimizações específicas para esse banco.

## Consola H2

```properties
spring.h2.console.enabled=true
```
- **`spring.h2.console.enabled`**: Habilita a console web do H2, permitindo que desenvolvedores acessem o banco de dados em memória através de um navegador web. Isso é útil para depuração e inspeção direta do banco de dados. A console pode ser acessada normalmente via `/h2-console` no navegador quando a aplicação está em execução.

---


## Conclusão

Este arquivo `application.properties` configura a aplicação "Gerenciador-Tarefas" para usar um banco de dados H2 em memória, habilita a console web do H2, e define as propriedades do datasource e JPA para garantir a correta conexão e uso do banco de dados. Estas configurações são típicas para um ambiente de desenvolvimento e testes, onde é conveniente usar um banco de dados em memória que é fácil de configurar e não requer instalação adicional.


# Documentação do Código: `GerenciadorTarefasApplication`

## Pacote

```java
package com.example.Gerenciador_Tarefas;
```
Este código pertence ao pacote `com.example.Gerenciador_Tarefas`, indicando que é parte de um projeto chamado "Gerenciador de Tarefas".

## Importações

```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
```

### `import org.springframework.boot.SpringApplication`
Esta importação traz a classe `SpringApplication` do Spring Boot, que é usada para inicializar e executar uma aplicação Spring Boot.

### `import org.springframework.boot.autoconfigure.SpringBootApplication`
Esta importação traz a anotação `@SpringBootApplication`, que é uma convenção de conveniência que agrega três outras anotações:
- `@Configuration`: Marca a classe como uma fonte de definições de beans do Spring.
- `@EnableAutoConfiguration`: Diz ao Spring Boot para começar a adicionar beans com base nas configurações de dependências.
- `@ComponentScan`: Habilita a varredura de componentes no pacote `com.example.Gerenciador_Tarefas` para encontrar classes anotadas com `@Component`, `@Service`, `@Repository`, etc.

## Classe

```java
@SpringBootApplication
public class GerenciadorTarefasApplication {
```

### `@SpringBootApplication`
Esta anotação na classe `GerenciadorTarefasApplication` indica que esta é a classe principal para a aplicação Spring Boot. Ela habilita a configuração automática, a varredura de componentes e a configuração de beans adicionais.

### `public class GerenciadorTarefasApplication`
Declara a classe `GerenciadorTarefasApplication` como pública. Esta classe contém o método `main`, que é o ponto de entrada para a aplicação Spring Boot.

## Método `main`

```java
public static void main(String[] args) {
	SpringApplication.run(GerenciadorTarefasApplication.class, args);
}
```

### `public static void main(String[] args)`
Este é o método principal (entry point) da aplicação. Como em qualquer aplicação Java, o método `main` é o ponto de entrada que é executado quando a aplicação é iniciada.

### `SpringApplication.run(GerenciadorTarefasApplication.class, args)`
Este comando inicializa a aplicação Spring Boot. Ele realiza os seguintes passos:
1. Cria um contexto de aplicação Spring.
2. Realiza a varredura de componentes.
3. Inicializa beans e suas dependências.
4. Inicializa o servidor embutido (como Tomcat, Jetty, etc.) se for uma aplicação web.
5. Executa a aplicação.

## Conclusão

A classe `GerenciadorTarefasApplication` é a classe principal da aplicação "Gerenciador de Tarefas" baseada no Spring Boot. A anotação `@SpringBootApplication` facilita a configuração automática e a inicialização da aplicação. O método `main` utiliza `SpringApplication.run` para iniciar a aplicação, carregando o contexto Spring e todas as suas configurações e beans necessários.


TarefaService.java

Claro! Abaixo está a documentação para o código fornecido.

---

# Documentação do Código: `TarefaService`

## Pacote

```java
package com.example.Gerenciador_Tarefas.service;
```
Este código pertence ao pacote `com.example.Gerenciador_Tarefas.service`, indicando que faz parte da camada de serviço do projeto "Gerenciador de Tarefas".

## Importações

```java
import com.example.Gerenciador_Tarefas.model.Tarefa;
import com.example.Gerenciador_Tarefas.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
```

### `import com.example.Gerenciador_Tarefas.model.Tarefa`
Importa a classe `Tarefa` do pacote `model`, que provavelmente representa a entidade Tarefa no sistema.

### `import com.example.Gerenciador_Tarefas.repository.TarefaRepository`
Importa a interface `TarefaRepository` do pacote `repository`, que gerencia operações CRUD para a entidade `Tarefa`.

### `import org.springframework.beans.factory.annotation.Autowired`
Importa a anotação `@Autowired` do Spring, que é usada para injeção de dependências.

### `import org.springframework.stereotype.Service`
Importa a anotação `@Service` do Spring, que indica que a classe é um serviço da camada de negócios.

### `import java.util.List`
Importa a classe `List` da biblioteca Java, usada para trabalhar com listas.

### `import java.util.Optional`
Importa a classe `Optional` da biblioteca Java, usada para representar um valor que pode estar presente ou ausente.

## Classe

```java
@Service
public class TarefaService {
```

### `@Service`
Esta anotação indica que a classe `TarefaService` é um componente de serviço do Spring. Serviços são usados para definir a lógica de negócios e são automaticamente detectados durante a varredura de componentes.

### `public class TarefaService`
Declara a classe `TarefaService` como pública. Esta classe contém métodos que encapsulam a lógica de negócios para a entidade `Tarefa`.

## Atributo

```java
@Autowired
private TarefaRepository tarefaRepository;
```

### `@Autowired`
Esta anotação indica que o Spring deve injetar automaticamente uma instância de `TarefaRepository` na classe `TarefaService`. Isso facilita a comunicação com a camada de persistência.

### `private TarefaRepository tarefaRepository`
Declara uma dependência privada de `TarefaRepository`, que será usada para interagir com o banco de dados.

## Métodos

### `public List<Tarefa> listarTodas()`

```java
public List<Tarefa> listarTodas() {
    return tarefaRepository.findAll();
}
```
Este método retorna uma lista de todas as tarefas armazenadas no banco de dados, usando o método `findAll()` do `TarefaRepository`.

### `public Optional<Tarefa> obterPorId(Long id)`

```java
public Optional<Tarefa> obterPorId(Long id) {
    return tarefaRepository.findById(id);
}
```
Este método retorna uma `Optional<Tarefa>` com base no ID fornecido. Se a tarefa não existir, o `Optional` estará vazio.

### `public Tarefa criar(Tarefa tarefa)`

```java
public Tarefa criar(Tarefa tarefa) {
    return tarefaRepository.save(tarefa);
}
```
Este método recebe uma instância de `Tarefa` e a salva no banco de dados, retornando a tarefa salva. Utiliza o método `save()` do `TarefaRepository`.

### `public void deletar(Long id)`

```java
public void deletar(Long id) {
    tarefaRepository.deleteById(id);
}
```
Este método deleta a tarefa correspondente ao ID fornecido, usando o método `deleteById()` do `TarefaRepository`.

## Conclusão

A classe `TarefaService` encapsula a lógica de negócios para a gestão de tarefas na aplicação "Gerenciador de Tarefas". Ela interage com a camada de persistência através de `TarefaRepository` para realizar operações CRUD. A utilização de `@Service` e `@Autowired` simplifica a configuração e injeção de dependências, promovendo um design modular e de fácil manutenção.


TarefaRepository.java

# Documentação do Código: `TarefaRepository`

## Pacote

```java
package com.example.Gerenciador_Tarefas.repository;
```
Este código pertence ao pacote `com.example.Gerenciador_Tarefas.repository`, indicando que faz parte da camada de repositório do projeto "Gerenciador de Tarefas".

## Importações

```java
import com.example.Gerenciador_Tarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
```

### `import com.example.Gerenciador_Tarefas.model.Tarefa`
Importa a classe `Tarefa` do pacote `model`, que representa a entidade Tarefa no sistema.

### `import org.springframework.data.jpa.repository.JpaRepository`
Importa a interface `JpaRepository` do Spring Data JPA, que fornece métodos CRUD prontos para serem usados, bem como funcionalidades adicionais para a gestão de entidades.

## Interface

```java
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
```

### `public interface TarefaRepository`
Declara a interface `TarefaRepository` como pública. No Spring Data JPA, interfaces de repositórios são usadas para definir métodos de acesso a dados.

### `extends JpaRepository<Tarefa, Long>`
A interface `TarefaRepository` estende `JpaRepository`, especificando `Tarefa` como a entidade a ser gerida e `Long` como o tipo do identificador da entidade.

### `JpaRepository`
`JpaRepository` é uma interface do Spring Data JPA que fornece métodos prontos para manipular entidades, tais como:
- `save(T entity)`: Salva a entidade fornecida.
- `findById(ID id)`: Encontra uma entidade pelo seu identificador.
- `findAll()`: Retorna todas as entidades.
- `deleteById(ID id)`: Deleta a entidade pelo seu identificador.

Ao estender `JpaRepository`, `TarefaRepository` herda esses métodos, permitindo operações CRUD simples e automáticas para a entidade `Tarefa` sem precisar escrever código adicional.

## Conclusão

A interface `TarefaRepository` é um repositório Spring Data JPA para a entidade `Tarefa` no projeto "Gerenciador de Tarefas". Ao estender `JpaRepository`, ela herda uma série de métodos úteis para manipulação de dados, promovendo um desenvolvimento rápido e fácil da camada de persistência. A definição da interface sem métodos adicionais indica que, por enquanto, a funcionalidade básica provida por `JpaRepository` é suficiente para as necessidades do projeto.


TarefaController.java

# Documentação do Código: `TarefaController`

## Pacote

```java
package com.example.Gerenciador_Tarefas.controller;
```
Este código pertence ao pacote `com.example.Gerenciador_Tarefas.controller`, indicando que faz parte da camada de controle do projeto "Gerenciador de Tarefas".

## Importações

```java
import com.example.Gerenciador_Tarefas.model.Tarefa;
import com.example.Gerenciador_Tarefas.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
```

### `import com.example.Gerenciador_Tarefas.model.Tarefa`
Importa a classe `Tarefa` do pacote `model`, que representa a entidade Tarefa no sistema.

### `import com.example.Gerenciador_Tarefas.service.TarefaService`
Importa a classe `TarefaService` do pacote `service`, que contém a lógica de negócios para a entidade Tarefa.

### `import org.springframework.beans.factory.annotation.Autowired`
Importa a anotação `@Autowired` do Spring, que é usada para injeção de dependências.

### `import org.springframework.http.ResponseEntity`
Importa a classe `ResponseEntity` do Spring, que representa toda a resposta HTTP, incluindo o status e o corpo.

### `import org.springframework.web.bind.annotation.*`
Importa anotações do Spring MVC para mapeamento de solicitações HTTP para métodos de manipulador no Spring MVC.

### `import java.util.List`
Importa a classe `List` da biblioteca Java, usada para trabalhar com listas.

### `import java.util.Optional`
Importa a classe `Optional` da biblioteca Java, usada para representar um valor que pode estar presente ou ausente.

## Classe

```java
@RestController
@RequestMapping("/tarefas")
public class TarefaController {
```

### `@RestController`
Esta anotação indica que a classe `TarefaController` é um controlador REST, que processa solicitações HTTP e retorna dados no formato JSON.

### `@RequestMapping("/tarefas")`
Esta anotação mapeia solicitações HTTP para a rota `/tarefas` para esta classe. Todos os métodos nesta classe terão seus endpoints iniciados com `/tarefas`.

## Atributo

```java
@Autowired
private TarefaService tarefaService;
```

### `@Autowired`
Esta anotação indica que o Spring deve injetar automaticamente uma instância de `TarefaService` na classe `TarefaController`.

### `private TarefaService tarefaService`
Declara uma dependência privada de `TarefaService`, que será usada para interagir com a lógica de negócios.

## Métodos

### `public List<Tarefa> listarTodas()`

```java
@GetMapping
public List<Tarefa> listarTodas() {
    return tarefaService.listarTodas();
}
```

### `@GetMapping`
Esta anotação mapeia solicitações HTTP GET para o método `listarTodas()`, que retorna uma lista de todas as tarefas.

### `public ResponseEntity<Tarefa> obterPorId(@PathVariable Long id)`

```java
@GetMapping("/{id}")
public ResponseEntity<Tarefa> obterPorId(@PathVariable Long id) {
    Optional<Tarefa> tarefa = tarefaService.obterPorId(id);
    return tarefa.map(ResponseEntity::ok)
                 .orElseGet(() -> ResponseEntity.notFound().build());
}
```

### `@GetMapping("/{id}")`
Esta anotação mapeia solicitações HTTP GET para o método `obterPorId()`, que retorna uma tarefa específica com base no ID fornecido.

### `@PathVariable Long id`
Esta anotação indica que o parâmetro `id` será extraído da URL.

### `public Tarefa criar(@RequestBody Tarefa tarefa)`

```java
@PostMapping
public Tarefa criar(@RequestBody Tarefa tarefa) {
    return tarefaService.criar(tarefa);
}
```

### `@PostMapping`
Esta anotação mapeia solicitações HTTP POST para o método `criar()`, que cria uma nova tarefa.

### `@RequestBody Tarefa tarefa`
Esta anotação indica que o corpo da solicitação HTTP será mapeado para o parâmetro `tarefa`.

### `public ResponseEntity<Void> deletar(@PathVariable Long id)`

```java
@DeleteMapping("/{id}")
public ResponseEntity<Void> deletar(@PathVariable Long id) {
    Optional<Tarefa> tarefa = tarefaService.obterPorId(id);
    if (tarefa.isPresent()) {
        tarefaService.deletar(id);
        return ResponseEntity.noContent().build();
    } else {
        return ResponseEntity.notFound().build();
    }
}
```

### `@DeleteMapping("/{id}")`
Esta anotação mapeia solicitações HTTP DELETE para o método `deletar()`, que deleta uma tarefa específica com base no ID fornecido.

## Conclusão

A classe `TarefaController` é um controlador REST para a aplicação "Gerenciador de Tarefas". Ela fornece endpoints para listar todas as tarefas, obter uma tarefa por ID, criar uma nova tarefa e deletar uma tarefa existente. Utiliza anotações do Spring MVC para mapear solicitações HTTP e interage com a camada de serviço `TarefaService` para executar a lógica de negócios necessária.


Tarefa.java

# Documentação do Código: `Tarefa`

## Pacote

```java
package com.example.Gerenciador_Tarefas.model;
```
Este código pertence ao pacote `com.example.Gerenciador_Tarefas.model`, indicando que faz parte da camada de modelo do projeto "Gerenciador de Tarefas".

## Importações

```java
import jakarta.persistence.*;
import java.time.LocalDate;
```

### `import jakarta.persistence.*`
Importa as anotações e classes do pacote `jakarta.persistence`, que são usadas para definir entidades e mapear relacionamentos entre objetos Java e um banco de dados relacional.

### `import java.time.LocalDate`
Importa a classe `LocalDate` da biblioteca Java, que representa uma data (sem hora).

## Classe

```java
@Entity
public class Tarefa {
```

### `@Entity`
Esta anotação indica que a classe `Tarefa` é uma entidade JPA. Entidades são objetos leves e persistentes que representam uma tabela no banco de dados.

### `public class Tarefa`
Declara a classe `Tarefa` como pública. Esta classe contém atributos que representam colunas da tabela `Tarefa` no banco de dados, bem como métodos getters e setters para acessar e modificar esses atributos.

## Atributos

### `@Id`

```java
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
```

### `@Id`
Esta anotação indica que o campo `id` é a chave primária da entidade.

### `@GeneratedValue(strategy = GenerationType.IDENTITY)`
Esta anotação define a estratégia de geração do valor da chave primária. `GenerationType.IDENTITY` especifica que os valores dos IDs serão gerados pelo banco de dados automaticamente.

### `private Long id`
Declara o atributo `id` como privado e do tipo `Long`. Este campo representa a chave primária da entidade `Tarefa`.

### `private String titulo`

```java
private String titulo;
```
Declara o atributo `titulo` como privado e do tipo `String`. Este campo representa o título da tarefa.

### `private String descricao`

```java
private String descricao;
```
Declara o atributo `descricao` como privado e do tipo `String`. Este campo representa a descrição da tarefa.

### `private LocalDate data`

```java
private LocalDate data;
```
Declara o atributo `data` como privado e do tipo `LocalDate`. Este campo representa a data da tarefa.

## Getters e Setters

### `public Long getId()`

```java
public Long getId() {
    return id;
}
```
Este método retorna o valor do atributo `id`.

### `public void setId(Long id)`

```java
public void setId(Long id) {
    this.id = id;
}
```
Este método define o valor do atributo `id`.

### `public String getTitulo()`

```java
public String getTitulo() {
    return titulo;
}
```
Este método retorna o valor do atributo `titulo`.

### `public void setTitulo(String titulo)`

```java
public void setTitulo(String titulo) {
    this.titulo = titulo;
}
```
Este método define o valor do atributo `titulo`.

### `public String getDescricao()`

```java
public String getDescricao() {
    return descricao;
}
```
Este método retorna o valor do atributo `descricao`.

### `public void setDescricao(String descricao)`

```java
public void setDescricao(String descricao) {
    this.descricao = descricao;
}
```
Este método define o valor do atributo `descricao`.

### `public LocalDate getData()`

```java
public LocalDate getData() {
    return data;
}
```
Este método retorna o valor do atributo `data`.

### `public void setData(LocalDate data)`

```java
public void setData(LocalDate data) {
    this.data = data;
}
```
Este método define o valor do atributo `data`.

Esta documentação detalha os principais componentes da aplicação "Gerenciador de Tarefas", fornecendo uma visão clara de sua estrutura e funcionalidade.

Diagrama de Arquitetura – Gerenciador de Tarefas

![Diagrama de Arquitetura](https://github.com/RaphaJimmyLuiz/Gerenciador-TarefasSpringBoot/blob/main/Diagrama%20de%20Arquitetura-GerenciadorTarefas.png)

Diagrama de Classes - Gerenciador de Tarefas

![Diagrama de Classes](https://github.com/RaphaJimmyLuiz/Gerenciador-TarefasSpringBoot/blob/main/Diagrama%20de%20Classes-GerenciadorTarefas.png)

## Conclusão

A classe `Tarefa` é uma entidade JPA que mapeia para uma tabela no banco de dados. Ela contém atributos que representam as colunas da tabela e métodos getters e setters para acessar e modificar esses atributos. A anotação `@Entity` indica que esta classe é uma entidade JPA, enquanto `@Id` e `@GeneratedValue` configuram o campo `id` como a chave primária da entidade e especificam que seu valor será gerado automaticamente pelo banco de dados.
