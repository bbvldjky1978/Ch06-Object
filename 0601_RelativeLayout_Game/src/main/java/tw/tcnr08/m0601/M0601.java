package tw.tcnr08.m0601;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class M0601 extends AppCompatActivity {

    private Button bntscissor, bntnet;
    private TextView t005, t006;
    private Button bntstone;
    private TextView t004;
    private String u_selec;
    private String answ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0601);
        setupviewcomponent();
    }

    private void setupviewcomponent() {

        bntscissor = (Button) findViewById(R.id.m0601_b001);
        bntstone = (Button) findViewById(R.id.m0601_b002);
        bntnet = (Button) findViewById(R.id.m0601_b003);
        t004 = (TextView) findViewById(R.id.m0601_t004);
        t005 = (TextView) findViewById(R.id.m0601_t005);
        t006 = (TextView) findViewById(R.id.m0601_t006);

        bntscissor.setOnClickListener(b001On);
        bntnet.setOnClickListener(b001On);
        bntstone.setOnClickListener(b001On);

    }


    private View.OnClickListener b001On = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int icomp = (int) (Math.random() * 3 + 1);


            switch (v.getId()) {
                case R.id.m0601_b001://玩家選剪刀
                    u_selec = getString(R.string.m0601_s001) + " " + getString(R.string.m0601_b001);
                    switch (icomp) {
                        case 1://電腦出剪刀

                            t004.setText(R.string.m0601_b001);
                            answ = getString(R.string.m0601_f003);
                            break;
                        case 2://電腦出石頭
                            t004.setText(R.string.m0601_b002);
                            answ = getString(R.string.m0601_f002);

                            break;
                        case 3://電腦出布
                            t004.setText(R.string.m0601_b003);
                            answ = getString(R.string.m0601_f001);

                            break;
                    }
                    break;


                case R.id.m0601_b002://玩家選石頭
                    u_selec = getString(R.string.m0601_s001) + " " + getString(R.string.m0601_b002);
                    switch (icomp) {
                        case 1://電腦出剪刀

                            t004.setText(R.string.m0601_b001);
                            answ = getString(R.string.m0601_f001);
                            break;
                        case 2://電腦出石頭
                            t004.setText(R.string.m0601_b002);
                            answ = getString(R.string.m0601_f003);

                            break;
                        case 3://電腦出布
                            t004.setText(R.string.m0601_b003);
                            answ = getString(R.string.m0601_f002);

                            break;
                    }
                    break;


                case R.id.m0601_b003://玩家選布
                    u_selec = getString(R.string.m0601_s001) + " " + getString(R.string.m0601_b003);

                    switch (icomp) {
                        case 1://電腦出剪刀

                            t004.setText(R.string.m0601_b001);
                            answ = getString(R.string.m0601_f002);
                            break;
                        case 2://電腦出石頭
                            t004.setText(R.string.m0601_b002);
                            answ = getString(R.string.m0601_f001);

                            break;
                        case 3://電腦出布
                            t004.setText(R.string.m0601_b003);
                            answ = getString(R.string.m0601_f003);

                            break;
                    }
                    break;

            }
//        ----------------------------------結果
            t005.setText(u_selec);
            t006.setText(answ);
        }
    };
}