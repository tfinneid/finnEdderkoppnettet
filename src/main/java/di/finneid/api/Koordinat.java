package di.finneid.api;

public record Koordinat(double breddegrad, double lengdegrader) {

    public Koordinat(String b, String l) {
        this( Double.valueOf(b), Double.valueOf(l) );
    }
}
