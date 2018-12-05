package example.com.busapp.api;

import com.google.gson.annotations.SerializedName;

public class Route {
    @SerializedName("long_name")
    private String longName;

    public Route(String longName) {
        this.longName = longName;
    }

    public String getLongName() {
        return longName;
    }

    @Override
    public String toString() {
        return this.longName;
    }
}
