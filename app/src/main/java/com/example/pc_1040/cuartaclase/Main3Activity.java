package com.example.pc_1040.cuartaclase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class Main3Activity extends AppCompatActivity {
    ImageView cuadro;
    RadioGroup opciones;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        cuadro=findViewById(R.id.imageView2);
        opciones=findViewById(R.id.grupo);
        opciones.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i)
                {
                    case R.id.radioButton:
                        cuadro.setImageResource(R.drawable.minecraft);
                        break;
                    case R.id.radioButton2:
                        cuadro.setImageResource(R.drawable.creiste);
                        break;

                    case R.id.radioButton3:
                        cuadro.setImageResource(R.drawable.dota2);
                        break;
                    case R.id.radioButton4:
                        cuadro.setImageResource(R.drawable.fornite);
                        break;
                    case R.id.radioButton5:
                        cuadro.setImageResource(R.drawable.pubg);
                        break;
                    case R.id.radioButton6:
                        cuadro.setImageResource(R.drawable.paladins);
                        break;
                }
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu m) {
        getMenuInflater().inflate(R.menu.menu1,m);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.opcion1:
                startActivity(new Intent(this,MainActivity.class));
                return true;
            case R.id.opcion2:
                startActivity(new Intent(this,Main2Activity.class));
                return true;
            case R.id.opcion3:
                startActivity(new Intent(this,Main3Activity.class));
                return true;
            case R.id.opcion4:
                finish();
                return true;
            default:
                return onOptionsItemSelected(item);
        }


    }
}
