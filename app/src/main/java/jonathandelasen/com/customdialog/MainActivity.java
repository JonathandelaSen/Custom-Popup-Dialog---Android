package jonathandelasen.com.customdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    private CardView cv1;
    private ActionDialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        setListeners();
    }

    private void findViews() {
        cv1 = findViewById(R.id.cv_feature1);
    }

    private void setListeners() {
        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog = new ActionDialog(R.string.title_no_location_dialog,
                        R.string.subtitle_no_location_dialog, R.string.understood_label, MainActivity.this);
                dialog.showDialog();
            }
        });
    }
}
