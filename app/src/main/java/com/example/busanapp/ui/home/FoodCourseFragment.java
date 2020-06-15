package com.example.busanapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.busanapp.R;
import com.example.busanapp.home.Course_Food;
import com.example.busanapp.home.RecyclerViewAdapterFoodCourse;

import java.util.ArrayList;
import java.util.List;

public class FoodCourseFragment extends Fragment {
    List<Course_Food> Fcourse;

    public FoodCourseFragment() {

    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main_food_course, container, false);

        Fcourse = new ArrayList<>();
        // 1
        Fcourse.add(new Course_Food("길에서 맛보는 부산여행의 묘미", "푸디 투어",
                "착한 가격에 높은 가성비를 자랑하는 부산만의 길거리 음식, 먹거리 투어를 하기에도 손색없는 부산만의 스트리트 푸드를 만나보자.\n",

                "씨앗호떡\n" + " 부산의 길거리 음식하면 긴 줄이 가장 먼저 떠오른 원조 씨앗호떡." +
                        " 몇 차례 방송에 소개되면서 유명해진 씨앗호떡은 '부산여행하면 꼭 맛보고 싶은 먹거리' 중 빠지지 않는 음식이다." +
                        " 기름에 노릇노릇 튀겨진 호떡에 몸통 반을 갈라 고소한 견과류를 가득 넣어주는 부산만의 스타일은 타 지역에서는 전혀 맛볼 수 없는 음식이었다." +
                        " 달고 고소한 맛의 어울림이 일품인 이 호떡은 오독오독 식감까지 매력적이다.\n",

                "비빔당면\n" + " 전국을 통 틀어서 부산에만 있다는 비빔당면." +
                        " 바삐 움직이는 시장 상인이 급히 만들어 허기를 채우던 음식에서 시작했으나, 이제는 부평 깡통시장의 상징과도 같은 음식이 됐다." +
                        " 비빔당면은 여러 재료를 기름에 볶아 간장 양념하는 잡채와는 달리, 삶은 당면에 여러 고명을 얹어 새빨간 양념을 비벼 먹는 것이 특징이다." +
                        " 특별할 것 없어 보이지만 매콤한 양념에 씹히는 재료들이 어우러진 맛은 중독성이 강하다." +
                        " 시장의 키작은 의자에 삼삼오오 모여 앉아 아주머니들이 바로 해주시는 비빔당면을 후루룩 말아 먹는 경험은 부산에서만 느낄 수 있는 재미다.\n",

                "유부주머니\n" +
                        " 복주머니 형태를 가진 유부주머니는 당면과 채소로 속이 꽉 차 있는 음식이다." +
                        " 미나리나 파로 주머니를 감싼 모양이 제법 먹음직스럽다. 보통 어묵과 곁들여 유부주머니전골로 즐기는데," +
                        " 유부주머니를 터트리기 전 맑은 국믈을 먼저 맛보고, 터뜨린 후 당면과 채소가 어우러진 고소한 국물을 즐기면 두 가지 맛을 한 번에 느낄 수 있다.\n",

                "오징어무침&정구지 지짐(부추전)\n" +
                        " 오징어무침을 길거리에서 먹는다니 조금 낯설기도 하다." +
                        " 그러나 남포동 골목에서 서서 먹는 오징어무침과 정구지 지짐을 한 번 맛보면 그 맛의 매력을 쉽게 잊을 수 없다." +
                        " 매콤 새콤한 오징어무침과 넓은 철판에 바삭하게 구워낸 정구지 지짐의 궁합은 가히 최고라 할 수 있다." +
                        " 기름에 고소하게 구운 만두와 세트로 먹는 것도 괜찮은 조합이다.\n",

                "부평시장 떡볶이·오뎅\n" +
                        " 부평 깡통시장에는 많은 떡볶이 집들이 있다." +
                        " 매체에 소개되면서 유명세를 탄 떡볶이부터 오랜 시간동안 자리를 지켜온 분식집까지." +
                        " 부평시장에 가면 부산 떡볶이 특유의 맛을 제대로 느낄 수 있다." +
                        " 이곳의 떡볶이 떡은 주로 두꺼운 가래떡을 사용해 쫀득한 식감이 특징인데, 가래떡을 어묵처럼 꼬치에 꽂아 먹는 물떡도 부산·경상도만의 스타일이다." +
                        " 일제강점기를 지나며 다양한 맛의 어묵을 생산하기 시작한 것도 부산이 가장 먼저다.\n",

                " 이 외에도 겨울에는 단팥죽, 여름에는 팥빙수를 포함, 오며가며 손이 가는 회오리 감자칩 등도 길거리에서 즐길 수 있는 부산의 맛이다." +
                        "\n\n" + " 맛은 기본, 상인들의 넉넉한 인심까지 느낄 수 있는 부산 길거리 음식." +
                        " 마음까지 든든하게 채우고 싶은 여행자라면 빨리 부산으로 떠나자.",

                R.drawable.street_1, R.drawable.street_2, R.drawable.street_3, R.drawable.street_4,
                R.drawable.street_5, R.drawable.street_6, R.drawable.street_7));

