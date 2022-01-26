package Vjezba.oop.myjavaprogram.Karta;

import java.io.Serializable;

 class Karta implements Serializable {
    private String codeName;
    private String color;
    private int number;

//    Konstruktor sa parametrima i u ovom zadatku nam ne treba, ali navodim da se zna šta je.
 //    public Karta(String codeName, String color, int number) {
 //        this.codeName = "Karo dama";
 //          this.color = "Crna";
 //        this.number = 13;
 //    }
 //    public Karta(){ // Konstruktor bez parametara
 //  }

     // Gett i Sett metode
    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
