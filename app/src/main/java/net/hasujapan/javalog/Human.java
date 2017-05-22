package net.hasujapan.javalog;

import android.util.Log;

/**
 * Created by hasujapan on 2017/05/22.
 */

class Human extends Animal implements Thinkable {

    final private String TAG = "javalog";
    public int age;
    public String hobby;

    // --------------------------------------

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    // --------------------------------------

    @Override
    public void say() {
        Log.d(TAG, "私の名前は" + this.name + "です。年は" + this.age + "歳です");
    }

    // --------------------------------------

    @Override
    public void think() {
        Log.d(TAG, "私は" + this.hobby + "について考える。");
    }


    // --------------------------------------

}
