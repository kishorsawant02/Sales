/**
 * 
 */
package com.domain;

/**
 * @author Kishor
 *
 */
public class Product {
	private int p_id, p_weight;
	private double p_price;
	private String p_name, p_category;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Purchase [p_id=");
		builder.append(p_id);
		builder.append(", p_weight=");
		builder.append(p_weight);
		builder.append(", p_price=");
		builder.append(p_price);
		builder.append(", p_name=");
		builder.append(p_name);
		builder.append(", p_category=");
		builder.append(p_category);
		builder.append("]");
		return builder.toString();
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public int getP_weight() {
		return p_weight;
	}

	public void setP_weight(int p_weight) {
		this.p_weight = p_weight;
	}

	
	public double getP_price() {
		return p_price;
	}

	public void setP_price(double p_price) {
		this.p_price = p_price;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getP_category() {
		return p_category;
	}

	public void setP_category(String p_category) {
		this.p_category = p_category;
	}

}
