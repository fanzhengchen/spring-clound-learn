package com.xgn.fzc.eurekaclient2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Date: 2018-06-23
 * Time: 6:45 PM
 *
 * @author: MarkFan
 * @since v1.0.0
 */
@RestController
public class MainController implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Value("${server.port}")
    Integer port;

    @GetMapping("/home")
    public String getHomePage() {
        return applicationContext.getId() + ":" +
                port;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
