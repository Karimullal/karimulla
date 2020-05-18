package com.product.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Image_TBL")
public class ImageModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "image_id")
	private int id;
	@Column(name = "image_name")
	private String name;
	@Column(name = "image_type")
	private String type;
	@Column(name = "pic_image")
	private byte[] picImage;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public byte[] getPicImage() {
		return picImage;
	}
	public void setPicImage(byte[] picImage) {
		this.picImage = picImage;
	}
	public ImageModel(String name, String type, byte[] picImage) {
		this.name = name;
		this.type = type;
		this.picImage = picImage;
	}
	public ImageModel() {
	}
	
	
}
