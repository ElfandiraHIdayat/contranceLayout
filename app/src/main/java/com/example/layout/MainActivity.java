package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
                if (nama.equals("Elfandira") && password.equals("456123")){
                    Toast t = Toast.makeText(getApplicationContext()
                            ,"WAS SUCCESSFUL",Toast.LENGTH_LONG);
                    t.show();
                }
                else if(nama.equals("Elfandira") && !password.equals("1234")){
                    Toast t = Toast.makeText(getApplicationContext()
                            ,"Wrong Password",Toast.LENGTH_LONG);
                    t.show();
                }
                else if(!nama.equals("sigit") && password.equals("1234")){
                    Toast t = Toast.makeText(getApplicationContext()
                            ,"Wrong Email",Toast.LENGTH_LONG);
                    t.show();
                }
                else{
                    Toast t = Toast.makeText(getApplicationContext()
                            ,"Incorrect email and password",Toast.LENGTH_LONG);
                    t.show();
                }

            }
        });
    }
}