package cl.octavionancul.firebasetesting;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Nodes {
    DatabaseReference root = FirebaseDatabase.getInstance().getReference();

    public DatabaseReference clients() {

        return root.child("clients");
    }

    public DatabaseReference movies() {

        return root.child("movies");
    }

    public DatabaseReference albums() {

        return root.child("albums");
    }

    public DatabaseReference client() {
        return clients().child("jhkkjnkjn");
    }

    public DatabaseReference client(String key) {

        return clients().child(key);
    }

}
