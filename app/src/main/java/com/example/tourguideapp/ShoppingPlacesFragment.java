package com.example.tourguideapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ShoppingPlacesFragment extends Fragment {


    public ShoppingPlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_shopping_places, container, false);

        // No.1


        TextView t1 = (TextView)view.findViewById(R.id.hong_kong_lane_textView);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), acivity_shoppingPlaces_Hong_Kong_Lane.class);
                startActivity(i1);
            }
        });

        // No:2


        TextView t2 = (TextView)view.findViewById(R.id.mahatma_phule_manda_textView);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getActivity(), activity_shoppingPlaces_Mahatma_Phule.class);
                startActivity(i2);
            }
        });


        // No.3


        TextView t3 = (TextView)view.findViewById(R.id.fashion_street_textView);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getActivity(), activity_shoppingPlaces_Fashion_Street.class);
                startActivity(i3);
            }
        });

        // No.4
        // make activity ( activity_shoppingPlaces_amanaah_mall )

        TextView t4 = (TextView)view.findViewById(R.id.juna_b_textView);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(getActivity(), activity_shoppingPlaces_Juna_Bazar.class);
                startActivity(i4);
            }
        });

        // No.5
        // make activity ( activity_shoppingPlaces_packages )

        TextView t5 = (TextView)view.findViewById(R.id.mg_road_textView);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(getActivity(), activity_shoppingPlaces_M_G_Road.class);
                startActivity(i5);
            }
        });




        return view;
    }


}
