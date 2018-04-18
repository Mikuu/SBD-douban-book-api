package com.twqa.demo.wiremock.api;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="backend")
public class MyConfig {

    private String url;
    private String path = "/v2/book/search?q={query}&count={count}&fields=publisher,price,page,id,title,images,tags,binding";

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
