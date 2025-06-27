package corsoBackEnd.Entities;

import java.util.ArrayList;
import java.util.List;

public class CollezioniGiochi {
    private List<Gioco> giochi;

    public CollezioniGiochi(){
        giochi=new ArrayList<>();
    }

    public  void aggiungiGioco(Gioco gioco){
        giochi.add(gioco);
    }

    public void mostraGiochi(){
        for (Gioco gioco: giochi){
            System.out.println(gioco);
        }
    }
}
