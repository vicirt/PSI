package psi.vici.com.psi.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ViciRiyani on 30-Jan-18.
 */

public class PsiResponse {
    @SerializedName("region_metadata")
    @Expose
    private List<RegionMetadata> regionMetadata = null;
    @SerializedName("items")
    @Expose
    private List<Item> items = null;
    @SerializedName("api_info")
    @Expose
    private ApiInfo apiInfo;

    public List<RegionMetadata> getRegionMetadata() {
        return regionMetadata;
    }

    public void setRegionMetadata(List<RegionMetadata> regionMetadata) {
        this.regionMetadata = regionMetadata;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public ApiInfo getApiInfo() {
        return apiInfo;
    }

    public void setApiInfo(ApiInfo apiInfo) {
        this.apiInfo = apiInfo;
    }
}
