package psi.vici.com.psi.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

import psi.vici.com.psi.R;
import psi.vici.com.psi.models.PsiResponse;
import psi.vici.com.psi.models.ReadingItem;

/**
 * Created by ViciRiyani on 30-Jan-18.
 */

public class InfoWindowCustomAdapter implements GoogleMap.InfoWindowAdapter {
    Context context;
    LayoutInflater inflater;
    PsiResponse data;

    public InfoWindowCustomAdapter(Context context, PsiResponse data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public View getInfoWindow(Marker marker) {
        inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = inflater.inflate(R.layout.psi_info_window, null);
        
        String title = marker.getTitle();
        
        TextView tvTitle = (TextView) v.findViewById(R.id.tvTitle);
        tvTitle.setText(title);
        
        if(data.getItems() != null && data.getItems().size() > 0) {
            TextView o3SubIndexValue = (TextView) v.findViewById(R.id.tvO3SubIndexValue);
            ReadingItem o3SubIndex = data.getItems().get(0).getReadings().getO3SubIndex();
            double o3SubIndexVal = 0;
            if (title.equalsIgnoreCase("west")) {
                o3SubIndexVal = o3SubIndex.getWest();
            } else if (title.equalsIgnoreCase("east")) {
                o3SubIndexVal = o3SubIndex.getEast();
            } else if (title.equalsIgnoreCase("north")) {
                o3SubIndexVal = o3SubIndex.getNorth();
            } else if (title.equalsIgnoreCase("south")) {
                o3SubIndexVal = o3SubIndex.getSouth();
            } else if (title.equalsIgnoreCase("central")) {
                o3SubIndexVal = o3SubIndex.getCentral();
            }
            o3SubIndexValue.setText(String.valueOf(o3SubIndexVal));

            TextView pm1024Value = (TextView) v.findViewById(R.id.tvPM1024Value);
            ReadingItem pm1024 = data.getItems().get(0).getReadings().getPm10TwentyFourHourly();
            double pm1024Val = 0;
            if (title.equalsIgnoreCase("west")) {
                pm1024Val = pm1024.getWest();
            } else if (title.equalsIgnoreCase("east")) {
                pm1024Val = pm1024.getEast();
            } else if (title.equalsIgnoreCase("north")) {
                pm1024Val = pm1024.getNorth();
            } else if (title.equalsIgnoreCase("south")) {
                pm1024Val = pm1024.getSouth();
            } else if (title.equalsIgnoreCase("central")) {
                pm1024Val = pm1024.getCentral();
            }
            pm1024Value.setText(String.valueOf(pm1024Val));

            TextView pm10Value = (TextView) v.findViewById(R.id.tvPM10SubIndexValue);
            ReadingItem pm10 = data.getItems().get(0).getReadings().getPm10SubIndex();
            double pm10Val = 0;
            if (title.equalsIgnoreCase("west")) {
                pm10Val = pm10.getWest();
            } else if (title.equalsIgnoreCase("east")) {
                pm10Val = pm10.getEast();
            } else if (title.equalsIgnoreCase("north")) {
                pm10Val = pm10.getNorth();
            } else if (title.equalsIgnoreCase("south")) {
                pm10Val = pm10.getSouth();
            } else if (title.equalsIgnoreCase("central")) {
                pm10Val = pm10.getCentral();
            }
            pm10Value.setText(String.valueOf(pm10Val));

            TextView coSubIndexValue = (TextView) v.findViewById(R.id.tvCOSubIndexValue);
            ReadingItem coSubIndex = data.getItems().get(0).getReadings().getCoSubIndex();
            double coSubIndexVal = 0;
            if (title.equalsIgnoreCase("west")) {
                coSubIndexVal = coSubIndex.getWest();
            } else if (title.equalsIgnoreCase("east")) {
                coSubIndexVal = coSubIndex.getEast();
            } else if (title.equalsIgnoreCase("north")) {
                coSubIndexVal = coSubIndex.getNorth();
            } else if (title.equalsIgnoreCase("south")) {
                coSubIndexVal = coSubIndex.getSouth();
            } else if (title.equalsIgnoreCase("central")) {
                coSubIndexVal = coSubIndex.getCentral();
            }
            coSubIndexValue.setText(String.valueOf(coSubIndexVal));

            TextView pm2524Value = (TextView) v.findViewById(R.id.tvPM2524Value);
            ReadingItem pm2524 = data.getItems().get(0).getReadings().getPm25TwentyFourHourly();
            double pm2524Val = 0;
            if (title.equalsIgnoreCase("west")) {
                pm2524Val = pm2524.getWest();
            } else if (title.equalsIgnoreCase("east")) {
                pm2524Val = pm2524.getEast();
            } else if (title.equalsIgnoreCase("north")) {
                pm2524Val = pm2524.getNorth();
            } else if (title.equalsIgnoreCase("south")) {
                pm2524Val = pm2524.getSouth();
            } else if (title.equalsIgnoreCase("central")) {
                pm2524Val = pm2524.getCentral();
            }
            pm2524Value.setText(String.valueOf(pm2524Val));

            TextView so2SubIndexValue = (TextView) v.findViewById(R.id.tvSO2SubIndexValue);
            ReadingItem so2SubIndex = data.getItems().get(0).getReadings().getSo2SubIndex();
            double so2SubIndexVal = 0;
            if (title.equalsIgnoreCase("west")) {
                so2SubIndexVal = so2SubIndex.getWest();
            } else if (title.equalsIgnoreCase("east")) {
                so2SubIndexVal = so2SubIndex.getEast();
            } else if (title.equalsIgnoreCase("north")) {
                so2SubIndexVal = so2SubIndex.getNorth();
            } else if (title.equalsIgnoreCase("south")) {
                so2SubIndexVal = so2SubIndex.getSouth();
            } else if (title.equalsIgnoreCase("central")) {
                so2SubIndexVal = so2SubIndex.getCentral();
            }
            so2SubIndexValue.setText(String.valueOf(so2SubIndexVal));

            TextView co8Value = (TextView) v.findViewById(R.id.tvCO8Value);
            ReadingItem co8SubIndex = data.getItems().get(0).getReadings().getCoEightHourMax();
            double co8Val = 0;
            if (title.equalsIgnoreCase("west")) {
                co8Val = co8SubIndex.getWest();
            } else if (title.equalsIgnoreCase("east")) {
                co8Val = co8SubIndex.getEast();
            } else if (title.equalsIgnoreCase("north")) {
                co8Val = co8SubIndex.getNorth();
            } else if (title.equalsIgnoreCase("south")) {
                co8Val = co8SubIndex.getSouth();
            } else if (title.equalsIgnoreCase("central")) {
                co8Val = co8SubIndex.getCentral();
            }
            co8Value.setText(String.valueOf(co8Val));

            TextView no2Value = (TextView) v.findViewById(R.id.tvNO2Value);
            ReadingItem no2SubIndex = data.getItems().get(0).getReadings().getNo2OneHourMax();
            double no2Val = 0;
            if (title.equalsIgnoreCase("west")) {
                no2Val = no2SubIndex.getWest();
            } else if (title.equalsIgnoreCase("east")) {
                no2Val = no2SubIndex.getEast();
            } else if (title.equalsIgnoreCase("north")) {
                no2Val = no2SubIndex.getNorth();
            } else if (title.equalsIgnoreCase("south")) {
                no2Val = no2SubIndex.getSouth();
            } else if (title.equalsIgnoreCase("central")) {
                no2Val = no2SubIndex.getCentral();
            }
            no2Value.setText(String.valueOf(no2Val));

            TextView so224Value = (TextView) v.findViewById(R.id.tvSO224Value);
            ReadingItem so224 = data.getItems().get(0).getReadings().getSo2TwentyFourHourly();
            double so224Val = 0;
            if (title.equalsIgnoreCase("west")) {
                so224Val = so224.getWest();
            } else if (title.equalsIgnoreCase("east")) {
                so224Val = so224.getEast();
            } else if (title.equalsIgnoreCase("north")) {
                so224Val = so224.getNorth();
            } else if (title.equalsIgnoreCase("south")) {
                so224Val = so224.getSouth();
            } else if (title.equalsIgnoreCase("central")) {
                so224Val = so224.getCentral();
            }
            so224Value.setText(String.valueOf(so224Val));

            TextView pm25Value = (TextView) v.findViewById(R.id.tvPM25SubIndexValue);
            ReadingItem pm25 = data.getItems().get(0).getReadings().getPm25SubIndex();
            double pm25Val = 0;
            if (title.equalsIgnoreCase("west")) {
                pm25Val = pm25.getWest();
            } else if (title.equalsIgnoreCase("east")) {
                pm25Val = pm25.getEast();
            } else if (title.equalsIgnoreCase("north")) {
                pm25Val = pm25.getNorth();
            } else if (title.equalsIgnoreCase("south")) {
                pm25Val = pm25.getSouth();
            } else if (title.equalsIgnoreCase("central")) {
                pm25Val = pm25.getCentral();
            }
            pm25Value.setText(String.valueOf(pm25Val));

            TextView psiValue = (TextView) v.findViewById(R.id.tvPSIValue);
            ReadingItem psi = data.getItems().get(0).getReadings().getPsiTwentyFourHourly();
            double psiVal = 0;
            if (title.equalsIgnoreCase("west")) {
                psiVal = psi.getWest();
            } else if (title.equalsIgnoreCase("east")) {
                psiVal = psi.getEast();
            } else if (title.equalsIgnoreCase("north")) {
                psiVal = psi.getNorth();
            } else if (title.equalsIgnoreCase("south")) {
                psiVal = psi.getSouth();
            } else if (title.equalsIgnoreCase("central")) {
                psiVal = psi.getCentral();
            }
            psiValue.setText(String.valueOf(psiVal));

            TextView o3Value = (TextView) v.findViewById(R.id.tvO3Value);
            ReadingItem o3 = data.getItems().get(0).getReadings().getO3EightHourMax();
            double o3Val = 0;
            if (title.equalsIgnoreCase("west")) {
                o3Val = o3.getWest();
            } else if (title.equalsIgnoreCase("east")) {
                o3Val = o3.getEast();
            } else if (title.equalsIgnoreCase("north")) {
                o3Val = o3.getNorth();
            } else if (title.equalsIgnoreCase("south")) {
                o3Val = o3.getSouth();
            } else if (title.equalsIgnoreCase("central")) {
                o3Val = o3.getCentral();
            }
            o3Value.setText(String.valueOf(o3Val));
        }

        return v;
    }

    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }
}
