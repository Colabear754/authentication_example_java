package com.colabear754.authentication_example_java.dto.sign_up.request;

import io.swagger.v3.oas.annotations.media.Schema;

public record SignUpRequest(
        @Schema(description = "회원 아이디", example = "colabear754")
        String account,
        @Schema(description = "회원 비밀번호", example = "1234")
        String password,
        @Schema(description = "회원 이름", example = "콜라곰")
        String name,
        @Schema(description = "회원 나이", example = "30")
        Integer age
) {
}
