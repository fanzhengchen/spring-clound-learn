package com.xgn.fzc.zipkinclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Date: 2018-06-25
 * Time: 1:40 AM
 *
 * @author: MarkFan
 * @since v1.0.0
 */
@RestController
public class MainController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }
}
