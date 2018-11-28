package jp.techacademy.saito.maiko.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;    //追加

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dog dog = new Dog("ポチ", 3);
        dog.move();

        Human human1 = new Human("まいこ", 33, "海外旅行");
        human1.say();
        human1.think();

        Human human2 = new Human("maiko", 3, "お菓子");
        human2.say();
        human2.think();
        /*
        dog.say();
        Log.d("javatest","犬の名前は" + dog.name + "です。");
        Log.d("javatest","犬の年齢は" + dog.age + "歳です。");

        BigDog bigdog = new BigDog("ヨーゼフ", 15);

        Dog dog2 = new Dog("ハチ", 10);
        bigdog.say();
        Log.d("javatest","犬の名前は" + bigdog.name + "です。");
        Log.d("javatest","犬の年齢は" + bigdog.age + "歳です。"); */
    }
}
