package cl.octavionancul.firebasetesting;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerOptions;

import cl.octavionancul.firebasetesting.Album.Album;
import cl.octavionancul.firebasetesting.Album.AlbumAdapter;
import cl.octavionancul.firebasetesting.Movie.Movie;
import cl.octavionancul.firebasetesting.Movie.MovieActivity;
import cl.octavionancul.firebasetesting.Movie.MovieListener;

//public class MainActivity extends AppCompatActivity {
//implementa movielistener para agregar el click en una fila y ver detalle en otra activity
public class MainActivity extends AppCompatActivity implements MovieListener {

    public static  final String MOVIE ="cl.octavionancul.firebasetesting.KEY.MOVIE";
    private ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Desafio 03 - E8
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.albumRv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        //Con el sethasfixedsize no funciona
       // recyclerView.setHasFixedSize(true);

        //options del adapter
        FirebaseRecyclerOptions<Album> options = new  FirebaseRecyclerOptions.Builder<Album>()
                .setQuery(new Nodes().albums(),Album.class)
                .setLifecycleOwner(this)
                .build();

        AlbumAdapter adapter = new AlbumAdapter(options);
        recyclerView.setAdapter(adapter);


 /*       progressDialog= new ProgressDialog(this);
        progressDialog.setCancelable(false);
        progressDialog.show();

        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //Para definir un divisor drawable
     //   DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,LinearLayoutManager.VERTICAL);
      // dividerItemDecoration.setDrawable(R.drawable);
     //   recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        FirebaseRecyclerOptions<Movie> options = new  FirebaseRecyclerOptions.Builder<Movie>()
                .setQuery(new Nodes().movies(),Movie.class)
                .setLifecycleOwner(this)
                .build();

        MovieAdapter movieAdapter = new MovieAdapter(options,this);
        recyclerView.setAdapter(movieAdapter);

        */

/*        new Nodes().movies().addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Movie movie = dataSnapshot.getValue(Movie.class);;
                Log.d("movies",movie.getName());
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });*/


/*
        DatabaseReference root = FirebaseDatabase.getInstance().getReference().child("quotes");
       DatabaseReference may24 = root.child("20170524");
      DatabaseReference may26 = root.child("20170526");
     DatabaseReference may28 = root.child("20170528");



        may24.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
              //  String text = dataSnapshot.getValue(String.class);
              //  String mayo24 = String.valueOf(dataSnapshot.child("20170524").getValue(String.class));
              //  String mayo26 = String.valueOf(dataSnapshot.child("20170526").getValue(String.class));

            Log.d("quote",dataSnapshot.getValue(String.class));
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
*/



      //  final TextView textView = findViewById(R.id.textTv);

 /*       Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        String dateFormat = format.format(date);*/
      //  textView.setText(dateFormat);

  /*      Bike bike = new Bike();
        bike.setPhoto("www.trek.cl/marlin.jpg");
        bike.setDetail("Aro 29");
        bike.setModel("Marlin 6");
        bike.setPhone("+56 9 87654321");

        FirebaseDatabase.getInstance().getReference().push().setValue(bike);
*/


     //   DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("quotes").child(dateFormat);
    //    DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("wines").child("merlot");

      /* DatabaseReference reference = new Nodes().client("jhkkjnkjn");

       reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

              //  Log.d("Quote",dataSnapshot.getValue(String.class));
              //  textView.setText(dataSnapshot.getValue(String.class));

            //      Wine wine = dataSnapshot.getValue(Wine.class);
            //    if(wine!=null){
                if(dataSnapshot.exists()){
                   Log.d("wine","existe");
                }else{
                    Log.d("wine","no existe");
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });*/

 /*       Button button = findViewById(R.id.addBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              *//*  Product product = new Product();
                product.setDescription("Description 2");
                product.setTitle("Bike 2");
                product.setPhone("987654321");
                product.setPhoto("www.bikes.cl/bike2.jpg");

                FirebaseDatabase.getInstance().getReference().push().setValue(product);*//*



            }
        });*/
    }

    @Override
    public void clicked(Movie movie) {
        Intent intent = new Intent(this,MovieActivity.class);
        intent.putExtra(MOVIE,movie);
        startActivity(intent);

      //  Toast.makeText(this, movie.getName(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void dataChanged() {
    progressDialog.dismiss();
    }
}
