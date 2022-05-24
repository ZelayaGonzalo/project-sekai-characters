package com.ps.projectSekaiDB.Repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import com.ps.projectSekaiDB.Model.Profile;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ps.projectSekaiDB.Model.Member;

@SpringBootTest
class MemberRepositoryTest {
	@Autowired
	private MemberRepository memberRepository;

	@Test
	void addMember() {
		Profile profile = Profile.builder()
				.gender("Secret")
				.VA("Hinata Sato")
				.birthday("Aug.27")
				.height("163 cm")
				.school("Kamiyama High School")
				.currentClass("1-A")
				.hobby("Making videos, collages")
				.specialty("Redesigning Clothes")
				.favFood("Curry rice, French fries")
				.dislikeFood("Mushrooms")
				.weakness("Foods that are too hot")
				.intro("Kind of moody and obsessed with anything cute. Falling in love with one of Kanade's songs found at random online, Mizuki created a music video for it, which in turn caught Kanade's attention. That's how Mizuki became the group's animator. Friends though they may be, Mizuki keeps a big secret from the rest of the group.")
				.introVid("")
				.build();
		Member member = Member.builder()
				.name("Akiyama Mizuki")
				.originalName("瑞希 暁山")
				.label("https://i.ibb.co/G7hhCvs/chr-v-lb-20.webp")
				.icon("https://i.ibb.co/p3vbX2B/Mizuki-circle.webp")
				.image("https://i.ibb.co/51xHMGt/Mizuki.png")
				.color("#ddaacc")
				.showOrder(1)
				.profile(profile)
				.build();
		memberRepository.save(member);
	}
	@Test
	void getMembers() {
		List<Member> members= memberRepository.findAll();
		System.out.println("members: "+ members);
		
	}
	@Test
	void getMember(){
		Optional<Member> member = memberRepository.findById(Long.valueOf(1));
		System.out.println("member:" + member);
	}
}
