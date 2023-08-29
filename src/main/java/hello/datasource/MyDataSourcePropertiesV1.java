package hello.datasource;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/**
 * 3. 외부 설정 조회 방법 - Type-safe Configuration Properties (@ConfigurationProperties)
 * - 공통 속성을 객체처럼 묶어서 사용하기 (my.datasource)
 * - TypeDisMatch 잡아줌.
 * - 문제 : 제약이 없음. @Setter 모두 열려있음.
 */
@Data
@ConfigurationProperties("my.datasource")
public class MyDataSourcePropertiesV1 {
    private String url;
    private String username;
    private String password;
    private Etc etc;


    // 외부 설정 주입 받을 객체 생성
    @Data
    public static class Etc {
        private int maxConnection;
        private Duration timeout;
        private List<String> options = new ArrayList<>();
    }
}
