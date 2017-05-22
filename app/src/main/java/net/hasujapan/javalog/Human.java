package net.hasujapan.javalog;

import android.util.Log;

/**
 * Created by hasujapan on 2017/05/22.
 */

class Human extends Animal {

    final private String TAG = "javalog";
    public int age;

    // --------------------------------------

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // --------------------------------------

    @Override
    public void say() {
        Log.d(TAG, "私の名前は" + this.name + "です。年は" + this.age + "歳です");
    }

    // --------------------------------------

}
