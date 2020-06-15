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

public class GangSeoGu extends Fragment {
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

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110154441631_oen",
                "#강서구지역\n\n" +
                        "포레스트3002\n" +
                        " 사랑스러운 반려견과 함께 카페를 방문하고자 한다면 강서구 녹산동 ‘포레스트3002’를 추천한다." +
                        " 주말에 반려견과 함께 입장이 가능하며, 반려견들이 뛰어놀 수 있는 넓은 정원과 낙동강 뷰를 즐길 수 있다는 것이 이 카페만의 매력이다." +
                        " 주인장이 마련한 감각적인 볼거리를 보는 재미도 쏠쏠하다."));

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110154443461_oen",
                "몽도르카페\n" +
                        " 가덕도 앞바다에 앉아 일몰과 일출을 감상할 수 있는 카페가 있다." +
                        " 천성동 ‘몽도르카페’는 가덕도 해안 끝자락에 위치해 눈앞에 펼쳐진 바다가 손에 닿을 듯 가깝다." +
                        " 탁 트인 널찍한 야외테라스와 숨어 있는 듯 아늑한 숲속 테라스가 있다." +
                        " 작은 오솔길을 따라 계단으로 내려가면 몽돌이 깔린 해안에서 산책을 즐길 수 있다."));

        RecyclerView.Adapter adapter = new CafeAdapter(cafeLocations);
        cafeRecycler.setAdapter(adapter);
    }
}