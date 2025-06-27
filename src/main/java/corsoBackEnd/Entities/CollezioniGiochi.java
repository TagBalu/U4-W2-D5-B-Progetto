package corsoBackEnd.Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public Gioco cercaPerId(String id)
        throws Exception{
        return giochi.stream().filter(gioco -> gioco.getId().equals(id)).findFirst().orElseThrow(()->new Exception("Gioco non trovato con ID:" + id));
    }

    public List<Gioco>cercaPerPrezzo(double prezzo){
        return giochi.stream().filter(gioco -> gioco.getPrezzo()< prezzo).collect(Collectors.toList());
    }
}
