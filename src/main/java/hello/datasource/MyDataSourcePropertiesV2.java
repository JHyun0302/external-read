package hello.datasource;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/**
 * 3. 외부 설정 조회 방법 - Type-safe Configuration Properties (@ConfigurationProperties)
 * - 제약이 있는 프로그램이 좋은 프로그램 :@Data -> @Getter & 생성자 주입으로 변경
 * - 문제 : 숫자의 범위 지정 불가. ex. 'maxConnection을 최소 1 이상으로 범위 지정'
 */
@Getter
@ConfigurationProperties("my.datasource")
public class MyDataSourcePropertiesV2 {
    private String url;
    private String username;
    private String password;
    private Etc etc;

    // @DefaultValue("") : 외부 설정값 없을 때 "" 값이 대신 들어감 ("" 없을 경우 기본값 들어감. 0, null)
    public MyDataSourcePropertiesV2(String url, String username, String password, @DefaultValue Etc etc) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.etc = etc;
    }

    // 외부 설정 주입 받을 객체 생성
    @Getter
    public static class Etc {
        private int maxConnection;
        private Duration timeout;
        private List<String> options = new ArrayList<>();

        public Etc(int maxConnection, Duration timeout, @DefaultValue("DEFAULT") List<String> options) {
            this.maxConnection = maxConnection;
            this.timeout = timeout;
            this.options = options;
        }
    }
}
