package com.profileku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText Nama,Password;
    int counter = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Nama = (EditText) findViewById(R.id.txtNama);
        Password = (EditText) findViewById(R.id.txtPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                masuk(Nama.getText().toString(), Password.getText().toString());

            }
        });


    }
    private void masuk(String user, String pw){
if((user.equals("denny")) && (pw.equals("11032000"))){
    Intent intent= new Intent(MainActivity.this,layout2.class);
   startActivity(intent);
}
    }
}
