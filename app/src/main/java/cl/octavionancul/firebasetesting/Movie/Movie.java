package cl.octavionancul.firebasetesting.Movie;

import java.io.Serializable;

//Implementa Serializable para pasar el objeto entero usando la interfaz
public class Movie implements Serializable {
private String name,score;

    public Movie(String name, String score) {
        this.name = name;
        this.score = score;
    }

    public Movie() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
