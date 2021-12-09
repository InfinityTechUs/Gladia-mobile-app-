package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.tcc.models.Cart;
import com.example.tcc.models.Products;

import java.util.ArrayList;
import java.util.List;

public class CartActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private Button btn_finish;
    private List<Cart> cart = new ArrayList<>();
    Products product;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrinho);



        Intent intent = getIntent();
        product = (Products) intent.getSerializableExtra("product");

        Cart itemCart = new Cart(product.getProd_name(), product.getProd_price(), product.getProd_img());
        cart.add(itemCart);



        ListAdapterCart adapterCart = new ListAdapterCart(this, cart);

        recyclerView = findViewById(R.id.listRecyclerViewCart);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapterCart);


        btn_finish = findViewById(R.id.btn_finish_order);

    }

}