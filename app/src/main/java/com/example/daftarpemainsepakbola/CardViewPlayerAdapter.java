package com.example.daftarpemainsepakbola;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewPlayerAdapter extends RecyclerView.Adapter<CardViewPlayerAdapter.CardViewViewPHolder> {
    private ArrayList<Player> listPlayer;

    public CardViewPlayerAdapter(ArrayList<Player> list){
        this.listPlayer = list;
    }

    @NonNull
    @Override
    public CardViewViewPHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_player, viewGroup, false);
        return new CardViewViewPHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewPHolder holder, int position) {

        final Player player = listPlayer.get(position);
        Glide.with(holder.itemView.getContext())
                .load(player.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);
        holder.tvName.setText(player.getName());
        holder.tvDetail.setText(player.getDetail());
        holder.btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Selecting " +
                        listPlayer.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
                Intent getDetail = new Intent(v.getContext().getApplicationContext(), DetailActivity.class);
                getDetail.putExtra("Name", player.getName());
                getDetail.putExtra("Detail", player.getDetail());
                getDetail.putExtra("Photo", player.getPhoto());

                v.getContext().startActivity(getDetail);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPlayer.size();
    }

    public class CardViewViewPHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        Button btnDetail;

        public CardViewViewPHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            btnDetail = itemView.findViewById(R.id.btn_detail);
        }
    }
}
