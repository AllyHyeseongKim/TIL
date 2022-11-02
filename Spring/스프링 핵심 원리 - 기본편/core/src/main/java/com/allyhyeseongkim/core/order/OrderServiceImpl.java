package com.allyhyeseongkim.core.order;

import com.allyhyeseongkim.core.discount.DiscountPolicy;
import com.allyhyeseongkim.core.discount.FixDiscountPolicy;
import com.allyhyeseongkim.core.discount.RateDiscountPolicy;
import com.allyhyeseongkim.core.member.Member;
import com.allyhyeseongkim.core.member.MemberRepository;
import com.allyhyeseongkim.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    // private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final MemberRepository memberRepository;

    private DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = this.memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
