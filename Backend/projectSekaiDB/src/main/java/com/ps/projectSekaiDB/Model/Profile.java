package com.ps.projectSekaiDB.Model;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Profile {
	private String VA;
	private String height;
	private String birthday;
	private String hobby;
	private String specialty;
	private String favFood;
	private String dislikeFood;
	private String weakness;
	private String school;
	private String currentClass;
	private String gender;
	private String intro;
	private String introVid;
}
