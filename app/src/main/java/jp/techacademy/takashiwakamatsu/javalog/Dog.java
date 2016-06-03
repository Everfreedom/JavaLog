package jp.techacademy.takashiwakamatsu.javalog;

import android.util.Log;

public class Dog implements Movable {

    // クラス変数
    static String to_jp = "犬";

    String name ;
    int age ;

    public Dog (String name,int age) {
        this.name = name;
        this.age = age ;
    }

    // クラス関数
    public static void introduce() {
        Log.d("javatest", "これは犬クラスです。");
    }

    public void say () {

        Log.d("javatest","わんわんわん");

    }

    @Override
    public void move () {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "は全力で走った。");

    }

}
