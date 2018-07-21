package m.srinivas.practice;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class AlertDialogAnimation_Example extends Activity {
TextView myhellow_txt;
    Animation shake;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        myhellow_txt  = (TextView) findViewById(R.id.myhellow_txt);
        shake = AnimationUtils.loadAnimation(AlertDialogAnimation_Example.this, R.anim.shake_anim);
        myhellow_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myhellow_txt.startAnimation(shake);
                showalert("good",AlertDialogAnimation_Example.this);
            }
        });

    }

    public static void showalert(String alert_msg, Context context) {
        final android.app.AlertDialog.Builder alertDialogBuilder = new android.app.AlertDialog.Builder(context,R.style.PauseDialog);
        alertDialogBuilder.setTitle("Weather");

        // alertDialogBuilder.setIcon(R.drawable.aplogo);
        // set dialog message
        alertDialogBuilder.setMessage(alert_msg).setCancelable(false)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {

                    }
                });
        alertDialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        // create alert dialog
        android.app.AlertDialog alertDialog = alertDialogBuilder.create();
        // show it
        alertDialog.show();

    }
}
