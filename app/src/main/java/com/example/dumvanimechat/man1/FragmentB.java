package com.example.dumvanimechat.man1;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

import com.example.dumvanimechat.R;
import com.example.dumvanimechat.data.AnimeChonAdapter;
import com.example.dumvanimechat.data.DataApp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class FragmentB extends Fragment {
    GridView gdvNhanVat;
    DataApp dataApp;
    Context ct;

    public FragmentB(Context ct) {
        this.ct = ct;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_b, container, false);
        init();
        mapd(view);
        setUp();
        setClick();
        return view;
    }

    private void init(){
        dataApp = new DataApp();
    }
    private void mapd(View v){
        gdvNhanVat = v.findViewById(R.id.gdvNhanVat);
    }

    private void setUp(){
        gdvNhanVat.setAdapter(new AnimeChonAdapter(ct,dataApp.arr));
    }
    private void setClick(){
    }
}
