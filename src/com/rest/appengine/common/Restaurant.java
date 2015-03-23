package com.rest.appengine.common;

public class Restaurant {
	 private String name;
	 private int id;
	 private String address;
	 private double lat;
	 private double lon;
	 private double rating;
	 private String style;
	 private String phone;
	 public String getName() {
		 return name;
	 }
	 public int getId() {
		 return id;
	 }
	 public Restaurant setName(String name) {
		 this.name = name;
		 return this;
	 }
	 public Restaurant setId(int id) {
		 this.id = id;
		 return this;
	 }
	 public String getAddress() {
		 return address;
	 }
	 public Restaurant setAddress(String address) {
		 this.address = address;
		 return this;
	 }
	 public double getRating() {
		 return rating;
	 }
	 public Restaurant setRating(double rating) {
		 this.rating = rating;
		 return this;
	 }
	 public String getStyle() {
		 return style;
	 }
	 public Restaurant setStyle(String style) {
		 this.style = style;
		 return this;
	 }
	 public double getLat() {
		 return lat;
	 }
	 public Restaurant setLat(double lat) {
		 this.lat = lat;
		 return this;
	 }
	 public double getLon() {
		 return lon;
	 }
	 public Restaurant setLon(double lon) {
		 this.lon = lon;
		 return this;
	 }
	 public String getPhone() {
		 return phone;
	 }
	 public Restaurant setPhone(String phone) {
		 this.phone = phone;
		 return this;
	 }
}
