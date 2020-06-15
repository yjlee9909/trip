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

public class BusanJinGu extends Fragment {
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

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110133654563_oen",
                "#부산진구지역\n\n" +
                        "빈티지38\n" +
                        " 아늑한 공간에서 여유로운 시간을 보내고 싶다면 전포카페거리에 위치한 카페 ‘빈티지38’을 추천한다." +
                        " 빈티지한 느낌을 물씬 풍기는 외관과는 달리 내부는 현대적인 감각으로 꾸며져 있다." +
                        " 직접 로스팅한 커피와 베테랑 파티쉐의 베이커리를 24시간 맛볼 수 있는 곳."));

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110133656104_oen",
                "비포선셋\n" +
                        " 유럽풍의 인테리어와 이국적인 분위기를 원한다면 ‘비포선셋’은 어떨까." +
                        " 다양한 식물을 활용한 인테리어는 싱그럽고 편안한 분위기를 만들어 준다." +
                        " 이곳은 국내 여행자들뿐만 아니라 SNS를 통해서 입소문을 타고 온 일본·중국·대만 등의 외국인들이 자주 방문하는 곳이다."));

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110133657776_oen",
                "오월생\n" +
                        " 사장님이 직접 만든 수제 디저트로 유명한 카페 ‘오월생’은 화이트로 꾸며진 인테리어가 특징인 곳이다." +
                        " 화사하고 밝은 분위기와 주인장의 감성 있는 인테리어 소품들이 조화를 이뤄 많은 사람들이 사진을 찍기 위해 찾아오는 카페이기도 하다."));

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110133659154_oen",
                "유월커피\n" +
                        " 6월과 your을 모두 담고 있는 카페 ‘유월커피’는 전포 카페거리 터줏대감이다." +
                        " 작고 오래된 외관의 건물이지만 안으로 들어가면 아늑하고 포근한 분위기를 느낄 수 있다." +
                        " 맛있는 커피와 함께 특유의 차분한 분위기를 즐기기에 안성맞춤."));

        RecyclerView.Adapter adapter = new CafeAdapter(cafeLocations);
        cafeRecycler.setAdapter(adapter);
    }
}