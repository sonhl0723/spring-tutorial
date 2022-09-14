package com.springtutorial.ecommerce.order;

import com.springtutorial.ecommerce.member.Grade;
import com.springtutorial.ecommerce.member.Member;
import com.springtutorial.ecommerce.member.MemberService;
import com.springtutorial.ecommerce.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {
    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        long memberId = 1L;
        Member member = new Member(memberId, "testmember", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "testitem", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
