package com.company;

public interface ComService {

    default String payComServices() {
        return "People who lives in the apartment pay communicat services";
    }
}
