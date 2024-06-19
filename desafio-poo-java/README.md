## Diagrama UML do Desafio

```mermaid
classDiagram
    interface ReprodutorMusical {
        + tocar(): void
        + pausar(): void
        + selecionarMusica(musica: String): void
    }

    interface AparelhoTelefonico {
        + ligar(numero: String): void
        + atender(): void
        + iniciarCorreioVoz(): void
    }

    interface NavegadorInternet {
        + exibirPagina(url: String): void
        + adicionarNovaAba(): void
        + atualizarPagina(): void
    }

    class iPhone {
        - ReprodutorMusical
        - AparelhoTelefonico
        - NavegadorInternet
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```
