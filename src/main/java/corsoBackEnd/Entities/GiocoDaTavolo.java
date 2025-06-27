package corsoBackEnd.Entities;

public class GiocoDaTavolo extends Gioco {
    private int numgiocatori;
    private int durataMedia;
    public GiocoDaTavolo(String titolo, int annoPubblicazione, double prezzo, int numgiocatori,int durataMedia) {
        super(titolo, annoPubblicazione, prezzo);
        if (numgiocatori<2||numgiocatori>10){
            throw new IllegalArgumentException("Numero di giocatori deve essere tra 2 e 10");
        }
        this.numgiocatori=numgiocatori;
        this.durataMedia=durataMedia;
    }

    @Override
    public String toString() {
        return "GiocoDaTavolo{" +
                "numgiocatori=" + numgiocatori +
                ", durataMedia Partita = " + durataMedia+" Minuti " +
                ", id='" + id + '\'' +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", prezzo=" + prezzo+" € "+
                '}';
    }
}
