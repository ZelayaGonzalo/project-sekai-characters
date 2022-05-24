package com.ps.projectSekaiDB.Model.Card;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stats {
	private int power;
	private int performance;
	private int stamina;
	private int technique;
}
