package com.ps.projectSekaiDB.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Unit {
	@Id
	@SequenceGenerator(name="unit_seq", sequenceName = "unit_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "unit_seq")
	private Long id;
	private String name;
	private String logo;
	private String background;
	private String introVid;
	private String intro;
	private String color;
	private String sekaiDesc;
	private String sekaiIcon;
	@OneToMany(mappedBy = "unit", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	@JsonIgnoreProperties(value = {"unit","profile"})
	private List<Member> members = new ArrayList<>();

	public void addMember(Member member) {
		members.add(member);
		member.setUnit(this);
	}
	public void removeMember(Member member) {
		members.remove(member);
		member.setUnit(null);
	}
}
