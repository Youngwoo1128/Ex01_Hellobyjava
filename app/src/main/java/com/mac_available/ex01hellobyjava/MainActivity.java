package com.mac_available.ex01hellobyjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //화면에 보이는 뷰들의 참조변수는 가급적 멤버변수로..
    TextView tv;
    Button btn;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Java언어만으로 화면 꾸미기

        //액티비티에 놓여질 수 있는 것은 View 클래스를 상소받은 클래스들만 가능함

        //글씨를 보여주는 TextView객체 생성 및 설정
        tv = new TextView(this);
        tv.setText("Hello world");

        //액티비티에 View를 붙이기
        //this.setContentView(tv); //this는 생략 가능함

        //버튼 역할을 하는 객체 생성 및 설정
        btn = new Button(this);
        btn.setText("click the button"); //Button이 TextView 상속이라 메소드 똑같음

        //액티비티에 뷰를 붙이기
        //setContentView(btn);

        //액티비티는 한번에 1개의 뷰만 놓여질 수 있음
        //그럼 여러개 놓으려면 View들을 여러개 담을 수 있는 ViewGroup객체를 1개 만들어서 거기에 다 붙이고
        //그 Viewgroup 1개를 액티비티에 붙이면 됨

        //Viewgroup 클래스들 중에서 가장 간단한 LinearLayout이라는 이름의 클래스 객체로 만들어서 사용해보자
        layout = new LinearLayout(this);
        layout.addView(tv);
        layout.addView(btn);

    }
}