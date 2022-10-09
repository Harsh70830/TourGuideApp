package com.example.tourguideapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FoodStreetFragment extends Fragment {


    public FoodStreetFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_food_street, container, false);

        // No:- 1 vada pav activity

        TextView t1 = (TextView)view.findViewById(R.id.vada_pav_textView);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Activity_Foods_Vada_Pav.class);
                startActivity(i1);
            }
        });

        // No:-2 poran poli Activity

        TextView t2 = (TextView)view.findViewById(R.id.poran_poli_textView);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getActivity(), Activity_Foods_puran_poli.class);
                startActivity(i2);
            }
        });

        // No.3 pav bhaji activity

        TextView t3 = (TextView)view.findViewById(R.id.pav_bhaji_textView);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getActivity(), Activity_Foods_Pav_Bhaji.class);
                startActivity(i3);
            }
        });

        // No.4 Misal Pav activty

        TextView t4 = (TextView)view.findViewById(R.id.misal_pav_textView);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(getActivity(), Activity_Foods_Misal_Pav.class);
                startActivity(i4);
            }
        });

        // No. 5 Modak activity

        TextView t5 = (TextView)view.findViewById(R.id.Modak_textView);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(getActivity(), Activity_Foods_Modak.class);
                startActivity(i5);
            }
        });


        // No.6 Poha - Maharashtra food classic to breakfast rescue

        TextView t6 = (TextView)view.findViewById(R.id.Poha_textView);
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6 = new Intent(getActivity(), Activity_Foods_Poha.class);
                startActivity(i6);
            }
        });

        // No.7 Sabudana khichdi

        TextView t7 = (TextView)view.findViewById(R.id.sabudana_khichdi_textView);
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7 = new Intent(getActivity(), Activity_Foods_sabudana_khichdi.class);
                startActivity(i7);
            }
        });


        return view;
    }

}
