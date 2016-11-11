package com.example.a403.a201244089;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    CheckBox ckb1;
    RatingBar star1;
    CalendarView calender1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"안녕?", Toast.LENGTH_SHORT).show();
            }
        });

        b2 = (Button)findViewById(R.id.button3);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"I`m fine", Toast.LENGTH_SHORT).show();
            }
        });

        ckb1=(CheckBox)findViewById(R.id.checkBox);
        ckb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ckb1.isChecked()){
                    Toast.makeText(getApplicationContext(),"체크 되었습니다.",Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(getApplicationContext(),"체크 해제 되었습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        star1=(RatingBar)findViewById(R.id.ratingBar);
        star1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(getApplicationContext(),"현재 별점은 "+rating+"입니다.", Toast.LENGTH_SHORT).show();

            }
        });

        calender1=(CalendarView) findViewById(R.id.calendarView);
        calender1.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                Toast.makeText(getApplicationContext(),"date;"+year+"-"+(month+1)+"-"+dayOfMonth,
                        Toast.LENGTH_SHORT).show();
            }
        });


    }
}
