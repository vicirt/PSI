package psi.vici.com.psi.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ViciRiyani on 30-Jan-18.
 */

public class Item {
    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    @SerializedName("update_timestamp")
    @Expose
    private String updateTimestamp;
    @SerializedName("readings")
    @Expose
    private Readings readings;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    public Readings getReadings() {
        return readings;
    }

    public void setReadings(Readings readings) {
        this.readings = readings;
    }
}
