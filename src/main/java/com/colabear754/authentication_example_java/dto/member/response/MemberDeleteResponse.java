package com.colabear754.authentication_example_java.dto.member.response;

import io.swagger.v3.oas.annotations.media.Schema;

public record MemberDeleteResponse(
        @Schema(description = "회원 삭제 성공 여부", example = "true")
        boolean result
) {
}
