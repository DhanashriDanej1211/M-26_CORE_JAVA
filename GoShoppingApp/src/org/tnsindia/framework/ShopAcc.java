package org.tnsindia.framework;
//Abstract class
public abstract class ShopAcc {
	private int accNo;
	private String accName;
	private float charges;
	
	//constructor
	public ShopAcc(int accNo, String accName, float charges) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.charges = charges;
	}

	//Getters and setters method
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public float getCharges() {
		return charges;
	}

	public void setCharges(float charges) {
		this.charges = charges;
	}

	
	@Override
	public String toString() {
		return String.format("ShopAcc [accNo=%s, accName=%s, charges=%s]", accNo, accName, charges);
	}

	//abstract method
	abstract public void bookProduct(float charges);
	public void items(float charges)
	{
		System.out.println(charges);
	}
		
}