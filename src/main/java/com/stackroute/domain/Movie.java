package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {
    private int movieId;
    private String movieName;
    private Actor actor2;

    public Movie(int movieId, String movieName) {
        this.movieId = movieId;
        this.movieName = movieName;
    }

    public Movie(int movieId, String movieName, Actor actor) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.actor2 = actor;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Actor getActor() {
        return actor2;
    }

    @Autowired
    public void setActor(Actor actor2) {
        this.actor2 = actor2;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", actor=" + actor2 +
                '}';
    }
}
