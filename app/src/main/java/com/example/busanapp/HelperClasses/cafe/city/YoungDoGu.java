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

public class YoungDoGu extends Fragment {
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

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110133651041_oen",
                "#영도구지역\n\n" +
                        "카린 영도플레이스\n" +
                        " 선글라스 브랜드로 유명한 ‘카린’은 청학동에 카페 ‘카린 영도플레이스’를 운영하고 있다." +
                        " 넓은 주차장과 루프탑이 있어 탁 트인 시원한 영도 바다 전망을 즐길 수 있다." +
                        " 북유럽 스타일의 인테리어로 쾌적하고 깔끔한 분위기를 느낄 수 있으며, 카린 선글라스 쇼룸이 있어 다양한 선글라스를 직접 써볼 수도 있다."));

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110133651893_oen",
                "신기산업\n" +
                        " 사무용품 제조회사인 신기산업은 회사의 사옥을 카페로 운영하고 있다." +
                        " 바다뷰 카페투어의 성지가 이곳에서부터 시작되었다고 할 수 있다." +
                        " 내부는 화이트와 그레이톤으로 꾸며져 있어 차분한 분위기를 느낄 수 있다." +
                        " 부산항대교와 영도 일대를 바라볼 수 있으며, 밤에는 멋진 야경도 즐길 수 있다."));

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110133653180_oen",
                "젬스톤\n" +
                        " 수영장 안에서 커피를 마신다면 어떤 기분일까." +
                        " 카페 젬스톤은 수영장이었던 건물의 인테리어를 그대로 살려 카페로 탈바꿈시켰다." +
                        " 카페 곳곳이 다양한 테마로 꾸며져 있어 사진을 찍거나 구경하는 재미가 쏠쏠하다." +
                        " 어떤 카페에서도 느낄 수 없는 독특한 분위기를 즐길 수 있는 곳이다."));

        RecyclerView.Adapter adapter = new CafeAdapter(cafeLocations);
        cafeRecycler.setAdapter(adapter);
    }
}