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

public class GiJangGun extends Fragment {
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

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110153823829_oen",
                "#기장군지역\n\n" +
                        "웨이브온\n" +
                        " 기장바다를 바라보는 오션뷰가 유명한 카페 ‘웨이브온’은 한국건축문화대상에 입상 할 만큼 건물의 외관이 인상적이다." +
                        " 루프 탑, 통유리 등 카페 내부에서도 오션뷰를 즐길 수 있도록 꾸며졌다." +
                        " 특히, 루프탑에서 즐기는 바다 풍경이 그림처럼 아름다운 곳이다."));

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110153825031_oen",
                "아데초이\n" +
                        " 깔끔한 화이트풍의 외관과는 달리, 앤티크 한 내부 소품과 원색의 대비가 이국적인 카페 아데초이." +
                        " 원목으로 만든 테이블과 늘어진 샹들리에가 묘한 조화를 이루는 곳이다." +
                        " 티타임 후 한적한 해안마을을 산책할 수 있는 멋진 곳에 위치한다."));

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110153826356_oen",
                "헤이든\n" +
                        " 작은 공원과 함께 자리하고 있는 바다 앞 카페 ‘헤이든’은 가벼운 산책을 즐기며 들르기 좋은 곳이다." +
                        " 카페 안에 위치한 테이블 뿐 아니라 외부에도 커피를 마시며 경치를 구경 할 수 있도록 다양한 위치에 테이블을 마련해 두었다." +
                        " 덕분에 기장 앞바다가 한눈에 들어오는 풍경을 즐길 수 있다."));

        cafeLocations.add(new CafeHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110153827459_oen",
                "비치다카페\n" +
                        " 주택을 리모델링한 ‘비치다카페’는 3개의 건물 동과 아이들도 뛰어 놀 수 있을 만큼 넓은 정원이 특징이다." +
                        " 각 동마다 루프탑이 있어 시원한 바다 바람과 함께 푸른 하늘을 감상할 수 있다." +
                        " 가장 높은 루프탑에선 기장 바다풍경과 더불어 빨강, 하양 방파제를 눈에 담을 수 있다."));

        RecyclerView.Adapter adapter = new CafeAdapter(cafeLocations);
        cafeRecycler.setAdapter(adapter);
    }
}