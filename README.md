## Inflearn

<img src="https://github.com/JHyun0302/server/assets/60764632/24cec8a1-ddb4-42c4-8e5b-2ff8d8fe6f49"  width="600" height="300"/>

### 강의명 : [스프링 부트 - 핵심 원리와 활용](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-%ED%95%B5%EC%8B%AC%EC%9B%90%EB%A6%AC-%ED%99%9C%EC%9A%A9)

- 지식공유자 : 김영한

### 강의 내용

- 스프링 부트가 제공하는 5가지 핵심 기능
    1. 내장 서버
    2. 자동 라이브러리 관리
    3. 자동 구성
    4. 외부 설정
    5. 모니터링 & 관리 기능

- 정리 : `외부 설정 조회`
    1. **Environment**
    2. **@Value()**
        - 단점 : `@Value()` 각각 하나하나 처리해야됨.
    3. **Type-safe Configuration Properties (@ConfigurationProperties)**
        - V1 문제 : 제약이 없음. @Setter 모두 열려있음.
        - V2
            - 생성자 주입으로 변경 (제약)
            - 문제 : 검증 기능 X
        - V3 : @Validate 추가

    - .yml 파일 : 개발 서버 & 운영 서버 설정 값 관리 

              