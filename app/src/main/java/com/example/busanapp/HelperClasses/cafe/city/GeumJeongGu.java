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

public class GeumJeongGu extends Fragment {
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

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110154439008_oen",
                "#금정구지역\n\n" +
                        "모모스\n" +
                        " 도심 속 정원 인테리어로 유명한 부곡동 ‘모모스커피’는 부산 커피의 대명사로 불릴 만큼 명성이 자자한 곳이다." +
                        " 전국의 커피 마니아들이 모여드는 이곳은 핸드드립 커피와 스페셜 티가 유명하다." +
                        " 계절별로 농장과 협약하여 들여오는 주스메뉴도 인기가 높다." +
                        " 커피뿐만 아니라 원두와 다양한 굿즈도 판매하는 커피 회사이기도 하다."));

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110154440470_oen",
                "티원\n" +
                        " 부산카페하면 오션뷰가 멋진 카페들을 먼저 떠올리겠지만 마운틴뷰로 유명한 카페도 있다." +
                        " ‘티원’은 범어사 인근 숲속에 자리하여 자연이 주는 맑은 공기를 마시며 힐링 할 수 있는 곳이다." +
                        " 상쾌한 허브차 한잔이면 마음 속 까지 깨끗해지는 기분이 든다." +
                        " 생각을 정리하면서 여유를 즐기기에 안성맞춤인 카페이다."));

        RecyclerView.Adapter adapter = new CafeAdapter(cafeLocations);
        cafeRecycler.setAdapter(adapter);
    }
}