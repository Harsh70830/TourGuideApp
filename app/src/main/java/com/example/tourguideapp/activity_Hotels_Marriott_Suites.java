package com.example.tourguideapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class activity_Hotels_Marriott_Suites extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId())
        {
            case android.R.id.home:
                finish();
                break;
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__hotels__marriott_suites);


        ImageView i1 = (ImageView)findViewById(R.id.call_icon_image);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Intent.ACTION_DIAL);
                i1.setData(Uri.parse("tel:8446310595"));
                if(i1.resolveActivity(getPackageManager()) != null) {
                    startActivity(i1);
                }
            }
        });

        ImageView i2 = (ImageView)findViewById(R.id.web_search_image);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String info = "https://www.tripadvisor.in/Commerce?p=Marriott_BA&src=183959614&geo=1218851&from=Hotel_Review&area=&slot=1&matchID=1&oos=0&cnt=1&silo=38059&bucket=934872&nrank=1&crank=1&clt=CLD&ttype=ContactLinkDesktop&tm=244882167&managed=false&capped=false&gosox=g3xMt9YCHBy3ZUg-YypssegjQviHlJQg6b-lnBPg98x_z9Z0XP9pjcZi3RyRnEOZbo07uA1wbR8X4-rTy09lJw8Ve_dn1vbq3-450AtB30k&adults=2&child_rm_ages=&inDay=16&outDay=17&rooms=1&dated=true&inMonth=10&inYear=2022&outMonth=10&outYear=2022&def_d=true&bapid=1&cs=1d20a7bcf1631a5cc952777bec1c231ac&ba_uid=84aea5f1-6d89-44db-9c3c-0e0cbd06359b";
                Intent i2 = new Intent(Intent.ACTION_WEB_SEARCH);
                i2.putExtra(SearchManager.QUERY, info);
                if (i2.resolveActivity(getPackageManager()) != null) {
                    startActivity(i2);
                }
            }
        });

        ImageView i3 = (ImageView)findViewById(R.id.google_map_search_image);
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Marriott+Suites+Pune/@18.5327439,73.9083185,17z/data=!3m1!4b1!4m8!3m7!1s0x3bc2c1a06bffbc65:0xe493a8c1eb6316!5m2!4m1!1i2!8m2!3d18.5327439!4d73.9105072");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if(mapIntent.resolveActivity(getPackageManager()) != null)
                {
                    startActivity(mapIntent);
                }

            }
        });

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

    }
}
