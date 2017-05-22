package net.hasujapan.javalog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

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

        Human ahuman = new Human("名前", 1);
        ahuman.say();

        /*
            課題2.
            thinkメソッドを持つThinkableインタフェースを作成し、
            Humanクラスに実装させてください。
            Humanクラスにはhobbyという文字列型のメンバ変数を用意し、
            thinkメソッドを呼び出すと「私は〜〜について考える」（〜〜はhobbyから取得）
            というLogを出力させてください。
         */

        Human bHuman = new Human("名前", 1, "趣味");
        bHuman.think();

    }
}
