package com.ps.projectSekaiDB.Repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ps.projectSekaiDB.Model.Unit;

@SpringBootTest
class UnitRepositoryTest {
	@Autowired
	private UnitRepository unitRepository;
	
	@Test
	public void addUnit() {
		Unit unit = Unit.builder().intro("Kanade Yoisaki is a member of a peculiar group of musicians who communicate through a voice chat app called Nightcord, but don't know each other in real life. Everything is going well and they're happily making music together, until one day one of the members becomes unreachable.")
				.logo("https://i.ibb.co/R2QdQkV/logo-nightcode.png")
				.name("Nightcord at 25:00")
				.background("https://i.ibb.co/K7VXb9f/bg-05.jpg")
				.color("#884499")
				.sekaiDesc("Their Sekai is an empty world with nothing in it except for a few dim rays of light, broken stage equipment, and black pyramids.")
				.sekaiIcon("https://i.ibb.co/YLht3Df/img-worldmap-areas10.png")
				.build();
		unitRepository.save(unit);
	}
	/*@Test
	public void showUnits() {
		List<Unit> units = unitRepository.findAll();
		System.out.println("units: " + units);
	}*/

}
