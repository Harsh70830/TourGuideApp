package com.example.tourguideapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hotels, container, false);

        // No:-1


        TextView t1 = (TextView)view.findViewById(R.id.Marriott_Suites_Pune_textView);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), activity_Hotels_Marriott_Suites.class);
                startActivity(i1);
            }
        });


        // No:2


        TextView t2 = (TextView)view.findViewById(R.id.the_corinthians_resort_textView);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getActivity(), activity_hotels_The_Corinthians_Resort.class);
                startActivity(i2);
            }
        });



        // No:- 3
        // Pearl COntinental action perform and open new activity ( activity_Hotels_PC )

        TextView t3 = (TextView)view.findViewById(R.id.hyatt_textView);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getActivity(), activity_Hotels_Hyatt.class);
                startActivity(i3);
            }
        });

        // No:- 4
        // Nishat hotel action perform and open new activity ( activity_Hotels_nishat )

        TextView t4 = (TextView)view.findViewById(R.id.blue_hotel_textView);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(getActivity(), activity_Hotels_Blue_Diamond.class);
                startActivity(i4);
            }
        });

        // No:5
        // Avari lahore action perform and open new activity ( actvity_hotels_avari )

        TextView t5 = (TextView)view.findViewById(R.id.fort_hotel_textView);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(getActivity(), activity_hotels_Fort.class);
                startActivity(i5);
            }
        });





        return view;
    }


}
