package com.app.OneToOne.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="mobiles_11")
public class Mobile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="MOBIELID")
	private Integer mobileId;
	
	@Column(name="MOBILENAME")
	private String mobileName;
	
	public Mobile() {
		System.out.println("Mobiles ctor called here");
	}

	public Mobile(Integer mobileId, String mobileName) {
		super();
		this.mobileId = mobileId;
		this.mobileName = mobileName;
	}

	public Integer getMobileId() {
		return mobileId;
	}

	public void setMobileId(Integer mobileId) {
		this.mobileId = mobileId;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	
	

}
