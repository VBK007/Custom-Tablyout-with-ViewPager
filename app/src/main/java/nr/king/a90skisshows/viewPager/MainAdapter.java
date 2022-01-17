package nr.king.a90skisshows.viewPager;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import nr.king.a90skisshows.InnerRecylerData;
import nr.king.a90skisshows.MainArrayData;
import nr.king.a90skisshows.MainRecylerData;
import nr.king.a90skisshows.R;

import pl.droidsonroids.gif.GifImageView;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    public Context context;
    public ArrayList<MainArrayData> arrayList;

    public MainAdapter(Context context, ArrayList<MainArrayData> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MainAdapter.MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.main_recyler_data,parent,false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        MainArrayData lData = arrayList.get(position);
        Glide.with(holder.cartoonBgImage.getContext()).asGif().load(lData.getCartoonImageViewUrl()).into(holder.cartoonImageView);
        holder.textViewCarttton.setText(lData.getCartooMainname());
        InnerRecyclerAdapter innerRecylerData=new InnerRecyclerAdapter(holder.innerRecyelerView.getContext(),lData.getArrayList());
        holder.innerRecyelerView.setAdapter(innerRecylerData);
        innerRecylerData.addAll(lData.getArrayList());


    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public void addAll(ArrayList<MainArrayData> arrayDataArrayList) {
        Log.d("MainAdapter", "addAll: "+arrayDataArrayList.size());
        this.arrayList=arrayDataArrayList;
        notifyDataSetChanged();
    }


    public class MainViewHolder extends RecyclerView.ViewHolder{
        GifImageView cartoonImageView;
        LinearLayout cartoonBgImage;
        TextView textViewCarttton;
        RecyclerView innerRecyelerView;
        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            cartoonImageView = itemView.findViewById(R.id.main_Imageview);
            innerRecyelerView=itemView.findViewById(R.id.main_secoundary_recycler);
            cartoonBgImage = itemView.findViewById(R.id.main_Recycler_data);
            textViewCarttton=itemView.findViewById(R.id.cartoon_name_first);
        }

    }


}
