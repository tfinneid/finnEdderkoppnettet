package di.finneid.integrasjoner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import di.finneid.api.Sesjonsstatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/** Pakke nivå for å simulerer java moduler */
class StatusJsonAnalyse {

    private static final Logger log = LogManager.getLogger(StatusJsonAnalyse.class);

    ObjectMapper mapper = new ObjectMapper();

    StatusJsonAnalyse() {
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    }

    Sesjonsstatus behandleStatus(String statusJson) {

        Sesjonsstatus sesjonsstatusMelding = null;

        try {
            sesjonsstatusMelding =  mapper.readValue(statusJson, Sesjonsstatus.class);
        } catch (JsonProcessingException e) {
            log.fatal("Kunne ikke analysere statusmeldinge.");
            System.exit(-2);
        }

        return sesjonsstatusMelding;
    }
}
