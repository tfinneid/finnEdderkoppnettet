package di.finneid.rest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpiderController {

    private static final Logger log = LogManager.getLogger(SpiderController.class);

    @GetMapping("/")
    public String visForside() {

        long ts = System.currentTimeMillis();
        log.info(">>> Tidsstempel er {}", ts);

        return "Forsiden: " + ts;
    }

    @GetMapping("/ts")
    public String hentTidsstempel() {

        long ts = System.currentTimeMillis();
        log.info(">>> Tidsstempel er {}", ts);

        return String.valueOf(ts);
    }
}
