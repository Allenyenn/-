package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnscissors;
    private Button btnstone;
    private Button btnnet;
    private TextView txtme;
    private TextView txtresult;
    private TextView txtcomputer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
    }
    private void findView() {
        btnscissors = (Button) findViewById(R.id.scissors);
        btnstone = (Button) findViewById(R.id.stone);
        btnnet = (Button) findViewById(R.id.net);
        txtme = (TextView) findViewById(R.id.me);
        txtresult = (TextView) findViewById(R.id.result);
        txtcomputer = (TextView) findViewById(R.id.computer);
        btnscissors.setOnClickListener(scissors);
        btnstone.setOnClickListener(stone);
        btnnet.setOnClickListener(net);
    }
private Button.OnClickListener scissors=new Button.OnClickListener(){
        public void onClick(View View) {
            int com = (int) (Math.random() * 3 + 1);
            if (com == 1) {
                txtme.setText("玩家出剪刀");
                txtcomputer.setText("電腦出剪刀");
                txtresult.setText("平手");
            } else if (com == 2) {
                txtme.setText("玩家出剪刀");
                txtcomputer.setText("電腦出石頭");
                txtresult.setText("電腦贏");
            } else {
                txtme.setText("玩家出剪刀");
                txtcomputer.setText("電腦出布");
                txtresult.setText("玩家贏");
            }
        }
};
private Button.OnClickListener stone=new Button.OnClickListener(){
        public void onClick(View View) {
            int com = (int) (Math.random() * 3 + 1);
            if (com == 1) {
                txtme.setText("玩家出石頭");
                txtcomputer.setText("電腦出剪刀");
                txtresult.setText("玩家贏");
            } else if (com == 2) {
                txtme.setText("玩家出石頭");
                txtcomputer.setText("電腦出石頭");
                txtresult.setText("平手");
            } else {
                txtme.setText("玩家出石頭");
                txtcomputer.setText("電腦出布");
                txtresult.setText("電腦贏");
            }
        }
    };
    private Button.OnClickListener net=new Button.OnClickListener(){
        public void onClick(View View) {
            int com = (int) (Math.random() * 3 + 1);
            if (com == 1) {
                txtme.setText("玩家出布");
                txtcomputer.setText("電腦出剪刀");
                txtresult.setText("電腦贏");
            } else if (com == 2) {
                txtme.setText("玩家出布");
                txtcomputer.setText("電腦出石頭");
                txtresult.setText("玩家贏");
            } else {
                txtme.setText("玩家出布");
                txtcomputer.setText("電腦出布");
                txtresult.setText("平手");
            }
        }
    };
}