package com.example.tcc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tcc.models.Cart;
import com.example.tcc.models.Products;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ListAdapterCart extends RecyclerView.Adapter<ListAdapterCart.ViewHolder> {
    private List<Cart> listCart;
    private Context context;
    private LayoutInflater mInflater;


    public ListAdapterCart(Context context, List<Cart> cart) {
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.listCart = cart;

    }

    @Override
    public int getItemCount() {return listCart.size(); }

    @Override
    public ListAdapterCart.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.cart_item_layout, null);
        return new ListAdapterCart.ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ListAdapterCart.ViewHolder holder, int positon) {
        holder.bindData(listCart.get(positon));
    }



    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView name_product_1, price_product_1;
        ImageView iconImage;


        public ViewHolder(View itemView){
            super (itemView);
            name_product_1 = itemView.findViewById(R.id.name_product_1);
            price_product_1 = itemView.findViewById(R.id.price_product_1);
            iconImage = itemView.findViewById(R.id.img_product_1);
        }

        void bindData(final Cart cart) {
            name_product_1.setText(cart.getProd_name());
            price_product_1.setText(cart.getProd_price());
            Picasso.get().load(cart.getProd_img()).into(iconImage);
        }
    }

    public void addItemCart(Cart item) {
        this.listCart.add(item);
        this.notifyDataSetChanged();
    }
}
