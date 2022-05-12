package tests;

import config.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ApiTests {

    @Test
    @Tag("api")
    public void printApiData() {
        ApiConfig config = ConfigFactory.create(ApiConfig.class, System.getProperties());
        System.out.println("baseURL = " + config.baseURL());
        System.out.println("Token = " + config.token());
    }

}