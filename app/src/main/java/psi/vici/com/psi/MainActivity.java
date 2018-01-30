package psi.vici.com.psi;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.List;

import psi.vici.com.psi.adapters.InfoWindowCustomAdapter;
import psi.vici.com.psi.models.PsiResponse;
import psi.vici.com.psi.models.RegionMetadata;
import psi.vici.com.psi.services.ApiService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private PsiResponse data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //call api service
        ApiService service = ApiService.retrofit.create(ApiService.class);
        Call<PsiResponse> psiCall = service.getPSIData();
        psiCall.enqueue(new Callback<PsiResponse>() {
            @Override
            public void onResponse(Call<PsiResponse> call, Response<PsiResponse> response) {
                //int statusCode = response.code();
                data = response.body();

                // Obtain the SupportMapFragment and get notified when the map is ready to be used.
                SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.map);
                mapFragment.getMapAsync(MainActivity.this);
            }

            @Override
            public void onFailure(Call<PsiResponse> call, Throwable t) {
                // Log error here since request failed
                Toast.makeText(MainActivity.this, "Api call failed!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Exit");
        builder.setMessage("Are You Sure?");

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                finish();
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        //Disable Map Toolbar
        mMap.getUiSettings().setMapToolbarEnabled(false);

        if(data != null) {
            mMap.setInfoWindowAdapter(new InfoWindowCustomAdapter(this, data));

            LatLng singapore = new LatLng(1.35735,103.82);
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(singapore, 10));

            List<RegionMetadata> list = data.getRegionMetadata();

            for(int i = 0; i < list.size(); i++) {
                RegionMetadata metadata = list.get(i);
                LatLng loc = new LatLng(metadata.getLabelLocation().getLatitude(), metadata.getLabelLocation().getLongitude());
                String metadataName = metadata.getName();
                mMap.addMarker(new MarkerOptions()
                        .position(loc)
                        .title(metadataName.substring(0, 1).toUpperCase() + metadataName.substring(1)));
            }
        }
    }
}
