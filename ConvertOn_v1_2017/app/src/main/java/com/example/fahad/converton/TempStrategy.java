package com.example.fahad.converton;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

/**
 * Created by Fahad on 2/16/2017.
 */

public class TempStrategy implements Strategy {


    public double Convert(String from, String to, double input) {
        // TODO Auto-generated method stub

        if((from.equals(temp.getInstance().getApplicationContext().getResources().getString(R.string.temperatureunitc)) && to.equals((temp.getInstance().getApplicationContext().getResources().getString(R.string.temperatureunitf))))){
            double ret = (double)((input*9/5)+32);
            return ret;
        }

        if((from.equals(temp.getInstance().getApplicationContext().getResources().getString(R.string.temperatureunitf)) && to.equals((temp.getInstance().getApplicationContext().getResources().getString(R.string.temperatureunitc))))){
            double ret = (double)((input-32)*5/9);
            return ret;
        }

        if((from.equals(temp.getInstance().getApplicationContext().getResources().getString(R.string.temperatureunitc)) && to.equals((temp.getInstance().getApplicationContext().getResources().getString(R.string.temperatureunitk))))){
            double ret = 273.15 + input;
            return ret;
        }

        if((from.equals(temp.getInstance().getApplicationContext().getResources().getString(R.string.temperatureunitf)) && to.equals((temp.getInstance().getApplicationContext().getResources().getString(R.string.temperatureunitk))))){
            double ret = (input - 32) * 5/9 + 273;
            return ret;
        }

        if((from.equals(temp.getInstance().getApplicationContext().getResources().getString(R.string.temperatureunitk)) && to.equals((temp.getInstance().getApplicationContext().getResources().getString(R.string.temperatureunitc))))){
            double ret = input - 273.15;
            return ret;
        }

        if((from.equals(temp.getInstance().getApplicationContext().getResources().getString(R.string.temperatureunitk)) && to.equals((temp.getInstance().getApplicationContext().getResources().getString(R.string.temperatureunitf))))){
            double ret = (input -273) *9/5 +32;
            return ret;
        }

        if(from.equals(to)){
            Context context = temp.getInstance().getApplicationContext();
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


