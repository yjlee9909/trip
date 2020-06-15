package com.example.busanapp.home;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.busanapp.R;

import java.util.List;

public class RecyclerViewAdapterOneTwoTrip extends RecyclerView.Adapter<RecyclerViewAdapterOneTwoTrip.MyViewHolder> {
    private Context mContext;
    private List<Course_one_two_trip> mData;

    public RecyclerViewAdapterOneTwoTrip(Context mContext, List<Course_one_two_trip> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);

        view = mInflater.inflate(R.layout.cardview_item,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.course_title.setText(mData.get(position).getTitle());
        holder.img_course_thumbnail.setImageResource(mData.get(position).getThumbnail1());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, Course_Activity_one_two_trip.class);

                // passing data to the book course activity
                intent.putExtra("Title", mData.get(position).getTitle());

                intent.putExtra("Description1", mData.get(position).getDescription1());
                intent.putExtra("Description2", mData.get(position).getDescription2());
                intent.putExtra("Description3", mData.get(position).getDescription3());
                intent.putExtra("Description4", mData.get(position).getDescription4());
                intent.putExtra("Description5", mData.get(position).getDescription5());
                intent.putExtra("Description6", mData.get(position).getDescription6());
                intent.putExtra("Description7", mData.get(position).getDescription7());
                intent.putExtra("Description8", mData.get(position).getDescription8());
                intent.putExtra("Description9", mData.get(position).getDescription9());
                intent.putExtra("Description10", mData.get(position).getDescription10());
                intent.putExtra("Description11", mData.get(position).getDescription11());
                intent.putExtra("Description12", mData.get(position).getDescription12());
                intent.putExtra("Description13", mData.get(position).getDescription13());
                intent.putExtra("Description14", mData.get(position).getDescription14());
                intent.putExtra("Description15", mData.get(position).getDescription15());


                intent.putExtra("Category", mData.get(position).getCategory());

                intent.putExtra("Thumbnail1", mData.get(position).getThumbnail1());
                intent.putExtra("Thumbnail2", mData.get(position).getThumbnail2());
                intent.putExtra("Thumbnail3", mData.get(position).getThumbnail3());
                intent.putExtra("Thumbnail4", mData.get(position).getThumbnail4());
                intent.putExtra("Thumbnail5", mData.get(position).getThumbnail5());
                intent.putExtra("Thumbnail6", mData.get(position).getThumbnail6());
                intent.putExtra("Thumbnail7", mData.get(position).getThumbnail7());
                intent.putExtra("Thumbnail8", mData.get(position).getThumbnail8());
                intent.putExtra("Thumbnail9", mData.get(position).getThumbnail9());
                intent.putExtra("Thumbnail10", mData.get(position).getThumbnail10());
                intent.putExtra("Thumbnail11", mData.get(position).getThumbnail11());
                intent.putExtra("Thumbnail12", mData.get(position).getThumbnail12());


                // start the activity
                mContext.startActivity(intent);     // error 오류
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView course_title;
        ImageView img_course_thumbnail;
        CardView cardView;

        public MyViewHolder(View itemView) {
            super(itemView);

            course_title = (TextView) itemView.findViewById(R.id.title);
            img_course_thumbnail = (ImageView) itemView.findViewById(R.id.image);
            cardView = (CardView) itemView.findViewById(R.id.cardView_item);
        }
    }
}

