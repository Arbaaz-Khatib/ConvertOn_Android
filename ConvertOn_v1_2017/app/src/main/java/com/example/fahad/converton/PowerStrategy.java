package com.example.fahad.converton;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

/**
 * Created by Fahad on 2/16/2017.
 */

public class PowerStrategy implements Strategy {

    public double Convert(String from, String to, double input) {
            // TODO Auto-generated method stub

            if((from.equals(power.getInstance().getApplicationContext().getResources().getString(R.string.powerunitwatts)) && to.equals(power.getInstance().getApplicationContext().getResources().getString(R.string.powerunithorseposer)))){
                //if((from.equals("watts")) && (to.equals("horsepower"))){
                double ret = 0.00134*input;
                return ret;
            }

        if((from.equals(power.getInstance().getApplicationContext().getResources().getString(R.string.powerunithorseposer)) && to.equals(power.getInstance().getApplicationContext().getResources().getString(R.string.powerunitwatts)))){
            //if((from.equals("horsepower")) && (to.equals("watts"))){
            double ret = 745.7*input;
            return ret;
        }

        if((from.equals(power.getInstance().getApplicationContext().getResources().getString(R.string.powerunitwatts)) && to.equals(power.getInstance().getApplicationContext().getResources().getString(R.string.powerunitkilowatts)))){
            //if((from.equals("watts")) && (to.equals("kilowatts"))){
            double ret = input/1000;
            return ret;
        }

        if((from.equals(power.getInstance().getApplicationContext().getResources().getString(R.string.powerunitkilowatts)) && to.equals(power.getInstance().getApplicationContext().getResources().getString(R.string.powerunitwatts)))){
            //if((from.equals("kilowatts")) &&(to.equals("watts"))){
            double ret = input*1000;
            return ret;
        }

        if((from.equals(power.getInstance().getApplicationContext().getResources().getString(R.string.powerunitkilowatts)) && to.equals(power.getInstance().getApplicationContext().getResources().getString(R.string.powerunithorseposer)))){
            //if((from.equals("kilowatts")) && (to.equals("horsepower"))){
            double ret = input*1.34102;
            return ret;
        }

        if((from.equals(power.getInstance().getApplicationContext().getResources().getString(R.string.powerunithorseposer)) && to.equals(power.getInstance().getApplicationContext().getResources().getString(R.string.powerunitkilowatts)))){
            //if((from.equals("horsepower")) &&(to.equals("kilowatts"))){
            double ret = input*0.7457;
            return ret;
        }
        if(from.equals(to)){
            Context context = power.getInstance().getApplicationContext();
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

