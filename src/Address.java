public class Address {

    public Address(String city, String region) {
        this.city = city;
        this.region = region;
    }

    private String city;
    private String region;

    public String getCity() {
        return city;
    }

    public String getRegion() {
        return region;
    }

    @Override
    public String toString() {
        return "Address is " + city + ", " + region;
    }
}
