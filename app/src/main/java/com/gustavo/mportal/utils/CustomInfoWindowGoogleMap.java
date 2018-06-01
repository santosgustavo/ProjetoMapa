package com.gustavo.mportal.utils;

import android.content.Context;
import android.view.View;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.gustavo.mportal.projeto_mapa.R;
import android.app.Activity;
import android.widget.ImageView;
import android.widget.TextView;


import static com.gustavo.mportal.projeto_mapa.R.layout.content_info;

public class CustomInfoWindowGoogleMap implements GoogleMap.InfoWindowAdapter{

    private Context context;

    public CustomInfoWindowGoogleMap(Context ctx){
        context = ctx;
    }

    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {
        View view = ((Activity)context).getLayoutInflater()
                .inflate(content_info, null);

        TextView name_tv = view.findViewById(R.id.name);
        TextView details_tv = view.findViewById(R.id.details);

        TextView hotel_tv = view.findViewById(R.id.hotels);
        TextView food_tv = view.findViewById(R.id.food);
        TextView transport_tv = view.findViewById(R.id.transport);

        name_tv.setText(marker.getTitle());
        details_tv.setText(marker.getSnippet());

        InfoWindowData infoWindowData = (InfoWindowData) marker.getTag();

        hotel_tv.setText(infoWindowData.getHotel());
        food_tv.setText(infoWindowData.getFood());
        transport_tv.setText(infoWindowData.getTransport());

        return view;
    }
}
