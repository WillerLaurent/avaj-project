package fr.fortytwolyon.avaj;

public class Coordinates {
    int longitude;
    int latitude;
    int height;

    private Coordinates(int longitude, int latitude, int height) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.height = height;
    }

    public int getLongitude() {
        return longitude;
    }

    public int getlatitude() {
        return latitude;
    }

    public int getHeight() {
        return height;
    }
}
