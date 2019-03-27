package ru.startandroid.last;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chord extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chord);
        addListenerOnButton();
    }
    private Button chordnota;
    private Button chordton;
    public void addListenerOnButton(){
        chordnota = (Button) findViewById(R.id.button);
        chordton = (Button) findViewById(R.id.butto4n);
        chordnota.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick (View v){
                        Intent intent = new Intent(".chore");
                        startActivity(intent);

                    }
                }
        );
        chordton.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick (View v){
                        Intent intent = new Intent(".chordton");
                        startActivity(intent);

                    }
                }
        );
    }
}
