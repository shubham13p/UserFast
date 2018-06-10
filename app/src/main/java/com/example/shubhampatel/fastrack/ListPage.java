package com.example.shubhampatel.fastrack;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListPage extends AppCompatActivity {

    ListView innerList;
    Button btn_shop;
    ArrayList<String> list;
    String listName;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_page);

        innerList = findViewById(R.id.innerList);
        btn_shop = findViewById(R.id.shop);

        final Intent myIntent = getIntent();
        listName = myIntent.getStringExtra("listName");
        list = myIntent.getStringArrayListExtra("list");


        final StringBuilder builder = new StringBuilder();
        for (String details : list) {
            builder.append(details + ":");
        }

        final String listitem = builder.toString();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListPage.this, android.R.layout.simple_list_item_1, list);
        innerList.setAdapter(adapter);


        btn_shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(ListPage.this, listitem, Toast.LENGTH_SHORT).show();
//                Intent i = new Intent(ListPage.this, MapsActivity.class);
//                i.putExtra("listofcustomer", listitem); // getText() SHOULD NOT be static!!!
//                i.putExtra("DMlist", list);
//                startActivity(i);


                Intent i = new Intent(ListPage.this, MapsActivity.class);
                i.putStringArrayListExtra("dmlist", list);
                i.putExtra("listofcustomer", listitem);
                i.putExtra("listName", listName);
                startActivity(i);


            }
        });


    }

//    public void onBackPressed() {
//        Intent startMain = new Intent(ListPage.this, MainActivity.class);
//        startActivity(startMain);
//    }
}
