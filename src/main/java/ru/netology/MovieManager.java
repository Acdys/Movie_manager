package ru.netology;

public class MovieManager {
    private String[] movies = new String[0];


    public void addMovie(String movie){
        String[] tmp = new String[movies.length + 1];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        tmp[tmp.length - 1] = movie;
        movies = tmp;

    }

    public String[] findAll(){
        return movies;
    }

    public String[] findLast(){
        int resultLength = Math.min(movies.length, 10);
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}
