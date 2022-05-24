package com.ps.projectSekaiDB.Model.Card;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardImages {
	private String thumbnailNormal;
	private String thumbnailTrained;
	private String normal;
	private String trained;
}
