package com.example.layout;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public  class activity2 extends AppCompatActivity{
    //Mendeklarasikan variabel dengan  tipe data textview
    TextView txEmail, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ke2);

        txEmail = findViewById(R.id.emailField);
        txPassword = findViewById(R.id.passwordField);

        //Mendeclarasikan bundle yang digunakan untuk mengambil pesan
        //Yang dikirim melalui method intent
        Bundle bundle = getIntent().getExtras();

        //Membuat variabel string untuk menyimpan data yang dikirim
        //Dari activity sebelumnya
        String email = bundle.getString("a");
        String pass = bundle.getString("b");

        // menampilkan value
        txEmail.setText(email);
        txPassword.setText(pass);
    }
}