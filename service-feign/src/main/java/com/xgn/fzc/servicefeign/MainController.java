package com.xgn.fzc.servicefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Date: 2018-06-23
 * Time: 7:12 PM
 *
 * @author: MarkFan
 * @since v1.0.0
 */
@RestController
public class MainController {

    @Resource
    FeignClientService service;

    @GetMapping("/feign")
    String getHomePage() {
        return service.testFeign();
    }
}
