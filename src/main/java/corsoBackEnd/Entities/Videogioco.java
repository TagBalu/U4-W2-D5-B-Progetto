package corsoBackEnd.Entities;

public class Videogioco extends Gioco {
    private String piattaforma;
    private  int durataGioco;
    private Genere genere;
    public Videogioco(String titolo, int annoPubblicazione, double prezzo,String piattaforma, int durataGioco, Genere genere) {
        super(titolo, annoPubblicazione, prezzo);
        this.piattaforma=piattaforma;
        this.durataGioco=durataGioco;
        this.genere=genere;
    }
    @Override
    public String toString() {
        return "Videogioco{" +
                "piattaforma='" + piattaforma + '\'' +
                ", durataGioco = " + durataGioco+ " Ore " +
                ", genere=" + genere +
                ", id='" + id + '\'' +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", prezzo= " + prezzo+" € " +
                '}';
    }
}
