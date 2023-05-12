package com.colabear754.authentication_example_java.repository;

import com.colabear754.authentication_example_java.common.MemberType;
import com.colabear754.authentication_example_java.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface MemberRepository extends JpaRepository<Member, UUID> {
    Optional<Member> findByAccount(String account);
    List<Member> findAllByType(MemberType type);
}
