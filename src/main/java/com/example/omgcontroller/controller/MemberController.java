package com.example.omgcontroller.controller;

import com.example.omgcontroller.model.Member;
import com.example.omgcontroller.repository.MemberRepository;
import com.example.omgcontroller.service.MemberService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
@CrossOrigin
public class MemberController {
    @Autowired
    private MemberService memberService;

    MemberController(MemberService memberService){ this.memberService = memberService; }

    @PostMapping("/create")
    Member newMember(@RequestBody Member newMember) {
        System.out.println(newMember);
        return memberService.saveMember(newMember);
    } // POST method that saves member in database

    @GetMapping("/getAll")
    public List<Member> findAllById(@PathVariable Long id) {
        return memberService.findAllById(id);
    } // GET method which returns all members from database.

    @Transactional
    @DeleteMapping("/deleteSingle/{id}")
    void deleteSingle(@PathVariable Long id) {
        memberService.deleteMemberById(id);
    } // A DELETE method to remove a specific member from database.
}
