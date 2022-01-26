package Vjezba.oop.myjavaprogram.Movie;

public class Movie {
    private String title;
    private String director;
    private int review;

   public Movie (String title, int review){ // Konstruktor sa parametrima
       this.title = title;
       this.review = review;
   }

   public Movie(){ // Konstruktor bez parametara

   }
    //   public Movie(){
  //      System.out.println("Best movies"); //Poziva se tri puta u TestMovie zato što tamo imamo 3 konstruktora.
  //  }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int reviwe) {
        this.review = reviwe;
    }
}
