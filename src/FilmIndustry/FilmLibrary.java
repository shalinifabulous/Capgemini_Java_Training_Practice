package FilmIndustry;

import java.util.ArrayList;
import java.util.List;

public class FilmLibrary implements IFilmLibrary{
    private List<Film> films;

    public FilmLibrary(){
        films = new ArrayList<>();
    }

    @Override
    public void addFilm(Film film){
        films.add(film);
    }

    @Override
    public void removeFilm(String title){
        films.removeIf(film -> film.getTitle().equalsIgnoreCase(title));
    }

    @Override
    public List<Film> getFilms(String query) {

        List<Film> result = new ArrayList<>();

        for (Film film : films) {
            if (film.getTitle().toLowerCase().contains(query.toLowerCase())
                    || film.getDirector().toLowerCase().contains(query.toLowerCase())) {

                result.add(film);
            }
        }
        return result;
    }

    public List<Film> getAllFilms(){
        return films;
    }

    public int getTotalFilmCount(){
        return films.size();
    }
}
