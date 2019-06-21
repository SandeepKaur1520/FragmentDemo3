package com.e.fragmentdemo3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fragment = new Myfragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentview1, fragment).addToBackStack("").commit();

        Fragment fragment1 = new Myfragment1();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentview2, fragment1).addToBackStack("").commit();

        Fragment fragment2 = new Myfragment2();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentview3, fragment2).addToBackStack("").commit();

        Fragment fragment3 = new Myfragment3();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentview4, fragment3).addToBackStack("").commit();




    }

}
