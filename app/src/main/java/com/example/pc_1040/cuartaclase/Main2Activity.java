package com.example.pc_1040.cuartaclase;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button boton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        boton1=findViewById(R.id.button);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent irventana3= new Intent(Main2Activity.this, Main3Activity.class);
               // startActivity(irventana3);
                Intent sistema= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(sistema,100);
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
