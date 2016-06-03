package jp.techacademy.takashiwakamatsu.javalog;

import android.util.Log;

public class Human extends Animal implements Thinkable{

    public void say( String name , int age ) {
        Log.d("javatest", "私の名前は" + name + "です。年は" + age + "歳です。");
    }

    String hobby = "趣味" ;
    public void think () {
        Log.d("javatest", "私は"+this.hobby+"について考える");
    }

}
