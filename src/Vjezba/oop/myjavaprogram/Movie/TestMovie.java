package Vjezba.oop.myjavaprogram.Movie;

public class TestMovie {

    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setTitle("Superman");
        movie1.setDirector("Richard Donner");
        movie1.setReview(8);

        Movie movie2 = new Movie();
        movie2.setTitle("The Revenant");
        movie2.setDirector("Alejandro G.I.");
        movie2.setReview(7);

        Movie movie3 = new Movie();
        movie3.setTitle("Interstellar");
        movie3.setDirector("Christopher Nolan");
        movie3.setReview(10);

        System.out.println("Naziv filma : " + movie2.getTitle());

        Movie movie4 = new Movie("Otpisani", 8);
        System.out.println("Naziv filma je: " + movie4.getTitle()  + " " +  "Ocjena je: " + movie4.getReview()); // Poziva se konstruktor sa dva parametra u Movie.

    }
}
