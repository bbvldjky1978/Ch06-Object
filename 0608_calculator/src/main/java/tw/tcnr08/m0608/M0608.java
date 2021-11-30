package tw.tcnr08.m0608;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class M0608 extends AppCompatActivity {

    private Button b001, b002, b003, b004, b005;
    private Button b006, b007, b008, b009, b000, b010;
    private Button b011, b012, b013, b014, b015;
    private TextView num1;
    private TextView ans01;

    private double nn;
    private String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0608);
        setupviewcompmnet();
    }

    private void setupviewcompmnet() {

        b000 = (Button) findViewById(R.id.m0608_b000);
        b001 = (Button) findViewById(R.id.m0608_b001);
        b002 = (Button) findViewById(R.id.m0608_b002);
        b003 = (Button) findViewById(R.id.m0608_b003);
        b004 = (Button) findViewById(R.id.m0608_b004);
        b005 = (Button) findViewById(R.id.m0608_b005);
        b006 = (Button) findViewById(R.id.m0608_b006);
        b007 = (Button) findViewById(R.id.m0608_b007);
        b008 = (Button) findViewById(R.id.m0608_b008);
        b009 = (Button) findViewById(R.id.m0608_b009);
        b010 = (Button) findViewById(R.id.m0608_b010);

        b011 = (Button) findViewById(R.id.m0608_b011);
        b012 = (Button) findViewById(R.id.m0608_b012);
        b013 = (Button) findViewById(R.id.m0608_b013);
        b014 = (Button) findViewById(R.id.m0608_b014);

        b015 = (Button) findViewById(R.id.m0608_b015);

        b000.setOnClickListener(b001On);
        b001.setOnClickListener(b001On);
        b002.setOnClickListener(b001On);
        b003.setOnClickListener(b001On);
        b004.setOnClickListener(b001On);
        b005.setOnClickListener(b001On);
        b006.setOnClickListener(b001On);
        b007.setOnClickListener(b001On);
        b008.setOnClickListener(b001On);
        b009.setOnClickListener(b001On);
        b010.setOnClickListener(b001On);

        b011.setOnClickListener(b002On);
        b012.setOnClickListener(b002On);
        b013.setOnClickListener(b002On);
        b014.setOnClickListener(b002On);

        b015.setOnClickListener(b003On);
        num1 = (TextView) findViewById(R.id.m0608_t001);
        ans01 = (TextView) findViewById(R.id.m0608_t002);


    }

    private View.OnClickListener b001On = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String keyin = num1.getText().toString();

            switch (v.getId()) {
                case R.id.m0608_b000:
                    num1.setText(keyin + "0");
                    break;
                case R.id.m0608_b001:
                    num1.setText(keyin + "1");
                    break;
                case R.id.m0608_b002:
                    num1.setText(keyin + "2");
                    break;
                case R.id.m0608_b003:
                    num1.setText(keyin + "3");
                    break;
                case R.id.m0608_b004:
                    num1.setText(keyin + "4");
                    break;
                case R.id.m0608_b005:
                    num1.setText(keyin + "5");
                    break;
                case R.id.m0608_b006:
                    num1.setText(keyin + "6");
                    break;
                case R.id.m0608_b007:
                    num1.setText(keyin + "7");
                    break;
                case R.id.m0608_b008:
                    num1.setText(keyin + "8");
                    break;
                case R.id.m0608_b009:
                    num1.setText(keyin + "9");
                    break;
                case R.id.m0608_b010:
                    num1.setText(keyin + ".");
                    break;
            }
//            num1.setText(keyin);  不能在這顯示
        }
    };

    private View.OnClickListener b002On = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

//            num1.setText(""); //清空白
            try {
                nn = Double.parseDouble(num1.getText().toString());
            } catch (Exception e) {  //  (條件 e 是變數)
                Toast.makeText(getApplicationContext(), getText(R.string.error), Toast.LENGTH_SHORT).show();
            }

            switch (v.getId()) {
                case R.id.m0608_b011:
                    s = "P";
                    break;
                case R.id.m0608_b012:
                    s = "M";
                    break;
                case R.id.m0608_b013:
                    s = "X";
                    break;
                case R.id.m0608_b014:
                    s = "D";
                    break;
            }
            num1.setText("");
        }
    };

    private View.OnClickListener b003On = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (num1.getText().toString().trim().length() != 0) {
                double n2 = Double.parseDouble(num1.getText().toString());
                DecimalFormat nf = new DecimalFormat("0.00000");

                if (s.equals("P")) ans01.setText(nf.format(nn + n2));
                if (s.equals("M")) ans01.setText(nf.format(nn - n2));
                if (s.equals("X")) ans01.setText(nf.format(nn * n2));
                if (s.equals("D")) ans01.setText(nf.format(nn / n2));

                num1.setText("");
                nn = 0;
            } else {
                Toast.makeText(getApplicationContext(), getText(R.string.m0608_error), Toast.LENGTH_SHORT).show();
            }
        }
    };
}