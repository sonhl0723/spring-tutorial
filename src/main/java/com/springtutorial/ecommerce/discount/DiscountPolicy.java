package com.springtutorial.ecommerce.discount;

import com.springtutorial.ecommerce.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
