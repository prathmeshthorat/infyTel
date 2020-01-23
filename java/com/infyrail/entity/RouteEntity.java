package com.infyrail.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ROUTE")
public class RouteEntity {
	
	@Id
	@GeneratedValue
	@Column(name="ROUTE_ID")
	private int routeId;
	@Column(name = "SOURCE",nullable =false)
	private String source;
	@Column(name="DESTINATION", nullable = false)
	private String destination;	
	
	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER )
	@JoinColumn(name="TRAIN")
	private List<TrainEntity> friends=new ArrayList<>();

	public RouteEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public List<TrainEntity> getFriends() {
		return friends;
	}

	public void setFriends(List<TrainEntity> friends) {
		this.friends = friends;
	}
	
	

}
