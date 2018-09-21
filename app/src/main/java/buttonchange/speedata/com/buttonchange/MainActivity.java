package buttonchange.speedata.com.buttonchange;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * @author xuyan
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        Button btnShow = (Button) findViewById(R.id.btn_show);
        Button btnMiss = (Button) findViewById(R.id.btn_miss);
        Button btnOpen = (Button) findViewById(R.id.btn_vibrator_open);
        Button btnClose = (Button) findViewById(R.id.btn_vibrator_close);
        Button btnBlack = (Button) findViewById(R.id.btn_color_black);
        Button btnBlue = (Button) findViewById(R.id.btn_color_blue);
        Button btnCyan = (Button) findViewById(R.id.btn_color_cyan);
        Button btnPink = (Button) findViewById(R.id.btn_color_pink);
        Button btnPurple = (Button) findViewById(R.id.btn_color_purple);
        Button btnRed = (Button) findViewById(R.id.btn_color_red);
        Button btnYellow = (Button) findViewById(R.id.btn_color_yellow);
        btnShow.setOnClickListener(this);
        btnMiss.setOnClickListener(this);
        btnOpen.setOnClickListener(this);
        btnClose.setOnClickListener(this);
        btnBlack.setOnClickListener(this);
        btnBlue.setOnClickListener(this);
        btnCyan.setOnClickListener(this);
        btnPink.setOnClickListener(this);
        btnPurple.setOnClickListener(this);
        btnRed.setOnClickListener(this);
        btnYellow.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_color_black:
                //创建Intent对象
                Intent intent1 = new Intent();
                //设置Intent的Action属性
                intent1.setAction("thefloatbuttonscan.color.black");
                //如果只传一个bundle的信息，可以不包bundle，直接放在intent里
                intent1.putExtra("ButtonStatus", "thefloatbuttonscan.color.black");
                //发送广播
                sendBroadcast(intent1);

                break;

            case R.id.btn_color_blue:
                //创建Intent对象
                Intent intent2 = new Intent();
                //设置Intent的Action属性
                intent2.setAction("thefloatbuttonscan.color.blue");
                //如果只传一个bundle的信息，可以不包bundle，直接放在intent里
                intent2.putExtra("ButtonStatus", "thefloatbuttonscan.color.blue");
                //发送广播
                sendBroadcast(intent2);

                break;

            case R.id.btn_color_cyan:
                //创建Intent对象
                Intent intent3 = new Intent();
                //设置Intent的Action属性
                intent3.setAction("thefloatbuttonscan.color.cyan");
                //如果只传一个bundle的信息，可以不包bundle，直接放在intent里
                intent3.putExtra("ButtonStatus", "thefloatbuttonscan.color.cyan");
                //发送广播
                sendBroadcast(intent3);

                break;

            case R.id.btn_color_pink:
                //创建Intent对象
                Intent intent4 = new Intent();
                //设置Intent的Action属性
                intent4.setAction("thefloatbuttonscan.color.pink");
                //如果只传一个bundle的信息，可以不包bundle，直接放在intent里
                intent4.putExtra("ButtonStatus", "thefloatbuttonscan.color.pink");
                //发送广播
                sendBroadcast(intent4);

                break;

            case R.id.btn_color_purple:
                //创建Intent对象
                Intent intent5 = new Intent();
                //设置Intent的Action属性
                intent5.setAction("thefloatbuttonscan.color.purple");
                //如果只传一个bundle的信息，可以不包bundle，直接放在intent里
                intent5.putExtra("ButtonStatus", "thefloatbuttonscan.color.purple");
                //发送广播
                sendBroadcast(intent5);

                break;

            case R.id.btn_color_red:
                //创建Intent对象
                Intent intent6 = new Intent();
                //设置Intent的Action属性
                intent6.setAction("thefloatbuttonscan.color.red");
                //如果只传一个bundle的信息，可以不包bundle，直接放在intent里
                intent6.putExtra("ButtonStatus", "thefloatbuttonscan.color.red");
                //发送广播
                sendBroadcast(intent6);

                break;

            case R.id.btn_color_yellow:
                //创建Intent对象
                Intent intent7 = new Intent();
                //设置Intent的Action属性
                intent7.setAction("thefloatbuttonscan.color.yellow");
                //如果只传一个bundle的信息，可以不包bundle，直接放在intent里
                intent7.putExtra("ButtonStatus", "thefloatbuttonscan.color.yellow");
                //发送广播
                sendBroadcast(intent7);

                break;

            case R.id.btn_show:

                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_LAUNCHER);
                ComponentName cn = new ComponentName("com.android.thefloatbuttonscan", "com.android.thefloatbuttonscan.MainActivity");
                intent.setComponent(cn);
                startActivity(intent);

                //创建Intent对象
                Intent intent8 = new Intent();
                //设置Intent的Action属性
                intent8.setAction("com.android.thefloatbuttonscan.intent.open");
                //如果只传一个bundle的信息，可以不包bundle，直接放在intent里
                intent8.putExtra("ButtonStatus", "com.android.thefloatbuttonscan.intent.open");
                //发送广播
                sendBroadcast(intent8);

                break;

            case R.id.btn_miss:
                //创建Intent对象
                Intent intent9 = new Intent();
                //设置Intent的Action属性
                intent9.setAction("com.android.thefloatbuttonscan.intent.close");
                //如果只传一个bundle的信息，可以不包bundle，直接放在intent里
                intent9.putExtra("ButtonStatus", "com.android.thefloatbuttonscan.intent.close");
                //发送广播
                sendBroadcast(intent9);

                break;

            case R.id.btn_vibrator_open:
                //创建Intent对象
                Intent intent10 = new Intent();
                //设置Intent的Action属性
                intent10.setAction("thefloatbuttonscan.vibrator.open");
                //如果只传一个bundle的信息，可以不包bundle，直接放在intent里
                intent10.putExtra("ButtonStatus", "thefloatbuttonscan.vibrator.open");
                //发送广播
                sendBroadcast(intent10);

                break;

            case R.id.btn_vibrator_close:
                //创建Intent对象
                Intent intent11 = new Intent();
                //设置Intent的Action属性
                intent11.setAction("thefloatbuttonscan.vibrator.close");
                //如果只传一个bundle的信息，可以不包bundle，直接放在intent里
                intent11.putExtra("ButtonStatus", "thefloatbuttonscan.vibrator.close");
                //发送广播
                sendBroadcast(intent11);

                break;

            default:
                break;

        }
    }
}
