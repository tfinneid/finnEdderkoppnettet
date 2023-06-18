package di.finneid.filoperasjoner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KoordinatKilder {

    private static final Logger log = LogManager.getLogger(KoordinatKilder.class);

    public static List<Koordinat> lesFraFil(String filnavn) {

        List<Koordinat> koordinater = null;

        Path sti = Path.of(filnavn);
        try (Stream<String> lines = Files.lines(sti).skip(1) ) {  // Hopper over tittellinjen

            koordinater = lines.map( l -> {
                    String[] k = l.split(",");
                    return new Koordinat( k[0], k[1] );
                }
            ).collect(Collectors.toList());


        } catch (Exception e) {
            log.fatal("Kunne ikke lese feil {}. Avslutter programmet", filnavn );
            System.exit(-1);
        }

        return Collections.unmodifiableList(koordinater);
    }

}
