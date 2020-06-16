package com.example.busanapp.mytrip;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.example.busanapp.R;
import com.google.android.material.snackbar.Snackbar;

import java.util.Calendar;
import java.util.Date;

public class AddSecondTripActivity extends PlaceListSecond
        implements DatePickerDialog.OnDateSetListener, View.OnClickListener {

    EditText trip_name;
    TextView trip_date;
    Spinner trip_location;
    Button btn_secondplace;
    Button btn_ok_first;
    Button save;
    LinearLayout mLinearLayout;
//  LottieAnimationView animationView;

    private String mStartdate;
    private String mTripname;
    private String mLocation;
    String mToken;

    private DatePickerDialog mDatePickerDialog;
    private MaterialDialog mDialog;
    private Handler mHandler;

    // Spinner
    ArrayAdapter<CharSequence> spinnerAdapter;
    boolean mInitSpinner;

    Calendar calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_add_new_trip_secondcourse);



        mLinearLayout = findViewById(R.id.linear_layout);
//      animationView = findViewById(R.id.animation_view);

        //list button
        btn_secondplace = findViewById(R.id.btn_secondplace);
        btn_secondplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddSecondTripActivity.this, PlaceListThird.class);
                startActivity(intent);
            }
        });
    }

    // 뒤로가기 버튼
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Date currentDate = calendar.getTime();

        Calendar selectedCalendar = Calendar.getInstance();
        selectedCalendar.set(year, month, dayOfMonth);

        Date selectedDate = selectedCalendar.getTime();

        if (selectedDate.compareTo(currentDate) > 0) {
            Log.d("Month", String.valueOf(month));
            mStartdate = Long.toString(selectedDate.getTime() / 1000);
            trip_date.setText(year + "년 " + (month + 1) + "월 " + dayOfMonth + "일");

        } else if (selectedDate.compareTo(currentDate) == 0) {
            TravelmateSnackbars.createSnackBar(findViewById(R.id.activityAddNewTrip),
                    R.string.wrong_date_alert, Snackbar.LENGTH_LONG
            ).show();

        } else {
            TravelmateSnackbars.createSnackBar(findViewById(R.id.activityAddNewTrip),
                    R.string.wrong_date_alert, Snackbar.LENGTH_LONG
            ).show();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            // Set Start date
            case R.id.sdate:
                mDatePickerDialog.show();
                break;

            // Add a new trip
            case R.id.ok:
                Utils.hideKeyboard(this);
                mTripname = trip_name.getText().toString();

                if (mTripname.trim().equals("")) {
                    TravelmateSnackbars.createSnackBar(findViewById(R.id.activityAddNewTrip),
                            R.string.trip_name_blank, Snackbar.LENGTH_LONG
                    ).show();

                } else if (trip_date == null || trip_date.getText().toString().equals("")) {
                    TravelmateSnackbars.createSnackBar(findViewById(R.id.activityAddNewTrip),
                            R.string.trip_date_blank, Snackbar.LENGTH_LONG
                    ).show();

                } else if (mLocation == null) {
                    TravelmateSnackbars.createSnackBar(findViewById(R.id.activityAddNewTrip),
                            R.string.trip_city_blank, Snackbar.LENGTH_LONG
                    ).show();

                }

                break;

//
        }
    }


    private void networkError() {
        mLinearLayout.setVisibility(View.INVISIBLE);
    }



}
