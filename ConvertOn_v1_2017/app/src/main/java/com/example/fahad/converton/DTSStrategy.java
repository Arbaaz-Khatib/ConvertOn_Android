package com.example.fahad.converton;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

/**
 * Created by Fahad on 2/24/2017.
 */

public class DTSStrategy implements Strategy {

    public double Convert(String from, String to, double input) {
        // TODO Auto-generated method stub

        if ((from.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitkbps)) && to.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitkBps)))) {
            //if((from.equals("Kbps")) && (to.equals("KBps"))){
            double ret = 0.125 * input;
            return ret;
        }
        if ((from.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitkbps)) && to.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitmbps)))) {
            //if((from.equals("Kbps")) && (to.equals("Mbps"))){
            double ret = 0.001 * input;
            return ret;
        }
        if ((from.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitkbps)) && to.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitmBps)))) {
            //if((from.equals("Kbps")) && (to.equals("MBps"))){
            double ret = 0.000125 * input;
            return ret;
        }
        if ((from.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitkbps)) && to.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitgbps)))) {
            //if((from.equals("Kbps")) && (to.equals("Gbps"))){
            double ret = 1e-6 * input;
            return ret;
        }
        if ((from.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitkbps)) && to.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitgBps)))) {
            //if((from.equals("Kbps")) && (to.equals("GBps"))){
            double ret = 1.25e-7 * input;
            return ret;
        }


        if ((from.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitkBps)) && to.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitkbps)))) {
            //if((from.equals("KBps")) && (to.equals("kbps"))){
            double ret = 8 * input;
            return ret;
        }
        if ((from.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitkBps)) && to.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitmbps)))) {
            //if((from.equals("KBps")) && (to.equals("Mbps"))){
            double ret = 0.008 * input;
            return ret;
        }
        if ((from.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitkBps)) && to.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitmBps)))) {
            //if((from.equals("KBps")) && (to.equals("MBps"))){
            double ret = 0.001 * input;
            return ret;
        }
        if ((from.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitkBps)) && to.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitgbps)))) {
            //if((from.equals("KBps")) && (to.equals("Gbps"))){
            double ret = 8e-6 * input;
            return ret;
        }
        if ((from.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitkBps)) && to.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitgBps)))) {
            //if((from.equals("KBps")) && (to.equals("GBps"))){
            double ret = 1e-6 * input;
            return ret;
        }


        if ((from.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitmbps)) && to.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitkbps)))) {
            //if((from.equals("mbps")) && (to.equals("kbps"))){
            double ret = 1000 * input;
            return ret;
        }
        if ((from.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitmbps)) && to.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitkBps)))) {
            //if((from.equals("mbps")) && (to.equals("KBps"))){
            double ret = 125 * input;
            return ret;
        }
        if ((from.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitmbps)) && to.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitmBps)))) {
            //if((from.equals("mbps")) && (to.equals("MBps"))){
            double ret = 0.125* input;
            return ret;
        }
        if ((from.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitmbps)) && to.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitgbps)))) {
            //if((from.equals("mbps")) && (to.equals("Gbps"))){
            double ret = 0.001 * input;
            return ret;
        }
        if ((from.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitmbps)) && to.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitgBps)))) {
            //if((from.equals("mbps")) && (to.equals("GBps"))){
            double ret = 0.000125 * input;
            return ret;
        }


        if ((from.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitmBps)) && to.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitkbps)))) {
            //if((from.equals("mBps")) && (to.equals("kbps"))){
            double ret = 8000 * input;
            return ret;
        }
        if ((from.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitmBps)) && to.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitkBps)))) {
            //if((from.equals("mBps")) && (to.equals("KBps"))){
            double ret = 1000 * input;
            return ret;
        }
        if ((from.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitmBps)) && to.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitmbps)))) {
            //if((from.equals("mBps")) && (to.equals("mbps"))){
            double ret = 8 * input;
            return ret;
        }
        if ((from.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitmBps)) && to.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitgbps)))) {
            //if((from.equals("mBps")) && (to.equals("Gbps"))){
            double ret = 0.008 * input;
            return ret;
        }
        if ((from.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitmBps)) && to.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitgBps)))) {
            //if((from.equals("mBps")) && (to.equals("GBps"))){
            double ret = 0.001 * input;
            return ret;
        }


        if ((from.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitgbps)) && to.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitkbps)))) {
            //if((from.equals("gbps")) && (to.equals("kbps"))){
            double ret = 1e+6 * input;
            return ret;
        }
        if ((from.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitgbps)) && to.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitkBps)))) {
            //if((from.equals("gbps")) && (to.equals("KBps"))){
            double ret = 125000 * input;
            return ret;
        }
        if ((from.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitgbps)) && to.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitmbps)))) {
            //if((from.equals("gbps")) && (to.equals("mbps"))){
            double ret = 1000 * input;
            return ret;
        }
        if ((from.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitgbps)) && to.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitmBps)))) {
            //if((from.equals("gbps")) && (to.equals("mBps"))){
            double ret = 125 * input;
            return ret;
        }
        if ((from.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitgbps)) && to.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitgBps)))) {
            //if((from.equals("gbps")) && (to.equals("GBps"))){
            double ret = 0.125 * input;
            return ret;
        }


        if ((from.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitgBps)) && to.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitkbps)))) {
            //if((from.equals("gBps")) && (to.equals("kbps"))){
            double ret = 8e+6 * input;
            return ret;
        }
        if ((from.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitgBps)) && to.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitkBps)))) {
            //if((from.equals("gBps")) && (to.equals("KBps"))){
            double ret = 1e+6 * input;
            return ret;
        }
        if ((from.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitgBps)) && to.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitmbps)))) {
            //if((from.equals("gBps")) && (to.equals("mbps"))){
            double ret = 8000 * input;
            return ret;
        }
        if ((from.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitgBps)) && to.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitmBps)))) {
            //if((from.equals("gBps")) && (to.equals("mBps"))){
            double ret = 1000 * input;
            return ret;
        }
        if ((from.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitgBps)) && to.equals(dts.getInstance().getApplicationContext().getResources().getString(R.string.dtsunitgbps)))) {
            //if((from.equals("gBps")) && (to.equals("Gbps"))){
            double ret = 8 * input;
            return ret;
        }

        if(from.equals(to)){
            Context context = dts.getInstance().getApplicationContext();
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
