package com.ps.projectSekaiDB.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ps.projectSekaiDB.Model.Card.Card;

import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Member {
	@Id
	@SequenceGenerator(name="member_seq", sequenceName = "member_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "member_seq")
	private Long id;
	private String color;
	private String name;
	private String originalName;
	private String label;
	private String icon;
	private String image;
	private int showOrder;
	@Embedded
	private Profile profile;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="unit_id")
	@JsonIgnoreProperties(value = "members")
	private Unit unit;
	
	@OneToMany(mappedBy = "member", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonIgnore
	private List<Card> cards = new ArrayList<>() {
	};
	
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
