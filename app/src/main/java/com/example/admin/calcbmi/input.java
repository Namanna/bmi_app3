package com.example.admin.calcbmi;

import android.content.Intent;
import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

import static android.renderscript.ScriptGroup.*;

public class input extends AppCompatActivity {
Button button;
EditText editText, editText2;
TextView text2, text5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        editText=(EditText)findViewById(R.id.editText);
        editText2=(EditText)findViewById(R.id.editText2);
        button=(Button)findViewById(R.id.button);
        text2=(TextView)findViewById(R.id.text2);
        text5=(TextView)findViewById(R.id.text5);

    }
        public void btnClick(View v)
        {

            String a;
            String b;
            float rf, an, bn;
            String rs;



            a  = editText.getText().toString();

            an = Float.parseFloat(a);


                b = editText2.getText().toString();
                bn = Float.parseFloat(b);
                if(an==0 && bn==0)
                {
                    Toast.makeText(this,"Giá trị không thể bằng 0!",Toast.LENGTH_SHORT).show();

                }
                else if (an==0)
                {
                    Toast.makeText(this, "Số kg không thể bằng 0!",Toast.LENGTH_SHORT).show();
                    editText.selectAll();
                }
                else if (bn==0)
                {
                    Toast.makeText(this, "Số M không thể bằng 0!",Toast.LENGTH_SHORT).show();
                    editText2.selectAll();
                }
                else {
                    rf = an / (bn * bn);
                    /* 2 dong sau la de lam tron so*/
                    rf = Math.round(rf * 1000) / 10;
                    rf = rf / 100;

                    rs = Float.toString(rf);
                    text2.setText(rs);

                    if (rf < 18.5) {
                        text5.setText("Bạn quá gầy!");
                    } else if (18.5 <= rf && rf <= 22.9) {
                        text5.setText("Ok, ko gầy cũng chẳng béo");
                    } else if (23 <= rf && rf <= 24.9) {
                        text5.setText("Hơi hơi béo rồi");
                    } else if (25 <= rf && rf <= 29.9) {
                        text5.setText("Béo phì!");
                    } else if (30 <= rf && rf <= 39.9) {
                        text5.setText("Béo lắm rồi! Ăn ít thôi!");
                    } else if (rf >= 40) {
                        text5.setText("Kiểm tra xem dữ liệu nhập vào có chính xác không, nếu chính xác, chúc mừng! Bạn là FAT MAN đích thực!");
                    } else {
                        text5.setText("Lỗi! Xin hãy thử lại!");
                    }

                }
            }
        }


