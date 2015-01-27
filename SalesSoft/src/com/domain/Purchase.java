/**
 * 
 */
package com.domain;

import java.sql.Date;

/**
 * @author Kishor
 * 
 */
public class Purchase {
	private int invoiceno, p_weight,p_id,c_id;
	private double p_price;
	private Date date;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Purchase [invoiceno=");
		builder.append(invoiceno);
		builder.append(", p_weight=");
		builder.append(p_weight);
		builder.append(", p_id=");
		builder.append(p_id);
		builder.append(", c_id=");
		builder.append(c_id);
		builder.append(", p_price=");
		builder.append(p_price);
		builder.append(", date=");
		builder.append(date);
		builder.append("]");
		return builder.toString();
	}
	public int getInvoiceno() {
		return invoiceno;
	}
	public void setInvoiceno(int invoiceno) {
		this.invoiceno = invoiceno;
	}
	public int getP_weight() {
		return p_weight;
	}
	public void setP_weight(int p_weight) {
		this.p_weight = p_weight;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public double getP_price() {
		return p_price;
	}
	public void setP_price(double p_price) {
		this.p_price = p_price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
