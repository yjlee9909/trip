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

public class JungGu extends Fragment {
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

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110132713427_oen",
                "#중구지역\n\n" +
                        "레귤러하우스\n" +
                        " 남포동 국제시장 내부에 위치한 ‘레귤러하우스’는 재즈 음악과 빈티지가 잘 어우러진 카페이다." +
                        " 고풍스러우면서도 고급진 소품들과 빈티지한 인테리어가 특징인 이곳은 커피뿐만 아니라 차와 디저트의 종류가 다양해 골라 먹는 재미가 있는 곳이다."));

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110132714529_oen",
                "노티스1950\n" +
                        " 중앙동에 위치한 노티스1950은 1950년대 쌀 창고로 이용되었던 건물을 리모델링하여 복합문화공간으로 재탄생시켰다." +
                        " 창가에 앉아 부산항의 전망을 즐길 수 있는 것이 특징인 이곳은 드라마 ‘쌈, 마이웨이’를 비롯해 영화, 드라마, 광고 촬영지로도 유명하다."));

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110132715990_oen",
                "바우노바 백산점\n" +
                        " 남포동과 중앙동 사이쯤 위치하고 있는 ‘바우노바 백산점’은 일본식 목조건물을 개조한 조용하고 안락한 카페이다." +
                        " 이곳에선 커피를 테이크아웃 할 수 없다." +
                        " 핸드드립 커피를 고집하는 만큼이나 천천히, 그리고 충분히 커피 맛을 음미할 수 있는 진정한 공간이 되기를 바라는 주인장의 마음일 것이다."));

        RecyclerView.Adapter adapter = new CafeAdapter(cafeLocations);
        cafeRecycler.setAdapter(adapter);
    }
}