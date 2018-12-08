package qy.springclout.apigateway;

import com.netflix.hystrix.HystrixCommandProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.client.ConfigServicePropertySourceLocator;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: Jaden
 * @Description:
 * @Date: Created in 10:43 2018/12/8
 * @Modified By:
 */

@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
public class ZuulApiGatewayApplication {
    public static void main(String[] args) {
        HystrixCommandProperties.Setter()
                .withExecutionTimeoutEnabled(false);
        HystrixCommandProperties.Setter()
                .withExecutionTimeoutInMilliseconds(61000);
        SpringApplication.run(ZuulApiGatewayApplication.class, args);
    }
}
