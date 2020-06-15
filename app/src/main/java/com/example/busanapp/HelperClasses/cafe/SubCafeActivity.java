package com.example.busanapp.HelperClasses.cafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.busanapp.HelperClasses.cafe.city.BukGu;
import com.example.busanapp.HelperClasses.cafe.city.BusanJinGu;
import com.example.busanapp.HelperClasses.cafe.city.DongGu;
import com.example.busanapp.HelperClasses.cafe.city.DongRaeGu;
import com.example.busanapp.HelperClasses.cafe.city.GangSeoGu;
import com.example.busanapp.HelperClasses.cafe.city.GeumJeongGu;
import com.example.busanapp.HelperClasses.cafe.city.GiJangGun;
import com.example.busanapp.HelperClasses.cafe.city.HaeWoonDae;
import com.example.busanapp.HelperClasses.cafe.city.JungGu;
import com.example.busanapp.HelperClasses.cafe.city.NamGu;
import com.example.busanapp.HelperClasses.cafe.city.SaHaGu;
import com.example.busanapp.HelperClasses.cafe.city.SaSangGu;
import com.example.busanapp.HelperClasses.cafe.city.SeoGu;
import com.example.busanapp.HelperClasses.cafe.city.SuYoungGu;
import com.example.busanapp.HelperClasses.cafe.city.YeonJeGu;
import com.example.busanapp.HelperClasses.cafe.city.YoungDoGu;
import com.example.busanapp.R;

public class SubCafeActivity extends AppCompatActivity {
    JungGu jungGu;
    SeoGu seoGu;
    DongGu dongGu;
    NamGu namGu;
    YoungDoGu youngDoGu;
    BusanJinGu busanJinGu;
    HaeWoonDae haeWoonDae;
    DongRaeGu dongRaeGu;
    BukGu bukGu;
    SaSangGu saSangGu;
    GiJangGun giJangGun;
    SaHaGu saHaGu;
    GeumJeongGu geumJeongGu;
    GangSeoGu gangSeoGu;
    YeonJeGu yeonJeGu;
    SuYoungGu suYoungGu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_cafe);

        jungGu = new JungGu();
        seoGu = new SeoGu();
        dongGu = new DongGu();
        namGu = new NamGu();
        youngDoGu = new YoungDoGu();
        busanJinGu = new BusanJinGu();
        haeWoonDae = new HaeWoonDae();
        dongRaeGu = new DongRaeGu();
        bukGu = new BukGu();
        saSangGu = new SaSangGu();
        giJangGun = new GiJangGun();
        saHaGu = new SaHaGu();
        geumJeongGu = new GeumJeongGu();
        gangSeoGu = new GangSeoGu();
        yeonJeGu = new YeonJeGu();
        suYoungGu = new SuYoungGu();

        Button btn_j = findViewById(R.id.JungGu);
        btn_j.setOnClickListener(v -> getSupportFragmentManager().beginTransaction().replace(R.id.container, jungGu).commit());

        Button btn_s = findViewById(R.id.SeoGu);
        btn_s.setOnClickListener(v -> getSupportFragmentManager().beginTransaction().replace(R.id.container, seoGu).commit());

        Button btn_d = findViewById(R.id.DongGu);
        btn_d.setOnClickListener(v -> getSupportFragmentManager().beginTransaction().replace(R.id.container, dongGu).commit());

        Button btn_n = findViewById(R.id.NamGu);
        btn_n.setOnClickListener(v -> getSupportFragmentManager().beginTransaction().replace(R.id.container, namGu).commit());

        Button btn_y = findViewById(R.id.YoungDoGu);
        btn_y.setOnClickListener(v -> getSupportFragmentManager().beginTransaction().replace(R.id.container, youngDoGu).commit());

        Button btn_bj = findViewById(R.id.BusanJinGu);
        btn_bj.setOnClickListener(v -> getSupportFragmentManager().beginTransaction().replace(R.id.container, busanJinGu).commit());

        Button btn_h = findViewById(R.id.HaeWoonDae);
        btn_h.setOnClickListener(v -> getSupportFragmentManager().beginTransaction().replace(R.id.container, haeWoonDae).commit());

        Button btn_dr = findViewById(R.id.DongRaeGu);
        btn_dr.setOnClickListener(v -> getSupportFragmentManager().beginTransaction().replace(R.id.container, dongRaeGu).commit());

        Button btn_b = findViewById(R.id.BukGu);
        btn_b.setOnClickListener(v -> getSupportFragmentManager().beginTransaction().replace(R.id.container, bukGu).commit());

        Button btn_ss = findViewById(R.id.SaSangGu);
        btn_ss.setOnClickListener(v -> getSupportFragmentManager().beginTransaction().replace(R.id.container, saSangGu).commit());

        Button btn_g = findViewById(R.id.GiJangGun);
        btn_g.setOnClickListener(v -> getSupportFragmentManager().beginTransaction().replace(R.id.container, giJangGun).commit());

        Button btn_sh = findViewById(R.id.SaHaGu);
        btn_sh.setOnClickListener(v -> getSupportFragmentManager().beginTransaction().replace(R.id.container, saHaGu).commit());

        Button btn_gj = findViewById(R.id.GeumJeongGu);
        btn_gj.setOnClickListener(v -> getSupportFragmentManager().beginTransaction().replace(R.id.container, geumJeongGu).commit());

        Button btn_gs = findViewById(R.id.GangSeoGu);
        btn_gs.setOnClickListener(v -> getSupportFragmentManager().beginTransaction().replace(R.id.container, gangSeoGu).commit());

        Button btn_yj = findViewById(R.id.YeonJeGu);
        btn_yj.setOnClickListener(v -> getSupportFragmentManager().beginTransaction().replace(R.id.container, yeonJeGu).commit());

        Button btn_sy = findViewById(R.id.SuYoungGu);
        btn_sy.setOnClickListener(v -> getSupportFragmentManager().beginTransaction().replace(R.id.container, suYoungGu).commit());
    }
}