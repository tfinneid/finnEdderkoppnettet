package di.finneid.oppstart;

import di.finneid.api.Koordinat;
import di.finneid.api.OptmalisertRute;
import di.finneid.filoperasjoner.DataLager;
import di.finneid.filoperasjoner.KoordinatKilder;
import di.finneid.integrasjoner.SpiderAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpiderApplication {

	private static final Logger log = LogManager.getLogger(SpiderApplication.class);

	// TODO fiks feilen: Boot finner ikke disse bønnene
	//      har nok med at dette skjer i @SpringBootApplication kontekst
//	@Autowired
//	private SpiderAPI spiderAPI;

//	@Autowired
//	private DataLager dataLager;

	public static void main(String[] args) {
		SpringApplication.run(SpiderApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return (args) -> {

			List<Koordinat> koordinater = KoordinatKilder.lesFraFil("data/spidercase.csv");
			log.debug("Leser koordinater ved oppstart: \n----\n\n{}\n\n----\n", koordinater);

			try {
				SpiderAPI.sjekkServerStatus();   // Finnes det en bedre algoritme for håndtering av slikt?
			} catch (Exception e) {
				log.fatal("Får ikke kontakt med Spider server, prøver igjen og igjen og igjen.... Avslutter");
				System.exit(-3);
			}

			SpiderAPI spiderAPI = new SpiderAPI();
			DataLager dataLager = new DataLager();

			if (!spiderAPI.opprettSesjon()) {
				log.warn("Klarer ikke å opprette sesjon.... Avslutter fordi vi mangler feilhåndteringslogikk");
				System.exit(-4);
			}

			if (!spiderAPI.startOptimalisering()) {
				log.warn("Klarer ikke å opprette sesjon.... Avslutter fordi vi mangler feilhåndteringslogikk");
				System.exit(-4);
			}

			OptmalisertRute beregnetRute =  spiderAPI.hentGjeldendeOptimalisrteRute();
			log.info("Venter på optimliseringsresultat....");

			dataLager.lagreBeregnedeRuter(beregnetRute);
			log.info("Applikasjonen er klar til å ta i mot forespørsler om ruteforslag");
		};
	}
}
