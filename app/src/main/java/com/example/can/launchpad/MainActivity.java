package com.example.can.launchpad;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    private SoundPool sp;
    private int sound1;
    private int sound2;
    private int sound3;
    private int sound4;
    private int sound5;
    private int sound6;
    private int sound7;
    private int sound8;
    private int sound9;
    private int sound00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.drumpad, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    sound1 = sp.load(getApplicationContext(), R.raw.sound1,1);
                    sound2 = sp.load(getApplicationContext(), R.raw.sound2,1);
                    sound3 = sp.load(getApplicationContext(), R.raw.sound3,1);
                    sound4 = sp.load(getApplicationContext(), R.raw.sound4,1);
                    sound5 = sp.load(getApplicationContext(), R.raw.sound5,1);
                    sound6 = sp.load(getApplicationContext(), R.raw.sound6,1);
                    sound7 = sp.load(getApplicationContext(), R.raw.sound7,1);
                    sound8 = sp.load(getApplicationContext(), R.raw.sound8,1);
                    sound9 = sp.load(getApplicationContext(), R.raw.sound9,1);
                    sound00 = sp.load(getApplicationContext(), R.raw.sound00,1);
                }
                else if(position==1){
                    sound1 = sp.load(getApplicationContext(), R.raw.alpha2,1);
                    sound2 = sp.load(getApplicationContext(), R.raw.esher5,1);
                    sound3 = sp.load(getApplicationContext(), R.raw.lite7,1);
                    sound4 = sp.load(getApplicationContext(), R.raw.pad7,1);
                    sound5 = sp.load(getApplicationContext(), R.raw.phazer7,1);
                    sound6 = sp.load(getApplicationContext(), R.raw.glory17,1);
                    sound7 = sp.load(getApplicationContext(), R.raw.skrillex_7,1);
                    sound8 = sp.load(getApplicationContext(), R.raw.skrillex_8,1);
                    sound9 = sp.load(getApplicationContext(), R.raw.skrillex_9,1);
                    sound00 = sp.load(getApplicationContext(), R.raw.sound00,1);
                }
                else if(position==2){
                    sound1 = sp.load(getApplicationContext(), R.raw.phazer2,1);
                    sound2 = sp.load(getApplicationContext(), R.raw.phazer3,1);
                    sound3 = sp.load(getApplicationContext(), R.raw.phazer4,1);
                    sound4 = sp.load(getApplicationContext(), R.raw.phazer5,1);
                    sound5 = sp.load(getApplicationContext(), R.raw.phazer6,1);
                    sound6 = sp.load(getApplicationContext(), R.raw.phazer1,1);
                    sound7 = sp.load(getApplicationContext(), R.raw.skrillex_7,1);
                    sound8 = sp.load(getApplicationContext(), R.raw.skrillex_8,1);
                    sound9 = sp.load(getApplicationContext(), R.raw.skrillex_9,1);
                    sound00 = sp.load(getApplicationContext(), R.raw.sound00,1);
                }
                else if(position==3){
                    sound1 = sp.load(getApplicationContext(), R.raw.pad1,1);
                    sound2 = sp.load(getApplicationContext(), R.raw.pad2,1);
                    sound3 = sp.load(getApplicationContext(), R.raw.pad3,1);
                    sound4 = sp.load(getApplicationContext(), R.raw.pad4,1);
                    sound5 = sp.load(getApplicationContext(), R.raw.pad5,1);
                    sound6 = sp.load(getApplicationContext(), R.raw.pad6,1);
                    sound7 = sp.load(getApplicationContext(), R.raw.skrillex_7,1);
                    sound8 = sp.load(getApplicationContext(), R.raw.skrillex_8,1);
                    sound9 = sp.load(getApplicationContext(), R.raw.skrillex_9,1);
                    sound00 = sp.load(getApplicationContext(), R.raw.sound00,1);
                }
                else if(position==4){
                    sound1 = sp.load(getApplicationContext(), R.raw.skrillex_1,1);
                    sound2 = sp.load(getApplicationContext(), R.raw.skrillex_2,1);
                    sound3 = sp.load(getApplicationContext(), R.raw.skrillex_3,1);
                    sound4 = sp.load(getApplicationContext(), R.raw.skrillex_4,1);
                    sound5 = sp.load(getApplicationContext(), R.raw.skrillex_5,1);
                    sound6 = sp.load(getApplicationContext(), R.raw.skrillex_6,1);
                    sound7 = sp.load(getApplicationContext(), R.raw.skrillex_7,1);
                    sound8 = sp.load(getApplicationContext(), R.raw.skrillex_8,1);
                    sound9 = sp.load(getApplicationContext(), R.raw.skrillex_9,1);
                    sound00 = sp.load(getApplicationContext(), R.raw.sound00,1);
                }
                else if(position==5){
                    sound1 = sp.load(getApplicationContext(), R.raw.mudab26,1);
                    sound2 = sp.load(getApplicationContext(), R.raw.alpha2,1);
                    sound3 = sp.load(getApplicationContext(), R.raw.lite7,1);
                    sound4 = sp.load(getApplicationContext(), R.raw.pad4,1);
                    sound5 = sp.load(getApplicationContext(), R.raw.glory17,1);
                    sound6 = sp.load(getApplicationContext(), R.raw.esher5,1);
                    sound7 = sp.load(getApplicationContext(), R.raw.skrillex_7,1);
                    sound8 = sp.load(getApplicationContext(), R.raw.skrillex_8,1);
                    sound9 = sp.load(getApplicationContext(), R.raw.skrillex_9,1);
                    sound00 = sp.load(getApplicationContext(), R.raw.sound00,1);
                }
                else {
                    sound1 = sp.load(getApplicationContext(), R.raw.mudab11,1);
                    sound2 = sp.load(getApplicationContext(), R.raw.mudab12,1);
                    sound3 = sp.load(getApplicationContext(), R.raw.mudab26,1);
                    sound4 = sp.load(getApplicationContext(), R.raw.mudab27,1);
                    sound5 = sp.load(getApplicationContext(), R.raw.mudab46,1);
                    sound6 = sp.load(getApplicationContext(), R.raw.mudab47,1);
                    sound7 = sp.load(getApplicationContext(), R.raw.skrillex_7,1);
                    sound8 = sp.load(getApplicationContext(), R.raw.skrillex_8,1);
                    sound9 = sp.load(getApplicationContext(), R.raw.skrillex_9,1);
                    sound00 = sp.load(getApplicationContext(), R.raw.sound00,1);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        sp = new SoundPool(9, AudioManager.STREAM_MUSIC,0);

    }

    public void playsound1 (View v){
        sp.play(sound1,1.0f,1.0f,0,0,1.0f);
    }
    public void playsound2 (View v){
        sp.play(sound2,1.0f,1.0f,0,0,1.0f);
    }
    public void playsound3 (View v){
        sp.play(sound3,1.0f,1.0f,0,0,1.0f);
    }
    public void playsound4 (View v){
        sp.play(sound4,1.0f,1.0f,0,0,1.0f);
    }
    public void playsound5 (View v){
        sp.play(sound5,1.0f,1.0f,0,0,1.0f);
    }
    public void playsound6 (View v){
        sp.play(sound6,1.0f,1.0f,0,0,1.0f);
    }
    public void playsound7 (View v){
        sp.play(sound7,1.0f,1.0f,0,0,1.0f);
    }
    public void playsound8 (View v){
        sp.play(sound8,1.0f,1.0f,0,0,1.0f);
    }
    public void playsound9 (View v){
        sp.play(sound9,1.0f,1.0f,0,0,1.0f);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


}
