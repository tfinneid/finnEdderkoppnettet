# finnEdderkoppnettet

En demo av et REST API som bruker av Spider optimaliseringsalgoritmen.

## Forutsetninger

- Java 17 LTS
- Gradle (valgfritt), minimum 7.6.1.

### Gradle

Prosjektet kan brukes med og uten Gradle installert på lokal maskin. Hvis gradle er installert lokalt, må versjonen være minst 7.6.1.

Hvis du ikke har Gradle installert, kan du bruke __gradlew__ kommndoen, som laster ned og setter opp en prosjekt-privat installasjon av gradle, med korrekt versjon for prosjektet.

## Bruk

Rest tjenesten kan startes fra kommandolinjen med følgende kommando:

For bruk uten lokal installasjon av Gradle eller hvis det er en versjon lavere.

    $ gradlew bootRun

Eller følgende hvis du allerede har Gradle 7.6.1+ installert

    $ gradle bootRun


## Utvidelser

### OpenAPI (Swagger)

Tjenesten kan leveres med en OpenAPI definisjon, for bruk til testing og eksperimentering med API'et. 

*Dette er en tilllegssfunksjon, som ikke følger denne utgaven.*


