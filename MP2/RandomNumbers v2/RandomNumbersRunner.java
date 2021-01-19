public class RandomNumbersRunner
{
	public static void main(String[] args)
	{
		RandomNumbers rn = new RandomNumbers();
		boolean a1to100, b1to100, a1to21, b1to21, a5to10, b5to10, a10to19, b10to19, a3to6, b3to6;
		boolean c1to100, c1to21, c5to10, c10to19, c3to6, c11to13, c5to15, c100to199, c101to200, c100to200;
		boolean a11to13, b11to13, a5to15, b5to15, a100to199, b100to199, a101to200, b101to200, a100to200, b100to200;
		a1to100 = b1to100 = a1to21 = b1to21 = a5to10 = b5to10 = a10to19 = b10to19 = a3to6 = b3to6 = false;
		a11to13 = b11to13 = a5to15 = b5to15 = a100to199 = b100to199 = a101to200 = b101to200 = a100to200 = b100to200 = false;
		c1to100 = c1to21 = c5to10 = c10to19 = c3to6 = c11to13 = c5to15 = c100to199 = c101to200 = c100to200 = false;

		System.out.println("Random Number Practice: ");
		System.out.println("1 to 100:\t" + rn.getRange1to100());
		System.out.println("1 to 21:\t"  + rn.getRange1to21());
		System.out.println("5 to 10:\t"  + rn.getRange5to10());
		System.out.println("10 to 19:\t" + rn.getRange10to19());
		System.out.println("3 to 6:\t\t" + rn.getRange3to6());
		System.out.println("11 to 13:\t" + rn.getRange11to13());
		System.out.println("5 to 15:\t"  + rn.getRange5to15());
		System.out.println("100 to 199:\t" + rn.getRange100to199());
		System.out.println("101 to 200:\t" + rn.getRange101to200());
		System.out.println("100 to 200:\t" + rn.getRange100to200());

		System.out.println("\n\nError Checking...\n");
		for(int i=0; i<1000000; i++)
		{
			if(rn.getRange1to100()<1 || rn.getRange1to100()>100)
				a1to100 = true;
			if(rn.getRange1to21()<1 || rn.getRange1to21()>21)
				a1to21 = true;
			if(rn.getRange5to10()<5 || rn.getRange5to10()>10)
				a5to10 = true;
			if(rn.getRange10to19()<10 || rn.getRange10to19()>19)
				a10to19 = true;
			if(rn.getRange3to6()<3 || rn.getRange3to6()>6)
				a3to6 = true;
			if(rn.getRange11to13()<11 || rn.getRange11to13()>13)
				a11to13 = true;
			if(rn.getRange5to15()<5 || rn.getRange5to15()>15)
				a5to15 = true;
			if(rn.getRange100to199()<100 || rn.getRange100to199()>199)
				a100to199 = true;
			if(rn.getRange101to200()<101 || rn.getRange101to200()>200)
				a101to200 = true;
			if(rn.getRange100to200()<100 || rn.getRange100to200()>200)
				a100to200 = true;

			if(rn.getRange1to100() == 1)
				b1to100 = true;
			if(rn.getRange1to100() == 100)
				c1to100 = true;
			if(rn.getRange1to21() == 1)
				b1to21 = true;
			if(rn.getRange1to21() == 21)
				c1to21 = true;
			if(rn.getRange5to10() == 5)
				b5to10 = true;
			if(rn.getRange5to10() == 10)
				c5to10 = true;
			if(rn.getRange10to19() == 10)
				b10to19 = true;
			if(rn.getRange10to19() == 19)
				c10to19 = true;
			if(rn.getRange3to6() == 3)
				b3to6 = true;
			if(rn.getRange3to6() == 6)
				c3to6 = true;
			if(rn.getRange11to13() == 11)
				b11to13 = true;
			if(rn.getRange11to13() == 13)
				c11to13 = true;
			if(rn.getRange5to15() == 5)
				b5to15 = true;
			if(rn.getRange5to15() == 15)
				c5to15 = true;
			if(rn.getRange100to199() == 100)
				b100to199 = true;
			if(rn.getRange100to199() == 199)
				c100to199 = true;
			if(rn.getRange101to200() == 101)
				b101to200 = true;
			if(rn.getRange101to200() == 200)
				c101to200 = true;
			if(rn.getRange100to200() == 100)
				b100to200 = true;
			if(rn.getRange100to200() == 200)
				c100to200 = true;
		}

		System.out.println("Out of range check:");
		String mOut = "";
		if(a1to100) mOut += "getRange1to100()";
		if(a1to21) mOut += "\ngetRange1to21()";
		if(a5to10) mOut += "\ngetRange5to10()";
		if(a10to19) mOut += "\ngetRange10to19()";
		if(a3to6) mOut += "\ngetRange3to6()";
		if(a11to13) mOut += "\ngetRange11to13()";
		if(a5to15) mOut += "\ngetRange5to15()";
		if(a100to199) mOut += "\ngetRange100to199()";
		if(a101to200) mOut += "\ngetRange101to200()";
		if(a100to200) mOut += "\ngetRange100to200()";
		System.out.print(mOut);
		if((!a1to100)&&(!a1to21)&&(!a5to10)&&(!a10to19)&&(!a3to6)&&(!a11to13)&&(!a5to15)&&(!a100to199)&&(!a101to200)&&(!a100to200))
			System.out.println("\t\tNo out of range values - nice job!");

		System.out.println("Bounds check:");
		String bOut = "";
		if(!b1to100) bOut += "getRange1to100() lower bound\n";
		if(!b1to21) bOut += "getRange1to21() lower bound\n";
		if(!b5to10) bOut += "getRange5to10() lower bound\n";
		if(!b10to19) bOut += "getRange10to19() lower bound\n";
		if(!b3to6) bOut += "getRange3to6() lower bound\n";
		if(!b11to13) bOut += "getRange11to13() lower bound\n";
		if(!b5to15) bOut += "getRange5to15() lower bound\n";
		if(!b100to199) bOut += "getRange100to199() lower bound\n";
		if(!b101to200) bOut += "getRange101to200() lower bound\n";
		if(!b100to200) bOut += "getRange100to200() lower bound\n";
		System.out.print(bOut);
		if((b1to100)&&(b1to21)&&(b5to10)&&(b10to19)&&(b3to6)&&(b11to13)&&(b5to15)&&(b100to199)&&(b101to200)&&(b100to200))
			System.out.println("\t\tLower bounds - all good!");

		String cOut = "";
		if(!c1to100) cOut += "getRange1to100() upper bound\n";
		if(!c1to21) cOut += "getRange1to21() upper bound\n";
		if(!c5to10) cOut += "getRange5to10() upper bound\n";
		if(!c10to19) cOut += "getRange10to19() upper bound\n";
		if(!c3to6) cOut += "getRange3to6() upper bound\n";
		if(!c11to13) cOut += "getRange11to13() upper bound\n";
		if(!c5to15) cOut += "getRange5to15() upper bound\n";
		if(!c100to199) cOut += "getRange100to199() upper bound\n";
		if(!c101to200) cOut += "getRange101to200() upper bound\n";
		if(!c100to200) cOut += "getRange100to200() upper bound\n";
		System.out.print(cOut);
		if((c1to100)&&(c1to21)&&(c5to10)&&(c10to19)&&(c3to6)&&(c11to13)&&(c5to15)&&(c100to199)&&(c101to200)&&(c100to200))
			System.out.println("\t\tUpper bounds - all good!");
	}
}
/*
Random Number Practice:
1 to 100:       32
1 to 21:        21
5 to 10:        6
10 to 19:       18
3 to 6:         5
11 to 13:       12
5 to 15:        11
100 to 199:     194
101 to 200:     111
100 to 200:     134


Error Checking...

Out of range check:
                No out of range values - nice job!
Bounds check:
                Lower bounds - all good!
                Upper bounds - all good!
Press any key to continue . . .
*/