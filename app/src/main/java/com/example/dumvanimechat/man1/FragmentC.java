package com.example.dumvanimechat.man1;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

import com.example.dumvanimechat.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragmentC extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c, container, false);
    }

}
