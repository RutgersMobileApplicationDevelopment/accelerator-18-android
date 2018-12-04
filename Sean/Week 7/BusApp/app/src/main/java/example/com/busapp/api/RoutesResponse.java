package example.com.busapp.api;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RoutesResponse {
    @SerializedName("data")
    private Data data;

    public Data getData() {
        return data;
    }

    public class Data {
        @SerializedName("1323")
        private List<Route> routes;

        public List<Route> getRoutes() {
            return routes;
        }
    }
}
