package com.colabear754.authentication_example_java.dto.member.response;

import com.colabear754.authentication_example_java.common.MemberType;
import com.colabear754.authentication_example_java.entity.Member;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;
import java.util.UUID;

public record MemberInfoResponse(
        @Schema(description = "회원 고유키", example = "c0a80121-7aeb-4b4b-8b0a-6b1c032f0e4a")
        UUID id,
        @Schema(description = "회원 아이디", example = "colabear754")
        String account,
        @Schema(description = "회원 이름", example = "콜라곰")
        String name,
        @Schema(description = "회원 나이", example = "30")
        Integer age,
        @Schema(description = "회원 타입", example = "USER")
        MemberType type,
        @Schema(description = "회원 생성일", example = "2023-05-11T15:00:00")
        LocalDateTime createdAt
) {
    public static MemberInfoResponse from(Member member) {
        return new MemberInfoResponse(
                member.getId(),
                member.getAccount(),
                member.getName(),
                member.getAge(),
                member.getType(),
                member.getCreatedAt()
        );
    }
}
