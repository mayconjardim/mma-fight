package com.mmafight.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fighter implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Integer punches;
	private Integer kicks;
	private Integer hp;
	private Integer dodging;
	private Integer takedowns;
	private Integer takedownsDefense;
	private Integer gnp;
	private Integer subs;
	private Integer subDefennse;
	
	public Fighter() {
	}

	public Fighter(Long id, String name, Integer punches, Integer kicks, Integer hp, Integer dodging, Integer takedowns,
			Integer takedownsDefense, Integer gnp, Integer subs, Integer subDefennse) {
		super();
		this.id = id;
		this.name = name;
		this.punches = punches;
		this.kicks = kicks;
		this.hp = hp;
		this.dodging = dodging;
		this.takedowns = takedowns;
		this.takedownsDefense = takedownsDefense;
		this.gnp = gnp;
		this.subs = subs;
		this.subDefennse = subDefennse;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPunches() {
		return punches;
	}

	public void setPunches(Integer punches) {
		this.punches = punches;
	}

	public Integer getKicks() {
		return kicks;
	}

	public void setKicks(Integer kicks) {
		this.kicks = kicks;
	}

	public Integer getHp() {
		return hp;
	}

	public void setHp(Integer hp) {
		this.hp = hp;
	}

	public Integer getDodging() {
		return dodging;
	}

	public void setDodging(Integer dodging) {
		this.dodging = dodging;
	}

	public Integer getTakedowns() {
		return takedowns;
	}

	public void setTakedowns(Integer takedowns) {
		this.takedowns = takedowns;
	}

	public Integer getTakedownsDefense() {
		return takedownsDefense;
	}

	public void setTakedownsDefense(Integer takedownsDefense) {
		this.takedownsDefense = takedownsDefense;
	}

	public Integer getGnp() {
		return gnp;
	}

	public void setGnp(Integer gnp) {
		this.gnp = gnp;
	}

	public Integer getSubs() {
		return subs;
	}

	public void setSubs(Integer subs) {
		this.subs = subs;
	}

	public Integer getSubDefennse() {
		return subDefennse;
	}

	public void setSubDefennse(Integer subDefennse) {
		this.subDefennse = subDefennse;
	}
	
	
	

}
