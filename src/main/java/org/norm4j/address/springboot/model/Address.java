package org.norm4j.address.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String id;
    private String streetNumber;
    private String streetName;
    private String postalCode;
    private String city;
    private GeoPoint geopoint;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class GeoPoint{
        private double longitude;
        private double latitude;
    }
}


