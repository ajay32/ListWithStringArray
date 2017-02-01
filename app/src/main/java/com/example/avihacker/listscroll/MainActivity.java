package com.example.avihacker.listscroll;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;


public class MainActivity extends Activity implements AdapterView.OnItemClickListener {
    ListView lv;
   String[] names = {"hello1","hello2","hello3","hello4","hello5","whatever","whatever2","whatever3","hello1","hello1","hello1",
           "hello1","hello1","hello1","hello1","hello1","hello1","hello1","hello1","hello1","hello1","hello1"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv =(ListView) findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,names);
      //  ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,names);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch(position){
            case 0:
                Intent intent = new Intent(this,MainActivity2Activity.class);
                startActivity(intent);
                break;
            case 1:
                Intent intent2 = new Intent(this,MainActivity22Activity.class);
                startActivity(intent2);
                break;
        }
    }
}
