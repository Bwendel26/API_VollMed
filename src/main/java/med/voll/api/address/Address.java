package med.voll.api.address;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import med.voll.api.doctor.DataDoctorRegister;

@Embeddable
public class Address {
    private String  country;
    private String state;
    private String city;
    @Column(name = "postal_code")
    private String postalCode;
    private String district;
    private String street;
    private String number;

    public Address() {}

    public Address(String country, String state, String city, String postalCode, String district, String street, String number) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.postalCode = postalCode;
        this.district = district;
        this.street = street;
        this.number = number;
    }

    public Address(DataAddress data) {
        this.country = data.country();
        this.state = data.state();
        this.city = data.city();
        this.postalCode = data.postalCode();
        this.district = data.district();
        this.street = data.street();
        this.number = data.number();
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getDistrict() {
        return district;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }
}
