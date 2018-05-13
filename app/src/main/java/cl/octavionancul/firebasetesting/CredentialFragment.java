package cl.octavionancul.firebasetesting;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


/**
 * A simple {@link Fragment} subclass.
 */
public class CredentialFragment extends Fragment {


    public CredentialFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_credential, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        final TextView deparment = view.findViewById(R.id.deparmentTv);
        final TextView jobTitle = view.findViewById(R.id.jobTitleTv);
        final TextView name = view.findViewById(R.id.nameTv);

        DatabaseReference root = FirebaseDatabase.getInstance().getReference();
        root.child("credentials").child("00030").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
              /*  Credential credential = dataSnapshot.getValue(Credential.class);

                deparment.setText(credential.getDeparment());
                jobTitle.setText(credential.getJobTitle());
                name.setText(credential.getName());*/




            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }
}
