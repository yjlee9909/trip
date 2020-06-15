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

public class SeoGu extends Fragment {
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

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110132717095_oen",
                "#서구지역\n\n" +
                        "TCC\n" +
                        " 암남동 ‘TCC’ 카페는 송도해수욕장을 한 눈에 담을 수 있는 곳에 자리하고 있다." +
                        " 가장 인기 있는 장소는 탁 트인 송도 앞 바다를 볼 수 있는 루프탑이다." +
                        " 통유리로 만들어진 창은 바다 전망을 즐길 수 있고, 화사한 실내에 분위기를 더한다." +
                        " 주변에는 송도해상케이블카와 시티투어버스 정류소가 있다."));

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110132718184_oen",
                "빈스톡\n" +
                        " 송도에는 부산 3대 커피장인이 운영하는 카페로 유명한 빈스톡이 있다." +
                        " 원두의 풍부한 향을 느끼고 싶다면 다크 로스트로 유명한 커피장인이 빚어내는 핸드드립 커피를 맛 볼 수 있는 빈스톡을 추천 한다."));

        RecyclerView.Adapter adapter = new CafeAdapter(cafeLocations);
        cafeRecycler.setAdapter(adapter);
    }
}