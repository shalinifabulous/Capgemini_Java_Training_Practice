package FilmIndustry;

import java.util.List;

public interface IFilmLibrary {

    void addFilm(Film film);

    void removeFilm(String title);

    List<Film> getFilms(String query);

    List<Film> getAllFilms();

    int getTotalFilmCount();
}
