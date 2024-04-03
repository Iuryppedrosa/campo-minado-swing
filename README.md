# Campo Minado em JavaFX
![](https://private-user-images.githubusercontent.com/89420889/319301581-9c231bd0-88eb-45d1-a721-8828fbd29c05.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTIxNjgwMTcsIm5iZiI6MTcxMjE2NzcxNywicGF0aCI6Ii84OTQyMDg4OS8zMTkzMDE1ODEtOWMyMzFiZDAtODhlYi00NWQxLWE3MjEtODgyOGZiZDI5YzA1LnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA0MDMlMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNDAzVDE4MDgzN1omWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTYyZjcyM2Y4OTI2MDRmMTcwZTZmMTljMjVmMzA2N2Q1MzU3MmVmMDQ3Njg2NWJjMGI1Y2ZlM2MyMjhkMGIyNzkmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.w-TVzScHsMS0XZI5TScquSxT3FmuUk_hOvPM4BtnoU4)

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

[](https://private-user-images.githubusercontent.com/89420889/319301587-1e9089ca-b885-4b2a-9e91-151d5d842a60.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTIxNjgwMTcsIm5iZiI6MTcxMjE2NzcxNywicGF0aCI6Ii84OTQyMDg4OS8zMTkzMDE1ODctMWU5MDg5Y2EtYjg4NS00YjJhLTllOTEtMTUxZDVkODQyYTYwLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA0MDMlMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNDAzVDE4MDgzN1omWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPWMyNDhjNWZhYTRjM2FhM2ViNWU0NDNkMjczMDJkNWIxOTIxYjI4NmU0NzljNTM2ZDA5NDI2NTkyNWJiZTM4MTYmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.Bv2JkavAJNi0CWLSIMCEIsPVAYtsVHxCZiShYMhN_qo)


