package com.twqa.demo.wiremock.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriTemplate;

import java.net.URI;

@Service
public class Provider {

    private MyConfig myConfig = new MyConfig();

    @Autowired
    public void setMyConfig(MyConfig myConfig) {
        this.myConfig = myConfig;
    }

    public Books retrieveBooks(String query, String count) {
        String endpoint = myConfig.getUrl()+myConfig.getPath();

        URI url = new UriTemplate(endpoint).expand(query, count);

        RestTemplate client = new RestTemplate();
        return client.getForObject(url, Books.class);
    }
}
