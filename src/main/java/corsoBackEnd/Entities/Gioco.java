package corsoBackEnd.Entities;

import java.util.UUID;


    public abstract class  Gioco{
        protected String id;
        protected String titolo;
        protected int annoPubblicazione;
        protected double prezzo;


        public Gioco(String titolo, int annoPubblicazione, double prezzo){
            this.id= UUID.randomUUID().toString();
            this.titolo=titolo;
            this.annoPubblicazione=annoPubblicazione;
            this.prezzo=prezzo;
        }
        public String getId(){
            return id;
        }

        public double getPrezzo(){
            return prezzo;
        }
        @Override
        public String toString() {
            return "Gioco{" +
                    "id='" + id + '\'' +
                    ", titolo='" + titolo + '\'' +
                    ", annoPubblicazione=" + annoPubblicazione +
                    ", prezzo=" + prezzo+" € " +
                    '}';
        }

        public void setPrezzo(double prezzo){
            if (prezzo>0){
                this.prezzo=prezzo;
            }else {throw new IllegalArgumentException("Il prezzo deve essere positivo");
        }


    }


    }
