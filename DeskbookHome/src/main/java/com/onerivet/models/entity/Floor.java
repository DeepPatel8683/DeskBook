package com.onerivet.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "[Floor]", schema = "[Ref]")
public class Floor {
	@Id
	@Column(name = "FloorId")
	private int id;
	
	@Column(name = "FloorName")
	private String floorName;
	
	@OneToOne
	@JoinColumn(name = "CityId")
	private City city;

	
	
}
