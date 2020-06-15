package com.example.busanapp.ui.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.busanapp.R;
import com.example.busanapp.home.Course_one_two_trip;
import com.example.busanapp.home.ImageAdapter;
import com.example.busanapp.home.RecyclerViewAdapterOneTwoTrip;

import java.util.ArrayList;
import java.util.List;

public class OneTwoFragment extends Fragment {
    private ImageAdapter adapter = new ImageAdapter();
    private RecyclerView recyclerView;


    public OneTwoFragment(){}

    private List<Course_one_two_trip> Fourth_Course;
    @Override
    public  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_main_trip, container, false);

        Fourth_Course = new ArrayList<>();
        Fourth_Course.add(new Course_one_two_trip("1박 2일에 완성하는 부산 해안선 완전 정복!", "1박 2일 여행\n",
                "★추천코스★",

                "\n" +
                        "1일차 : 영도대교 - 흰여울문화마을 / 절영해안산책로 - 태종대 - 국제시장/깡통시장 - 용두산공원\n\n" +
                        "2일차 : 해운대해수욕장 - 아쿠아리움 - 동백해안산책로(누리마루APEC하우스) - 오륙도스카이워크 - 이기대해안산책로 - 광안대교\n",

                "영도대교에서 여정을 시작한다.\n" +
                        "영도로 향하는 관문인 영도대교는 1950년대 한국전쟁으로 인해 생이별한 가족들이 훗날 만남을 기약하던 유명한 다리였다.\n" +
                        "한국 최초의 도개교로 매일 오후 2시 도개행사가 열린다.\n ",

                "흰여울문화마을과 마을 아래 절영해안산책로에서는 영화촬영 장소 찾기, 아기자기한 카페 구경하기, 바다 전망 인생샷 찍기 등으로 매번 분주하다.\n ",

                "영도에 왔다면 뛰어난 해안절경을 자랑하는 태종대도 놓쳐서는 안 된다. " +
                        "맑은 날 전망대에 오르면 대마도까지 조망할 수 있고 다누비열차를 이용해 태종대 전체를 편하게 둘러볼 수 있다.\n",

                "국제시장은 영화로 만들어질 만큼 전쟁의 슬픈 역사가 남아 있는 곳이다. 다양한 구제 물품과 수입품을 저렴한 가격에 구매할 수 있다.\n "+
                        "시간 가는 줄 모르고 시장 구경을 하다 허기가 지면 인근 깡통시장으로 걸음을 옮겨보자. 맛도 가격도 착한 주전부리의 진수가 기다리고 있다.\n",

                "국제시장에서 도보로 10분 거리에 용두산 공원이 자리해 있다. 부산 랜드마크인 부산타워 전망대는 일몰시간이면 최고의 전망을 자랑한다.\n " +
                        "땅거미가 지기 시작하면 노을에 붉게 빛나는 부산항, 영도, 남포동, 국제시장 등이 파노라마처럼 한눈에 들어온다.\n " +
                        "해가 진 후, 환상적 야경을 눈에 담으며 첫째 날을 마무리한다.\n\n",

                "해운대에서 시작하는 여행 2일차.\n " +
                        "우리나라 대표 관광지이자 많은 인파가 찾는 곳인 만큼 주변에는 숙박 시설과 오락 시설들이 잘 조성돼 있다. \n",

                "부산 대표 실내관광명소인 부산아쿠아리움에서는 살아 있는 다양한 해양생물들을 직접 눈으로 볼 수 있으며, 시간대별로 다양한 수중 공연이 펼쳐진다.\n ",

                "숲과 바다가 어우러진 명품 해안산책로 동백섬이다.\n\n " +
                        //내용전환
                        "해운대 해변 끝자락에서 시작해 누리마루APEC하우스를 거쳐 더베이101으로 이어지는 코스로 이동하거나 또는 그 반대 방향으로 코스를 잡아도 좋다.\n " +
                        "하얀 등대가 반기는 전망대에서 시원한 부산 앞바다와 웅장한 광안대교를 한눈에 조망할 수 있다.\n\n",

                "부산의 아름다운 일출과 일몰을 모두 가진 명소 오륙도다. 해맞이공원과 스카이워크에서 만나는 에메랄드 빛 부산 앞바다가 아름다운 곳이다.\n " +
                        "투명 유리바닥 스카이워크에서의 짜릿한 경험은 오륙도가 선사하는 또 다른 즐거움이다.\n ",

                "오륙도는 이기대 해안산책로로 이어진다. " +
                        "오르락 내리락 경사가 있는 트레킹 코스긴 하지만 해안을 따라 걷는 길이 보여주는 멋진 경관을 놓칠 수는 없다.\n\n",

                "★지도로 보는 추천코스★",

                "① 눈물로 약속한 공간 영도 대교\n" +
                        "② 가파른 절벽 끝에 흰여울문화마을\n" +
                        "③ 걷기만 핻 힐링, 절연해안산책로\n" +
                        "④ 영도 등대와 함께한 100년 태종대\n" +
                        "⑤ 골목골목 와글와글 국제시장\n" +
                        "⑥ 부산 먹방의 성지 부평깡통시장\n" +
                        "⑦ 부산여행의 이유 용두산공원\n" +
                        "⑧ 부산 바다의 정석, 해운대해수욕장\n" +
                        "⑨ 직접 만나는 바다 부산아쿠아리움\n" +
                        "⑩ 바다와 산, 그리고 부산을 걷다\n" +
                        "⑪ 오륙도가 전해주는 바다\n" +
                        "⑫ 부산 명품 트레킹코스 이기대 해안산책로\n" +
                        "⑬ 광안리의 밤은 당신의 낮보다 아름답다\n",

                "젊음의 열기가 넘쳐나는 도심 속 바다 광안리해수욕장에서 여유 있게 휴식을 취한다.\n\n" +
                        " 해가 지면 나타나는 다이아몬드브릿지 광안대교는 10만 가지 이상의 LED가 만들어내는 황홀한 불빛으로 광안리 해변을 물들인다.\n\n"+
                        "부산의 해안선을 따라가는 여행, 부산 바다가 간직한 여러 얼굴을 만나러 가는 길은 1박 2일이라는 시간이 결코 아깝지 않다."

                ,R.drawable.busan_1n2d,R.drawable.busan_1n2d_first,R.drawable.busan_1n2d_second,R.drawable.busan_1n2d_third,R.drawable.busan_1n2d_fourth,
                R.drawable.busan_1n2d_fifth,R.drawable.busan_1n2d_sixth,R.drawable.busan_1n2d_seventh,R.drawable.busan_1n2d_eighth,R.drawable.busan_1n2d_ninth
                ,R.drawable.busan_1n2d_tenth,R.drawable.busan_1n2d_eleventh));

        Fourth_Course.add(new Course_one_two_trip ("두 마리 토끼, 서부산과 동부산을 잡자",

                "1박 2일 여행",

                "★추천코스★",

                "\n1일차 : 태종대 - 송도해수욕장 - 감천문화마을 - 국제시장 / 깡통시장 - 용두산공원\n\n" +
                        "2일차 : 광안대교 - 해운대해수욕장 - 동백해안산책로 / 누리마루APECA하우스 - 달맞이고개 - 송정 - 해동용궁사\n",

                "영도의 남쪽 끝자락에 위치한 태종대는 울창한 숲과 절벽, 바다가 조화를 이루는 아름다운 곳이다.\n" +
                        "다누비열차를 타고 덜컹덜컹 태종대 전체를 순환해도 좋고, 해상유람선에 올라 출렁이는 파도 느끼며 태종대를 바라봐도 좋다.\n",

                "영도에서 멀지 않은 곳에 위치한 송도해수욕장은 하늘과 땅 모두에서 바다를 느낄 수 있는 곳이다.\n " +
                        "송도해상케이블카를 타고 바다 위를 나는 기분을 누렸다면, 구름산책로 위를 걸으며 투명한 바닥의 아찔함을 느껴 봐도 좋겠다.\n",

                "한국의 마추픽추라 불리는 감천문화마을은 계단식 주거형태와 미로 같은 골목길 등 독특한 경관을 자랑하는 곳이다.\n" +
                        "피난민의 터전으로 만들어 지기 시작한 마을은 이제 생활과 예술이 공존하는 명소가 됐다.\n" +
                        "설치미술품과 포토존 등이 마을 곳곳을 채우고, 예술가들이 만든 다양한 작품을 감상하며 직접 예술인과 함께하는 공방 체험에 나설 수도 있다.\n",

                "중구에 위치한 부산 대표 전통시장인 국제시장과 깡통시장도 그냥 지나칠 수 없는 장소다.\n" +
                        "국제시장에는 먹자골목, 구제용품 골목이 눈길을 끄는데 시장 내 609공간에선 다양한 문화공연까지 열린다.\n" +
                        "먹방의 진수 부평 깡통시장은 전 세계 다문화 먹거리와 공연을 즐길 수 있는 야시장이 특징이다.\n",

                "시장에서 가까운 곳에 위치한 용두산공원은 부산 시내를 한 눈에 내려다볼 수 있는 부산타워가 있는 곳이다.\n" +
                        "부산타워 전망대에서는 도시와 항구의 모습을 한 번에 내려다 볼 수 있다.\n" +
                        "해지는 부산을 바라보며 하루를 마무리해보자.\n",

                "부산바다라 하면 해운대를 빼 놓을 수 없다.\n" +
                        "희고 고운 모래를 가진 해운대 백사장과 그 끝자락에 위치한 동백섬을 놓쳐선 안 된다.\n",

                "숲과 바다가 어우러진 해안길을 따라가는 동백해안산책로에서는 바다풍경이 가장 아름다운 지점에서 APEC정상회담이 열렸던 누리마루APEC 하우스를 만나게 된다.\n",

                "달빛을 맞이하는 언덕 달맞이길의 정상에는 월출 명당 해월정이 있다.\n" +
                        "해월정에서 이어지는 문탠로드를 따라 난 해안산책로는 삼포해안길 미포와 청사포, 구덕포로 이어진다.\n",

                "국내 서핑의 메카로 떠오른 송정해수욕장에서 휴양과 레저를 동시에 즐겨보자.\n" +
                        "해양레포츠 관련 시설이 즐비하고 파도를 즐기는 서퍼들을 구경하는 것만으로도 재미가 있는 곳, 송정해수욕장이다.\n",

                "바다 위 아름다운 풍광을 자랑하는 해동용궁사는 대변항까지 이어지는 해안산책로의 시작점이다.\n" +
                        "경내 어디서든 푸른 동해 바다를 조망할 수 있는 사찰로 간절히 기도하면 한 가지 소원은 꼭 이뤄준다는 기도도량이다.\n",

                "★지도로 보는 추천코스★",

                "① 영도 등대와 함께한 100년 태종대\n" +
                        "② 100년을 넘어 다시 태어난 송도해수욕장\n" +
                        "③ 한국의 마추픽추 감천문화마을\n" +
                        "④ 골목골목 와글와글 국제시장\n" +
                        "⑤ 부산 먹방의 성지 부평깡통시장\n" +
                        "⑥ 부산여행의 이유 용두산공원\n" +
                        "⑦ 광안리의 밤은 당신의 낮보다 아름답다\n" +
                        "⑧ 부산 바다의 정석, 해운대해수욕장\n" +
                        "⑨ 바다와 산, 그리고 부산을 걷다\n" +
                        "⑩ 일출과 월출 모두를 품은 달맞이길 & 문탠로드\n",

                "\n\n*** 소개된 삼포해안길의 ‘미포철길’은 공사로 인해 2020년 6월까지 폐쇄됨을 알려드립니다. ***\n",

                R.drawable.onetwo_thumbnail,R.drawable.onetwo_pplus, R.drawable.onetwo_first, R.drawable.onetwo_second, R.drawable.onetwo_third, R.drawable.onetwo_fourth, R.drawable.onetwo_fifth
                , R.drawable.onetwo_sixth, R.drawable.onetwo_seventh, R.drawable.onetwo_eighth, R.drawable.onetwo_ninth, R.drawable.onetwo_tenth));

        RecyclerView myrv = (RecyclerView) view.findViewById(R.id.recyclerview_id);

        RecyclerView.Adapter myAdapter = new RecyclerViewAdapterOneTwoTrip(getActivity(),Fourth_Course);

        //myrv.setLayoutManager(new GridLayoutManager(this, 3));

        // 세로 레이아웃
        LinearLayoutManager verticalLayoutManager = new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL, false);

        // 레이아웃 매니저 연결
        myrv.setLayoutManager(verticalLayoutManager);

        myrv.setAdapter(myAdapter);

        return view;
    }
}
