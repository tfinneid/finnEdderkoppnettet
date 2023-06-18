package di.finneid.filoperasjoner;

import di.finneid.api.Koordinat;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class KoordinatKilderTest {

    @Test
    public void lesKoordinaterFraFil() {

        List<Koordinat> rute = KoordinatKilder.lesFraFil("data/spidercase.csv");

        assertThat(rute)
                .hasAtLeastOneElementOfType(Koordinat.class)
                .hasSize(695);
    }

}