package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tcc.models.Cart;
import com.example.tcc.models.Products;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ProductActivity extends AppCompatActivity {

    Button btn_cart;
    TextView nome, price, desc, brand;
    ImageView imgProduct;
    Products product;

    private List<Cart> listCart;
    private ListAdapterCart adapterCart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        btn_cart= findViewById(R.id.button);
        nome = findViewById(R.id.name_product);
        price = findViewById(R.id.price_product);
        desc = findViewById(R.id.desc_product);
        brand = findViewById(R.id.desc_brand);
        imgProduct = findViewById(R.id.img_product);


        Intent intent = getIntent();
        if(intent.getExtras() !=null){
            product = (Products) intent.getSerializableExtra("data");
            String productName = product.getProd_name();
            String productPrice = product.getProd_price();
            String productDesc = product.getProd_desc();
            String productBrand = product.getProd_brand();
            String imgURL = product.getProd_img();

            nome.setText(productName);
            price.setText(productPrice);
            desc.setText(productDesc);
            brand.setText(productBrand);
            Picasso.get().load(imgURL).into(imgProduct);



        }

        btn_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                product = (Products) intent.getSerializableExtra("data");
                Intent intent = new Intent(ProductActivity.this, CartActivity.class).putExtra("product", product);

                startActivity(intent);
            }
        });
    }

}