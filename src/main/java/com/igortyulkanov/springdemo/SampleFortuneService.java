package com.igortyulkanov.springdemo;

import lombok.Data;

import java.util.List;
@Data

public class SampleFortuneService implements FortuneService {

    private List<String> fortunes;
    @Override
    public String getFortune() {
        return "";
    }
}
