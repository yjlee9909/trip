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

public class HaeWoonDae extends Fragment {
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

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110133700216_oen",
                "#해운대지역\n\n" +
                        "엣지993\n" +
                        " 해운대해수욕장 근처에 위치한 ‘엣지993’은 바다 전망이 좋기로 유명하다." +
                        " 1, 5, 6층이 카페로 운영되고 모든 테이블이 바다를 향하고 있다." +
                        " 6층 루프탑에서 바다를 바라보면 해운대 백사장과 좌우로 펼쳐지는 광안대교, 마린시티, 동백섬 등 부산의 랜드마크를 한눈에 볼 수 있다."));

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110133700875_oen",
                "포트1902\n" +
                        " 송정해수욕장과 멀지 않은 곳에 위치하고 있는 ‘포트1902’은 커피뿐만 아니라 전시, 공연, 파티 등 다양한 목적의 공간으로 운영되는 곳이다." +
                        " 국내 최초로 풀장을 보유한 카페로도 알려져 있고, 층별로 색다른 인테리어를 선보인다."));

        RecyclerView.Adapter adapter = new CafeAdapter(cafeLocations);
        cafeRecycler.setAdapter(adapter);
    }
}