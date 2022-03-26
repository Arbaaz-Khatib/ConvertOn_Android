package com.example.fahad.converton;
import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;
/**
 * Created by Fahad on 2/21/2017.
 */

public class AngleStrategy implements Strategy {

    public double Convert(String from, String to, double input) {
        // TODO Auto-generated method stub

        if ((from.equals(angle.getInstance().getApplicationContext().getResources().getString(R.string.angleunitd)) && to.equals(angle.getInstance().getApplicationContext().getResources().getString(R.string.angleunitr)))) {
            //if((from.equals("degree")) && (to.equals("radian"))){
            double ret = (input * 3.142) / 180;
            return ret;
        }
        if ((from.equals(angle.getInstance().getApplicationContext().getResources().getString(R.string.angleunitd)) && to.equals(angle.getInstance().getApplicationContext().getResources().getString(R.string.angleunitg)))) {
            //if((from.equals("degree")) && (to.equals("gradian"))){
            return 1.11111111 * input;
        }

        if ((from.equals(angle.getInstance().getApplicationContext().getResources().getString(R.string.angleunitr)) && to.equals(angle.getInstance().getApplicationContext().getResources().getString(R.string.angleunitd)))) {
            //if((from.equals("radian")) && (to.equals("degree"))){
            return input * (180 / 3.142);
        }
        if ((from.equals(angle.getInstance().getApplicationContext().getResources().getString(R.string.angleunitr)) && to.equals(angle.getInstance().getApplicationContext().getResources().getString(R.string.angleunitg)))) {
            //if((from.equals("radian")) && (to.equals("gradian"))){
            return 63.6638548 * input;
        }

        if ((from.equals(angle.getInstance().getApplicationContext().getResources().getString(R.string.angleunitg)) && to.equals(angle.getInstance().getApplicationContext().getResources().getString(R.string.angleunitd)))) {
            //if((from.equals("gradian")) && (to.equals("degree"))){
            return 0.9 * input;
        }
        if ((from.equals(angle.getInstance().getApplicationContext().getResources().getString(R.string.angleunitg)) && to.equals(angle.getInstance().getApplicationContext().getResources().getString(R.string.angleunitr)))) {
            //if((from.equals("gradian")) && (to.equals("radian"))){
            return 0.0157075 * input;
        }

        if (from.equals(to)) {
            Context context = angle.getInstance().getApplicationContext();
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
