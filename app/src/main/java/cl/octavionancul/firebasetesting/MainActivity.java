package cl.octavionancul.firebasetesting;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  final TextView textView = findViewById(R.id.textTv);

        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        String dateFormat = format.format(date);
      //  textView.setText(dateFormat);

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
}
