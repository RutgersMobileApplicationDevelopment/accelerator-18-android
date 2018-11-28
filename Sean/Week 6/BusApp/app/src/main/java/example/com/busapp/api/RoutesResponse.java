package example.com.busapp.api;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RoutesResponse {
    @SerializedName("body")
    Body body;

    class Body {
        @SerializedName("data")
        Data data;
    }

    class Data {
        @SerializedName("1323")
        List<Route> routes;
    }
}
