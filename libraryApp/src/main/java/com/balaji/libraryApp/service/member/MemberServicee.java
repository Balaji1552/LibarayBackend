package com.balaji.libraryApp.service.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balaji.libraryApp.model.Member;
import com.balaji.libraryApp.repository.MemberRepository;
import com.balaji.libraryApp.service.MemberService;
@Service
public class MemberServicee implements MemberService {
    @Autowired
    MemberRepository memberRepository;

    @Override
    public Member create(Member member){
        return memberRepository.save(member);
    }
    @Override
    public List<Member> getMemberss(){
        return memberRepository.findAll();
    }
     @Override
     public Member getMember(Integer id){
        return memberRepository.findById(id).get();
     }
     @Override
     public Member updatee(Member member){
        return memberRepository.save(member);
     }
     @Override
     public String deletee(Integer id){
    
        memberRepository.deleteById(id);
        return "deleted memeber row id is "+id;
     }
}
