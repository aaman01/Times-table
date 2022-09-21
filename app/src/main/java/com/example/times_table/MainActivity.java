package com.example.times_table;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import com.example.times_table.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public void work(int j ){
        ListView listView= (ListView) findViewById(R.id.listview);
        ArrayList<Integer>table=new ArrayList<Integer>();
        for (int i = 1 ; i<=10; i++){
            table.add(j*i);
        }
        ArrayAdapter <Integer>arrayAdapter=new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1,table);
        listView.setAdapter(arrayAdapter);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SeekBar seekbar=(SeekBar) findViewById(R.id.seekbar);


        seekbar.setMax(20);
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                work(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}