package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Fruit> fruits = new ArrayList<>();


    String fruitlist [] = {"apple" , "bnana" ,"apricot","orange"};
    int  fruitImage [] = {R.drawable.apple,R.drawable.banana,R.drawable.aripcot,R.drawable.orange};
    ListView listView ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    // data source
        Fruit apple = new Fruit (" apple "," Red ",R.drawable.apple);
        Fruit bnana = new Fruit (" banana "," yellow ",R.drawable.banana);
        Fruit aripcot = new Fruit (" aripcot "," Orenge ",R.drawable.aripcot);
        Fruit orange = new Fruit (" orange "," Orange ",R.drawable.orange);

        fruits.add(apple);
        fruits.add(bnana);
        fruits.add(aripcot);
        fruits.add(orange);


//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.


    //listaAdptor
        CustomBaseAdptor customBaseAdptor = new CustomBaseAdptor(getApplicationContext(),fruitlist,fruitImage);
         listView = (ListView) findViewById(R.id.customList);
         listView.setAdapter(customBaseAdptor);


         listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int position , long id) {
                 Log.i("custmor list viwe " ," item clicked @ position :: " + position);
             }
         });




    }
}