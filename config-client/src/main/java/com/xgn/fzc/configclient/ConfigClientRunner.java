package com.xgn.fzc.configclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Date: 2018-06-24
 * Time: 4:56 AM
 *
 * @author: MarkFan
 * @since v1.0.0
 */
@Slf4j
@Component
public class ConfigClientRunner implements ApplicationRunner {

    private static final String KEY = "foo";

    @Autowired
    Environment environment;

    @Value("${foo}")
    String foo;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("properties {}\r\n{}\r\n", environment.getProperty(KEY), foo);
    }
}
