package com.example.experiment3_2;

import android.os.Bundle;
import android.widget.TableLayout;
import android.app.AlertDialog;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }
    public void customView(View source)
    {
        // 加载\res\layout\login.xml界面布局文件
        TableLayout loginForm = (TableLayout) getLayoutInflater().inflate(R.layout.login, null);
        new AlertDialog.Builder(this)
                // 设置对话框的图标
                .setIcon(R.drawable.dog)
                // 设置对话框的标题
                .setTitle("ANOROIO APP")
                // 设置对话框显示的View对象
                .setView(loginForm)
                // 为对话框设置一个“确定”按钮
                .setPositiveButton("Sign in", (dialog, which) -> {
                    // 此处可执行登录处理
                })
                // 为对话框设置一个“取消”按钮
                .setNeutralButton("Cancel", (dialog, which) -> {

                })
                // 创建并显示对话框
                .create().show();
    }
}