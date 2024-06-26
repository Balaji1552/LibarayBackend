package com.balaji.libraryApp.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.balaji.libraryApp.model.Member;
import com.balaji.libraryApp.service.MemberService;

@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    MemberService memberService;

      @GetMapping("/all")
     public List<Member> getMembers(){
        return memberService.getMemberss();
     }
    @GetMapping("/{id}")
    public Member getMember(@PathVariable Integer id){
      
        return memberService.getMember(id);
    }


    
    @PutMapping("/update")
    public Member updateMember(@RequestBody Member member){
        return memberService.updatee(member);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMember(@PathVariable Integer id){
        return memberService.deletee(id);
    }

    @PutMapping("/store")
    public Member saveMember(@RequestBody Member member){
     return memberService.create(member);
    }

    
}
