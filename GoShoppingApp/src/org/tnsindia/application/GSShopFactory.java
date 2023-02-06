package org.tnsindia.application;

import org.tnsindia.framework.NormalAcc;
import org.tnsindia.framework.PrimeAcc;
import org.tnsindia.framework.ShopFactory;

public class GSShopFactory extends ShopFactory{

	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accName, float charges, boolean isPrime) {
		GSPrimeAcc p=new GSPrimeAcc(accNo,accName,charges,isPrime);
		return null;
	}

	@Override
	public NormalAcc getNewnormalAccount(int accNo, String accName, float charges, float deliveryCharges) {
		GSNormalAcc n=new GSNormalAcc(accNo,accName,charges,deliveryCharges);
		return n;
	}

}