        // 2
        Fcourse.add(new Course_Food("맛의 핫플! 초량 돼지갈비 골목 & 불백 거리", "푸디 투어",
                " 초량 돼지갈비 골목과 초량 불백(불고기 백반) 거리는 부산의 많은 먹자골목 가운데서도 유독 남녀노소 모두의 사랑을 독차지하는 곳이다.\n",

                " 초량돼지갈비 골목의 시작은 6·25전쟁으로 거슬러 올라간다." +
                        " 당시 부산에는 많은 피난민이 몰려들었다." +
                        " 초량동은 피난민 거주지와 도심을 연결하는 가운데쯤이었는데 이때부터 값싼 돼지갈비 집이 하나둘 들어서게 된다." +
                        " 그러다 미국의 원조 용품이 들어오고 부산항 등에서 일하는 노동자가 급증하면서 1950년대 후반부터 상권이 형성된다." +
                        " 게다가 초량동 인근 산복도로에 노동자들이 터전을 잡자 이때부터 돼지갈비 골목으로 본격 이름이 난다.\n",

                " 30년 넘게 골목을 가득 채우던 고기 굽던 연기는 1990년대 부산항의 기능 이전과 자동화 등이 겹치며 시들해져 갔다." +
                        " 사람이 없으니 상권도 차츰 힘을 잃어 간 것." +
                        " 이때부터 돼지갈비 골목의 주 고객이 차츰 가족단위 지역주민으로 변해 간다." +
                        " 그러던 중 국내 여행 활성화 등이 맞물리며 이제는 어느덧 부산 대표 먹자골목으로 한축을 담당하고 있다.\n",

                " 40년 넘게 한 자리를 지켜온 전통 있는 가게에서 뿜어내는 달짝지근한 돼지갈비 냄새에 이끌려 자리를 잡으면 주인장의 음식솜씨를 가늠해 볼 수 있는 밑반찬이 먼저 오른다." +
                        " 신선한 샐러드는 허기진 빈속을 달래주고 돼지갈비와 찰떡궁합을 자랑하는 백김치는 없으면 서운하다." +
                        " 고춧가루와 참기름으로 버무린 깔끔한 파채는 특유의 생생한 자태를 뽐낸다." +
                        " 숯불에 달궈진 석쇠 위에 돼지갈비를 올리면 지글거리는 소리가 침샘을 자극하고 연기를 타고 풍기는 불향이 입맛을 다시게 한다.\n",

                " 돼지갈비 골목 인근에는 초량 불백 거리다." +
                        " 일명 육(肉)거리라 불리는 이곳은 최고의 가성비로 이름난 곳이다." +
                        " 이 골목 불백은 택시기사들 사이에서 먼저 입소문이 나기 시작했다." +
                        " 사실 기사식당이란 간판을 달고 있는 집은 예전부터 싸고 맛있는 집이 많았다." +
                        " 부산 초량 불백 거리도 비싼 돈 들이지 않고 맛 좋은 불고기에 쌈을 즐길 수 있었으니 택시기사들 사이에서 인기 만점인 장소였다.\n",

                " 그랬던 불백 거리가 이제는 전국적 맛집 골목으로 알려지면서 여행자들이 제법 찾는 장소가 됐다.\n" +
                        " 불향 가득 입혀진 간장, 고추장 불고기에 어우러진 밑반찬, 거기에 갓 지은 고슬고슬한 쌀밥은 몇 십 년을 이어오는 불백 거리의 힘이다." +
                        " 젊은이들의 입맛을 저격한 치즈 불백과 같은 신메뉴 뿐만 아니라 오리불고기, 순두부찌개, 돌솥비빔밥 등 다양한 메뉴를 함께 즐길 수 있는 것도 이 골목의 장점이다.\n",

                " 불백 거리의 모든 가게가 저마다 원조를 자처하지만 고민을 길게 할 필요는 없다." +
                        " 대부분의 가게들이 기본 이상의 맛과 착한 가격을 보장하니 말이다.\n\n" +
                        " 어머니의 손맛을 느낄 수 있는 든든한 불고기백반, 남다른 감칠맛 자랑하는 돼지갈비까지." +
                        " 부산에서 고기 맛을 제대로 느끼고 싶다면 일단 초량으로 가보자.\n",

                R.drawable.fork_1, R.drawable.fork_2, R.drawable.fork_3, R.drawable.fork_4, R.drawable.fork_5, R.drawable.fork_6, R.drawable.fork_7));

        //3
        Fcourse.add(new Course_Food("낭만 추억 만들어 주는 해운대 포장마차", "푸디 투어",
                " 해운대 해변을 따라 줄지어 자리한 포장마차가 눈에 들어온다." +
                        " 저녁이 되면 거대한 마천루 아래 알록달록 불을 밝히는 해운대 포장마차는 그 분위기마저 낭만적이다.\n",
                " 포차마다 구비된 수조에는 전복, 개불, 멍게, 소라 등 내로라하는 부산의 해산물들이 가득 담겨있다." +
                        " 실제 해수를 사용해 신선도를 유지하니 해산물의 바다맛이 고스란히 전달된다.\n",
                " 해운대 포장마차촌은 미식여행의 색다른 재미를 선사하는 곳이자, 투박하지만 정겨운 부산 사람의 인심을 담을 수 있는 곳이기도 하다.\n",
                "", "", "", "",
                R.drawable.snackcart_1, R.drawable.snackcart_2, R.drawable.snackcart_3, 0, 0, 0, 0));

        RecyclerView myrv = view.findViewById(R.id.F_recyclerview_id);
        RecyclerView.Adapter myAdapter = new RecyclerViewAdapterFoodCourse(getActivity(), Fcourse);

        // 가로 레이아웃
        LinearLayoutManager verticalLayoutManager = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false);

        // 레이아웃 매니저 연결
        myrv.setLayoutManager(verticalLayoutManager);

        myrv.setAdapter(myAdapter);

        return view;
    }
}