package com.example.rianto.moviee.activity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

import com.example.rianto.moviee.R;

/**
 * Created by rianto on 1/29/2018.
 */

public class AlertDialogManager  {

    public void showAlertDialog(Context context, String title, String message,
                                Boolean status) {
        AlertDialog alertDialog = new AlertDialog.Builder(context).create();
        alertDialog.setTitle(title);
        alertDialog.setMessage(message);
        if(status != null)
            alertDialog.setIcon((status) ? R.mipmap.bell : R.mipmap.bell);
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        alertDialog.show();
    }
}


