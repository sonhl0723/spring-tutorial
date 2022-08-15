package com.springtutorial.ecommerce.member;

public interface MemberService {
    void join(Member member); // 회원 추가 로직 로드
    Member findMember(Long memberId); // 회원 조회 로직 로드
}
