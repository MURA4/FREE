package ru.startandroid.last;


import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class chordton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chordton);

        RadioButton bdur = (RadioButton)findViewById(R.id.bdur);
        bdur.setOnClickListener(radioButtonClickListener);

        RadioButton cdur = (RadioButton)findViewById(R.id.cdur);
        cdur.setOnClickListener(radioButtonClickListener);
        txt = findViewById(R.id.textView5);
    }

    View.OnClickListener radioButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RadioGroup  radioGroup = findViewById(R.id.radio);
            int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();

            RadioButton myRadioButton = (RadioButton) findViewById(checkedRadioButtonId);

            String strText;
            strText = myRadioButton.getText().toString();

            if(strText.equals("B-dur")) {
                Drawable img = getResources().getDrawable(R.drawable.bdurchord);
                img.setBounds(0, 0, 800, 400);
                txt.setCompoundDrawables(img, null, null, null);

            }
        }
    };
    TextView txt;

}
