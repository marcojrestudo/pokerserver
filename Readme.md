# Poker Leo - Servidor

## Ambiente

### Crie do diretório Dev e source

Clique em search na barra de taferas do windows
Digite cmd e enter

Digite:

```cmd
cd\
mkdir Dev
cd Dev
mkdir src
mkdir IDE
mkdir tools
```

### Baixar a IDE

Será utilizada a IDE ***IntelliJ IDEA*** versão comunitária (free).

O InteliJ é a mesma IDE do Android Studio.

https://www.jetbrains.com/pt-br/idea/download/#section=windows

> Dicas de plugins
>
> - Atom Material File Icons
> - SonarLint 
> - Visual Studio Code Dark Plus Theme

Configurar icones:
File | Settings | Appearance & Behavior | Atom Material Icons Settings


Alterar o tema: 
File | Settings | Appearance & Behavior | Appearance



### Dicionários para Android Studio

https://github.com/rafaelsc/IntelliJ.Portuguese.Brazil.Dictionary

Caminho para indicar os dicionários
Editor | Proofreading | Spelling

### Configuração do GIT e do GITHUB
Clique em search na barra de taferas do windows
Digite cmd e enter

Digite:

```cmd
git --version
```
Feche a janela de comando do windows

Configurando GIT na IDE
File | Settings | Version Control | Git


Configurando GITHUB na IDE
File | Settings | Version Control | GitHub

## Criando o projeto do servidor
Vamos utilizar o ***SPRING BOOT*** para fazer o projeto

https://start.spring.io/

|Parâmetro|Conteúdo|
|---|---|
|Project|Gradle Project|
|Language|Kotlin|
|Spring Boot|2.5.5 +|
|Group|br.com.legus|
|Artifact|pokerserver|
|Name|pokerserver|
|Description|Servidor do Jogo de Poker Legus|
|Package name|br.com.legus.pokerserver|
|Packaging|Jar|
|Java|11|

#### Dependências
|Grupo|Dependência|
|---|---|
|DEVELOPER TOOLS|Spring Boot DevTools |
|WEB|Spring Web|

Baixar o Arquivo ZIP do projeto
Clique em search na barra de taferas do windows
Digite cmd e enter

Digite:
```cmd
cd\Dev\src
mkdir Poker
```
Extraia o conteúdo de pokerserver.zip no diretório Poker

## Projeto

- Abra da IDE e crie um novo projeto vazio
- Indique a pasta c:\Dev\src\Poker
- Adicione o módulo do servidor
- Clique e +
- Clique em Import Module
- Clique em pokersrv
- Escolha Maven
- Clique em Finish

Navegue na árvore do projeto até
pokersrv/src/main/kotlin/br/com/legus/pokersrv

Veja o conteúdo do Arquivo
PokersrvApplication.kt

Crei um pacote com o nome controller

Clique com o botão direito sobre o pacote e crie uma classe Kotlin
PlayerController.kt

```kotlin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PlayerController {

    @GetMapping("/player")
    fun getPlayer(): String {
        return "Nome do Jogador"
    }
}
```

## DevOps

### Controle de versão

Clique em VCS
Clique em Create a GIT repository

Configurar o arquivo do git no projeto
Abra o aqruivo .git\config

Inclua as linhas abaixo

```
[user]
	email = oliveira.marco.jr@gmail.com
	name = marcojrestudo
```

- Clique na aba commit
- Selecione todos os arquivos
- Insira a mensagem do commit "Initial commit"
- Clique em commit

Selecione 
Git | GitHub | Share Project on GitHub

É necessário criar o arquivo system.properties na raiz do projeto, para informar o heroku da versão do java que estamos utilizado.

```
java.runtime.version=11
```

### Heroku

Acesse
https://www.heroku.com/


## Markdown language
https://www.markdownguide.org/basic-syntax/
https://www.markdownguide.org/extended-syntax/ 

Linguagens suportadas pelo Github Flavored Markdown

|actionscript3|apache|applescript|asp|
|---|---|---|---|
|brainfuck|c|cfm|clojure|
|cmake| coffee|cpp|cs|
|csharp|css|csv|bash|
|diff|elixir|erb|go|
|haml|http|java|javascript|
|json|jsx|less|lolcode|
|make|markdown|matlab|nginx|
|objectivec|pascal|PHP|Perl|
|python|profile|rust|salt|
|shell|sh|zsh|bash|
|scss|sql|svg|swift|
|ruby|smalltalk|vim|volt|
|vhdl|vue|xml|yaml|
