package FilmIndustry;

public class Film {
    private String title;
    private String director;
    private int year;

    public Film(String title, String director, int year){
        this.title = title;
        this.director = director;
        this.year = year;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector(){
        return director;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    @Override
    public String toString(){
        return "Film{" + "title: " + title
        + "director: " + director +
        "year: " + year;
    }
}
