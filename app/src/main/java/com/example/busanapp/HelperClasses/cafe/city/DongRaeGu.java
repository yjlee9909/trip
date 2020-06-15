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

public class DongRaeGu extends Fragment {
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

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110153817951_oen",
                "#동래구지역\n\n" +
                        "아트케이갤러리 카페\n" +
                        " 아름다운 정원과 멋지게 어우러진 외관이 눈길을 사로잡는 아트케이갤러리." +
                        " 아트홀, 정원카페, 갤러리카페로 이루어져 있다." +
                        " 구 수가화랑을 복합문화공간으로 재탄생 시킨 이곳에서는 다양한 문화 행사가 열리며, 카페 곳곳에서 다양한 예술작품을 감상 할 수 있다."));

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110153819257_oen",
                "그린내\n" +
                        " 동래 복천동 고분으로 가는 한적한 길에 위치한 ‘그린내’는 직접 만든 커피와 빵으로 유명한 곳이다." +
                        " 로스팅을 배울 수 있는 교육 프로그램을 진행하고 있으며, 탁 트인 고분일대의 전망을 볼 수 있는 공간과 천장 위로 하늘을 볼 수 있는 다락방이 있다."));

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110153820649_oen",
                "어반플로우\n" +
                        " 벚꽃 명소로 알려진 온천천 카페거리에 위치한 ‘어반플로우’는 모던 화이트톤으로 꾸며져 트렌디한 분위기를 느낄 수 있다." +
                        " 밝은 인테리어 덕에 카페 안에서도 멋진 사진들을 담을 수 있는 곳이다." +
                        " 전문 바리스타가 운영하고 있으며 수플레 팬케이크가 맛있기로 유명하다."));

        RecyclerView.Adapter adapter = new CafeAdapter(cafeLocations);
        cafeRecycler.setAdapter(adapter);
    }
}