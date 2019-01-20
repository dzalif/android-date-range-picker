package com.example.aliffirdaus.daterangepicker;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ddd.daterangepicker.DateRangePicker;

public class MainActivity extends AppCompatActivity {

    Button openCalendar;
    TextView startDate, endDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openCalendar = findViewById(R.id.open_calendar);
        startDate = findViewById(R.id.start_date);
        endDate = findViewById(R.id.end_date);

        openCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initCalendar();
            }
        });
    }

    private void initCalendar() {
        final DateRangePicker dateRangePicker = new DateRangePicker(this, new DateRangePicker.OnCalenderClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onDateSelected(String s, String s1) {
               startDate.setText("Start Date : " + s);
               endDate.setText("End Date : " + s1);
            }
        });
        dateRangePicker.show();
        dateRangePicker.setBtnPositiveText("Oke");
        dateRangePicker.setBtnNegativeText("Batal");
    }
}
