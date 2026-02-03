package com.streamapi;
import java.time.*;
import java.util.*;
class Member{
	String name ;
	LocalDate expiryDate ;
	public Member(String name , LocalDate expiryDate) {
		this.name = name;
		this.expiryDate = expiryDate;
	}
}
public class FilteringExpireMembership {
	public static void main(String[] args) {
		List<Member> members = List.of(
                new Member("member1", LocalDate.now().plusDays(20)),
                new Member("member2", LocalDate.now().plusDays(40)),
                new Member("member3", LocalDate.now().plusDays(25)),
                new Member("member4", LocalDate.now().plusDays(15))
        );
		LocalDate today = LocalDate.now();
		LocalDate after30days = today.plusDays(30);
		members.stream().filter(m -> 
		!m.expiryDate.isBefore(today) && !m.expiryDate.isAfter(after30days)).forEach(m->
				System.out.println(m.name + " "+ m.expiryDate));
		
	}
}
