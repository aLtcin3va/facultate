package ro.faculate;
import java.util.List;

public class Account {
        private int cont;
        private int suma;
        private String titular;
        private List<Card> carduri;
        private int comision;
        private int plataFurnizori;
        private int sumaRetrasa;

        public Account(int cont, int suma, String titular, List<Card> carduri) {
            this.cont = cont;
            this.suma = suma;
            this.titular = titular;
            this.carduri = carduri;
        }

        public int getSuma() {
            return suma;
        }

        public int getCont() {
            return cont;
        }

        public List<Card> getCarduri() {
            return carduri;
        }

        public int getExtragereSold() {
            suma -= sumaRetrasa;
            return suma;
        }

        public int getPlataFurnizori() {
            comision = plataFurnizori / 100;
            suma -= (plataFurnizori + comision);
            return suma;
        }
    }