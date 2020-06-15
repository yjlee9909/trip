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

public class SuYoungGu extends Fragment {
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

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110154445896_oen",
                "#수영구지역\n\n" +
                        "오후의홍차\n" +
                        " 홍차를 즐기는 사람을 위한 맞춤카페 ‘오후의홍차.’" +
                        " 홍차를 비롯해 블랜디드티, 백차, 녹차 등 다양한 차를 음미할 수 있다." +
                        " 부산다운건축상을 받을 만큼 외관이 아름답고 내부 또한 고풍스럽다." +
                        " 5층 루프탑에서는 수영강변과 강 건너편에 있는 마린시티, 센텀시티를 조망할 수 있다." +
                        " 1층과 2층의 갤러리에서는 상설이나 기획전시가 열린다."));

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110154446981_oen",
                "더박스\n" +
                        " 수영 강변 야경이 아름다운 민락동 ‘더박스’는 아름다운 외관으로 각종 건축상에서 입상한 카페이다." +
                        " 커다란 박스가 어긋나게 얹어진 외형이 인상적인 이곳은 외관만으로도 방문자들의 마음을 설레게 한다." +
                        " 테라스에서 바라보는 바다 풍경은 마치 크루즈여행을 하고 있는 듯한 즐거움을 선사한다."));

        RecyclerView.Adapter adapter = new CafeAdapter(cafeLocations);
        cafeRecycler.setAdapter(adapter);
    }
}