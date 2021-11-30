package tw.tcnr08.m0602;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class M0602 extends AppCompatActivity {

//    private Button bntscissor, bntnet;
    private TextView t005, t006;
//    private Button bntstone;
//    private TextView t004;
    private String u_selec;
    private String answ;
    private ImageButton bntscissor;
    private ImageButton bntstone;
    private ImageButton bntnet;
    private ImageView t004;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0602);
        setupviewcomponent();
    }

    private void setupviewcomponent() {

        bntscissor = (ImageButton) findViewById(R.id.m0602_b001);
        bntstone = (ImageButton) findViewById(R.id.m0602_b002);
        bntnet = (ImageButton) findViewById(R.id.m0602_b003);
        t004 = (ImageView) findViewById(R.id.m0602_t004);
        t005 = (TextView) findViewById(R.id.m0602_t005);
        t006 = (TextView) findViewById(R.id.m0602_t006);

        bntscissor.setOnClickListener(b001On);
        bntnet.setOnClickListener(b001On);
        bntstone.setOnClickListener(b001On);

    }


    private View.OnClickListener b001On = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int icomp = (int) (Math.random() * 3 + 1);


            switch (v.getId()) {
                case R.id.m0602_b001://玩家選剪刀
                    u_selec = getString(R.string.m0602_s001) + " " + getString(R.string.m0602_b001);
                    switch (icomp) {
                        case 1://電腦出剪刀

                            t004.setImageResource(R.drawable.scissors);
                            answ = getString(R.string.m0602_f003);
                            t006.setTextColor(Color.YELLOW);
                            break;
                        case 2://電腦出石頭
                            t004.setImageResource(R.drawable.stone);
                            answ = getString(R.string.m0602_f002);
                            t006.setTextColor(Color.RED);

                            break;
                        case 3://電腦出布
                            t004.setImageResource(R.drawable.net);
                            answ = getString(R.string.m0602_f001);
                            t006.setTextColor(Color.GREEN);

                            break;
                    }
                    break;


                case R.id.m0602_b002://玩家選石頭
                    u_selec = getString(R.string.m0602_s001) + " " + getString(R.string.m0602_b002);
                    switch (icomp) {
                        case 1://電腦出剪刀

                            t004.setImageResource(R.drawable.scissors);
                            answ = getString(R.string.m0602_f001);
                            t006.setTextColor(Color.GREEN);

                            break;
                        case 2://電腦出石頭
                            t004.setImageResource(R.drawable.stone);
                            answ = getString(R.string.m0602_f003);
                            t006.setTextColor(Color.YELLOW);

                            break;
                        case 3://電腦出布
                            t004.setImageResource(R.drawable.net);
                            answ = getString(R.string.m0602_f002);
                            t006.setTextColor(Color.RED);

                            break;
                    }
                    break;


                case R.id.m0602_b003://玩家選布
                    u_selec = getString(R.string.m0602_s001) + " " + getString(R.string.m0602_b003);

                    switch (icomp) {
                        case 1://電腦出剪刀

                            t004.setImageResource(R.drawable.scissors);
                            answ = getString(R.string.m0602_f002);
                            t006.setTextColor(Color.RED);

                            break;
                        case 2://電腦出石頭
                            t004.setImageResource(R.drawable.stone);
                            answ = getString(R.string.m0602_f001);
                            t006.setTextColor(Color.GREEN);

                            break;
                        case 3://電腦出布
                            t004.setImageResource(R.drawable.net);
                            answ = getString(R.string.m0602_f003);
                            t006.setTextColor(Color.YELLOW);

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