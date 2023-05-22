# 스프링 시큐리티와 JWT를 사용한 사용자 인증 예제 프로젝트
### 이 프로젝트는 아래 내용을 구현한 예제입니다.
- 블로그의 [[Spring Security] Spring Security와 JWT를 사용하여 사용자 인증 구현하기(Spring Boot 3.0.0 이상)](https://colabear754.tistory.com/171)에 작성한 내용을 Java로 구현한 프로젝트
- 스프링 시큐리티를 통해 비밀번호를 암호화하여 DB에 저장
- 스프링 시큐리티를 통해 DB에 저장된 사용자의 계정과 비밀번호로 로그인
- JWT를 사용하여 로그인한 사용자에게 토큰 발급
- 인가된 토큰의 권한에 따라 API 접근 권한 제어

### 브랜치 정보
- master : 설정이 완료된 브랜치
- base : 아무 설정 없이 스프링 시큐리티만 추가한 밑바탕 브랜치

### 환경 정보
- Java 19
- Spring Boot 3.0.6
- Spring Security
- Springdoc 2.1.0
- Spring Data JPA
- H2 DB
- Gradle 7.6.1
- Lombok
