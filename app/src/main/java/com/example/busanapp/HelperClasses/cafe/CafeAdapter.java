package com.example.busanapp.HelperClasses.cafe;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.busanapp.R;

import java.util.ArrayList;

public class CafeAdapter extends RecyclerView.Adapter<CafeAdapter.AdapterAllCategoriesViewHolder> {
    private ArrayList<CafeHelperClass> cafeLocations;

    public CafeAdapter(ArrayList<CafeHelperClass> cafeLocations) {
        this.cafeLocations = cafeLocations;
    }

    @NonNull
    @Override
    public AdapterAllCategoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_item, parent, false);
        return new AdapterAllCategoriesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterAllCategoriesViewHolder holder, int position) {
        CafeHelperClass helperClass = cafeLocations.get(position);

//      holder.imageView.setImageResource(helperClass.getImage());
        Glide.with(holder.itemView.getContext()).load(helperClass.getUrl()).into(holder.imageView);
        holder.textView.setText(helperClass.getText());
//      holder.relativeLayout.setBackground(Drawable.createFromPath(helperClass.getGradient()));
    }

    @Override
    public int getItemCount() {
        return cafeLocations.size();
    }

    static class AdapterAllCategoriesViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        AdapterAllCategoriesViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.Image);
            textView = itemView.findViewById(R.id.content);
        }
    }
}
