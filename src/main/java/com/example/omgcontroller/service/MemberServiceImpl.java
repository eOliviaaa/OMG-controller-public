package com.example.omgcontroller.service;

import com.example.omgcontroller.model.Member;
import com.example.omgcontroller.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberRepository memberRepository;
    @Override
    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public List<Member> findAllById(Long id) {
        return memberRepository.findAllById(id);
    }

    @Override
    public void deleteMemberById(Long id) {
        memberRepository.deleteById(id);
    }
}
