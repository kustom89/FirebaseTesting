package cl.octavionancul.firebasetesting.Album;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import cl.octavionancul.firebasetesting.R;

public class AlbumAdapter extends FirebaseRecyclerAdapter<Album,AlbumAdapter.AlbumHolder> {


    public AlbumAdapter(@NonNull FirebaseRecyclerOptions<Album> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull AlbumHolder holder, int position, @NonNull Album model) {
    holder.name.setText(model.getName());
    holder.band.setText(model.getBand());
    holder.release.setText(String.valueOf(model.getRelease()));

    }

    @NonNull
    @Override
    public AlbumHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_album,parent,false);
        return new AlbumAdapter.AlbumHolder(view);
    }

    public static class AlbumHolder extends RecyclerView.ViewHolder{

        private TextView name, band, release;

        public AlbumHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.nameTv);
            band = (TextView) itemView.findViewById(R.id.bandTv);
            release = (TextView) itemView.findViewById(R.id.releaseTv);

        }
    }
}
