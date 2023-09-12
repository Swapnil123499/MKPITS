package com.mkpit.DayAssignmentFourEight.intcal;

import com.mkpit.DayAssignmentFourEight.intcal.acountholder.Loan;

public final class InterestCalculation {
	final float rateOfIntrest;
	public InterestCalculation() {
		rateOfIntrest=4.2f;
	}
	
	public final void claculateOfIntrest(Loan loan) {
		double totleAmount=loan.getAmount()*Math.pow((1+(0.01*rateOfIntrest)), loan.getDuration());
		System.out.println("The total amount after the intrest:-  "+totleAmount);
		System.out.println("The intrest on the loan is:- "+(totleAmount-loan.getAmount()));
	}
	
	
	
}
