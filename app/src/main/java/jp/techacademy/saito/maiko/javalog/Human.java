package jp.techacademy.saito.maiko.javalog;

import android.util.Log;

public class Human extends Animal implements Thinkable {

    // メンバ変数
    String hobby = "海外旅行";

    // コンストラクタ
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void say() {
        Log.d("javatest", "「私の名前は" + this.name + "です。年は" + this.age + "歳です。」");
    }

    @Override
    public void think() {
        Log.d("javatest", "私は" + hobby + "について考える");
    }

}
