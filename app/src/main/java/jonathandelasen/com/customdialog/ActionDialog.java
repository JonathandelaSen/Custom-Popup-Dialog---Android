package jonathandelasen.com.customdialog;

import android.app.Activity;
import android.app.Dialog;
import android.support.annotation.StringRes;
import android.view.Window;
import android.widget.TextView;

public class ActionDialog {

    private TextView tvTitle;
    private TextView tvSubtitle;
    private TextView tvAction;


    private Activity activity;
    private Dialog dialog;


    public ActionDialog(@StringRes int title, @StringRes int subtitle, @StringRes int action, Activity activity) {
        this.activity = activity;

        setDialog();
        findViews();
        setData(title, subtitle, action);
    }




    public void showDialog(){
        dialog.show();
    }

    public void dismiss(){
        dialog.dismiss();
    }



    private void setDialog() {
        dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.custom_dialog);
    }

    private void findViews(){
        tvTitle = dialog.findViewById(R.id.tv_title);
        tvSubtitle = dialog.findViewById(R.id.tv_subtitle);
        tvAction = dialog.findViewById(R.id.tv_action);
    }

    private void setData(int title, int subtitle, int action) {
        tvTitle.setText(title);
        tvSubtitle.setText(subtitle);
        tvAction.setText(action);
    }


}
