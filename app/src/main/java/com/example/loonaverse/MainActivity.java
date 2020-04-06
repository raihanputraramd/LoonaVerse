package com.example.loonaverse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.loonaverse.Adapter.MemberAdapter;
import com.example.loonaverse.Model.Member;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMember;
    private ArrayList<Member> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list.addAll(MemberData.getListData());

        rvMember = findViewById(R.id.rv_member);
        rvMember.setHasFixedSize(true);

        showRecyclerView();
        goToProfile();
    }

    private void showRecyclerView() {
        rvMember.setLayoutManager(new LinearLayoutManager(this));
        MemberAdapter adapter = new MemberAdapter(list);
        rvMember.setAdapter(adapter);
        adapter.setOnItemClickCallback(new MemberAdapter.onItemClickCallback() {
            @Override
            public void onItemClicked(Member data) {
                showMemberData(data);
            }
        });
    }

    private void goToProfile() {
        ImageView icProfile = findViewById(R.id.ic_profile_dicoding);
        icProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
    private void showMemberData(Member member) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra(DetailActivity.DETAIL_STAGE_NAME, member.getStageName());
        intent.putExtra(DetailActivity.DETAIL_REAL_NAME, member.getRealName());
        intent.putExtra(DetailActivity.DETAIL_BIRTH_PLACE, member.getBirthPlace());
        intent.putExtra(DetailActivity.DETAIL_BIRTH_DATE, member.getBirthDate());
        intent.putExtra(DetailActivity.DETAIL_ANIMAL, member.getAnimal());
        intent.putExtra(DetailActivity.DETAIL_DEBUT, member.getDebut());
        intent.putExtra(DetailActivity.DETAIL_BLOOD_TYPE, member.getBloodType());
        intent.putExtra(DetailActivity.DETAIL_HISTORY, member.getHistory());
        intent.putExtra(String.valueOf(DetailActivity.DETAIL_PHOTO), member.getPhoto());
        startActivity(intent);
    }
}
