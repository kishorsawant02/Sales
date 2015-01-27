package com.domain;

import java.sql.Date;

/**
 * @author Kishor
 *
 */
public class Sales {
	private int s_id;
	private int c_id,p_id;
	private int s_qty;
	private double s_price;
	private Date s_date;
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public int getS_qty() {
		return s_qty;
	}
	public void setS_qty(int s_qty) {
		this.s_qty = s_qty;
	}
	public double getS_price() {
		return s_price;
	}
	public void setS_price(double s_price) {
		this.s_price = s_price;
	}
	public Date getS_date() {
		return s_date;
	}
	public void setS_date(Date s_date) {
		this.s_date = s_date;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sales [s_id=");
		builder.append(s_id);
		builder.append(", c_id=");
		builder.append(c_id);
		builder.append(", p_id=");
		builder.append(p_id);
		builder.append(", s_qty=");
		builder.append(s_qty);
		builder.append(", s_price=");
		builder.append(s_price);
		builder.append(", s_date=");
		builder.append(s_date);
		builder.append("]");
		return builder.toString();
	}
	

}
