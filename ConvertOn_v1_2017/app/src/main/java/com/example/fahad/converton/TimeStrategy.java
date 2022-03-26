package com.example.fahad.converton;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

/**
 * Created by Fahad on 2/21/2017.
 */

public class TimeStrategy implements Strategy {

    public double Convert(String from, String to, double input) {
        // TODO Auto-generated method stub

        if ((from.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunits)) && to.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunitm)))) {
            //if((from.equals("sec")) && (to.equals("min"))){
            double ret = 0.01667 *input;
            return ret;
        }
        if ((from.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunits)) && to.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunith)))) {
            //if((from.equals("sec")) && (to.equals("hr"))){
            double ret = 0.000278 *input;
            return ret;
        }
        if ((from.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunits)) && to.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunitmo)))) {
            //if((from.equals("sec")) && (to.equals("mnth"))){
            double ret = 3.8027e-11 *input;
            return ret;
        }
        if ((from.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunits)) && to.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunity)))) {
            //if((from.equals("sec")) && (to.equals("yr"))){
            double ret = (input * 0.00000003168809);
            return ret;
        }


        if ((from.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunitm)) && to.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunits)))) {
            //if((from.equals("min")) && (to.equals("sec"))){
            double ret = 60 * input;
            return ret;
        }
        if ((from.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunitm)) && to.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunith)))) {
            //if((from.equals("min")) && (to.equals("hr"))){
            double ret = 0.016667 * input;
            return ret;
        }
        if ((from.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunitm)) && to.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunitmo)))) {
            //if((from.equals("min")) && (to.equals("mnth"))){
            double ret = (0.00002 * input);
            return ret;
        }
        if ((from.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunitm)) && to.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunity)))) {
            //if((from.equals("min")) && (to.equals("yr"))){
            double ret = (input * 2e-6);
            return ret;
        }


        if ((from.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunith)) && to.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunits)))) {
            //if((from.equals("hr")) && (to.equals("sec"))){
            double ret = 3600 * input;
            return ret;
        }
        if ((from.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunith)) && to.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunitm)))) {
            //if((from.equals("hr")) && (to.equals("min"))){
            double ret = 60 * input;
            return ret;
        }
        if ((from.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunith)) && to.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunitmo)))) {
            //if((from.equals("hr")) && (to.equals("mnth"))){
            double ret = 0.00137 * input;
            return ret;
        }
        if ((from.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunith)) && to.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunity)))) {
            //if((from.equals("hr")) && (to.equals("yr"))){
            double ret = input * 0.00011;
            return ret;
        }


        if ((from.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunitmo)) && to.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunits)))) {
            //if((from.equals("month")) && (to.equals("sec"))){
            double ret = 2630000 * input;
            return ret;
        }
        if ((from.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunitmo)) && to.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunitm)))) {
            //if((from.equals("month")) && (to.equals("min"))){
            double ret = 43829.1 * input;
            return ret;
        }
        if ((from.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunitmo)) && to.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunith)))) {
            //if((from.equals("month")) && (to.equals("hr"))){
            double ret = 730.484 * input;
            return ret;
        }
        if ((from.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunitmo)) && to.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunity)))) {
            //if((from.equals("month")) && (to.equals("yr"))){
            double ret = input / 12;
            return ret;
        }



        if ((from.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunity)) && to.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunits)))) {
            //if((from.equals("yr")) && (to.equals("sec"))){
            double ret = 31557600 * input;
            return ret;
        }
        if ((from.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunity)) && to.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunitm)))) {
            //if((from.equals("yr")) && (to.equals("min"))){
            double ret = 525960 * input;
            return ret;
        }
        if ((from.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunity)) && to.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunith)))) {
            //if((from.equals("yr")) && (to.equals("hr"))){
            double ret = 8766 * input;
            return ret;
        }
        if ((from.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunity)) && to.equals(time.getInstance().getApplicationContext().getResources().getString(R.string.timeunitmo)))) {
            //if((from.equals("yr")) && (to.equals("mnth"))){
            double ret = 12 * input;
            return ret;
        }

        if(from.equals(to)){
            Context context = time.getInstance().getApplicationContext();
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
