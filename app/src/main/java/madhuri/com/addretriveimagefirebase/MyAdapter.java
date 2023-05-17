package madhuri.com.addretriveimagefirebase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private ArrayList<DataClass> dataList;

    public MyAdapter(ArrayList<DataClass> dataList, Context context) {
        this.dataList = dataList;
        this.context = context;
    }

    private Context context;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycleritem,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Glide.with(context).load(dataList.get(position).getDataimage()).into(holder.recyclerimage);
        holder.recyclertext.setText(dataList.get(position).getDatatitle());

    }

    @Override
    public int getItemCount() {

        return dataList.size();
    }

    public  static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView recyclerimage;
        TextView recyclertext;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            
            recyclerimage = itemView.findViewById(R.id.recyclerimage);
            recyclertext = itemView.findViewById(R.id.recyclercaption);
        }
    }
}
