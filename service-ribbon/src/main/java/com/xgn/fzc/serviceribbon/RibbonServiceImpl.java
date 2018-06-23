package com.xgn.fzc.serviceribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Date: 2018-06-23
 * Time: 7:22 PM
 *
 * @author: MarkFan
 * @since v1.0.0
 */
@Service
public class RibbonServiceImpl implements RibbonService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "ribbonError")
    public String ribbon() {
        return restTemplate.getForObject("http://EUREKA-CLIENT-DEMO/home", String.class);
    }

    public String ribbonError() {
        return "ribbon error";
    }
}
