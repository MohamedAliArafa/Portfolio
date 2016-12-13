package com.arafa.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_pop_movies)
    Button btn_pop_movies;
    @BindView(R.id.btn_stock_hawk)
    Button btn_stock_hawk;
    @BindView(R.id.btn_build_bigger)
    Button btn_build_bigger;
    @BindView(R.id.btn_make_material)
    Button btn_make_material;
    @BindView(R.id.btn_go_ubiquitous)
    Button btn_go_ubiquitous;
    @BindView(R.id.btn_my_own_app)
    Button btn_my_own_app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_pop_movies,
            R.id.btn_stock_hawk,
            R.id.btn_build_bigger,
            R.id.btn_make_material,
            R.id.btn_go_ubiquitous,
            R.id.btn_my_own_app})
    public void OnClick(Button btn) {
        int id = btn.getId();
        switch (id) {
            case R.id.btn_pop_movies:
                Toast.makeText(this, getString(R.string.pop_movies_title_txt), Toast.LENGTH_SHORT).show();
            case R.id.btn_stock_hawk:
                Toast.makeText(this, getString(R.string.stock_title_txt), Toast.LENGTH_SHORT).show();
            case R.id.btn_build_bigger:
                Toast.makeText(this, getString(R.string.build_it_bigger_title_txt), Toast.LENGTH_SHORT).show();
            case R.id.btn_make_material:
                Toast.makeText(this, getString(R.string.make_app_material_title_txt), Toast.LENGTH_SHORT).show();
            case R.id.btn_go_ubiquitous:
                Toast.makeText(this, getString(R.string.go_ubiquitous_title_txt), Toast.LENGTH_SHORT).show();
            case R.id.btn_my_own_app:
                Toast.makeText(this, getString(R.string.my_own_app_title_txt), Toast.LENGTH_SHORT).show();
        }
    }
}
