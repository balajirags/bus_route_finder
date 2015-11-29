package in.balaji.works.models;

/**
 * Created by gbalaji on 29/11/15.
 */
public enum Stops
{
    MADIPAKKAM("madipakkam"),
    CHROMPET("chrompet"),
    TAMBARAM("tambaram"),
    PALLAVARAM("pallavaram"),
    VELACHERY("velachery"),
    AIRPORT("airport"),
    THIRUVANMIYUR("thiruvanmiyur"),
    ADYAR("adyar"),
    ANNA("anna"),
    GUINDY("guindy"),
    TARAMANI("taramani"),
    THORIAPAKKAM("thoriapakkam");


    private final String place;

    Stops(String place)
    {
        this.place = place;
    }

    public String getValue(){
        return place;
    }
}
