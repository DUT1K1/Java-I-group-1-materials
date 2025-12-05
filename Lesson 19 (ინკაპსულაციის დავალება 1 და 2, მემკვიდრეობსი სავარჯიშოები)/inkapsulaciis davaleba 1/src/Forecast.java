public class Forecast {
    private String cityName;
    private double windSpeed;
    private double rainPercentage;
    private boolean isRain;
    private boolean isCloudy;
    private boolean isSunny;

    public Forecast(
            String cityName,
            double windSpeed,
            double rainPercentage,
            boolean isRain,
            boolean isCloudy,
            boolean isSunny
    ) {
        this.cityName = cityName;
        this.windSpeed = windSpeed;
        this.rainPercentage = rainPercentage;
        this.isRain = isRain;
        this.isCloudy = isCloudy;
        this.isSunny = isSunny;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public double getRainPercentage() {
        return rainPercentage;
    }

    public void setRainPercentage(double rainPercentage) {
        this.rainPercentage = rainPercentage;
    }

    public boolean isRain() {
        return isRain;
    }

    public void setRain(boolean rain) {
        isRain = rain;
    }

    public boolean isCloudy() {
        return isCloudy;
    }

    public void setCloudy(boolean cloudy) {
        isCloudy = cloudy;
    }

    public boolean isSunny() {
        return isSunny;
    }

    public void setSunny(boolean sunny) {
        isSunny = sunny;
    }

    public void printWeatherInfo() {
        System.out.println("Forecast{" +
                "cityName='" + cityName + '\'' +
                ", windSpeed=" + windSpeed +
                ", rainPercentage=" + rainPercentage +
                ", isRain=" + isRain +
                ", isCloudy=" + isCloudy +
                ", isSunny=" + isSunny +
                '}');
    }

    public boolean shouldWeGoOut() {
        return !isRain && !isCloudy && isSunny && !(windSpeed >= 5);
    }
}
