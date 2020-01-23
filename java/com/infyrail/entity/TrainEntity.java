package com.infyrail.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TRAIN")
public class TrainEntity {
	
	@Id()
	@GeneratedValue
	@Column(name = "TRAIN_ID")
	private int trainId;
	@Column(name = "TRAIN_NAME", nullable = false)
	private String trainName;
	@Column(name = "ARRIVAL_TIME" , nullable = false)
	private String arrivalTime;
	@Column(name = "DEPARTURE_TIME", nullable = false)
	private String departureTime;
	@Column(name = "FARE", nullable = false)
	private Double fare;
	public TrainEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTrainId() {
		return trainId;
	}
	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public Double getFare() {
		return fare;
	}
	public void setFare(Double fare) {
		this.fare = fare;
	}
	
	
		

}
