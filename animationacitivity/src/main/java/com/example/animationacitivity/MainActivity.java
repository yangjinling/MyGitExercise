package com.example.animationacitivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button tiaozhuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tiaozhuan = ((Button) findViewById(R.id.tiaozhuan));
        tiaozhuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                //1、淡入淡出效果
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
                //2、放大淡出效果
//                overridePendingTransition(R.anim.scale_in,R.anim.alpha_out);
                //3、转动淡出效果1
//                overridePendingTransition(R.anim.scale_rotate_in,R.anim.alpha_out);
                //4、转动淡出效果2
//                overridePendingTransition(R.anim.scale_translate_rotate,R.anim.alpha_out);
                //5、左上角展开淡出效果
//                overridePendingTransition(R.anim.scale_translate,R.anim.alpha_out);
                //6、压缩变小淡出效果
//                  overridePendingTransition(R.anim.hyperspace_in,R.anim.hyperspace_out);
                //7、右往左推出效果
//                overridePendingTransition(R.anim.push_left_in,R.anim.push_left_out);
                //8、下往上推出效果
//                overridePendingTransition(R.anim.push_up_in,R.anim.push_up_out);
                //9、放大淡出效果
//                overridePendingTransition(R.anim.wave_scale,R.anim.alpha_out);
                //10、缩小效果
//                overridePendingTransition(R.anim.zoom_enter,R.anim.zoom_exit);
                //11、上下交错效果
//                overridePendingTransition(R.anim.slide_up_in,R.anim.slide_down_out);
            }
        });

    }
}
