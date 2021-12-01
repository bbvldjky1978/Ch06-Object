package tw.tcnr08.m0608;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class M0608 extends AppCompatActivity {

//    private CheckBox chb01, chb02, chb03, chb04;
//    private CheckBox chb05, chb06, chb07, chb08;
//    private CheckBox chb09, chb10, chb11, chb12;
//    private CheckBox chb13, chb14, chb15, chb16;
//    private CheckBox chb17, chb18, chb19, chb020;
    private Button b001;
    private TextView t001;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0608);

        setupviewcomponent();
    }

    private void setupviewcomponent() {
//        chb01 = (CheckBox) findViewById(R.id.m0608_chb01);
//        chb02 = (CheckBox) findViewById(R.id.m0608_chb02);
//        chb03 = (CheckBox) findViewById(R.id.m0608_chb03);
//        chb04 = (CheckBox) findViewById(R.id.m0608_chb04);
//        chb05 = (CheckBox) findViewById(R.id.m0608_chb05);
//        chb06 = (CheckBox) findViewById(R.id.m0608_chb06);
//        chb07 = (CheckBox) findViewById(R.id.m0608_chb07);
//        chb08 = (CheckBox) findViewById(R.id.m0608_chb08);
//        chb09 = (CheckBox) findViewById(R.id.m0608_chb09);
//        chb10 = (CheckBox) findViewById(R.id.m0608_chb10);
//        chb11= (CheckBox) findViewById(R.id.m0608_chb11);
//        chb12= (CheckBox) findViewById(R.id.m0608_chb12);
//        chb13= (CheckBox) findViewById(R.id.m0608_chb13);
//        chb14= (CheckBox) findViewById(R.id.m0608_chb14);
//        chb15= (CheckBox) findViewById(R.id.m0608_chb15);
//        chb16= (CheckBox) findViewById(R.id.m0608_chb16);
//        chb17= (CheckBox) findViewById(R.id.m0608_chb17);
//        chb18= (CheckBox) findViewById(R.id.m0608_chb18);
//        chb19 = (CheckBox) findViewById(R.id.m0608_chb19);
//        chb020= (CheckBox) findViewById(R.id.m0608_chb20);

        b001 = (Button) findViewById(R.id.m0608_b001);
        t001 = (TextView) findViewById(R.id.m0608_t001);

        b001.setOnClickListener(b001On);

    }

    private View.OnClickListener b001On = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

//----------------完成ok       1.先設定輸出ans01 2.再設定輸出ans01從那裏來的    3.設定答案抓取公式------------------------------
//            String ans01=getString(R.string.m0608_t001);  //2.再設定輸出ans01從那裏來的
//
//            if (chb01.isChecked())ans01+=chb01.getText().toString()+" ";  //3.設定答案抓取公式
//            if (chb02.isChecked())ans01+=chb02.getText().toString()+" ";
//            if (chb03.isChecked())ans01+=chb03.getText().toString()+" ";
//            if (chb04.isChecked())ans01+=chb04.getText().toString()+" ";
//
//            t001.setText(ans01);   //1.先設定輸出ans01


            String ans01 = getString(R.string.m0608_txt01) + "\n";

            for (int i = 1; i < 21; i++) {

                String rid = "m0608_chb" + String.format("%02d", i);
                int resid = getResources().getIdentifier(rid, "id", getPackageName());
                CheckBox btn = ((CheckBox) findViewById(resid));
                if (btn.isChecked()) ans01 += btn.getText().toString() + " ";


//            if (chb01.isChecked())ans01+=chb01.getText().toString()+" ";
//            if (chb02.isChecked())ans01+=chb02.getText().toString()+" ";
//            if (chb03.isChecked())ans01+=chb03.getText().toString()+" ";
//            if (chb04.isChecked())ans01+=chb04.getText().toString()+" ";
//            if (chb05.isChecked())ans01+=chb05.getText().toString()+" ";
//            if (chb06.isChecked())ans01+=chb06.getText().toString()+" ";
//            if (chb07.isChecked())ans01+=chb07.getText().toString()+" ";
//            if (chb08.isChecked())ans01+=chb08.getText().toString()+" ";
//            if (chb09.isChecked())ans01+=chb09.getText().toString()+" ";
//            if (chb10.isChecked())ans01+=chb10.getText().toString()+" ";
//            if (chb11.isChecked())ans01+=chb11.getText().toString()+" ";
//            if (chb12.isChecked())ans01+=chb12.getText().toString()+" ";
//            if (chb13.isChecked())ans01+=chb13.getText().toString()+" ";
//            if (chb14.isChecked())ans01+=chb14.getText().toString()+" ";
//            if (chb15.isChecked())ans01+=chb15.getText().toString()+" ";
//            if (chb16.isChecked())ans01+=chb16.getText().toString()+" ";
//            if (chb17.isChecked())ans01+=chb17.getText().toString()+" ";
//            if (chb18.isChecked())ans01+=chb18.getText().toString()+" ";
//            if (chb19.isChecked())ans01+=chb19.getText().toString()+" ";
//            if (chb020.isChecked())ans01+=chb020.getText().toString()+" ";

                t001.setText(ans01);
            }
        }

        ;

    };
}