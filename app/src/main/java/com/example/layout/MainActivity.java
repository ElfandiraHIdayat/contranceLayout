package com.example.layout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edmail, edpassword;
    String nama, password;
    Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin=findViewById(R.id.Button);
        edmail=findViewById(R.id.editTextTextEmailAddress);
        edpassword=findViewById(R.id.editTextTextPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = edmail.getText().toString();
                password = edpassword.getText().toString();

                String email = "elfandirahidayat@gmail.com";
                String password = "456123789";

                if (nama.isEmpty() || password.isEmpty()){
                    Toast t = Toast.makeText(getApplicationContext()
                            ,"Email dan Password wajib diisi",Toast.LENGTH_LONG);
                    t.show();

                }
                else{
                    if (nama.equals(email) && password.equals(password)){
                        Toast t = Toast.makeText(getApplicationContext()
                                ,"WAS SUCCESSFUL",Toast.LENGTH_LONG);
                        t.show();

                        Bundle b = new Bundle();

                        b.putString("a",nama.trim());

                        b.putString("b",password.trim());

                        Intent i = new Intent(getApplicationContext(),Home_Activity.class);

                        i.putExtras(b);

                        startActivity(i);

                    }
                    else{
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Failed",Toast.LENGTH_LONG);
                    }
                }

            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //Kondisi jika dipilih adalah id mndaftar
        if (item.getItemId() ==  R.id.mnDaftar){

            //Method utk memanggil activty "Daftar Activty"
            Intent i = new Intent(getApplicationContext(), DaftarActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //method untuk tamppilkan menu.
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}