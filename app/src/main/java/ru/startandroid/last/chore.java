package ru.startandroid.last;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class chore extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chore);
kek();
        addListenerOnButton();
    }

    public void kek(){
        txt = findViewById(R.id.textView2);

        addListenerOnButton();

        ListView listView = (ListView)findViewById(R.id.m);
        final String[] catNames = new String[] {
                "Б53", "Б6", "Б64",
                "М53", "М6", "М64",
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, catNames);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                    long id) {

                TextView textView = (TextView) itemClicked;
                strText = textView.getText().toString();
                if(strText.equals("Б53")){
                    if(k == 2){
                        Drawable img = getResources().getDrawable(R.drawable.b53re);
                        img.setBounds(0, 0, 500, 400);
                        txt.setCompoundDrawables(img, null, null, null);

                    }
                    if(k == 1){
                        Drawable img = getResources().getDrawable(R.drawable.b53do);
                        img.setBounds(0, 0, 500, 400);
                        txt.setCompoundDrawables(img, null, null, null);

                    }
                    if(k == 3){
                        Drawable img = getResources().getDrawable(R.drawable.b53mi);
                        img.setBounds(0, 0, 500, 400);
                        txt.setCompoundDrawables(img, null, null, null);

                    }
                }
                if(strText.equals("Б6")){
                    if(k == 2){
                        Drawable img = getResources().getDrawable(R.drawable.b6re);
                        img.setBounds(0, 0, 500, 400);
                        txt.setCompoundDrawables(img, null, null, null);

                    }

                }
                if(strText.equals("Б64")){
                    if(k == 2){
                        Drawable img = getResources().getDrawable(R.drawable.b64re);
                        img.setBounds(0, 0, 500, 400);
                        txt.setCompoundDrawables(img, null, null, null);

                    }

                }
            }
        });

    }

    String strText;
    TextView txt;
    Button btndo;
    int k;
    Button btnre;
    Button btnmi;
    public void addListenerOnButton(){
        btndo = (Button) findViewById(R.id.bdo);
        btnre = (Button) findViewById(R.id.bre);
        btnmi = (Button) findViewById(R.id.bmi);
        btnre.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick (View v){
                        k = 2;
                    }
                }
        );
        btndo.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick (View v){
                        k = 1;
                    }
                }
        );
        btnmi.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick (View v){
                        k = 3;
                    }
                }
        );
    }
}
