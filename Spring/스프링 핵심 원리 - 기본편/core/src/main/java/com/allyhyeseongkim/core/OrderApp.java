package com.allyhyeseongkim.core;

import com.allyhyeseongkim.core.member.Grade;
import com.allyhyeseongkim.core.member.Member;
import com.allyhyeseongkim.core.member.MemberService;
import com.allyhyeseongkim.core.member.MemberServiceImpl;
import com.allyhyeseongkim.core.order.Order;
import com.allyhyeseongkim.core.order.OrderService;
import com.allyhyeseongkim.core.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
    }
}
