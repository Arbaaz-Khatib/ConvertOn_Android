package com.example.fahad.converton;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

/**
 * Created by Fahad on 2/13/2017.
 */
public class LengthStrategy implements Strategy {
    public double Convert(String from, String to, double input) {
        // TODO Auto-generated method stub

        //Application app = UnitConverter.StrategyClass
        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitkm)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitmile)))){
            //if((from.equals("km")) && (to.equals("mile"))){
            double ret = 0.62137*input;
            return ret;
        }
        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitmile)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitkm)))){
            //if((from.equals("mile")) && (to.equals("km"))){
            double ret = 1.60934*input;
            return ret;
        }

        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitmile)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitm)))){
            //if((from.equals("mile")) && (to.equals("m"))){
            double ret = 1609.34*input;
            return ret;
        }

        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitm)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitmile)))){
            //if((from.equals("m")) && (to.equals("mile"))){
            double ret = input/1609.34;
            return ret;
        }

        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitmile)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitcm)))){
            //if((from.equals("mile")) && (to.equals("cm"))){
            double ret = 160934*input;
            return ret;
        }

        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitcm)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitmile)))){
            //if((from.equals("cm")) && (to.equals("mile"))){
            double ret = input/160934;
            return ret;
        }

        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitmile)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitmm)))){
            //if((from.equals("mile")) && (to.equals("mm"))){
            double ret = input*1609340;
            return ret;
        }

        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitmm)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitmile)))){
            //if((from.equals("mm")) && (to.equals("mile"))){
            double ret = input/1609340;
            return ret;
        }

        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitmile)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitinch)))){
            //if ((from.equals("mile")) && (to.equals("inch"))){
            double ret = 63360*input;
            return ret;
        }

        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitinch)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitmile)))){
            //if ((from.equals("inch")) && (to.equals("mile"))){
            double ret = input/63360;
            return ret;
        }


        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitmile)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitfeet)))){
            //if((from.equals("mile")) && (to.equals("ft"))){
            double ret = 5280*input;
            return ret;
        }

        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitfeet)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitmile)))){
            //if((from.equals("ft")) && (to.equals("mile"))){
            double ret = input/5280;
            return ret;
        }


        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitkm)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitm)))){
            //if ((from.equals("km")) && (to.equals("m"))){
            double ret = input*1000;
            return ret;
        }

        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitm)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitkm)))){
            //if((from.equals("m")) && (to.equals("km"))){
            double ret = 0.001*input;
            return ret;
        }

        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitkm)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitcm)))){
            //if((from.equals("km")) && (to.equals("cm"))){
            double ret = 100000*input;
            return ret;
        }

        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitcm)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitkm)))){
            //if((from.equals("cm")) && (to.equals("km"))){
            double ret = input/100000;
            return ret;
        }

        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitkm)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitmm)))){
            //if((from.equals("km")) && (to.equals("mm"))){
            double ret = 1000000*input;
            return ret;
        }


        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitmm)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitkm)))){
            //if((from.equals("mm")) && (to.equals("km"))){
            double ret = input/1000000;
            return ret;
        }


        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitkm)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitfeet)))){
            //if((from.equals("km")) && (to.equals("ft"))){
            double ret = input*3280.84;
            return ret;
        }

        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitfeet)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitkm)))){
            //if((from.equals("ft")) && (to.equals("km"))){
            double ret = input/3280.84;
            return ret;
        }

        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitkm)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitinch)))){
            //if((from.equals("km")) && (to.equals("inch"))){
            double ret = input*39370.1;
            return ret;
        }

        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitinch)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitkm)))){
            //if((from.equals("inch")) && (to.equals("km"))){
            double ret = input/39370.1;
            return ret;
        }


        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitm)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitcm)))){
            //if((from.equals("m")) && (to.equals("cm"))){
            double ret = 100*input;
            return ret;
        }

        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitcm)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitm)))){
            //if((from.equals("cm")) && (to.equals("m"))){
            double ret = input/100;
            return ret;
        }


        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitm)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitmm)))){
            //if((from.equals("m")) && (to.equals("mm"))){
            double ret = 1000*input;
            return ret;
        }

        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitmm)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitm)))){
            //if((from.equals("mm")) && (to.equals("m"))){
            double ret = input/1000;
            return ret;
        }


        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitm)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitinch)))){
            //if((from.equals("m")) && (to.equals("inch"))){
            double ret = 100*input/2.54;
            return ret;
        }


        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitinch)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitm)))){
            //if((from.equals("inch")) && (to.equals("m"))){
            double ret = 2.54*input/100;
            return ret;
        }

        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitm)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitfeet)))){
            //if((from.equals("m")) && (to.equals("ft"))){
            double ret = input*3.28084;
            return ret;
        }

        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitfeet)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitm)))){
            //if((from.equals("ft")) && (to.equals("m"))){
            double ret = input/3.28084;
            return ret;
        }

        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitcm)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitmm)))){
            //if((from.equals("cm")) && (to.equals("mm"))){
            double ret = 10*input;
            return ret;
        }

        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitmm)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitcm)))){
            //if((from.equals("mm")) && (to.equals("cm"))){
            double ret = input/10;
            return ret;
        }

        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitinch)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitcm)))){
            //if((from.equals("inch")) && (to.equals("cm"))){
            double ret = 2.54*input;
            return ret;
        }

        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitcm)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitinch)))){
            //if((from.equals("cm")) && (to.equals("inch"))){
            double ret = input/2.54;
            return ret;
        }

        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitcm)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitfeet)))){
            //if((from.equals("cm")) && (to.equals("ft"))){
            double ret = input*0.03281;
            return ret;
        }

        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitfeet)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitcm)))){
            //if((from.equals("ft")) && (to.equals("cm"))){
            double ret = input*30.48;
            return ret;
        }

        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitmm)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitfeet)))){
            //if((from.equals("mm")) && (to.equals("ft"))){
            double ret = 0.00328*input;
            return ret;
        }


        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitfeet)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitmm)))){
            //if((from.equals("ft")) && (to.equals("mm"))){
            double ret = input*304.8;
            return ret;
        }

        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitmm)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitinch)))){
            //if((from.equals("mm")) && (to.equals("inch"))){
            double ret = input/25.4;
            return ret;
        }

        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitinch)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitmm)))){
            //if((from.equals("inch")) && (to.equals("mm"))){
            double ret = input*25.4;
            return ret;
        }

        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitfeet)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitinch)))){
            //if((from.equals("ft")) && (to.equals("inch"))){
            double ret = 12*input;
            return ret;
        }

        if((from.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitinch)) && to.equals(length.getInstance().getApplicationContext().getResources().getString(R.string.lengthunitfeet)))){
            //if((from.equals("inch")) && (to.equals("ft"))){
            double ret = input/12;
            return ret;
        }
        if(from.equals(to)){
            Context context = length.getInstance().getApplicationContext();
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



