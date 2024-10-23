package com.example.dumvanimechat.man1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.dumvanimechat.R;
import com.example.dumvanimechat.view.spacetablayout.SpaceTabLayout;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class ManChaoActivity extends AppCompatActivity {

    List<Fragment> fragmentList = new ArrayList<>();
    ViewPager viewPager ;
    SpaceTabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_chao);
        init();
        mapd();
        setUp();
        setClick();
    }

    private void init(){
        fragmentList.add(new FragmentA());
        fragmentList.add(new FragmentB(this));
        fragmentList.add(new FragmentC());}
    private void mapd(){
        viewPager = findViewById(R.id.viewPager);
        tabLayout =findViewById(R.id.spaceTabLayout);
    }
    private void setUp(){ tabLayout.initialize(viewPager, getSupportFragmentManager(), fragmentList);
    }
    private void setClick(){ tabLayout.setTabOneOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        }
    });

        tabLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "" + tabLayout.getCurrentPosition(), Toast.LENGTH_SHORT).show();
            }
        });}
}