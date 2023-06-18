package di.finneid.integrasjoner;

import di.finneid.api.OptmalisertRute;
import di.finneid.api.Sesjonsstatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class SpiderAPI {

    private static final Logger log = LogManager.getLogger(SpiderAPI.class);

    public static Sesjonsstatus sjekkServerStatus() throws Exception {

        // TODO implementer statusSjekk av spidersesjoner
        return null;
    }

    public boolean opprettSesjon() {

        log.info("Oppretter sesjon mot ruteoptmilasinergsserver");

        // TODO ....

        return true;
    }

    public boolean startOptimalisering() {

        // TODO ....
        return true;
    }

    public OptmalisertRute hentGjeldendeOptimalisrteRute() {

        // TODO ....
        return new OptmalisertRute("");
    }
}
