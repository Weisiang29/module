package sg.edu.rp.c346.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView textandroid;
TextView textweb;
TextView textdesign;
TextView textprocess;
TextView textiT;
    TextView textPortfolio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textandroid=findViewById(R.id.textAndroid);
        textdesign=findViewById(R.id.textDesign);
        textiT=findViewById(R.id.textIt);
        textprocess=findViewById(R.id.textProcess);
        textweb=findViewById(R.id.textWeb);
        textPortfolio=findViewById(R.id.textPortfolio);
        textweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,Modules.class);
                intent.putExtra("module",3);
                startActivity(intent);
            }
        });
        textandroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,Modules.class);
                intent.putExtra("module",1);
                startActivity(intent);
            }
        });
        textdesign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,Modules.class);
                intent.putExtra("module",5);
                startActivity(intent);
            }
        });
        textiT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,Modules.class);
                intent.putExtra("module",2);
                startActivity(intent);
            }
        });
        textprocess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,Modules.class);
                intent.putExtra("module",4);
                startActivity(intent);
            }
        });
            textPortfolio.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent =new Intent(MainActivity.this,Modules.class);
                    intent.putExtra("module",6);
                    startActivity(intent);
                }
            });



        }}
