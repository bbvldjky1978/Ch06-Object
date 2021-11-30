package tw.tcnr08.m0603;

import android.graphics.Color;
import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class M0603 extends AppCompatActivity {

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
    private MediaPlayer startmusic;
    private MediaPlayer mediavctory;
    private MediaPlayer mediahaha;
    private MediaPlayer medialose;
    private MediaPlayer mediagoodnight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0603);
        setupviewcomponent();
    }

    private void setupviewcomponent() {

        bntscissor = (ImageButton) findViewById(R.id.m0603_b001);
        bntstone = (ImageButton) findViewById(R.id.m0603_b002);
        bntnet = (ImageButton) findViewById(R.id.m0603_b003);
        t004 = (ImageView) findViewById(R.id.m0603_t004);
        t005 = (TextView) findViewById(R.id.m0603_t005);
        t006 = (TextView) findViewById(R.id.m0603_t006);

        bntscissor.setOnClickListener(b001On);
        bntnet.setOnClickListener(b001On);
        bntstone.setOnClickListener(b001On);

//        // --開啟片頭音樂-----
//        startmusic = MediaPlayer.create(getApplication(), R.raw.guess);
//        startmusic.start();

        startmusic = MediaPlayer.create(getApplication(), R.raw.guess);
        startmusic.start();  //開機播放音樂

        mediavctory = MediaPlayer.create(getApplication(), R.raw.vctory);
        mediahaha = MediaPlayer.create(getApplication(), R.raw.haha);
        medialose = MediaPlayer.create(getApplication(), R.raw.lose);
        mediagoodnight=MediaPlayer.create(getApplication(),R.raw.goodnight);


    }


    private View.OnClickListener b001On = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int icomp = (int) (Math.random() * 3 + 1);


            switch (v.getId()) {
                case R.id.m0603_b001://玩家選剪刀
                    u_selec = getString(R.string.m0603_s001) + " " + getString(R.string.m0603_b001);
                    switch (icomp) {
                        case 1://電腦出剪刀

                            t004.setImageResource(R.drawable.scissors);
//                            answ = getString(R.string.m0603_f003);
//                            t006.setTextColor(Color.YELLOW);
                            music(1);
                            break;
                        case 2://電腦出石頭
                            t004.setImageResource(R.drawable.stone);
//                            answ = getString(R.string.m0603_f002);
//                            t006.setTextColor(Color.RED);
                            music(3);

                            break;
                        case 3://電腦出布
                            t004.setImageResource(R.drawable.net);
//                            answ = getString(R.string.m0603_f001);
//                            t006.setTextColor(Color.GREEN);
                            music(2);

                            break;
                    }
                    break;


                case R.id.m0603_b002://玩家選石頭
                    u_selec = getString(R.string.m0603_s001) + " " + getString(R.string.m0603_b002);
                    switch (icomp) {
                        case 1://電腦出剪刀

                            t004.setImageResource(R.drawable.scissors);
//                            answ = getString(R.string.m0603_f001);
//                            t006.setTextColor(Color.GREEN);
                            music(2);

                            break;
                        case 2://電腦出石頭
                            t004.setImageResource(R.drawable.stone);
//                            answ = getString(R.string.m0603_f003);
//                            t006.setTextColor(Color.YELLOW);
                            music(1);

                            break;
                        case 3://電腦出布
                            t004.setImageResource(R.drawable.net);
//                            answ = getString(R.string.m0603_f002);
//                            t006.setTextColor(Color.RED);
                            music(3);

                            break;
                    }
                    break;


                case R.id.m0603_b003://玩家選布
                    u_selec = getString(R.string.m0603_s001) + " " + getString(R.string.m0603_b003);

                    switch (icomp) {
                        case 1://電腦出剪刀

                            t004.setImageResource(R.drawable.scissors);
//                            answ = getString(R.string.m0603_f002);
//                            t006.setTextColor(Color.RED);
                            music(3);

                            break;
                        case 2://電腦出石頭
                            t004.setImageResource(R.drawable.stone);
//                            answ = getString(R.string.m0603_f001);
//                            t006.setTextColor(Color.GREEN);
                            music(2);

                            break;
                        case 3://電腦出布
                            t004.setImageResource(R.drawable.net);
//                            answ = getString(R.string.m0603_f003);
//                            t006.setTextColor(Color.YELLOW);
                            music(1);

                            break;
                    }
                    break;

            }
//        ----------------------------------結果
            t005.setText(u_selec);
            t006.setText(answ);
        }
    };

    private void music(int i) {//1.贏  2. 輸  3. 平手
        if (startmusic.isPlaying()) startmusic.stop();
        if (mediahaha.isPlaying()) mediahaha.stop();
        if (mediavctory.isPlaying()) mediavctory.stop();
        if (medialose.isPlaying()) medialose.stop();

        switch (i) {
            case 1:
                mediavctory.start();
                t006.setTextColor(Color.GREEN);
                answ = getString(R.string.m0603_f001);
                break;
            case 2:
                medialose.start();
                t006.setTextColor(Color.RED);
                answ = getString(R.string.m0603_f002);
                break;
            case 3:
                mediahaha.start();
                t006.setTextColor(Color.YELLOW);
                answ = getString(R.string.m0603_f003);
                break;
            case 4:
            mediagoodnight.start();
                    break;
        }
    }





    @Override
    protected void onStop() {  //退出時啟動音樂
        super.onStop();
        if (mediagoodnight.isPlaying()) mediagoodnight.stop();


        this.finish();
        if (mediagoodnight.isPlaying()) mediagoodnight.stop();
        music(4);

    }

    @Override
    public void onBackPressed() {  //右上角退出時停止
        super.onBackPressed();

        this.finish();

    }

//    @Override
//    protected void onStart() {  //退出時播放音樂
//        super.onStart();
//        if (startmusic.isPlaying()) startmusic.stop();
//    }

//    @Override
//    protected void onDestroy() {  //退出時停止
//        super.onDestroy();
//         if (startmusic.isPlaying()) startmusic.stop();
//
//    }
}