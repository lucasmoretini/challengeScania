package br.com.app.challenge.scania.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = true)
	private String description;
	@Column(nullable = false)
	private int price;
	@Column(nullable = false)
	private double topSpeed;
	@Column(nullable = false)
	private double weigth;
	@Column(nullable = false)
	private String boardIdentification;
	@Column(nullable = false)
	private int companyId;
	@Column(nullable = false)
	private int truckDriverId;
	@Column(nullable = false)
	private int manufacturerId;
	@Column(nullable = false)
	private int vehicleTypeId;
	
	public Vehicle(int id, String name, String description, int price, double topSpeed, double weigth,
			String boardIdentification, int companyId, int truckDriverId, int manufacturerId, int vehicleTypeId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.topSpeed = topSpeed;
		this.weigth = weigth;
		this.boardIdentification = boardIdentification;
		this.companyId = companyId;
		this.truckDriverId = truckDriverId;
		this.manufacturerId = manufacturerId;
		this.vehicleTypeId = vehicleTypeId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(double topSpeed) {
		this.topSpeed = topSpeed;
	}

	public double getWeigth() {
		return weigth;
	}

	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}

	public String getBoardIdentification() {
		return boardIdentification;
	}

	public void setBoardIdentification(String boardIdentification) {
		this.boardIdentification = boardIdentification;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public int getTruckDriverId() {
		return truckDriverId;
	}

	public void setTruckDriverId(int truckDriverId) {
		this.truckDriverId = truckDriverId;
	}

	public int getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(int manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public int getVehicleTypeId() {
		return vehicleTypeId;
	}

	public void setVehicleTypeId(int vehicleTypeId) {
		this.vehicleTypeId = vehicleTypeId;
	}
	
	
	
	
}
