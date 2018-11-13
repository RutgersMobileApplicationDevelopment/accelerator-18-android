package example.com.busapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

public class RouteAdapter  {
    private List<String> list;

    public class RouteViewHolder extends RecyclerView.ViewHolder {
        public View itemView;
        public RouteViewHolder(View itemView) {
            super(itemView);
            this.itemView = itemView;
        }
    }

}
