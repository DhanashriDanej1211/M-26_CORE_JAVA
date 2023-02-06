package org.tnsindia.application;

import org.tnsindia.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{

	public GSPrimeAcc(int accNo, String accName, float charges, boolean isPrime) {
		super(accNo, accName, charges, isPrime);
	}

	@Override
	public String toString() {
		return "GSPrimeAcc []";
	}
	

}