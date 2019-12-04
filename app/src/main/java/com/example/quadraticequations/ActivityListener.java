package com.example.quadraticequations;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityListener implements View.OnClickListener{

    private EditText editA;
    private EditText editB;
    private EditText editC;
    private TextView answer;

    public ActivityListener(EditText a, EditText b, EditText c, TextView ans){
        this.editA = a;
        this.editB = b;
        this.editC = c;
        this.answer = ans;
    }

    @Override
    public void onClick(View v){
        double a = Double.parseDouble(editA.getText().toString());
        double b = Double.parseDouble(editB.getText().toString());
        double c = Double.parseDouble(editC.getText().toString());
        double d = b*b - 4*a*c;
        if(a != 0 && b != 0 && c != 0){
            if(d < 0){
                answer.setText("Нет корней");
            }
            if(d == 0){
                answer.setText("{" + (-b / 2*a) + "}");
            }
            if(d > 0){
                answer.setText("{" + ((-b + Math.sqrt(d)) / 2*a) + "; " + ((-b -Math.sqrt(d)) / 2*a) + "}");
            }

        }
        else{
            if(a == 0){
                answer.setText("Это не квадратное уравнение");
            }
            else{
                if(b == 0 && c == 0){
                    answer.setText("{" + 0 + "}");
                }
                else{
                    if(b == 0){
                        answer.setText("{" + Math.sqrt(-c / a) + "; " + (-Math.sqrt(-c / a)) + "}");
                    }
                    if(c == 0){
                        answer.setText("{" + 0 + "; " + (Math.sqrt(-b / a)) + "}");
                    }
                }
            }
        }




    }
}
