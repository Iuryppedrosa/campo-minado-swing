# Campo Minado em JavaFX

Este repositório contém o código-fonte de um jogo Campo Minado implementado em Java, utilizando JavaFX para a interface gráfica e seguindo o padrão de design MVC (Model-View-Controller).

## Características

- **Lógica Completa do Campo Minado:** Implementação fiel ao jogo clássico, com todas as regras e desafios que tornam o Campo Minado um passatempo intrigante.
- **Interface Gráfica com JavaFX:** Uma interface gráfica limpa e responsiva, proporcionando uma experiência de usuário fluida e agradável.
- **Padrão MVC:** Estruturação do código seguindo o padrão MVC, o que facilita a manutenção e a compreensão do projeto.

## Como Jogar

- O objetivo do jogo é revelar todas as células do campo que não contêm minas.
- Clique nas células para revelá-las; se uma célula contiver uma mina, o jogo termina.
- Se uma célula revelada não contiver uma mina, ela mostrará um número indicando quantas minas estão nas células adjacentes.

## Requisitos

- Java JDK 8 ou superior.
- JavaFX SDK para a interface gráfica.

## Instalação

1. Clone o repositório para sua máquina local.
2. Certifique-se de ter o JavaFX SDK instalado e configurado.

## Execução

Para executar o jogo, navegue até o diretório do projeto e execute os seguintes comandos:

```bash
javac --module-path /caminho/para/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml -d out src/*.java
java --module-path /caminho/para/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml -cp out Main
```

## Estrutura de pastas

```markdown
## Estrutura de Diretórios

O projeto está organizado da seguinte maneira:
```
- src
  - modelo
    - Campo.java
    - CampoEvento.java
    - CampoObservador.java
    - ResultadoEvento.java
    - Tabuleiro.java
  - visao
    - BotaoCampo.java
    - PainelTabuleiro.java
  - TelaPrincipal.java
- out
  - (Arquivos compilados do projeto)
```

Cada diretório e arquivo tem seu propósito específico dentro da arquitetura MVC do projeto:

- `modelo`: Contém todas as classes que representam a lógica do negócio e o estado do jogo Campo Minado.
- `visao`: Inclui as classes responsáveis pela interface gráfica do usuário, utilizando JavaFX.
- `TelaPrincipal.java`: É o ponto de entrada do jogo, onde a interface gráfica é inicializada e mostrada ao usuário.
- `out`: Este diretório contém os arquivos compilados e prontos para execução do jogo.

Certifique-se de atualizar os nomes dos arquivos e diretórios conforme necessário para corresponder exatamente à sua estrutura de projeto.
```


