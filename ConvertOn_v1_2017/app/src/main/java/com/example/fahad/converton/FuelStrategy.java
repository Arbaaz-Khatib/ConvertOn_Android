package com.example.fahad.converton;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

/**
 * Created by Fahad on 2/19/2017.
 */

public class FuelStrategy implements Strategy {

    public double Convert(String from, String to, double input) {
        // TODO Auto-generated method stub

        if ((from.equals(fuel.getInstance().getApplicationContext().getResources().getString(R.string.fuelunitmpg)) && to.equals(fuel.getInstance().getApplicationContext().getResources().getString(R.string.fuelunitmpl)))) {
            //if((from.equals("MPG")) && (to.equals("MPL"))){
            double ret = 0.219969 * input;
            return ret;
        }

        if ((from.equals(fuel.getInstance().getApplicationContext().getResources().getString(R.string.fuelunitmpg)) && to.equals(fuel.getInstance().getApplicationContext().getResources().getString(R.string.fuelunitkml)))) {
            //if((from.equals("MPG")) && (to.equals("KmPL"))){
            double ret = 0.35400 * input;
            return ret;
        }

        if ((from.equals(fuel.getInstance().getApplicationContext().getResources().getString(R.string.fuelunitmpg)) && to.equals(fuel.getInstance().getApplicationContext().getResources().getString(R.string.fuelunitlpk)))) {
            //if((from.equals("MPG")) && (to.equals("L/100K"))){
            double ret = 282.48093 / input;
            return ret;
        }

        if ((from.equals(fuel.getInstance().getApplicationContext().getResources().getString(R.string.fuelunitmpl)) && to.equals(fuel.getInstance().getApplicationContext().getResources().getString(R.string.fuelunitmpg)))) {
            //if((from.equals("MPL")) && (to.equals("MPG"))){
            double ret = 4.54608 * input;
            return ret;
        }

        if ((from.equals(fuel.getInstance().getApplicationContext().getResources().getString(R.string.fuelunitmpl)) && to.equals(fuel.getInstance().getApplicationContext().getResources().getString(R.string.fuelunitkml)))) {
            //if((from.equals("MPL")) && (to.equals("KML"))){
            double ret = 1.609344 * input;
            return ret;
        }

        if ((from.equals(fuel.getInstance().getApplicationContext().getResources().getString(R.string.fuelunitmpl)) && to.equals(fuel.getInstance().getApplicationContext().getResources().getString(R.string.fuelunitlpk)))) {
            //if((from.equals("MPL")) && (to.equals("L/100Km"))){
            double ret = 62.13711 / input;
            return ret;
        }

        if ((from.equals(fuel.getInstance().getApplicationContext().getResources().getString(R.string.fuelunitkml)) && to.equals(fuel.getInstance().getApplicationContext().getResources().getString(R.string.fuelunitmpg)))) {
            //if((from.equals("KmPL")) && (to.equals("MPG"))){
            double ret = 2.82480 * input;
            return ret;
        }

        if ((from.equals(fuel.getInstance().getApplicationContext().getResources().getString(R.string.fuelunitkml)) && to.equals(fuel.getInstance().getApplicationContext().getResources().getString(R.string.fuelunitmpl)))) {
            //if((from.equals("KmPL")) && (to.equals("MPL"))){
            double ret = 0.62137 * input;
            return ret;
        }

        if ((from.equals(fuel.getInstance().getApplicationContext().getResources().getString(R.string.fuelunitkml)) && to.equals(fuel.getInstance().getApplicationContext().getResources().getString(R.string.fuelunitlpk)))) {
            //if((from.equals("KmPL")) && (to.equals("L/100km"))){
            double ret = 100 / input;
            return ret;
        }

        if ((from.equals(fuel.getInstance().getApplicationContext().getResources().getString(R.string.fuelunitlpk)) && to.equals(fuel.getInstance().getApplicationContext().getResources().getString(R.string.fuelunitmpg)))) {
            //if((from.equals("L/100Km")) && (to.equals("MPG"))){
            double ret = 282.48093 / input;
            return ret;
        }

        if ((from.equals(fuel.getInstance().getApplicationContext().getResources().getString(R.string.fuelunitlpk)) && to.equals(fuel.getInstance().getApplicationContext().getResources().getString(R.string.fuelunitmpl)))) {
            //if((from.equals("L/100Km")) && (to.equals("MPL"))){
            double ret = 62.13711 / input;
            return ret;
        }

        if ((from.equals(fuel.getInstance().getApplicationContext().getResources().getString(R.string.fuelunitlpk)) && to.equals(fuel.getInstance().getApplicationContext().getResources().getString(R.string.fuelunitkml)))) {
            //if((from.equals("L/100Km")) && (to.equals("KmPL"))){
            double ret = 100 / input;
            return ret;
        }

        if(from.equals(to)){
            Context context = fuel.getInstance().getApplicationContext();
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
