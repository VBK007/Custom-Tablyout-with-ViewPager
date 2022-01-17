package nr.king.a90skisshows.viewPager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;

import nr.king.a90skisshows.MainRecylerData;
import nr.king.a90skisshows.R;

public class CustomViewPgaerAdapter extends PagerAdapter {
    private Context context;
    private ArrayList<MainRecylerData> arrayList;

    public CustomViewPgaerAdapter(Context context, ArrayList<MainRecylerData> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.main_layout_with_recyler,container,false);
        RecyclerView recyclerView = view.findViewById(R.id.main_Recycler);
        MainRecylerData mainRecylerData = arrayList.get(position);
        MainAdapter mainAdapter = new MainAdapter(context,mainRecylerData.getArrayDataArrayList());
        recyclerView.setAdapter(mainAdapter);
        mainAdapter.addAll(mainRecylerData.getArrayDataArrayList());
        container.addView(view);
        return view;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object);
    }
}




