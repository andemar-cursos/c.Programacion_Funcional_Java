package com.andemar.cursos.jobsearch.utils;

import feign.Feign;
import feign.gson.GsonDecoder;

public interface APIFunctions {

    public static <T> T buildAPI(Class<T> clazz, String url) {
        return Feign.builder()
                    .decoder(new GsonDecoder())
                    .target(clazz, url);
    }

}
