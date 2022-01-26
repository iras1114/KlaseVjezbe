package Vjezba.oop.myjavaprogram.Karta;

public class TesterKarta {
    public static void main(String[] args) {
        Karta karta = new Karta();
        karta.setCodeName("Karo Dama");
        karta.setColor("Crna");
        karta.setNumber(13);
        System.out.println("Ime karte : " + karta.getCodeName());
        System.out.println("Boja karte : " + karta.getColor());
        System.out.println("Broj Karte : " + karta.getNumber());
    }
}
