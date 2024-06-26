package com.balaji.libraryApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.balaji.libraryApp.model.Member;

@Service
public interface MemberService {

    public Member create(Member munber);
    public List<Member> getMemberss();
    public Member getMember(Integer id);
    public Member updatee(Member member);
    public String deletee(Integer id);
} 
    

