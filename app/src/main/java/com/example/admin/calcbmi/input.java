package com.example.admin.calcbmi;

import android.content.Intent;
import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.renderscript.ScriptGroup.*;

public class input extends AppCompatActivity {
Button button;
EditText editText, editText2;
TextView text2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        editText=(EditText)findViewById(R.id.editText);
        editText2=(EditText)findViewById(R.id.editText2);
        button=(Button)findViewById(R.id.button);
        text2=(TextView)findViewById(R.id.text2);

    }
        public void btnClick(View v)
        {

            String a;
            String b;
            float rf, an, bn;
            String rs;



            a=editText.getText().toString();
            an = Float.parseFloat(a);
            b=editText2.getText().toString();
            bn =  Float.parseFloat(b);
            rf = an/(bn*bn);
            rs = Float.toString(rf);
            text2.setText(rs);

        }

}
