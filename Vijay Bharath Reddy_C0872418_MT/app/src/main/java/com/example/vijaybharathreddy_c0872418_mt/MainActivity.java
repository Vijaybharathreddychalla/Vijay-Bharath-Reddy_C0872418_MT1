package com.example.vijaybharathreddy_c0872418_mt;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinner;
    EditText daily_rent;
    EditText days;
    EditText amount;
    EditText total_payment;
    Button button;
    RadioButton Rage1;
    RadioButton Rage2;
    RadioButton Rage3;
    CheckBox op1;
    CheckBox op2;
    CheckBox op3;





    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        daily_rent =findViewById(R.id.et_rent);
        days = findViewById(R.id.TV_day);
        amount = findViewById(R.id.et_amt);
        total_payment = findViewById(R.id.et_tp);
        button = findViewById(R.id.btn);

        Rage1 = findViewById(R.id.ar1);
        Rage2 = findViewById(R.id.ar2);
        Rage3 = findViewById(R.id.ar3);
        op1 = findViewById(R.id.opr1);
        op2 = findViewById(R.id.opr2);
        op3 = findViewById(R.id.opr3);






        spinner = findViewById(R.id.spin1);




        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.car_name, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text = adapterView.getItemAtPosition(i).toString();
        switch (text){
            case "BMW":
                daily_rent.setText("$100");
                break;
            case "Audi Q3" :
                daily_rent.setText("$150");
                break;
            case "Mazda M5"  :
                daily_rent.setText("$70");
                break;

            case "Toyota Camry":
                daily_rent.setText("$80");
                break;

            case "Hundai Elantra":
                daily_rent.setText("$50");
                break;
            case "Ferrari":
                daily_rent.setText("$250");
                break;
            case "Tesla":
                daily_rent.setText("$120");
                break;
            case "Honda Civic":
                daily_rent.setText("$60");
                break;




        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}