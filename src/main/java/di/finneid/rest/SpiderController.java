package di.finneid.rest;

import di.finneid.filoperasjoner.DataLager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// TODO: Finn Fem Feil: I siste liten, finner ikke boot disse mappingene lenger...

@RestController
public class SpiderController {

    private static final Logger log = LogManager.getLogger(SpiderController.class);

    @Autowired
    private DataLager dataLager;

    @GetMapping("/")
    public String hentOptimalisertRute() {

        log.info("AKSESS: Behandler forespørsel om optimalisert rute fra ....");
        String hentetRute = dataLager.hentOptimalsertRute();

        return hentetRute;
    }

    @GetMapping("/ts")
    public String helsesjekk() {

        long ts = System.currentTimeMillis();
        log.info(">>> Helsesjekk forespørsel: Tidsstempel er {}", ts);

        return String.valueOf(ts);
    }
}
