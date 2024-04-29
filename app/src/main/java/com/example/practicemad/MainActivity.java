package com.example.practicemad;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //---------------------------------------------------------------------------------
        ImageButton imageButton = findViewById(R.id.imageButton);
        //imageview

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this,"hello from imagebiew",Toast.LENGTH_LONG).show();

                //explicit intent
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);

                //implicit intent
//                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
//                startActivity(intent);
            }
        });




        //-----------------------------------------------------------------------------------
        ListView listView = (ListView) findViewById(R.id.listview);
        //listview
        String[] names = {"audi","benz"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter(
                this, android.R.layout.simple_list_item_1,names
        );//creating an arrayadapter

        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem = (String) adapterView.getItemAtPosition(i);
                Toast.makeText(MainActivity.this,"item selected" + names[i] ,Toast.LENGTH_SHORT).show();
            }
        });
        //----------------------------------------------------------------------------------


    }
}