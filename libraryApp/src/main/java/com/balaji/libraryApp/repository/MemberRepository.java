package com.balaji.libraryApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balaji.libraryApp.model.Member;

public interface MemberRepository extends JpaRepository<Member,Integer> {
    
}
