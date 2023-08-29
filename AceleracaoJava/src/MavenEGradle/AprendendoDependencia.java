package MavenEGradle;

public class AprendendoDependencia {

  public static void main(String[] args) {
    /*
     * === Apache Maven ===
     * 
     * No desenvolvimento de software, chamamos a etapa de entrega de “build”, que é quando
     * empacotamos tudo de que precisamos para que o software funcione e disponibilizamos da forma
     * previamente acordada para a implantação.
     * 
     * === Configurando o Maven através do arquivo pom.xml === Para utilizar todos os benefícios do
     * Apache Maven, é necessário colocar um arquivo chamado “pom.xml” na raiz do seu projeto,
     * indicando que ele é “guiado” pelo Maven.
     * 
     * Primeiramente, antes de colocarmos nossas dependências no arquivo “pom.xml”, precisamos
     * adicionar algumas informações básicas:
     * 
     * groupId: o nome dos pacotes da sua organização. artifactId: o nome do seu projeto ou produto.
     * version: a versão em que se encontra o projeto ou produto. packaging: o tipo de arquivo que é
     * disponibilizado no final
     * 
     * EXEMPLO DO ARQUIVO POM.XML
     * 
     * <project>
     * 
     * <modelVersion>4.0.0</modelVersion>
     * 
     * <groupId>com.trybe</groupId>
     * 
     * <artifactId>trybe-webapp</artifactId>
     * 
     * 
     * <version>1.0-SNAPSHOT</version>
     * 
     * <packaging>war</packaging>
     * 
     * </project>
     * 
     * 
     * 
     * === Gradle ===
     * 
     * 
     * As grandes diferenças entre Gradle e Maven são:
     * 
     * O Gradle é facilmente customizável, visto que com ele você cria seu próprio script em
     * linguagem de programação (embora seja um pouco mais complexo, é mais livre), enquanto o Maven
     * é mais travado devido à sua “simplicidade”. O Gradle tem um mecanismo de incrementalidade, ou
     * seja, depois da primeira vez que o script de build é aplicado, somente os arquivos que
     * sofrerem mudanças e ou forem adicionados a esse script é que vão passar pelo processo de
     * build novamente. Esse mecanismo acelera muito o tempo de build de um projeto. A cada build
     * gerada, o Gradle gera um cache para ele. Se nada mudou desde a última build, o Gradle te dá a
     * versão que está no cache, acelerando o tempo de build de um projeto.
     * 
     * Configurando Gradle programaticamente
     * 
     * Usando Gradle, temos a opção de fazer as declarações programaticamente, usando uma DSL
     * (veremos mais adiante sobre) para Groovy ou Kotlin, um pouco diferente do XML que encontramos
     * em projetos Maven. Além disso, o Gradle suporta dependências tanto Maven quanto Ivy (usado
     * pelo Ant), sendo possível usar múltiplos repositórios diferentes em formatos diferentes.
     * 
     * 
     * Gradle e sua DSL para configurações
     * 
     * No exemplo a seguir, podemos ver como é simplicada a maneira de declararmos novos
     * repositórios de dependência usando a DSL em Kotlin:
     * 
     * \/\/\/\/\/\/\/\/\/\/\/\/\/\/\/
     * 
     * build.gradle.kts
     * 
     * repositories {
     * 
     * mavenCentral()
     * 
     * maven {
     * 
     * url = uri("https://repo.spring.io/release")
     * 
     * }
     * 
     * maven {
     * 
     * url = uri("https://repo.spring.io/release")
     * 
     * }
     * 
     * }
     * 
     * /\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\
     * 
     * 
     * EXEMPLO declaração de dependência do projeto usando DSL
     * 
     * \/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/
     * 
     * biuld.gradle.kts
     * 
     * publins {
     * 
     * `java-library`
     * 
     * }
     * 
     * repositories {
     * 
     * mavenCentral()
     * 
     * }
     * 
     * dependencies {
     * 
     * implementation("org.springframework:spring-web:5.+")
     * 
     * }
     * 
     */

  }

}
