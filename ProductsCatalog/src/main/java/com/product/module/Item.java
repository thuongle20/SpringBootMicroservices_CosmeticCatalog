package com.product.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class Item {

	public Item() {

	}

	public Item(String name) {
		this.name = name;
	}

	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String name;

	public Long getId() {
		return this.id;

	}

	public String getName() {
		return this.name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
}
