package com.bridgelabz;

public class Contact {

	private String name;
	private String age;
	private long phoneNo;
	private String city;
	private String state;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Contacts{" +
				"name='" + name + '\'' +
				", age='" + age + '\'' +
				", city='" + city + '\'' +
				", state='" + state + '\'' +
				", phoneNo=" + phoneNo +
				'}';
	}
}
