package com.example.fahad.converton;

/**
 * Created by Fahad on 2/16/2017.
 */

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class area extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    private EditText in_length;
    private Spinner vol1;
    private Button Converto;
    private Spinner vol2;
    ArrayAdapter<String> unitarrayadapter;
    private Strategy currentStrategy;
    private EditText output;
    private String unitfrom;
    private String unitto;
    private static area instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        vol1 = (Spinner) findViewById(R.id.len_spinner1);
        vol1.setOnItemSelectedListener(this);

        vol2 = (Spinner) findViewById(R.id.len_spinner2);
        vol2.setOnItemSelectedListener(this);

        unitarrayadapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        unitarrayadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fillSpinnerWithAreaUnit();
        vol1.setAdapter(unitarrayadapter);
        vol2.setAdapter(unitarrayadapter);

        unitarrayadapter.setNotifyOnChange(true);

        output = (EditText) findViewById(R.id.len_output);
        output.setClickable(false);

        Converto = (Button) findViewById(R.id.con_button);
        Converto.setOnClickListener(this);

        in_length = (EditText) findViewById(R.id.len_input);

        currentStrategy = new AreaStrategy();
        instance = this;
    }

    private void fillSpinnerWithAreaUnit(){
        unitarrayadapter.clear();
        unitarrayadapter.add(getResources().getString(R.string.areaunitsqkm));
        unitarrayadapter.add(getResources().getString(R.string.areaunitsqmiles));
        unitarrayadapter.add(getResources().getString(R.string.areaunitsqm));
        unitarrayadapter.add(getResources().getString(R.string.areaunitsqcm));
        unitarrayadapter.add(getResources().getString(R.string.areaunitsqmm));
        unitarrayadapter.add(getResources().getString(R.string.areaunitsqyard));
        unitarrayadapter.notifyDataSetChanged();
    }

    public static area getInstance() {
        return instance;
    }

    public void onItemSelected(AdapterView<?> parent) {

    }

    public void onNothingSelected(AdapterView<?> parent) {
    }

    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
        if (v.getParent() == vol1) {
            unitfrom = (String) (vol1.getSelectedItem().toString());
        }
        if (v.getParent() == vol2) {
            unitto = (String) (vol2.getSelectedItem().toString());
        }
    }

    public void onClick(View v) {
        if (v == Converto) {
            if (!in_length.getText().toString().equals("")) {
                double in = Double.parseDouble(in_length.getText().toString());
                double result = currentStrategy.Convert(unitfrom, unitto, in);
                if(result>=9999999)
                {
                    String resultmain = String.format(" %f", result);
                    output.setText(resultmain);
                }
                else
                    output.setText(Double.toString(result));
            } else {
                Context context = getApplicationContext();
                CharSequence text = "Enter Data";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.setGravity(Gravity.BOTTOM| Gravity.CENTER_HORIZONTAL, 0, 20);
                toast.show();
            }
        }
    }
}
