package com.example.loonaverse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    public static final String DETAIL_STAGE_NAME = "detail_stage_name";
    public static final String DETAIL_REAL_NAME = "detail_real_name";
    public static final String DETAIL_BIRTH_PLACE = "detail_birth_place";
    public static final String DETAIL_BIRTH_DATE = "detail_birth_date";
    public static final String DETAIL_ANIMAL = "detail_animal";
    public static final String DETAIL_DEBUT = "detail_debut";
    public static final String DETAIL_BLOOD_TYPE = "detail_blood_type";
    public static final String DETAIL_HISTORY = "detail_history";
    public static final int DETAIL_PHOTO = 0;

    TextView tvStageName, tvRealName, tvBirthPlace, tvBirthDate, tvAnimal, tvDebut, tvBloodtype,
            tvHistory;
    ImageView ivPhoto, icBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        findIdAll();
        getAndSetDataAll();
        back();

    }

    private void findIdAll() {
        tvStageName = findViewById(R.id.tv_stage_name);
        tvRealName = findViewById(R.id.tv_real_name);
        tvBirthPlace = findViewById(R.id.tv_birth_place);
        tvBirthDate = findViewById(R.id.tv_birth_date);
        tvAnimal = findViewById(R.id.tv_animal);
        tvDebut = findViewById(R.id.tv_debut);
        tvBloodtype = findViewById(R.id.tv_blood_type);
        tvHistory = findViewById(R.id.tv_member_history);
        ivPhoto = findViewById(R.id.iv_member_detail);

    }

    private void getAndSetDataAll() {
        String stageName = getIntent().getStringExtra(DETAIL_STAGE_NAME);
        String realName = getIntent().getStringExtra(DETAIL_REAL_NAME);
        String birthPlace = getIntent().getStringExtra(DETAIL_BIRTH_PLACE);
        String birthDate = getIntent().getStringExtra(DETAIL_BIRTH_DATE);
        String animal = getIntent().getStringExtra(DETAIL_ANIMAL);
        String debut = getIntent().getStringExtra(DETAIL_DEBUT);
        String bloodType = getIntent().getStringExtra(DETAIL_BLOOD_TYPE);
        String history = getIntent().getStringExtra(DETAIL_HISTORY);
        int photos = getIntent().getIntExtra(String.valueOf(DETAIL_PHOTO), 0);

        tvStageName.setText(stageName);
        tvRealName.setText(realName);
        tvBirthPlace.setText(birthPlace);
        tvBirthDate.setText(birthDate);
        tvAnimal.setText(animal);
        tvDebut.setText(debut);
        tvBloodtype.setText(bloodType);
        tvHistory.setText(history);
        ivPhoto.setImageResource(photos);
    }

    private void back() {
        icBack = findViewById(R.id.ic_back);
        icBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
