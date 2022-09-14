package com.springtutorial.ecommerce.discount;

import com.springtutorial.ecommerce.member.Grade;
import com.springtutorial.ecommerce.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{
    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        }
        else {
            return 0;
        }
    }
}
