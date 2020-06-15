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

public class DongGu extends Fragment {
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

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110132719247_oen",
                "#동구지역\n\n" +
                        "카페 초량1941\n" +
                        " 초량동 산복도로에 위치하고 있는 ‘초량1941’은 1941년 지어진 일본식 가옥을 개조해 만든 카페이다." +
                        " 다양한 종류의 우유카페로 유명한 이곳은 숲의 신선한 공기를 마시며 자연을 느낄 수 있다." +
                        " 우유뿐만 아니라 다양한 굿즈도 판매한다."));

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110132720332_oen",
                "문화공감 수정\n" +
                        " 도시철도 부산진역 근처에 위지하고 있는 ‘문화공감수정’은 일본식 전통가옥의 느낌을 그대로 살려 카페로 운영되고 있다." +
                        " 입구를 지나 가옥을 보고 있으면 마치 일본의 어느 집에 들어온 듯한 착각을 불러일으킨다. 일본식 가옥이지만 한국 전통차를 맛볼 수 있다." +
                        " 아이유의 ‘밤 편지’ 뮤직비디오 촬영지로도 유명하다."));

        RecyclerView.Adapter adapter = new CafeAdapter(cafeLocations);
        cafeRecycler.setAdapter(adapter);
    }
}