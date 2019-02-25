package com.example.cloudconsumer9001.fallback;

import com.example.cloudconsumer9001.service.FindAllService;
import org.springframework.stereotype.Component;

/**
 * Created by junxiang on 2019/2/25 0025
 */
@Component
public class FindAllFallBack implements FindAllService {

    @Override
    public String findAll() {
        return "this is findAll's fallback method, yeah, just a fall back!";
    }
}
