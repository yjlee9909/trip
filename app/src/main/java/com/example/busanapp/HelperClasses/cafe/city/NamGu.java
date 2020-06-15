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

public class NamGu extends Fragment {
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

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110132721612_oen",
                "#남구지역\n\n" +
                        "딜라잇식스\n" +
                        " 대연동에 위치한 ‘딜라잇식스’는 도심형 카페이다." +
                        " 각 공간마다 테마가 있어 찾는 사람들에게 다양한 볼거리를 제공한다." +
                        " 본관과 별관으로 구분되어 있고 공간이 넓어, 원하는 공간에서 커피를 즐길 수 있다." +
                        " 주변을 둘러보면 사진을 찍을 수 있는 포토존도 쉽게 찾아볼 수 있다."));

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110132722791_oen",
                "카페 이정원\n" +
                        " 경성대 대학가에 위치한 ‘카페 이정원’은 카페 이름처럼 식물을 활용한 정원 인테리어가 독창적이다." +
                        " 정원이 한눈에 들어오는 통 창 가득 햇살이 쏟아지는 이곳은 다양한 커피를 비롯해 10여 가지 종류의 베이커리 메뉴로도 유명하다."));

        RecyclerView.Adapter adapter = new CafeAdapter(cafeLocations);
        cafeRecycler.setAdapter(adapter);
    }
}