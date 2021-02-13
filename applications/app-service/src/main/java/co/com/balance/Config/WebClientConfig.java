package co.com.balance.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

import javax.net.ssl.SSLException;

@Configuration
public class WebClientConfig {

    @Bean
    public WebClient createWebClient() throws SSLException {
        return WebClient.builder().baseUrl("https://red-grass-1423.getsandbox.com").build();
    }

}

