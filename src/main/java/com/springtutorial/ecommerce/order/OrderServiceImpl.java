package com.springtutorial.ecommerce.order;

import com.springtutorial.ecommerce.discount.DiscountPolicy;
import com.springtutorial.ecommerce.discount.FixDiscountPolicy;
import com.springtutorial.ecommerce.member.Member;
import com.springtutorial.ecommerce.member.MemberRepository;
import com.springtutorial.ecommerce.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
