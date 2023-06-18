package di.finneid.integrasjoner;

import di.finneid.api.Sesjonsstatus;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StatusJsonTest {

    @Test
    public void sjekkForKorrektSyntaksAnalyse() {

        String eksempel = " {\"sessionIds\":[]} ";

        StatusJsonAnalyse jsonAnalysator = new StatusJsonAnalyse();
        Sesjonsstatus resultat = jsonAnalysator.behandleStatus(eksempel);

        assertThat(resultat).isNotNull();
    }

    @Test
    public void inneholderToSesjonsidentifikatorer() {

        String eksempel = " {\"sessionIds\":[125522,1234412]} ";

        StatusJsonAnalyse jsonAnalysator = new StatusJsonAnalyse();
        Sesjonsstatus resultat = jsonAnalysator.behandleStatus(eksempel);

        assertThat(resultat.sessionIds())
                .hasSize(2)
                .contains("1234412", "125522");  /** motsatt rekkefølge av elementer for implementasjonsuavhengig
                                                          sammenligning av innholdet */
    }
}