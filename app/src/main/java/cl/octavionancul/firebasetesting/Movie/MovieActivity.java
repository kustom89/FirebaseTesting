package cl.octavionancul.firebasetesting.Movie;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cl.octavionancul.firebasetesting.MainActivity;
import cl.octavionancul.firebasetesting.R;

public class MovieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        Movie movie = (Movie) getIntent().getSerializableExtra(MainActivity.MOVIE);
        getSupportActionBar().setTitle(movie.getName());


    }
}
