package com.example.fahad.converton;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

/**
 * Created by Fahad on 2/16/2017.
 */

public class EnergyStrategy implements Strategy {

    public double Convert(String from, String to, double input) {
        // TODO Auto-generated method stub

        if ((from.equals(energy.getInstance().getApplicationContext().getResources().getString(R.string.energyunitkilojoules)) && to.equals(energy.getInstance().getApplicationContext().getResources().getString(R.string.energyunitkilojoules)))) {
            //if((from.equals("calories")) &&(to.equals("kilojoules"))){
            double ret = input * 4.184;
            return ret;
        }

        if ((from.equals(energy.getInstance().getApplicationContext().getResources().getString(R.string.energyunitkilojoules)) && to.equals(energy.getInstance().getApplicationContext().getResources().getString(R.string.energyunitcalories)))) {
            //if((from.equals("kilojoules")) && (to.equals("calories"))){
            double ret = input * 0.239006;
            return ret;
        }

        if ((from.equals(energy.getInstance().getApplicationContext().getResources().getString(R.string.energyunitcalories)) && to.equals(energy.getInstance().getApplicationContext().getResources().getString(R.string.energyunitjoules)))) {
            //if((from.equals("calories")) && (to.equals("joules"))){
            double ret = input * 4184;
            return ret;
        }

        if ((from.equals(energy.getInstance().getApplicationContext().getResources().getString(R.string.energyunitjoules)) && to.equals(energy.getInstance().getApplicationContext().getResources().getString(R.string.energyunitcalories)))) {
            //if((from.equals("joules")) && (to.equals("calories"))){
            double ret = input * 0.000239;
            return ret;
        }

        if ((from.equals(energy.getInstance().getApplicationContext().getResources().getString(R.string.energyunitkilojoules)) && to.equals(energy.getInstance().getApplicationContext().getResources().getString(R.string.energyunitjoules)))) {
            //if((from.equals("kilojoules")) && (to.equals("joules"))){
            double ret = input * 1000;
            return ret;
        }

        if ((from.equals(energy.getInstance().getApplicationContext().getResources().getString(R.string.energyunitjoules)) && to.equals(energy.getInstance().getApplicationContext().getResources().getString(R.string.energyunitkilojoules)))) {
            //if((from.equals("joules")) && (to.equals("kilojoules"))){
            double ret = input / 1000;
            return ret;
        }
        if (from.equals(to)) {
            Context context = energy.getInstance().getApplicationContext();
            CharSequence text = "Same Types Selected";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.BOTTOM| Gravity.CENTER_HORIZONTAL, 0, 20);
            toast.show();
            return input;
        }
        return 0.0;
    }
}


