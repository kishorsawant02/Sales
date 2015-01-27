/**
 * 
 */
package com.domain;

/**
 * @author Kishor
 *
 */
public class Company {
	
	private int c_id;
	private String c_name,c_address,c_city,c_phone,c_email;
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_address() {
		return c_address;
	}
	public void setC_address(String c_address) {
		this.c_address = c_address;
	}
	public String getC_city() {
		return c_city;
	}
	public void setC_city(String c_city) {
		this.c_city = c_city;
	}
	public String getC_phone() {
		return c_phone;
	}
	public void setC_phone(String c_phone) {
		this.c_phone = c_phone;
	}
	public String getC_email() {
		return c_email;
	}
	public void setC_email(String c_email) {
		this.c_email = c_email;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Company [c_id=");
		builder.append(c_id);
		builder.append(", c_name=");
		builder.append(c_name);
		builder.append(", c_address=");
		builder.append(c_address);
		builder.append(", c_city=");
		builder.append(c_city);
		builder.append(", c_phone=");
		builder.append(c_phone);
		builder.append(", c_email=");
		builder.append(c_email);
		builder.append("]");
		return builder.toString();
	}

}
