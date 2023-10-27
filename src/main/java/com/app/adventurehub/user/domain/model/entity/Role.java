package com.app.adventurehub.user.domain.model.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@With
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "roles")
public class Role {
	@Id
	@Column(name = "role_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;
}