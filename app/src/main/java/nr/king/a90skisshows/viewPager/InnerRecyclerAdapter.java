package nr.king.a90skisshows.viewPager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import nr.king.a90skisshows.InnerRecylerData;
import nr.king.a90skisshows.R;
import pl.droidsonroids.gif.GifImageView;

public class InnerRecyclerAdapter extends RecyclerView.Adapter<InnerRecyclerAdapter.InnerViewHolder> {
    private Context context;
    private ArrayList<InnerRecylerData> arrayList;

    public InnerRecyclerAdapter(Context context, ArrayList<InnerRecylerData> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public InnerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.secoundary_data, parent, false);
        return new InnerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InnerViewHolder holder, int position) {
        InnerRecylerData lData = arrayList.get(position);
        holder.textUsername.setText(lData.getCartooMainname());
        Glide.with(holder.gifImageView.getContext()).asGif().load(lData.getCartoonImageViewUrl()).into(holder.gifImageView);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public void addAll(ArrayList<InnerRecylerData> arrayList) {
        this.arrayList=arrayList;
        notifyDataSetChanged();
    }

    public class InnerViewHolder extends RecyclerView.ViewHolder {
        GifImageView gifImageView;
        TextView textUsername;

        public InnerViewHolder(@NonNull View itemView) {
            super(itemView);
            gifImageView = itemView.findViewById(R.id.secoundary_Image);
            textUsername = itemView.findViewById(R.id.cartoon_name);
        }
    }
}
