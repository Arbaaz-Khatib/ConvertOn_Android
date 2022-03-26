package com.example.fahad.converton;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

/**
 * Created by Fahad on 2/16/2017.
 */

public class WeightStrategy implements Strategy{

    public double Convert(String from, String to, double input) {
            // TODO Auto-generated method stub

            if((from.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitkg)) && to.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitgm)))){
                //if((from.equals("Kg")) && (to.equals("gm"))){
                double ret = (double)(1000*input);
                return ret;
            }


            if((from.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitgm)) && to.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitkg)))){
                //if((from.equals("gm")) && (to.equals("Kg"))){
                double ret = (double)(input/1000);
                return ret;
            }

            if((from.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitkg)) && to.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitlb)))){
                //if((from.equals("Kg")) && (to.equals("lb"))){
                double ret = 2.2046*input;
                return ret;
            }

            if((from.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitlb)) && to.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitkg)))){
                //if((from.equals("lb")) && (to.equals("Kg"))){
                double ret = 0.454*input;
                return ret;
            }

            if((from.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitkg)) && to.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitounce)))){
                //if((from.equals("Kg")) && (to.equals("ounce"))){
                double ret = input*35.27396;
                return ret;
            }

            if((from.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitounce)) && to.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitkg)))){
                //if((from.equals("ounce")) && (to.equals("Kg"))){
                double ret = input*0.02835;
                return ret;
            }

            if((from.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitkg)) && to.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitmg)))){
                //if((from.equals("Kg")) && (to.equals("mg"))){
                double ret = input*1000000;
                return ret;
            }

            if((from.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitmg)) && to.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitkg)))){
                //if((from.equals("mg")) && (to.equals("Kg"))){
                double ret = input/1000000;
                return ret;
            }


            if((from.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitgm)) && to.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitlb)))){
                //if((from.equals("gm")) && (to.equals("lb"))){
                double ret = 0.0022*input;
                return ret;
            }

            if((from.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitlb)) && to.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitgm)))){
                //if((from.equals("lb")) && (to.equals("gm"))){
                double ret = 453.6*input;
                return ret;
            }

            if((from.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitgm)) && to.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitmg)))){
                //if((from.equals("gm")) && (to.equals("mg"))){
                double ret = input*1000;
                return ret;
            }

            if((from.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitmg)) && to.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitgm)))){
                //if((from.equals("mg")) && (to.equals("gm"))){
                double ret = input/1000;
                return ret;
            }

            if((from.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitgm)) && to.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitounce)))){
                //if((from.equals("gm")) && (to.equals("ounce"))){
                double ret = input*0.03527;
                return ret;
            }

            if((from.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitounce)) && to.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitgm)))){
                //if((from.equals("ounce")) && (to.equals("gm"))){
                double ret = input*28.34952;
                return ret;
            }

            if((from.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitlb)) && to.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitmg)))){
                //if((from.equals("lb")) && (to.equals("mg"))){
                double ret = input*453592.37;
                return ret;
            }

            if((from.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitmg)) && to.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitlb)))){
                //if((from.equals("mg")) && (to.equals("lb"))){
                double ret = input/453592.37;
                return ret;
            }

            if((from.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitounce)) && to.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitmg)))){
                //if((from.equals("ounce")) && (to.equals("mg"))){
                double ret = input*28349.52313;
                return ret;
            }


            if((from.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitmg)) && to.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitounce)))){
                //if((from.equals("mg")) && (to.equals("ounce"))){
                double ret = input/28349;
                return ret;
            }

            if((from.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitlb)) && to.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitounce)))){
                //if((from.equals("lb")) && (to.equals("ounce"))){
                double ret = 16*input;
                return ret;
            }

            if((from.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitounce)) && to.equals(weight.getInstance().getApplicationContext().getResources().getString(R.string.weightunitlb)))){
                //if ((from.equals("ounce")) && (to.equals("lb"))){
                double ret = input/16;
                return ret;
            }
            if(from.equals(to)){
                Context context = weight.getInstance().getApplicationContext();
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

