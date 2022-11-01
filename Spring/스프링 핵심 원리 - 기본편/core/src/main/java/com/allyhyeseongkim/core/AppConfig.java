package com.allyhyeseongkim.core;

import com.allyhyeseongkim.core.discount.DiscountPolicy;
import com.allyhyeseongkim.core.discount.FixDiscountPolicy;
import com.allyhyeseongkim.core.discount.RateDiscountPolicy;
import com.allyhyeseongkim.core.member.MemberRepository;
import com.allyhyeseongkim.core.member.MemberService;
import com.allyhyeseongkim.core.member.MemberServiceImpl;
import com.allyhyeseongkim.core.member.MemoryMemberRepository;
import com.allyhyeseongkim.core.order.OrderService;
import com.allyhyeseongkim.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        // return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
