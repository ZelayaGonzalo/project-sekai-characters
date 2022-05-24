package com.ps.projectSekaiDB.Model.Card;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ps.projectSekaiDB.Model.Member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
	@Id
	@SequenceGenerator(name="card_seq", sequenceName = "card_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "card_seq")
	private Long id;
	private String title;
	private String attribute;
	@Embedded
	private CardImages images;
	@Embedded
	private Skills skills;
	@Embedded
	private Stats stats;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "member_id")
	@JsonIgnoreProperties(value= {"cards","profile","unit"})
	private Member member;
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Member )) return false;
        return id != null && id.equals(((Member) o).getId()); 
    }
 
    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
