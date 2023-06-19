

# finnEdderkoppnettet

En prototype på en REST tjeneste som tilbyr ruteoptimalisering ved hjelp av Spider tjenestens algoritmer.

## Innhold

GitHub autogenererer en fortegnelse av innholdet, som vises på nettsiden under ikonet ved siden av navnet 
i README vinduet.

Dette dokumentet oppsummerer hoveddelene av arbeidet

- Designet / arkitekturen
- Teknisk beskrivelse av implementasjonen
- Bruk av løsningen

## Om systemes design og arkitektur

Fordi dette er en ganske liten og enkel versjon av systemet, blir utførelsen ganske oversiktlig. 
Typisk vil man arbeide annerledes når systemet er større og mer komplisert.

I denne oppgaven kan man gå rett på systemdesignet. Arktiekturen består i all hovedsak av enkel 
java modularisering, som også kan benevnes som delsystemer som et perspektiv for reelle systemer.

Grensesnittet i delsystemene og samarbeid dem i mellom for å beskrive systemet som helhet, blir 
ikke tillagt vesentlig vekt i eventuell arkitektur for prototypen. 

### Systemdesignet

Hver hovedpakke i java, representerer i denne løsnignen en potensiell java modul eller delsystem, 
avhengig av realistisk funksjon og størrelse. 

Det er er ikke lagt vekt på ekte teknisk modularisering, ei heller alle arkitektur, systemdesign eller domenedesign
spørsmål som ville vært naturlig å vurdere, da java pakker dekker formålet for denne prototypen. Det er mer ment for å
belyse områdene.

#### Gjennomføringen

Med et så oversiktlig system, er designet utarbeidet basert på en ren ovenfra og ned metodikk. Implementering gjenspeiler også den 
gjennomføringen, **og forklarer hvis detaljer i implementasjonen ikker er gjennomført** i denne prototypen.

Kravspspesifikasjonen er delvis uklar og tolkes som en simulering av reelle kravspesifikasjoner, dvs som et første utkast fra forretning. Prosessen er da å gå i samtaler med forretning, for iterativ utdypning og implementasjon av løsningen.

**For denne prototypen er det derfor tatt visse beslutninger i designet og implementasjonen, uten videre konsultasjon  (med forretning).**



## Tekniske detaljer

Systemet består av flere delsystemer: lesing av inndata, behandlingsoperasjon på data og presentasjon 
av data. Delsysemene er som følger

### Filoperasjoner

Rådataene som brukes i tjenesten ligger i katalogen

    /finnEdderkoppnettet/data

Disse lese fra og tilbys i modulen **Fileoperasjoner**

### Databenahdling


### Eksterne systemer

Grensesnitt mot eksterne systemer ligger i modulen

    Integrasjoner

## Bruk

### Forutsetninger

- Java 17 LTS
- Gradle (valgfritt), minimum 7.6.1.

### Gradle

Prosjektet kan brukes med og uten Gradle installert på lokal maskin. Hvis gradle er installert lokalt, 
må versjonen være minst 7.6.1.

Hvis du ikke har Gradle installert, kan du bruke __gradlew__ kommndoen, som laster ned og setter opp en 
prosjekt-privat installasjon av gradle, med korrekt versjon for prosjektet.

### Kjøring av applikasjon

REST tjenesten kan startes fra kommandolinjen med følgende kommandoer. Disse kommandoene kjører ikke 
tester før start.

For bruk uten lokal installasjon av Gradle eller ved lavere versjon installert lokalt

    $ gradlew bootRun

Alterntativt kan følgende brukes, hvis Gradle 7.6.1+ allerede er installert lokalt

    $ gradle bootRun


### Bygging av prosjeket

Bygging av prosjektet innebærer kompilering, kjøring av tester og konstruksjon av en eksekverbar jar fil. 
Det er ikke nødvendig å kjøre jar filen manuelt, bruk heller gralde sin "bootRun" kommando i stedet.
Argumentet "-x test" fører til at testene ikke blir kjørt. Men de blir fremdeles kompilert.

    $ gradle(w) clean build [-x test]

Den bygde jar filen vil ligge i build/libs katalogen.


## Utvidelser

### OpenAPI (Swagger)

Det er mulig å bruke en OpenAPI definisjon, for å teste eller eksperimentere med REST grensensittet. 
Men den er ikke inkludert i denne prototypen.


## Andre bemerkninger

Kommentarer i koden er formatert med "// TODO", dette fargebelyses i Intellij
