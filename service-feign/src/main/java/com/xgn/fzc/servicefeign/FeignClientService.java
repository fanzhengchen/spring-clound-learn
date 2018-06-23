package com.xgn.fzc.servicefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Date: 2018-06-23
 * Time: 7:10 PM
 *
 * @author: MarkFan
 * @since v1.0.0
 */
@FeignClient(value = "service-ribbon-demo")
public interface FeignClientService {

    @GetMapping("/ribbon")
    String testFeign();
}
