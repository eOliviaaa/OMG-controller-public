package com.example.omgcontroller.service;

import com.example.omgcontroller.model.Member;

import java.util.List;

public interface MemberService {
    Member saveMember(Member member);

    List<Member> findAllById(Long id);

    void deleteMemberById(Long id);
}
