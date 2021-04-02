package com.example.layout;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import org.w3c.dom.Text;

public class DaftarActivity extends AppCompatActivity {
    //variabel dengan tipe data EditText
    EditText edtNama, edtAlamat, edtEmail, edtPassword, edtrepass;

    //variable dengan tipe  data Floating Action Button
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        //Membuat Method untuk event dari floating button
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Membuat Kondisi untk mengecek apakah EditText kosong atau tidak
                if (edtNama.getText().toString().isEmpty() ||
                        edtAlamat.getText().toString().isEmpty() ||
                        edtEmail.getText().toString().isEmpty() ||
                        edtPassword.getText().toString().isEmpty() ||
                        edtrepass.getText().toString().isEmpty()) {
                    //menampilkan pesan  notifikasi  jika seluruh EditText Wajib diisi
                    Snackbar.make(view, "Wajib mengisi bagian yang kosong !!!", Snackbar.LENGTH_LONG).show();
                } else {
                    //Menampilkan pesan bahwa isi dari EditText password dan EditTextPassword
                    //Tidak sama
                    Snackbar.make(view, "Password dan Repassword harus sama!!!", Snackbar.LENGTH_LONG).show();
                }

            }
        });
    }

}


