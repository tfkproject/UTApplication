package app.tfkproject.utapplication.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import app.tfkproject.utapplication.GuideDetailActivity;
import app.tfkproject.utapplication.R;
import app.tfkproject.utapplication.model.ItemGuide;

/**
 * Created by taufik on 15/05/18.
 */

public class AdapterGuide extends RecyclerView.Adapter<AdapterGuide.ViewHolder> {

    private Context context;
    private List<ItemGuide> itemList;

    public class ViewHolder extends RecyclerView.ViewHolder {
        public CardView cardItem;
        public TextView txtJudul;

        public ViewHolder(View view) {
            super(view);
            cardItem = (CardView) view.findViewById(R.id.cardView);
            txtJudul = (TextView) view.findViewById(R.id.txt_judul);
        }
    }

    public AdapterGuide(Context context, List<ItemGuide> itemList){
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_guide, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.cardItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, GuideDetailActivity.class);
                intent.putExtra("key_judul", itemList.get(position).getJudul());
                intent.putExtra("key_gambar", itemList.get(position).getGambar());
                intent.putExtra("key_keterangan", itemList.get(position).getKeterangan());
                context.startActivity(intent);
            }
        });

        holder.txtJudul.setText(itemList.get(position).getJudul());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
