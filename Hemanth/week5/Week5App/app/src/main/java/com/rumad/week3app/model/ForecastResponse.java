package com.rumad.week3app.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ForecastResponse {


    /**
     * cod : 200
     * message : 0.0046
     * cnt : 40
     * list : [{"dt":1540944000,"main":{"temp":270.44,"temp_min":269.08,"temp_max":270.44,"pressure":1033.91,"sea_level":1055.13,"grnd_level":1033.91,"humidity":88,"temp_kf":1.36},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"02n"}],"clouds":{"all":8},"wind":{"speed":5,"deg":136.504},"sys":{"pod":"n"},"dt_txt":"2018-10-31 00:00:00"},{"dt":1540954800,"main":{"temp":269.57,"temp_min":268.549,"temp_max":269.57,"pressure":1033.55,"sea_level":1054.82,"grnd_level":1033.55,"humidity":88,"temp_kf":1.02},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"02n"}],"clouds":{"all":8},"wind":{"speed":5.02,"deg":139.5},"sys":{"pod":"n"},"dt_txt":"2018-10-31 03:00:00"},{"dt":1540965600,"main":{"temp":269.91,"temp_min":269.224,"temp_max":269.91,"pressure":1033.31,"sea_level":1054.42,"grnd_level":1033.31,"humidity":83,"temp_kf":0.68},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03d"}],"clouds":{"all":44},"wind":{"speed":5.57,"deg":147.5},"sys":{"pod":"d"},"dt_txt":"2018-10-31 06:00:00"},{"dt":1540976400,"main":{"temp":272.63,"temp_min":272.293,"temp_max":272.63,"pressure":1033.09,"sea_level":1053.94,"grnd_level":1033.09,"humidity":78,"temp_kf":0.34},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":76},"wind":{"speed":5.56,"deg":155.504},"sys":{"pod":"d"},"dt_txt":"2018-10-31 09:00:00"},{"dt":1540987200,"main":{"temp":273.808,"temp_min":273.808,"temp_max":273.808,"pressure":1032.26,"sea_level":1053.05,"grnd_level":1032.26,"humidity":80,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":88},"wind":{"speed":5.31,"deg":164.004},"rain":{"3h":0.04},"sys":{"pod":"d"},"dt_txt":"2018-10-31 12:00:00"},{"dt":1540998000,"main":{"temp":273.644,"temp_min":273.644,"temp_max":273.644,"pressure":1031.92,"sea_level":1052.76,"grnd_level":1031.92,"humidity":86,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":80},"wind":{"speed":4.96,"deg":167.5},"rain":{"3h":0.145},"sys":{"pod":"n"},"dt_txt":"2018-10-31 15:00:00"},{"dt":1541008800,"main":{"temp":273.827,"temp_min":273.827,"temp_max":273.827,"pressure":1031.33,"sea_level":1052.31,"grnd_level":1031.33,"humidity":87,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":88},"wind":{"speed":4.96,"deg":175.007},"rain":{"3h":0.12},"sys":{"pod":"n"},"dt_txt":"2018-10-31 18:00:00"},{"dt":1541019600,"main":{"temp":274.477,"temp_min":274.477,"temp_max":274.477,"pressure":1031.63,"sea_level":1052.51,"grnd_level":1031.63,"humidity":93,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":88},"wind":{"speed":4.26,"deg":188.508},"rain":{"3h":0.185},"sys":{"pod":"n"},"dt_txt":"2018-10-31 21:00:00"},{"dt":1541030400,"main":{"temp":274.872,"temp_min":274.872,"temp_max":274.872,"pressure":1031.51,"sea_level":1052.41,"grnd_level":1031.51,"humidity":95,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":4.03,"deg":193.502},"rain":{"3h":0.4},"sys":{"pod":"n"},"dt_txt":"2018-11-01 00:00:00"},{"dt":1541041200,"main":{"temp":275.324,"temp_min":275.324,"temp_max":275.324,"pressure":1031.46,"sea_level":1052.3,"grnd_level":1031.46,"humidity":97,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":3.77,"deg":199.5},"rain":{"3h":0.12},"sys":{"pod":"n"},"dt_txt":"2018-11-01 03:00:00"},{"dt":1541052000,"main":{"temp":276.204,"temp_min":276.204,"temp_max":276.204,"pressure":1031.67,"sea_level":1052.5,"grnd_level":1031.67,"humidity":95,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":80},"wind":{"speed":3.86,"deg":204.002},"rain":{"3h":0.14},"sys":{"pod":"d"},"dt_txt":"2018-11-01 06:00:00"},{"dt":1541062800,"main":{"temp":278.652,"temp_min":278.652,"temp_max":278.652,"pressure":1031.83,"sea_level":1052.47,"grnd_level":1031.83,"humidity":91,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":88},"wind":{"speed":4.36,"deg":213.501},"rain":{"3h":0.07},"sys":{"pod":"d"},"dt_txt":"2018-11-01 09:00:00"},{"dt":1541073600,"main":{"temp":279.642,"temp_min":279.642,"temp_max":279.642,"pressure":1031.79,"sea_level":1052.4,"grnd_level":1031.79,"humidity":87,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":3.91,"deg":219.505},"rain":{"3h":0.05},"sys":{"pod":"d"},"dt_txt":"2018-11-01 12:00:00"},{"dt":1541084400,"main":{"temp":278.546,"temp_min":278.546,"temp_max":278.546,"pressure":1032.06,"sea_level":1052.64,"grnd_level":1032.06,"humidity":92,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":3.47,"deg":215.002},"rain":{"3h":0.1},"sys":{"pod":"n"},"dt_txt":"2018-11-01 15:00:00"},{"dt":1541095200,"main":{"temp":277.892,"temp_min":277.892,"temp_max":277.892,"pressure":1031.62,"sea_level":1052.36,"grnd_level":1031.62,"humidity":96,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":3.31,"deg":212.001},"rain":{"3h":0.11},"sys":{"pod":"n"},"dt_txt":"2018-11-01 18:00:00"},{"dt":1541106000,"main":{"temp":277.835,"temp_min":277.835,"temp_max":277.835,"pressure":1031.35,"sea_level":1052,"grnd_level":1031.35,"humidity":96,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":3.21,"deg":216.5},"rain":{"3h":0.15},"sys":{"pod":"n"},"dt_txt":"2018-11-01 21:00:00"},{"dt":1541116800,"main":{"temp":277.802,"temp_min":277.802,"temp_max":277.802,"pressure":1031.33,"sea_level":1051.96,"grnd_level":1031.33,"humidity":95,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":76},"wind":{"speed":3.16,"deg":224.502},"rain":{"3h":0.09},"sys":{"pod":"n"},"dt_txt":"2018-11-02 00:00:00"},{"dt":1541127600,"main":{"temp":277.468,"temp_min":277.468,"temp_max":277.468,"pressure":1030.64,"sea_level":1051.4,"grnd_level":1030.64,"humidity":95,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":2.78,"deg":221.003},"rain":{"3h":0.09},"sys":{"pod":"n"},"dt_txt":"2018-11-02 03:00:00"},{"dt":1541138400,"main":{"temp":276.514,"temp_min":276.514,"temp_max":276.514,"pressure":1030.13,"sea_level":1050.87,"grnd_level":1030.13,"humidity":95,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":0},"wind":{"speed":3.02,"deg":212.5},"rain":{"3h":0.01},"sys":{"pod":"d"},"dt_txt":"2018-11-02 06:00:00"},{"dt":1541149200,"main":{"temp":279.944,"temp_min":279.944,"temp_max":279.944,"pressure":1029.63,"sea_level":1050.12,"grnd_level":1029.63,"humidity":80,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":3.25,"deg":216.502},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-11-02 09:00:00"},{"dt":1541160000,"main":{"temp":281.616,"temp_min":281.616,"temp_max":281.616,"pressure":1028.28,"sea_level":1048.6,"grnd_level":1028.28,"humidity":73,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":3.66,"deg":210.004},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-11-02 12:00:00"},{"dt":1541170800,"main":{"temp":278.937,"temp_min":278.937,"temp_max":278.937,"pressure":1027.27,"sea_level":1047.78,"grnd_level":1027.27,"humidity":89,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02n"}],"clouds":{"all":20},"wind":{"speed":3.68,"deg":207.001},"rain":{},"sys":{"pod":"n"},"dt_txt":"2018-11-02 15:00:00"},{"dt":1541181600,"main":{"temp":278.129,"temp_min":278.129,"temp_max":278.129,"pressure":1026.16,"sea_level":1046.62,"grnd_level":1026.16,"humidity":88,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02n"}],"clouds":{"all":20},"wind":{"speed":4.01,"deg":208.502},"rain":{},"sys":{"pod":"n"},"dt_txt":"2018-11-02 18:00:00"},{"dt":1541192400,"main":{"temp":277.833,"temp_min":277.833,"temp_max":277.833,"pressure":1024.73,"sea_level":1045.29,"grnd_level":1024.73,"humidity":82,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02n"}],"clouds":{"all":24},"wind":{"speed":4.43,"deg":213.001},"rain":{},"sys":{"pod":"n"},"dt_txt":"2018-11-02 21:00:00"},{"dt":1541203200,"main":{"temp":277.416,"temp_min":277.416,"temp_max":277.416,"pressure":1023.81,"sea_level":1044.38,"grnd_level":1023.81,"humidity":83,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"clouds":{"all":44},"wind":{"speed":4.81,"deg":220.502},"rain":{},"sys":{"pod":"n"},"dt_txt":"2018-11-03 00:00:00"},{"dt":1541214000,"main":{"temp":276.809,"temp_min":276.809,"temp_max":276.809,"pressure":1021.89,"sea_level":1042.44,"grnd_level":1021.89,"humidity":88,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":56},"wind":{"speed":4.96,"deg":219.002},"rain":{},"sys":{"pod":"n"},"dt_txt":"2018-11-03 03:00:00"},{"dt":1541224800,"main":{"temp":277.686,"temp_min":277.686,"temp_max":277.686,"pressure":1020.47,"sea_level":1040.79,"grnd_level":1020.47,"humidity":83,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":76},"wind":{"speed":5.51,"deg":218.502},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-11-03 06:00:00"},{"dt":1541235600,"main":{"temp":280.178,"temp_min":280.178,"temp_max":280.178,"pressure":1019.02,"sea_level":1039.17,"grnd_level":1019.02,"humidity":76,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":6.28,"deg":222.003},"rain":{"3h":0.06},"sys":{"pod":"d"},"dt_txt":"2018-11-03 09:00:00"},{"dt":1541246400,"main":{"temp":280.101,"temp_min":280.101,"temp_max":280.101,"pressure":1017.32,"sea_level":1037.39,"grnd_level":1017.32,"humidity":94,"temp_kf":0},"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":6.51,"deg":226.003},"rain":{"3h":3.19},"sys":{"pod":"d"},"dt_txt":"2018-11-03 12:00:00"},{"dt":1541257200,"main":{"temp":280.927,"temp_min":280.927,"temp_max":280.927,"pressure":1016.18,"sea_level":1036.37,"grnd_level":1016.18,"humidity":95,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":6.37,"deg":235.001},"rain":{"3h":1.59},"sys":{"pod":"n"},"dt_txt":"2018-11-03 15:00:00"},{"dt":1541268000,"main":{"temp":282.319,"temp_min":282.319,"temp_max":282.319,"pressure":1015.66,"sea_level":1035.94,"grnd_level":1015.66,"humidity":93,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":6.27,"deg":244.5},"rain":{"3h":0.27},"sys":{"pod":"n"},"dt_txt":"2018-11-03 18:00:00"},{"dt":1541278800,"main":{"temp":282.191,"temp_min":282.191,"temp_max":282.191,"pressure":1016.95,"sea_level":1037.23,"grnd_level":1016.95,"humidity":90,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":20},"wind":{"speed":5.98,"deg":281.501},"rain":{"3h":0.18},"sys":{"pod":"n"},"dt_txt":"2018-11-03 21:00:00"},{"dt":1541289600,"main":{"temp":278.132,"temp_min":278.132,"temp_max":278.132,"pressure":1019.08,"sea_level":1039.51,"grnd_level":1019.08,"humidity":82,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":5.66,"deg":285.002},"rain":{},"sys":{"pod":"n"},"dt_txt":"2018-11-04 00:00:00"},{"dt":1541300400,"main":{"temp":277.074,"temp_min":277.074,"temp_max":277.074,"pressure":1020.32,"sea_level":1040.91,"grnd_level":1020.32,"humidity":87,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":48},"wind":{"speed":4.66,"deg":287.003},"rain":{"3h":0.029999999999999},"sys":{"pod":"n"},"dt_txt":"2018-11-04 03:00:00"},{"dt":1541311200,"main":{"temp":277.876,"temp_min":277.876,"temp_max":277.876,"pressure":1021.53,"sea_level":1042.15,"grnd_level":1021.53,"humidity":82,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":48},"wind":{"speed":3.78,"deg":282.001},"rain":{"3h":0.03},"sys":{"pod":"d"},"dt_txt":"2018-11-04 06:00:00"},{"dt":1541322000,"main":{"temp":280.126,"temp_min":280.126,"temp_max":280.126,"pressure":1022.69,"sea_level":1043.07,"grnd_level":1022.69,"humidity":80,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02d"}],"clouds":{"all":20},"wind":{"speed":4.06,"deg":276},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-11-04 09:00:00"},{"dt":1541332800,"main":{"temp":280.87,"temp_min":280.87,"temp_max":280.87,"pressure":1022.74,"sea_level":1043.03,"grnd_level":1022.74,"humidity":74,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02d"}],"clouds":{"all":24},"wind":{"speed":4.31,"deg":269.503},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-11-04 12:00:00"},{"dt":1541343600,"main":{"temp":279.266,"temp_min":279.266,"temp_max":279.266,"pressure":1022.91,"sea_level":1043.38,"grnd_level":1022.91,"humidity":81,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":56},"wind":{"speed":3.46,"deg":264.003},"rain":{},"sys":{"pod":"n"},"dt_txt":"2018-11-04 15:00:00"},{"dt":1541354400,"main":{"temp":278.104,"temp_min":278.104,"temp_max":278.104,"pressure":1022.86,"sea_level":1043.36,"grnd_level":1022.86,"humidity":88,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":80},"wind":{"speed":3.41,"deg":256.502},"rain":{},"sys":{"pod":"n"},"dt_txt":"2018-11-04 18:00:00"},{"dt":1541365200,"main":{"temp":277.39,"temp_min":277.39,"temp_max":277.39,"pressure":1023,"sea_level":1043.56,"grnd_level":1023,"humidity":91,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":80},"wind":{"speed":3.62,"deg":260.002},"rain":{},"sys":{"pod":"n"},"dt_txt":"2018-11-04 21:00:00"}]
     * city : {"id":524901,"name":"Moscow","coord":{"lat":55.7522,"lon":37.6156},"country":"RU"}
     */

    private String cod;
    private double message;
    private int cnt;
    private CityBean city;
    private List<ListBean> list;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public CityBean getCity() {
        return city;
    }

    public void setCity(CityBean city) {
        this.city = city;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class CityBean {
        /**
         * id : 524901
         * name : Moscow
         * coord : {"lat":55.7522,"lon":37.6156}
         * country : RU
         */

        private int id;
        private String name;
        private CoordBean coord;
        private String country;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public CoordBean getCoord() {
            return coord;
        }

        public void setCoord(CoordBean coord) {
            this.coord = coord;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public static class CoordBean {
            /**
             * lat : 55.7522
             * lon : 37.6156
             */

            private double lat;
            private double lon;

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLon() {
                return lon;
            }

            public void setLon(double lon) {
                this.lon = lon;
            }
        }
    }

    public static class ListBean {
        /**
         * dt : 1540944000
         * main : {"temp":270.44,"temp_min":269.08,"temp_max":270.44,"pressure":1033.91,"sea_level":1055.13,"grnd_level":1033.91,"humidity":88,"temp_kf":1.36}
         * weather : [{"id":800,"main":"Clear","description":"clear sky","icon":"02n"}]
         * clouds : {"all":8}
         * wind : {"speed":5,"deg":136.504}
         * sys : {"pod":"n"}
         * dt_txt : 2018-10-31 00:00:00
         * rain : {"3h":0.04}
         */

        private int dt;
        private MainBean main;
        private CloudsBean clouds;
        private WindBean wind;
        private SysBean sys;
        private String dt_txt;
        private RainBean rain;
        private List<WeatherBean> weather;

        public int getDt() {
            return dt;
        }

        public void setDt(int dt) {
            this.dt = dt;
        }

        public MainBean getMain() {
            return main;
        }

        public void setMain(MainBean main) {
            this.main = main;
        }

        public CloudsBean getClouds() {
            return clouds;
        }

        public void setClouds(CloudsBean clouds) {
            this.clouds = clouds;
        }

        public WindBean getWind() {
            return wind;
        }

        public void setWind(WindBean wind) {
            this.wind = wind;
        }

        public SysBean getSys() {
            return sys;
        }

        public void setSys(SysBean sys) {
            this.sys = sys;
        }

        public String getDt_txt() {
            return dt_txt;
        }

        public void setDt_txt(String dt_txt) {
            this.dt_txt = dt_txt;
        }

        public RainBean getRain() {
            return rain;
        }

        public void setRain(RainBean rain) {
            this.rain = rain;
        }

        public List<WeatherBean> getWeather() {
            return weather;
        }

        public void setWeather(List<WeatherBean> weather) {
            this.weather = weather;
        }

        public static class MainBean {
            /**
             * temp : 270.44
             * temp_min : 269.08
             * temp_max : 270.44
             * pressure : 1033.91
             * sea_level : 1055.13
             * grnd_level : 1033.91
             * humidity : 88
             * temp_kf : 1.36
             */

            private double temp;
            private double temp_min;
            private double temp_max;
            private double pressure;
            private double sea_level;
            private double grnd_level;
            private int humidity;
            private double temp_kf;

            public double getTemp() {
                return temp;
            }

            public void setTemp(double temp) {
                this.temp = temp;
            }

            public double getTemp_min() {
                return temp_min;
            }

            public void setTemp_min(double temp_min) {
                this.temp_min = temp_min;
            }

            public double getTemp_max() {
                return temp_max;
            }

            public void setTemp_max(double temp_max) {
                this.temp_max = temp_max;
            }

            public double getPressure() {
                return pressure;
            }

            public void setPressure(double pressure) {
                this.pressure = pressure;
            }

            public double getSea_level() {
                return sea_level;
            }

            public void setSea_level(double sea_level) {
                this.sea_level = sea_level;
            }

            public double getGrnd_level() {
                return grnd_level;
            }

            public void setGrnd_level(double grnd_level) {
                this.grnd_level = grnd_level;
            }

            public int getHumidity() {
                return humidity;
            }

            public void setHumidity(int humidity) {
                this.humidity = humidity;
            }

            public double getTemp_kf() {
                return temp_kf;
            }

            public void setTemp_kf(double temp_kf) {
                this.temp_kf = temp_kf;
            }
        }

        public static class CloudsBean {
            /**
             * all : 8
             */

            private int all;

            public int getAll() {
                return all;
            }

            public void setAll(int all) {
                this.all = all;
            }
        }

        public static class WindBean {
            /**
             * speed : 5
             * deg : 136.504
             */

            private double speed;
            private double deg;

            public double getSpeed() {
                return speed;
            }

            public void setSpeed(int speed) {
                this.speed = speed;
            }

            public double getDeg() {
                return deg;
            }

            public void setDeg(double deg) {
                this.deg = deg;
            }
        }

        public static class SysBean {
            /**
             * pod : n
             */

            private String pod;

            public String getPod() {
                return pod;
            }

            public void setPod(String pod) {
                this.pod = pod;
            }
        }

        public static class RainBean {
            /**
             * 3h : 0.04
             */

            @SerializedName("3h")
            private double _$3h;

            public double get_$3h() {
                return _$3h;
            }

            public void set_$3h(double _$3h) {
                this._$3h = _$3h;
            }
        }

        public static class WeatherBean {
            /**
             * id : 800
             * main : Clear
             * description : clear sky
             * icon : 02n
             */

            private int id;
            private String main;
            private String description;
            private String icon;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getMain() {
                return main;
            }

            public void setMain(String main) {
                this.main = main;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }
        }
    }
}
