package com.ps.projectSekaiDB.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ps.projectSekaiDB.Model.Member;
import com.ps.projectSekaiDB.Repository.MemberRepository;

@RestController
public class MemberController {
	@Autowired
	MemberRepository memberRepository;
	
	@GetMapping("/getMembers")
	public List<Member> getMembers(){
		List<Member> members = memberRepository.findAll();
		return members;
	}
	@CrossOrigin
	@GetMapping("/getMember")
	public Optional<Member> getMember(@RequestParam Long id){
		Optional<Member> member = memberRepository.findById(id);
		return member;
	}

}
