package jp.techacademy.takashiwakamatsu.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human();
        human.say("takashi",43);
        human.think();
        /*
        Dog dog = new Dog("太郎",25);
        dog.say();
        Log.d("javatest", "Dog.to_jpは" + Dog.to_jp + "です。");
        Dog.introduce();
        Log.d("javatest", "犬の名前は" + dog.name + "です。");
        Log.d("javatest", "犬の年齢は" + dog.age + "です。");

        BigDog bigDog = new BigDog ( "ヨーゼフ",50);
        bigDog.say();
        Log.d("javatest", "犬の名前は" + bigDog.name + "です。");
        dog.move();

    }

    private void total(int first,int last ){
        int i = first;
        for ( i= first ;i < last ;i++ ) {
            Log.d("javatest",String.valueOf(i));
        }
    */

    }


}
