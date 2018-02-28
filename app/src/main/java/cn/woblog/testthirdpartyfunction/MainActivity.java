package cn.woblog.testthirdpartyfunction;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import cn.woblog.testthirdpartyfunction.activity.QQActivity;
import cn.woblog.testthirdpartyfunction.activity.SinaActivity;
import cn.woblog.testthirdpartyfunction.activity.WxActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void testQQ(View view) {
        startActivity(new Intent(MainActivity.this, QQActivity.class));
    }
    public void testSina(View view) {
        startActivity(new Intent(MainActivity.this, SinaActivity.class));
    }
    public void testWx(View view) {
        startActivity(new Intent(MainActivity.this, WxActivity.class));
    }
}
