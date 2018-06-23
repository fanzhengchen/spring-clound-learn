package com.xgn.fzc.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Date: 2018-06-23
 * Time: 6:50 PM
 *
 * @author: MarkFan
 * @since v1.0.0
 */
@RestController
public class MainController {

    @Autowired
    RibbonService ribbonService;

    @GetMapping("/ribbon")
    public String ribbon() {
        return ribbonService.ribbon();
    }
}
