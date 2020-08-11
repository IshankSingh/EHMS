package ishank.demo.volley.ehms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PatientDetail extends AppCompatActivity {

    ArrayList<PatientData> gList = new ArrayList<>();
    String [] patientIdList = {"JOHN123", "ERICA123"};
    int [] patientImage = {R.drawable.john, R.drawable.erica};

    TextView nameTV, ageTV, genderTV, dobTV, emailTV, phoneTV, addressTV, presPresTV, presOldTV, medPresTV, medOldTV, appointTV, allergyTV, chronicTV, billTV;
    ImageView patientIV;
    String patientId;
    int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_detail);
        for (String[] s : PatientInfoRaw.patientInfo) {
            gList.add(new PatientData(s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7], s[8], s[9], s[10], s[11], s[12], s[13], s[14]));
        }

        getIntentData();

        // populating the views

        patientIV = findViewById(R.id.patient_image);
        nameTV = findViewById(R.id.patient_name);
        ageTV = findViewById(R.id.patient_age);
        genderTV = findViewById(R.id.patient_gender);
        dobTV = findViewById(R.id.patient_dob);
        emailTV = findViewById(R.id.patient_email);
        phoneTV = findViewById(R.id.patient_phone);
        addressTV = findViewById(R.id.patient_address);
        presPresTV = findViewById(R.id.patient_prescription_present);
        presOldTV = findViewById(R.id.patient_prescription_old);
        medPresTV = findViewById(R.id.patient_medicine_present);
        medOldTV = findViewById(R.id.patient_medicine_old);
        appointTV = findViewById(R.id.patient_appointment);
        allergyTV = findViewById(R.id.patient_allergy);
        chronicTV = findViewById(R.id.patient_chronic);
        billTV = findViewById(R.id.patient_bills);

        fillData();

    }

    private void getIntentData() {
        if(getIntent().hasExtra("patientId")) {
            patientId = getIntent().getStringExtra("patientId");
            if(patientId != null && !patientId.isEmpty()) {
                patientId = patientId.toUpperCase().trim();

                // determining the position of patientDetail if available
                for (int i = 0; i < patientIdList.length; i++) {
                    if (patientId.equals(patientIdList[i])) {
                        pos = i;
                        break;
                    }
                }

                //end of for
            }
            // end of inner if
        }
        // end of outer if
    }

    private void fillData() {
        Log.d("TAG", "fillData: " + pos);
        patientIV.setImageResource(patientImage[pos]);
        nameTV.setText(gList.get(pos).getName());
        ageTV.setText(gList.get(pos).getAge());
        genderTV.setText(gList.get(pos).getGender());
        dobTV.setText(gList.get(pos).getDob());
        emailTV.setText(gList.get(pos).getEmail());
        phoneTV.setText(gList.get(pos).getPhone());
        addressTV.setText(gList.get(pos).getAddress());
        presPresTV.setText(Html.fromHtml(gList.get(pos).getPrescription_present()));
        presOldTV.setText(Html.fromHtml(gList.get(pos).getPrescription_old()));
        medPresTV.setText(Html.fromHtml(gList.get(pos).getMedicine_present()));
        medOldTV.setText(Html.fromHtml(gList.get(pos).getMedicine_old()));
        appointTV.setText(Html.fromHtml(gList.get(pos).getAppointment()));
        allergyTV.setText(Html.fromHtml(gList.get(pos).getAllergies()));
        chronicTV.setText(gList.get(pos).getChronic());
        billTV.setText(Html.fromHtml(gList.get(pos).getBills()));
    }
}