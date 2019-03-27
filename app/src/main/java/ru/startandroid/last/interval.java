package ru.startandroid.last;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class interval extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interval);
        kek();
        addListenerOnButton();

    }

    public void kek(){
        txt = findViewById(R.id.textView);



        ListView listView = (ListView)findViewById(R.id.m);
        final String[] catNames = new String[] {
                "ч1", "м2", "б2", "м3", "б3",
                "ч4", "ч5", "м6", "б6", "м7",
                "б7", "ч8"
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
                if(strText == "ч1"){
                    if(k == 2){
                        Drawable img = getResources().getDrawable(R.drawable.rere);
                        img.setBounds(0, 0, 500, 400);
                        txt.setCompoundDrawables(img, null, null, null);

                    }
                    if(k == 1){
                        Drawable img = getResources().getDrawable(R.drawable.dodo);
                        img.setBounds(0, 0, 500, 400);
                        txt.setCompoundDrawables(img, null, null, null);

                    }
                }
                if(strText == "м2"){
                    if(k == 1){
                        Drawable img = getResources().getDrawable(R.drawable.dorebemol);
                        img.setBounds(0, 0, 500, 400);
                        txt.setCompoundDrawables(img, null, null, null);

                    }
                }
                if(strText == "б2"){
                    if(k == 1){
                        Drawable img = getResources().getDrawable(R.drawable.dore);
                        img.setBounds(0, 0, 500, 400);
                        txt.setCompoundDrawables(img, null, null, null);

                    }
                }
                if(strText == "м3"){
                    if(k == 1){
                        Drawable img = getResources().getDrawable(R.drawable.domibemol);
                        img.setBounds(0, 0, 500, 400);
                        txt.setCompoundDrawables(img, null, null, null);

                    }
                }
                if(strText == "б3"){
                    if(k == 1){
                        Drawable img = getResources().getDrawable(R.drawable.domi);
                        img.setBounds(0, 0, 500, 400);
                        txt.setCompoundDrawables(img, null, null, null);

                    }
                }
                if(strText == "ч4"){
                    if(k == 1){
                        Drawable img = getResources().getDrawable(R.drawable.dofa);
                        img.setBounds(0, 0, 500, 400);
                        txt.setCompoundDrawables(img, null, null, null);

                    }
                }
                if(strText == "ч5"){
                    if(k == 1){
                        Drawable img = getResources().getDrawable(R.drawable.dosol);
                        img.setBounds(0, 0, 500, 400);
                        txt.setCompoundDrawables(img, null, null, null);

                    }
                }
                if(strText == "м6"){
                    if(k == 1){
                        Drawable img = getResources().getDrawable(R.drawable.dolabemol);
                        img.setBounds(0, 0, 500, 400);
                        txt.setCompoundDrawables(img, null, null, null);

                    }
                }
                if(strText == "б6"){
                    if(k == 1){
                        Drawable img = getResources().getDrawable(R.drawable.dola);
                        img.setBounds(0, 0, 500, 400);
                        txt.setCompoundDrawables(img, null, null, null);

                    }
                }
                if(strText == "м7"){
                    if(k == 1){
                        Drawable img = getResources().getDrawable(R.drawable.dosibemol);
                        img.setBounds(0, 0, 500, 400);
                        txt.setCompoundDrawables(img, null, null, null);

                    }
                }
                if(strText == "б7"){
                    if(k == 1){
                        Drawable img = getResources().getDrawable(R.drawable.dosi);
                        img.setBounds(0, 0, 500, 400);
                        txt.setCompoundDrawables(img, null, null, null);

                    }
                }
                if(strText == "ч8"){
                    if(k == 1){
                        Drawable img = getResources().getDrawable(R.drawable.dodo2);
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
    public void addListenerOnButton(){
        btndo = (Button) findViewById(R.id.bdo);
        btnre = (Button) findViewById(R.id.bre);
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
    }


}

