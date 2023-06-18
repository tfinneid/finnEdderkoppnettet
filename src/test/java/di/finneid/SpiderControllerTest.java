package di.finneid;

import di.finneid.rest.SpiderController;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SpiderControllerTest {

	@Test
	void korrektOpprettelseAvSpiderController() {
		SpiderController c = new SpiderController();

		assertThat(c).isNotNull();
	}

	@Test
	void mangledneOpprettelseAvSpiderControllerSkalKasteException() {
		SpiderController c = null;

		assertThatExceptionOfType(
				NullPointerException.class
		).isThrownBy( () -> {

			c.helsesjekk();
		});
	}

	@Test
	void returMeldingStarterMedTidstemplerErXXXVerdi() {
		SpiderController c = new SpiderController();

		long c2 = System.currentTimeMillis();

		long retVal = Long.valueOf( c.helsesjekk() );

		assertThat(retVal).isGreaterThanOrEqualTo(retVal);
	}
}
