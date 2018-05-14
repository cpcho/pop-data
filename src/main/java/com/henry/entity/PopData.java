package com.henry.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity(name = "Henry")
@Table(name = "popData")
public class PopData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@JsonProperty("concat_id")
	private String concatId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("state")
	private String state;
	@JsonProperty("county")
	private String county;
	@JsonProperty("lat")
	private String lat;
	@JsonProperty("lon")
	private String lon;
	@JsonProperty("pop")
	private String pop;
	@JsonProperty("den")
	private String den;

	public String getConcatId() {
		return concatId;
	}

	public void setConcatId(String concatId) {
		this.concatId = concatId;
	}

	public String getDen() {
		return den;
	}

	public void setDen(String den) {
		this.den = den;
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

	public String getPop() {
		return pop;
	}

	public void setPop(String pop) {
		this.pop = pop;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public PopData() {
	}
}
