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

        TextView motorista = view.findViewById(R.id.motorista);
        TextView chassi = view.findViewById(R.id.chassi);
        TextView ultimaPosicao = view.findViewById(R.id.ultimaPsicao);
        TextView localizacao = view.findViewById(R.id.localizacao);
        TextView placa = view.findViewById(R.id.placa);
        TextView titulo = view.findViewById(R.id.titulo);

        titulo.setText(marker.getTitle());

        InfoWindowData infoWindowData = (InfoWindowData) marker.getTag();

        motorista.setText(infoWindowData.getMotorista());
        chassi.setText(infoWindowData.getChassi());
        ultimaPosicao.setText(infoWindowData.getUltimaPosicao());
        localizacao.setText(infoWindowData.getLocalizacao());
        placa.setText(infoWindowData.getPlaca());
        return view;
    }
}
