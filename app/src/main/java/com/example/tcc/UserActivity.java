package com.example.tcc;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    Button btn_delete;
    TextView name_user, myorder, info_acc, conf_acc, inf_end;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        setTheme(R.style.Theme_LoginScreen);
        btn_delete = findViewById(R.id.button);
        name_user = findViewById(R.id.textView_title);
        myorder = findViewById(R.id.desc_desc);
        info_acc = findViewById(R.id.desc_marca);
        conf_acc = findViewById(R.id.textView);
        inf_end = findViewById(R.id.textView2);



        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
    }

    private void openDialog() {
        AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle("Excluir Conta")
                .setMessage("Deseja Excluir sua Conta?")
                .setPositiveButton("Ok",null)
                .setNegativeButton("Cancelar",null)
                .show();
        Button positiveButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                Intent in = new Intent(UserActivity.this, MainActivity.class);
                startActivity(in);
            }
        });
    }
}