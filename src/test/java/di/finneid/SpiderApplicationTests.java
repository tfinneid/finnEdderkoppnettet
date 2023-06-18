package di.finneid;

//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;

import di.finneid.rest.SpiderController;

import static org.assertj.core.api.Assertions.assertThat;

//@SpringBootTest
class SpiderApplicationTests {

//	@Test
	void korrektOpprettelseAvSpiderController() {
		SpiderController c = new SpiderController();

		assertThat(c).isNot(null);
	}

//	@Test // expect failed assertion
	void mangledneOpprettelseAvSpiderControllerSkalKasteException() {
		SpiderController c = null;

		assertThat(c).isNot(null);
	}

}
