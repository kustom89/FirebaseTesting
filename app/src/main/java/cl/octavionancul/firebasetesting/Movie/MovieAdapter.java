package cl.octavionancul.firebasetesting.Movie;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import cl.octavionancul.firebasetesting.R;

public class MovieAdapter extends FirebaseRecyclerAdapter<Movie,MovieAdapter.MovieHolder> {

    //Listener para agregar la funcion de hacer click en la vista
    private MovieListener listener;
    private boolean first = true;

    public MovieAdapter(@NonNull FirebaseRecyclerOptions<Movie> options, MovieListener listener) {
        super(options);
        this.listener= listener;
    }

    @NonNull
    @Override
    public MovieHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_movie,parent,false);
        return new MovieHolder(view);
    }



    @Override
    protected void onBindViewHolder(@NonNull final MovieHolder holder, int position, @NonNull Movie model) {
        holder.name.setText(model.getName());
        holder.score.setText(model.getScore());

        //Luego de definir el listener se define el onclick
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Movie auxMovie = getItem(holder.getAdapterPosition());
            listener.clicked(auxMovie);
            }
        });
    }

    @Override
    public void onDataChanged() {
        super.onDataChanged();

        if(first){
            first=false;
            listener.dataChanged();
        }

    }
    class MovieHolder extends RecyclerView.ViewHolder{

        private TextView name, score;
        
        public MovieHolder(View itemView) {
            super(itemView);
        name= itemView.findViewById(R.id.nameTv);
        score=itemView.findViewById(R.id.scoreTv);
        }
    }
}
