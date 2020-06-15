package com.example.busanapp.HelperClasses.cafe.city;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.busanapp.HelperClasses.cafe.CafeAdapter;
import com.example.busanapp.HelperClasses.cafe.CafeHelperClass;
import com.example.busanapp.R;

import java.util.ArrayList;

public class YeonJeGu extends Fragment {
    private RecyclerView cafeRecycler;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_main, container, false);

        cafeRecycler = root.findViewById(R.id.cafeList);
        cafeRecycler();

        return root;
    }

    private void cafeRecycler() {
        cafeRecycler.setHasFixedSize(true);
        cafeRecycler.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));

        ArrayList<CafeHelperClass> cafeLocations = new ArrayList<>();

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110154444697_oen",
                "#연제구지역\n\n" +
                        "고래커피\n" +
                        " 다양한 소품들과 빈티지한 감성을 느낄 수 있는 연산동 ‘고래커피.’" +
                        " SNS에서도 높은 인기를 자랑하는 이곳은 마치 공사장에 온 것 같은 느낌의 인테리어가 시그니처다." +
                        " 직접 로스팅한 커피를 판매하고 있으며, 원당 밀크커피와 흑당 구름 커피가 유명하다."));

        RecyclerView.Adapter adapter = new CafeAdapter(cafeLocations);
        cafeRecycler.setAdapter(adapter);
    }
}