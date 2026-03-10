package FilmIndustry;

public class Main {
    public static void main(String[] args) {
        FilmLibrary filmLibrary = new FilmLibrary();

        filmLibrary.addFilm(new Film("Inception", "Nolan", 2010));
        filmLibrary.addFilm(new Film("Titanic", "James Cameron", 1997));
        filmLibrary.addFilm(new Film("Avatar", "James Cameron", 2009));

        System.out.println("All Films:");
        System.out.println(filmLibrary.getAllFilms());

        System.out.println("Search 'James':");
        System.out.println(filmLibrary.getFilms("James"));

        System.out.println("Total Films: ");
        System.out.println(filmLibrary.getTotalFilmCount());

        filmLibrary.removeFilm("Titanic");

        System.out.println("After removing Titanic");
        System.out.println(filmLibrary.getAllFilms());
    }
}
