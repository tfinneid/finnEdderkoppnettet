package di.finneid.filoperasjoner;

import di.finneid.api.OptmalisertRute;
import di.finneid.rest.SpiderController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class DataLager {

    private static final Logger log = LogManager.getLogger(SpiderController.class);

    public String hentOptimalsertRute() {
        log.info("Henter ruteinformasjon....");

        return ("9999.6666");
    }

    public void lagreBeregnedeRuter(OptmalisertRute rute) {
        log.info("Lagrer ruten....");
    }
}
