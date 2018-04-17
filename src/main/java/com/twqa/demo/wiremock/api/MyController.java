package com.twqa.demo.wiremock.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private Provider service;

    @GetMapping("/douban/book/search")
    public Books searchBook(@RequestParam("query") String query,
                            @RequestParam("count") String count) {
        return service.retrieveBooks(query, count);
    }
}
