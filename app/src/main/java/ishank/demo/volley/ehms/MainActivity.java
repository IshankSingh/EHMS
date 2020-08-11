package ishank.demo.volley.ehms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText searchET;
    TextView searchMsgTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchET = findViewById(R.id.patient_id);
        searchMsgTV = findViewById(R.id.patient_search_msg_TV);
        searchMsgTV.setVisibility(View.GONE);

        // write your processing code here

        searchET.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                final int DRAWABLE_RIGHT = 2;

                if(event.getAction() == MotionEvent.ACTION_UP) {
                    if(event.getRawX() >= (searchET.getRight() - searchET.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                        // your action here
                        check();

                        return true;
                    }
                }
                return false;
            }
        });

        searchET.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEND || actionId == EditorInfo.IME_ACTION_DONE
                        || actionId == EditorInfo.IME_ACTION_SEARCH) {
                    check();

                    return true;
                }
                return false;
            }
        });
    }

    @Override
    public void onClick(View v) {

    }

    public void check() {
        String patientId = searchET.getText().toString();
        patientId = patientId.toUpperCase().trim();
        if (patientId.equals("JOHN123") || patientId.equals("ERICA123")) {
            Intent intent = new Intent(this, PatientDetail.class);
            intent.putExtra("patientId", patientId);
            startActivity(intent);
        }else {
            searchMsgTV.setVisibility(View.VISIBLE);
            searchMsgTV.setText("This patient does not exit! Please check and enter again.");
        }

    }
}