package com.jue.config;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 解决：
 * 导致上述问题是因为tomcat自8.5.x系列的：8.5.12 之后版本、8.0.x系列的：8.0.42 之后版本、
 * 7.0.x系列的：7.0.76 之后版本对URL参数做了比较规范的限制，必须遵循RFC 7230 and RFC 3986
 * 规范，对于非保留字字符（json格式的请求参数）必须做转义操作，否则会抛出Invalid character
 * found in the request target. The valid characters are defined in RFC 7230 and
 * RFC 3986错误信息。就是严格按照 RFC 3986规范进行访问解析，而 RFC 3986规范定义了Url中
 * 只允许包含英文字母（a-zA-Z）、数字（0-9）、-_.~4个特殊字符以及所有保留字符(RFC3986中
 * 指定了以下字符为保留字符：! * ’ ( ) ; : @ & = + $ , / ? # [ ])。
 */
@Configuration
public class TomcatConfigurer {

    @Bean
    public TomcatServletWebServerFactory webServerFactory() {
        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
        factory.addConnectorCustomizers((Connector connector) -> {
            connector.setProperty("relaxedPathChars", "\"<>[\\]^`{|}");
            connector.setProperty("relaxedQueryChars", "\"<>[\\]^`{|}");
        });
        return factory;
    }

}