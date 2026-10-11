package com.petcare;

public class Pet {

	private int petId;
	private String petName;
	private String species;
	private String breed;
	private int age;
	private String ownerName;
	private String ownerPhone;
	private String healthStatus;

	public Pet() {

	}

	public Pet( String petName, String species, String breed, int age,
			String ownerName, String ownerPhone,String healthStatus) {
		super();
		this.petName = petName;
		this.species = species;
		this.breed = breed;
		this.age = age;
		this.ownerName = ownerName;
		this.ownerPhone = ownerPhone;
		this.healthStatus = healthStatus;
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerPhone() {
		return ownerPhone;
	}

	public void setOwnerPhone(String ownerPhone) {
		this.ownerPhone = ownerPhone;
	}

	public String getHealthStatus() {
		return healthStatus;
	}

	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
	}

	@Override
	public String toString() {
		return "Pet [petId=" + petId + ", petName=" + petName + ", species=" + species + ", breed=" + breed + ", age="
				+ age + ", ownerName=" + ownerName + ", ownerPhone=" + ownerPhone + ", healthStatus=" + healthStatus
				+ "]";
	}

}
