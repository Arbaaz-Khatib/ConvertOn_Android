package com.example.fahad.converton;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

/**
 * Created by Fahad on 2/21/2017.
 */

public class CookStrategy implements Strategy {

    public double Convert(String from, String to, double input) {
        // TODO Auto-generated method stub

        if ((from.equals(cooking.getInstance().getApplicationContext().getResources().getString(R.string.cookunitc)) && to.equals(cooking.getInstance().getApplicationContext().getResources().getString(R.string.cookunitt)))) {
            //if((from.equals("cup")) && (to.equals("teaspoon"))){
            double ret = 48 *input;
            return ret;
        }
        if ((from.equals(cooking.getInstance().getApplicationContext().getResources().getString(R.string.cookunitc)) && to.equals(cooking.getInstance().getApplicationContext().getResources().getString(R.string.cookunitta)))) {
            //if((from.equals("cup")) && (to.equals("tablespoon"))){
            double ret = 16 *input;
            return ret;
        }

        if ((from.equals(cooking.getInstance().getApplicationContext().getResources().getString(R.string.cookunitt)) && to.equals(cooking.getInstance().getApplicationContext().getResources().getString(R.string.cookunitc)))) {
            //if((from.equals("teaspoon")) && (to.equals("cup"))){
            double ret = 0.0208333 *input;
            return ret;
        }
        if ((from.equals(cooking.getInstance().getApplicationContext().getResources().getString(R.string.cookunitt)) && to.equals(cooking.getInstance().getApplicationContext().getResources().getString(R.string.cookunitta)))) {
            //if((from.equals("teaspoon")) && (to.equals("tablespoon"))){
            double ret = 0.333333 *input;
            return ret;
        }

        if ((from.equals(cooking.getInstance().getApplicationContext().getResources().getString(R.string.cookunitta)) && to.equals(cooking.getInstance().getApplicationContext().getResources().getString(R.string.cookunitt)))) {
            //if((from.equals("tablespoon")) && (to.equals("teaspoon"))){
            double ret = 2.999998940089434 *input;
            return ret;
        }
        if ((from.equals(cooking.getInstance().getApplicationContext().getResources().getString(R.string.cookunitta)) && to.equals(cooking.getInstance().getApplicationContext().getResources().getString(R.string.cookunitc)))) {
            //if((from.equals("tablespoon")) && (to.equals("cup"))){
            double ret = 0.062499957709375011938 *input;
            return ret;
        }

        if(from.equals(to)){
            Context context = cooking.getInstance().getApplicationContext();
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
