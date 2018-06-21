package com.myapp.jln.pro0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonMovie;
    private Button buttonShare;
    private Button buttonReader;
    private Button buttonNews;
    private Button buttonGraduate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMovie = (Button)findViewById(R.id.buttonMovie);
        buttonShare = (Button)findViewById(R.id.buttonShare);
        buttonReader = (Button)findViewById(R.id.buttonReader);
        buttonNews = (Button)findViewById(R.id.buttonNews);
        buttonGraduate = (Button)findViewById(R.id.buttonGraduate);

        buttonMovie.setOnClickListener(this);
        buttonShare.setOnClickListener(this);
        buttonReader.setOnClickListener(this);
        buttonNews.setOnClickListener(this);
        buttonGraduate.setOnClickListener(this);

        Log.d("###", "fetch");

        Log.d("###", "commit1");

        Log.d("####", "commit2");

    }

    @Override
    public void onClick(View view) {
        String text = "";
        switch (view.getId())
        {
            case R.id.buttonMovie:text = "启动应用：热门电影";break;
            case R.id.buttonShare:text = "启动应用：股票雄鹰";break;
            case R.id.buttonReader:text = "启动应用：XYZ阅读器";break;
            case R.id.buttonNews:text = "启动应用：最新闻";break;
            case R.id.buttonGraduate:text = "启动应用：毕业设计";break;
        }
        Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
        toast.show();
    }
}
