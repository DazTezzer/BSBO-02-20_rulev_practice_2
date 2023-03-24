package ru.mirea.rulev.control_lesson2;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
public class MyProgresDialogFragment {
    public MyProgresDialogFragment(Context context) {
        ProgressDialog pd = new ProgressDialog(context);
        pd.setTitle("Loading");
        pd.setMessage("Message");
        pd.setButton(Dialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        pd.show();
    }
}
