package corsoBackEnd;

import corsoBackEnd.Entities.CollezioniGiochi;
import corsoBackEnd.Entities.Genere;
import corsoBackEnd.Entities.GiocoDaTavolo;
import corsoBackEnd.Entities.Videogioco;

public class Application {

    public static void main(String[] args) {
        CollezioniGiochi collezione=new CollezioniGiochi();

        Videogioco vg1=new Videogioco("The Witcher 3", 2015,10.0,"Pc",30, Genere.RPG);
        Videogioco vg2=new Videogioco("Call of duty: Modern Warfare", 2019,39,"Ps4",15,Genere.FPS);
        collezione.aggiungiGioco(vg1);
        collezione.aggiungiGioco(vg2);


        GiocoDaTavolo gt1=new GiocoDaTavolo("UNO",1971,9.73,10,30);
        collezione.aggiungiGioco(gt1);

        collezione.mostraGiochi();
    }
}
