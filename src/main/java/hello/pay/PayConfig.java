package hello.pay;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @Profile() : 조건에 따른 빈 등록
 * - 조건 없으면 : default
 * - "prod" 조건 맞으면 ProdPayClient
 */
@Slf4j
@Configuration
public class PayConfig {
    @Bean
    @Profile("default")
    public LocalPayClient localPayClient() {
        log.info("LocalPayClient 빈 등록");
        return new LocalPayClient();
    }

    @Bean
    @Profile("prod")
    public ProdPayClient prodPayClient() {
        log.info("ProdPayClient 빈 등록");
        return new ProdPayClient();
    }
}
