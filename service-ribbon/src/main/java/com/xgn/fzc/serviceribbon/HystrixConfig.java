package com.xgn.fzc.serviceribbon;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Date: 2018-06-23
 * Time: 8:03 PM
 *
 * @author: MarkFan
 * @since v1.0.0
 */
@Configuration
public class HystrixConfig {

//    @Bean
//    public ServletRegistrationBean getServlet(){
//        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
//        ServletRegistrationBean bean = new ServletRegistrationBean();
//        bean.setLoadOnStartup(1);
//        bean.addUrlMappings("/hystrix.stream");
//        bean.setName("HystrixMetricsStreamServlet");
//        return bean;
//    }
}
