package com.example.fahad.converton;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

/**
 * Created by Fahad on 2/19/2017.
 */

public class DataStrategy implements Strategy{

    public double Convert(String from, String to, double input) {
        // TODO Auto-generated method stub

        if ((from.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitb)) && to.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitby)))) {
            //if((from.equals("bit")) && (to.equals("byte"))){
            double ret = 0.125 * input;
            return ret;
        }

        if ((from.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitb)) && to.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitkb)))) {
            //if((from.equals("bit")) && (to.equals("kb"))){
            double ret =  0.0001220703125  * input;
            return ret;
        }

        if ((from.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitb)) && to.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitmb)))) {
            //if((from.equals("bit")) && (to.equals("mb"))){
            double ret = 1.192092895508E-7 * input;
            return ret;
        }

        if ((from.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitb)) && to.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitgb)))) {
            //if((from.equals("bit")) && (to.equals("gb"))){
            double ret = 1.164153218269E-10  * input;
            return ret;
        }

        if ((from.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitb)) && to.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunittb)))) {
            //if((from.equals("bit")) && (to.equals("tb"))){
            double ret = 1.136912032962E-13  * input;
            return ret;
        }

        if ((from.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitby)) && to.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitb)))) {
            //if((from.equals("byte")) && (to.equals("bit"))){
            double ret = 8 * input;
            return ret;
        }

        if ((from.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitby)) && to.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitkb)))) {
            //if((from.equals("byte")) && (to.equals("kb"))){
            double ret = 0.0009765625 * input;
            return ret;
        }

        if ((from.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitby)) && to.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitmb)))) {
            //if((from.equals("byte")) && (to.equals("mb"))){
            double ret = 9.536743164063E-7  * input;
            return ret;
        }

        if ((from.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitby)) && to.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitgb)))) {
            //if((from.equals("byte")) && (to.equals("gb"))){
            double ret = 9.313225746155E-10 * input;
            return ret;
        }

        if ((from.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitby)) && to.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunittb)))) {
            //if((from.equals("byte")) && (to.equals("tb"))){
            double ret = 9.095296263695E-13 * input;
            return ret;
        }
        if ((from.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitkb)) && to.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitb)))) {
            //if((from.equals("kb")) && (to.equals("bit"))){
            double ret = 8192 * input;
            return ret;
        }

        if ((from.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitkb)) && to.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitby)))) {
            //if((from.equals("kb")) && (to.equals("byte"))){
            double ret = 1024 * input;
            return ret;
        }

        if ((from.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitkb)) && to.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitmb)))) {
            //if((from.equals("kb")) && (to.equals("mb"))){
            double ret = 0.0009765625 * input;
            return ret;
        }

        if ((from.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitkb)) && to.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitgb)))) {
            //if((from.equals("kb")) && (to.equals("gb"))){
            double ret = 9.536743164063E-7 * input;
            return ret;
        }

        if ((from.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitkb)) && to.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunittb)))) {
            //if((from.equals("kb")) && (to.equals("tb"))){
            double ret = 9.313583374023E-10  * input;
            return ret;
        }

        if ((from.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitb)) && to.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitby)))) {
            //if((from.equals("mb")) && (to.equals("byte"))){
            double ret = 1048576 * input;
            return ret;
        }

        if ((from.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitb)) && to.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitkb)))) {
            //if((from.equals("mb")) && (to.equals("kb"))){
            double ret = 1024 * input;
            return ret;
        }

        if ((from.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitb)) && to.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitgb)))) {
            //if((from.equals("mb")) && (to.equals("gb"))){
            double ret = 0.0009765625 * input;
            return ret;
        }

        if ((from.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitb)) && to.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunittb)))) {
            //if((from.equals("mb")) && (to.equals("tb"))){
            double ret = 9.537109375E-7  * input;
            return ret;
        }
        if ((from.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitgb)) && to.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitb)))) {
            //if((from.equals("gb")) && (to.equals("bit"))){
            long ret = (long) ((8589934592L) * input);
            return ret;
        }

        if ((from.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitgb)) && to.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitby)))) {
            //if((from.equals("gb")) && (to.equals("byte"))){
            double ret = 1073741824 * input;
            return ret;
        }

        if ((from.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitgb)) && to.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitkb)))) {
            //if((from.equals("gb")) && (to.equals("kb"))){
            double ret = 1048576 * input;
            return ret;
        }

        if ((from.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitgb)) && to.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitmb)))) {
            //if((from.equals("gb")) && (to.equals("mb"))){
            double ret = 1024 * input;
            return ret;
        }

        if ((from.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitgb)) && to.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunittb)))) {
            //if((from.equals("gb")) && (to.equals("tb"))){
            double ret = 0.0009766 * input;
            return ret;
        }
        if ((from.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunittb)) && to.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitb)))) {
            //if((from.equals("tb")) && (to.equals("bit"))){
            long ret = (long) ((long) (8795755265206L) * input);
            return ret;
        }

        if ((from.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunittb)) && to.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitby)))) {
            //if((from.equals("tb")) && (to.equals("byte"))){
            long ret = (long) ((8589934592L) * input);
            return ret;
        }

        if ((from.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunittb)) && to.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitkb)))) {
            //if((from.equals("tb")) && (to.equals("kb"))){
            double ret = 1048576 * input;
            return ret;
        }

        if ((from.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunittb)) && to.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitmb)))) {
            //if((from.equals("tb")) && (to.equals("mb"))){
            double ret = 1048576 * input;
            return ret;
        }

        if ((from.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunittb)) && to.equals(data.getInstance().getApplicationContext().getResources().getString(R.string.dataunitgb)))) {
            //if((from.equals("tb")) && (to.equals("gb"))){
            double ret = 1024 * input;
            return ret;
        }

        if(from.equals(to)){
            Context context = data.getInstance().getApplicationContext();
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
