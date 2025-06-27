package corsoBackEnd;

import corsoBackEnd.Entities.*;

import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        CollezioniGiochi collezione=new CollezioniGiochi();

        Videogioco vg1=new Videogioco("The Witcher 3", 2015,10.0,"Pc",30, Genere.RPG);
        Videogioco vg2=new Videogioco("Call of duty: Modern Warfare", 2019,39,"Ps4",15,Genere.FPS);
        Videogioco vg3=new Videogioco("Alone in the dark",2024,35,"xbox",34,Genere.HORROR);
        collezione.aggiungiGioco(vg1);
        collezione.aggiungiGioco(vg2);
        collezione.aggiungiGioco(vg3);


        GiocoDaTavolo gt1=new GiocoDaTavolo("UNO",1971,9.73,10,30);
        GiocoDaTavolo gt2=new GiocoDaTavolo("Monopoly",1936,29.90,10,80);
        collezione.aggiungiGioco(gt1);
        collezione.aggiungiGioco(gt2);

        collezione.mostraGiochi();
       //-----------------esercizio 2 ----------------------------//
        System.out.println("Inserisci id del gioc da cercare: ");
        String idCercato=scanner.nextLine();
        try{
            Gioco gioco=collezione.cercaPerId(idCercato);
            System.out.println("Trovato: " + gioco);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        //-------------esercizio 3 ------------------//
        System.out.println("Inserisci limite di prezzo: ");
        double limitePrezzo=scanner.nextDouble();

        List<Gioco> risultati=collezione.cercaPerPrezzo(limitePrezzo);
        if (risultati.isEmpty()){
            System.out.println("Nessun gioco con prezzo inferiore a "+ limitePrezzo);
        } else {
            risultati.forEach(System.out::println);
        }
    }
}
