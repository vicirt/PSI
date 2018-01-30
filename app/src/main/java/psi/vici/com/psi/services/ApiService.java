package psi.vici.com.psi.services;

import psi.vici.com.psi.models.PsiResponse;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * Created by ViciRiyani on 30-Jan-18.
 */

public interface ApiService {
    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.data.gov.sg/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();


    @GET("v1/environment/psi")
    @Headers({"api-key: sgAHT5RJ4SlIWLznEAALspKGtj5cZkgx"})
    Call<PsiResponse> getPSIData();
}
