package com.example.fahad.converton;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

/**
 * Created by Fahad on 2/16/2017.
 */

public class CurrencyStrategy implements Strategy {

    //private Context appcontext = currency.getInstance().getApplicationContext();
    public double Convert(String from, String to, double input) {
        // TODO Auto-generated method stub

        if((from.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyuniti)) && to.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitd)))){
            //if((from.equals("INR")) && (to.equals("US Dollar"))){
            double ret = 0.015*input;
            return ret;
        }

        if((from.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyuniti)) && to.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitdi)))){
            //if((from.equals("INR")) && (to.equals("Dinar"))){
            double ret = input*0.0046;
            return ret;
        }

        if((from.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyuniti)) && to.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunite)))){
            //if((from.equals("INR")) && (to.equals("Euros"))){
            double ret = input*0.014;
            return ret;
        }

        if((from.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyuniti)) && to.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitp)))){
            //if((from.equals("INR")) &&(to.equals("Pounds"))){
            double ret = input*0.012;
            return ret;
        }

        if((from.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitd)) && to.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyuniti)))){
            //if((from.equals("US Dollar")) && (to.equals("INR"))){
            double ret = input*66.98;
            return ret;
        }

        if((from.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitd)) && to.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitp)))){
            //if((from.equals("US Dollar")) &&(to.equals("Pounds"))){
            double ret = input*0.80;
            return ret;
        }


        if((from.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitd)) && to.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunite)))){
            //if((from.equals("US Dollar")) &&(to.equals("Euros"))){
            double ret = input*0.94;
            return ret;
        }


        if((from.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitd)) && to.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitdi)))){
            //if((from.equals("US Dollar")) &&(to.equals("Dinar"))){
            double ret = input*0.31;
            return ret;
        }


        if((from.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitdi)) && to.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyuniti)))){
            //if((from.equals("Dinar")) &&(to.equals("INR"))){
            double ret = input*219.40;
            return ret;
        }


        if((from.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitdi)) && to.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitp)))){
            //if((from.equals("Dinar")) &&(to.equals("Pounds"))){
            double ret = input*2.61922;
            return ret;
        }


        if((from.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitdi)) && to.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunite)))){
            //if((from.equals("Dinar")) &&(to.equals("Euros"))){
            double ret = input*3.07022;
            return ret;
        }

        if((from.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitdi)) && to.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitdi)))){
            //if((from.equals("Dinar")) &&(to.equals("US Dollar"))){
            double ret = input*0.00085;
            return ret;
        }


        if((from.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitp)) && to.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyuniti)))){
            //if((from.equals("Pounds")) &&(to.equals("INR"))){
            double ret = input*83.77;
            return ret;
        }

        if((from.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitp)) && to.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitdi)))){
            //if((from.equals("Pounds")) &&(to.equals("US Dollar"))){
            double ret = input*1.25;
            return ret;
        }

        if((from.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitp)) && to.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunite)))){
            //if((from.equals("Pounds")) &&(to.equals("Euros"))){
            double ret = input*1.17;
            return ret;
        }

        if((from.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitp)) && to.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitdi)))){
            //if((from.equals("Pounds")) &&(to.equals("Dinar"))){
            double ret = input*0.38;
            return ret;
        }


        if((from.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunite)) && to.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyuniti)))){
            //if((from.equals("Euros")) &&(to.equals("INR"))){
            double ret = input*71.84;
            return ret;
        }

        if((from.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunite)) && to.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitd)))){
            //if((from.equals("Euros")) &&(to.equals("US Dollars"))){
            double ret = input*1.07;
            return ret;
        }

        if((from.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunite)) && to.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitp)))){
            //if((from.equals("Euros")) &&(to.equals("Pounds"))){
            double ret = input*0.85;
            return ret;
        }

        if((from.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunite)) && to.equals(currency.getInstance().getApplicationContext().getResources().getString(R.string.currencyunitdi)))){
            //if((from.equals("Euros")) &&(to.equals("Dinar"))){
            double ret = input*0.33;
            return ret;
        }

        if(from.equals(to)){
            Context context = currency.getInstance().getApplicationContext();
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
