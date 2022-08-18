package com.example.cw7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.ContentView;

import java.util.zip.Inflater;

public class CustomBaseAdptor extends BaseAdapter {

Context context  ;
String listfruit [];
int listimage [];
LayoutInflater inflater ;


 public CustomBaseAdptor (Context ctx , String [] fruitlist , int [] image ){
     this.context = ctx ;
     this.listfruit =fruitlist;
     this.listimage = image ;
      this.inflater = LayoutInflater.from(ctx);



 }






    @Override
    public int getCount() {
        return listfruit.length ;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
         convertView = inflater.inflate(R.layout.activity_custom_list_viwe, null);
        TextView txtView = convertView.findViewById(R.id.textview);
        ImageView fruitImg = (ImageView) convertView.findViewById(R.id.imageicon);
        txtView.setText(listfruit[position]);
        fruitImg.setImageResource(listimage[position]);
        return convertView;
    }
}
