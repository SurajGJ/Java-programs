package com.collection.set.model;

public class Doctor {

	String name;
	String splization;
	//int experience;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSplization() {
		return splization;
	}
	public void setSplization(String splization) {
		this.splization = splization;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((splization == null) ? 0 : splization.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (splization == null) {
			if (other.splization != null)
				return false;
		} else if (!splization.equals(other.splization))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Doctor [name=" + name + ", splization=" + splization + "]";
	}
	
	 
}
