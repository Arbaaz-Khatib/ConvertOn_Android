package com.example.fahad.converton;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

import com.example.fahad.converton.R;
import com.example.fahad.converton.Strategy;
import com.example.fahad.converton.length;


public class VolumeStrategy implements Strategy {

    public double Convert(String from, String to, double input) {
        // TODO Auto-generated method stub


        if((from.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitlitres)) && to.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitmillilitres)))){
            //if((from.equals("litre")) && (to.equals("millilitre"))){
            double ret = input*1000;
            return ret;
        }

        if((from.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitmillilitres)) && to.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitlitres)))){
            //if((from.equals("millilitre")) && (to.equals("litre"))){
            double ret = input/1000;
            return ret;
        }


        if((from.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitlitres)) && to.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubicm)))){
            //if((from.equals("litre")) && (to.equals("cubic m"))){
            double ret = input*0.001;
            return ret;
        }

        if((from.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubicm)) && to.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitlitres)))){
            //if((from.equals("cubic m")) && (to.equals("litre"))){
            double ret = input*1000;
            return ret;
        }

        if((from.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitlitres)) && to.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubiccm)))){
            //if((from.equals("litre")) && (to.equals("cubic cm"))){
            double ret = 1000*input;
            return ret;
        }

        if((from.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubiccm)) && to.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitlitres)))){
            //if((from.equals("cubic cm")) && (to.equals("litre"))){
            double ret = 0.001*input;
            return ret;
        }

        if((from.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitlitres)) && to.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubicmm)))){
            //if((from.equals("litre")) && (to.equals("cubic mm"))){
            double ret = input*1000000;
            return ret;
        }

        if((from.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubicmm)) && to.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitlitres)))){
            //if((from.equals("cubic mm")) && (to.equals("litre"))){
            double ret = input/1000000;
            return ret;
        }

        if((from.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitlitres)) && to.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubicfeet)))){
            //if((from.equals("litre")) && (to.equals("cubic feet"))){
            double ret = input*0.03531;
            return ret;
        }

        if((from.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubicfeet)) && to.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitlitres)))){
            //if((from.equals("cubic feet")) && (to.equals("litre"))){
            double ret = input*28.31685;
            return ret;
        }

        if((from.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubicm)) && to.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubiccm)))){
            //if((from.equals("cubic m")) && (to.equals("cubic cm"))){
            double ret = input*100*100*100;
            return ret;
        }

        if((from.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubiccm)) && to.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubicm)))){
            //if((from.equals("cubic cm")) && (to.equals("cubic m"))){
            double ret = input/1000000;
            return ret;
        }

        if((from.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubicm)) && to.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubicmm)))){
            //if((from.equals("cubic m")) && (to.equals("cubic mm"))){
            double ret = input*1000*1000*1000;
            return ret;
        }

        if((from.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubicmm)) && to.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubicm)))){
            //if((from.equals("cubic mm")) && (to.equals("cubic m"))){
            double ret = input/(1000*1000*1000);
            return ret;
        }

        if((from.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubicm)) && to.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitmillilitres)))){
            //if((from.equals("cubic m")) && (to.equals("millilitre"))){
            double ret = input*1000000;
            return ret;
        }

        if((from.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitmillilitres)) && to.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubicm)))){
            //if((from.equals("millilitre")) && (to.equals("cubic m"))){
            double ret = input/1000000;
            return ret;
        }

        if((from.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubicm)) && to.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubicfeet)))){
            //if((from.equals("cubic m")) && (to.equals("cubic feet"))){
            double ret = input*35.31467;
            return ret;
        }

        if((from.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubicfeet)) && to.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubicm)))){
            //if((from.equals("cubic feet")) && (to.equals("cubic m"))){
            double ret = input/35.31467;
            return ret;
        }

        if((from.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubiccm)) && to.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubicmm)))){
            //if((from.equals("cubic cm")) && (to.equals("cubic mm"))){
            double ret = input*1000;
            return ret;
        }


        if((from.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubicmm)) && to.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubiccm)))){
            //if((from.equals("cubic mm")) && (to.equals("cubic cm"))){
            double ret = input/1000;
            return ret;
        }


        if((from.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubiccm)) && to.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitmillilitres)))){
            //if((from.equals("cubic cm")) && (to.equals("millilitre"))){
            double ret = input;
            return ret;
        }

        if((from.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitmillilitres)) && to.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubiccm)))){
            //if((from.equals("millilitre")) && (to.equals("cubic cm"))){
            double ret = input;
            return ret;
        }

        if((from.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubiccm)) && to.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubicfeet)))){
            //if((from.equals("cubic cm")) && (to.equals("cubic feet"))){
            double ret = input/28316.84659;
            return ret;
        }


        if((from.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubicfeet)) && to.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubiccm)))){
            //if((from.equals("cubic feet")) && (to.equals("cubic cm"))){
            double ret = input*28316.84659;
            return ret;
        }

        if((from.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubicmm)) && to.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitmillilitres)))){
            //if((from.equals("cubic mm")) && (to.equals("millilitre"))){
            double ret = input*0.001;
            return ret;
        }

        if((from.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitmillilitres)) && to.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubicmm)))){
            //if((from.equals("millilitre")) && (to.equals("cubic mm"))){
            double ret = input*1000;
            return ret;
        }


        if((from.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubicmm)) && to.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubicfeet)))){
            //if((from.equals("cubic mm")) && (to.equals("cubic feet"))){
            double ret = input/28316846.592;
            return ret;
        }

        if((from.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubicfeet)) && to.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubicmm)))){
            //if((from.equals("cubic feet")) && (to.equals("cubic mm"))){
            double ret = input*28316846.592;
            return ret;
        }

        if((from.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubicfeet)) && to.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitmillilitres)))){
            //if((from.equals("cubic feet")) && (to.equals("millilitre"))){
            double ret = input*28316.84659;
            return ret;
        }

        if((from.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitmillilitres)) && to.equals(volume.getInstance().getApplicationContext().getResources().getString(R.string.volumeunitcubicfeet)))){
            //if((from.equals("millilitre")) && (to.equals("cubic feet"))){
            double ret = input/28316.84659;
            return ret;
        }
        if(from.equals(to)){
            Context context = volume.getInstance().getApplicationContext();
            CharSequence text = "Same Types Selected";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.BOTTOM| Gravity.CENTER_HORIZONTAL, 0, 20);
            toast.show();
            return input;
        }
        return 0;
    }


}
