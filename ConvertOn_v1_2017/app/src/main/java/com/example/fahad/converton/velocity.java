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

public class velocity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener  {
    private EditText in_length;
    private Spinner C2M;
    private Button Converto;
    private Spinner M2C;
    private EditText output;
    ArrayAdapter<String> unitarrayadapter;
    private Strategy currentStrategy;
    private String unitfrom;
    private String unitto;
    private static velocity instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        C2M = (Spinner) findViewById(R.id.len_spinner1);
        C2M.setOnItemSelectedListener(this);

        M2C = (Spinner) findViewById(R.id.len_spinner2);
        M2C.setOnItemSelectedListener(this);

        unitarrayadapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        unitarrayadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fillSpinnerWithVelocityUnit();
        C2M.setAdapter(unitarrayadapter);
        M2C.setAdapter(unitarrayadapter);

        unitarrayadapter.setNotifyOnChange(true);

        output = (EditText) findViewById(R.id.len_output);
        output.setClickable(false);

        Converto = (Button) findViewById(R.id.con_button);
        Converto.setOnClickListener(this);

        in_length = (EditText) findViewById(R.id.len_input);

        currentStrategy = new VelocityStrategy();
        instance = this;
    }

    private void fillSpinnerWithVelocityUnit(){
        unitarrayadapter.clear();
        unitarrayadapter.add(getResources().getString(R.string.velocityunitkmph));
        unitarrayadapter.add(getResources().getString(R.string.velocityunitmilesperh));
        unitarrayadapter.add(getResources().getString(R.string.velocityunitmeterpers));
        unitarrayadapter.add(getResources().getString(R.string.velocityunitfeetpers));
        unitarrayadapter.notifyDataSetChanged();
    }

    public static velocity getInstance() {
        return instance;
    }

    public void onItemSelected(AdapterView<?> parent) {

    }

    public void onNothingSelected(AdapterView<?> parent) {
    }

    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
        if (v.getParent() == C2M) {
            unitfrom = (String) (C2M.getSelectedItem().toString());
        }
        if (v.getParent() == M2C) {
            unitto = (String) (M2C.getSelectedItem().toString());
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