package com.example.karan.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score = 0;
    int id;

    public void fscore(View view) {
        int fs = 0, r1 = 0, r2 = 0, r3 = 0, r4 = 0, r5 = 0, r6 = 0;
        RadioGroup radiogroup = (RadioGroup) findViewById(R.id.rg1);
        id = radiogroup.getCheckedRadioButtonId();
        if (id > 0) {
            RadioButton selectedrad = (RadioButton) findViewById(id);
            String s1 = (String) selectedrad.getText();

            if (s1.equals("1994")) {
                score = 5;
            } else
                score = 0;

            r1 = score;
        }
        RadioGroup radiogroup1 = (RadioGroup) findViewById(R.id.rg2);
        id = radiogroup1.getCheckedRadioButtonId();
        if (id > 0)

        {
            RadioButton selectedrad = (RadioButton) findViewById(id);
            String s2 = (String) selectedrad.getText();
            if (s2.equals("1972")) {
                score = 5;
            } else
                score = 0;

            r2 = score;
        }
        RadioGroup radiogroup2 = (RadioGroup) findViewById(R.id.rg3);
        id = radiogroup2.getCheckedRadioButtonId();
        if (id > 0)

        {
            RadioButton selectedrad = (RadioButton) findViewById(id);
            String s3 = (String) selectedrad.getText();
            if (s3.equals("captain russell")) {
                score = 5;
            } else
                score = 0;

            r3 = score;
        }
        RadioGroup radiogroup3 = (RadioGroup) findViewById(R.id.rg4);
        id = radiogroup3.getCheckedRadioButtonId();
        if (id > 0)

        {
            RadioButton selectedrad = (RadioButton) findViewById(id);
            String s3 = (String) selectedrad.getText();
            if (s3.equals("darr")) {
                score = 5;
            } else
                score = 0;

            r4 = score;
        }
        RadioGroup radiogroup4 = (RadioGroup) findViewById(R.id.rg5);
        id = radiogroup4.getCheckedRadioButtonId();
        if (id > 0)

        {
            RadioButton selectedrad = (RadioButton) findViewById(id);
            String s4 = (String) selectedrad.getText();
            if (s4.equals("shahrukh khan")) {
                score = 5;
            } else
                score = 0;

            r5 = score;
        }
        RadioGroup radiogroup5 = (RadioGroup) findViewById(R.id.rg6);
        id = radiogroup5.getCheckedRadioButtonId();
        if (id > 0)

        {
            RadioButton selectedrad = (RadioButton) findViewById(id);
            String s5 = (String) selectedrad.getText();
            if (s5.equals("Amitabh Bachchan")) {
                score = 5;
            } else
                score = 0;

            r6 = score;
        }
        fs = (int) (r1 + r2 + r3 + r4 + r5 + r6+ r7()+r8());
        Toast.makeText(this, "your score is" + fs, Toast.LENGTH_SHORT).show();
    }

    public float r7(){
        CheckBox kareena=(CheckBox) findViewById(R.id.kareena);
        CheckBox karishma=(CheckBox) findViewById(R.id.karishma);
        CheckBox sonam=(CheckBox) findViewById(R.id.sonam);
        CheckBox shraddha=(CheckBox) findViewById(R.id.shraddha);
        boolean ka,kar,so,sh;
        ka=kareena.isChecked();
        kar=karishma.isChecked();
        so=sonam.isChecked();
        sh=shraddha.isChecked();
        if (ka==true && kar==true  && so==false && sh==false)
        {
            score=5;
        }
        else{
            score=0;
        }
        return score;
    }
    String s7;
    public  int r8(){
        EditText Edit=(EditText) findViewById(R.id.Edit);
        String s8=Edit.getText().toString();
        s7=s8.toLowerCase().trim();
        if(s7.equals("arrehman")){
            score=5;
        }
        else{
            score=0;
        }
        return score;
    }

}