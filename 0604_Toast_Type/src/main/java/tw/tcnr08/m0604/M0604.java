package tw.tcnr08.m0604;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class M0604 extends AppCompatActivity {


    private Button b001,b002,b003,b004;
    private Toast toast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0604);
        setupviewcompment();

    }

    private void setupviewcompment() {
        b001=(Button)findViewById(R.id.m0604_b001);
        b002=(Button)findViewById(R.id.m0604_b002);
        b003=(Button)findViewById(R.id.m0604_b003);
        b004=(Button)findViewById(R.id.m0604_b004);


        b001.setOnClickListener(b001On);
        b002.setOnClickListener(b001On);
        b003.setOnClickListener(b001On);
        b004.setOnClickListener(b001On);

    }
    private View.OnClickListener b001On =new View.OnClickListener() {



        @Override
        public void onClick(View v) {
            toast=null;

            switch (v.getId()){
                case R.id.m0604_b001:
//                    Toast.makeText(getApplicationContext(),"請注意",Toast.LENGTH_LONG).show();// 字串寫死的，不建議這樣作
                    Toast.makeText(getApplicationContext(),getText(R.string.m0604_t001),Toast.LENGTH_LONG).show();//寫程式時順便更新，新的字串
//                    Toast要做成文字(從那裏來的()，要抓的字串(字串位置)，Toast . 顯示時間長短 . 顯現出來
                    break;
                case R.id.m0604_b002:
//                    toasts=Toast.makeText(getApplicationContext(),"自定義顯示位置",Toast.LENGTH_LONG);
//                    toasts.setGravity(Gravity.CENTER,0,0);
//                    toasts.show();

                    toast = Toast.makeText(getApplicationContext(), getString(R.string.m0604_t002), Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER|Gravity.START,0,0);

                    toast.show();



                    break;
                case R.id.m0604_b003:
                    toast = Toast.makeText(getApplicationContext(), getString(R.string.m0604_b003), Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER|Gravity.START,50,50);

//                    toastView = (LinearLayout) toast.getView();
//                    ImageView imageCodeProject = new ImageView(getApplicationContext());
//                    imageCodeProject.setImageResource(R.drawable.ic_sample);
//                    toastView.addView(imageCodeProject, 0);

                    LinearLayout toastView = (LinearLayout) toast.getView();
                    ImageView imageCodeProject=new ImageView(getApplicationContext());
                    imageCodeProject.setImageResource(R.drawable.scissors);
                    toastView.addView(imageCodeProject,0);
                    toast.show();


                    break;
                case R.id.m0604_b004:
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.custom, (ViewGroup) findViewById(R.id.llToast));

                    ImageView image = (ImageView) layout.findViewById(R.id.tvImageToast);
                    TextView title = (TextView) layout.findViewById(R.id.tvTitleToast);
                    TextView text = (TextView) layout.findViewById(R.id.tvTextToast);

                    image.setImageResource(R.drawable.scissors);
                    title.setText(getString(R.string.m0604_t001).toString());
                    text.setText(getString(R.string.m0604_b003).toString());
//-----------------------------------
                    //-----------------------------------
                    toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.START | Gravity.TOP, 20, 40);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();





                    break;
            }
        }
    };
}