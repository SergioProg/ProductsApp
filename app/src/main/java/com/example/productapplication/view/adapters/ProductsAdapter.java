package com.example.productapplication.view.adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.productapplication.R;
import com.example.productapplication.presenter.ProductsListPresenter;
import com.example.productapplication.presenter.viewObjects.Product;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sseleznev on 18.11.2016.
 */

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ViewHolder> {

    private List<Product> items = new ArrayList<Product>();
    private Context context;
    private ProductsListPresenter presenter;
    private final int onLoadMoreItems = 10;

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView itemImage;
        public TextView itemArticle;
        public CardView cardView;

        public ViewHolder(View v) {
            super(v);
            itemImage = (ImageView) v.findViewById(R.id.imageView);
            itemArticle = (TextView) v.findViewById(R.id.textView);
            cardView = (CardView) v.findViewById(R.id.cardView);
        }

    }

    public void add(List<Product> prods) {
        items.addAll(prods);
        notifyDataSetChanged();
    }



    public ProductsAdapter(Context context, List<Product> myDataset, ProductsListPresenter presenter) {
        this.context = context;
        this.items = myDataset;
        this.presenter = presenter;
        //ImageLoader.getInstance().denyNetworkDownloads(true);
    }


    @Override
    public ProductsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.products_item_layout, parent, false);
        return new ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Product rowItem = items.get(position);

        holder.itemArticle.setText(rowItem.getArticle());
        Picasso.with(context)
                .load(rowItem.getImageUrl())
                .resize(300, 300)
                .into(holder.itemImage);

        holder.cardView.setTag(position);

        holder.cardView.setOnClickListener(v -> {
            Integer rowPosition = (Integer)v.getTag();
            Product clickedItem = items.get(rowPosition);
            presenter.selectProduct(clickedItem);
        });

        if (position >= items.size()-onLoadMoreItems) presenter.loadNext();
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}
