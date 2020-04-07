package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseShowroom<M extends BaseShowroom<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setManager(java.lang.String manager) {
		set("manager", manager);
	}
	
	public java.lang.String getManager() {
		return getStr("manager");
	}

	public void setLocation(java.lang.String location) {
		set("location", location);
	}
	
	public java.lang.String getLocation() {
		return getStr("location");
	}

}