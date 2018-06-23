package com.xgn.fzc.eurekaclient;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Date: 2018-06-23
 * Time: 5:52 PM
 *
 * @author: MarkFan
 * @since v1.0.0
 */
@RestController
public class MainController implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @GetMapping("/home")
    public String getHomePage() {
        return applicationContext.getApplicationName() + ":" +
                applicationContext.getId();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
