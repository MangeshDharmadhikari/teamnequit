package com.teamnequit.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.teamnequit.Activities.MemberList.ViewMemberListActivity;
import com.teamnequit.KPIActivity;
import com.teamnequit.R;
import com.teamnequit.newsletterActivity;
import com.teamnequit.referdocumentActivity;
import com.teamnequit.rulesActivity;
import com.teamnequit.teamGoalsActivity;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        //MemberList
        ImageView memberList = root.findViewById(R.id.teamMemberList);
        memberList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            startActivity(new Intent(getContext(), ViewMemberListActivity.class));
            }
        });
        ImageView teamGoals = root.findViewById(R.id.teamGoals);
        teamGoals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), newsletterActivity.class));
            }
        });

        ImageView referncedocument = root.findViewById(R.id.teamReferenceDoc);
        referncedocument.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), referdocumentActivity.class));
            }
        });
        ImageView kpiteam = root.findViewById(R.id.teamKPI);
        kpiteam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), KPIActivity.class));
            }
        });

        ImageView ruleteam = root.findViewById(R.id.teamRules);
        ruleteam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), rulesActivity.class));
            }
        });


        return root;
    }
}