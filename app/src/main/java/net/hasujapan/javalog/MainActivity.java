package net.hasujapan.javalog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    final private String TAG = "javalog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
            課題1.
            抽象クラスAnimalを継承したHumanクラスを定義し、
            生成したインスタンスのsayメソッドで「私の名前は〜〜です。年は〜〜歳です。」
            （〜〜はメンバ変数から取得）というLogを出力させてください。
         */

        Human human = new Human("名前", 1);
        human.say();

    }
}
