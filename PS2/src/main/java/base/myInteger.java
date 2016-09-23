package base;

public class myInteger {
	
	public int iValue;
	
	public myInteger(int iValue)
	{
		this.iValue=iValue;
	}

	public int getiValue() 
	{
		return iValue;
	}

	public boolean isEven() {
		if (iValue % 2 == 0){
			return true;
		}
		return false;
	}

	public boolean isOdd() {
		if (iValue % 2 != 0){
			return true;
		}
		return false;
	}

	public boolean isPrime() {
		int x = 0;
		for (x = 2; x <= iValue / 2; x++) {
			if (iValue % x != 0)
				return true;
		}
		return false;
	}

	public static boolean isEven(int iValue) {
		if (iValue % 2 == 0){
			return true;
		}
		return false;
	}

	public static boolean isOdd(int iValue) {
		if (iValue % 2 != 0){
			return true;
		}
		return false;
	}

	public static boolean isPrime(int iValue) {
		int x = 0;
		for (x = 2; x <= iValue / 2; x++) {
			if (iValue % x != 0)
				return true;
		}
		return false;
	}
	
	public static boolean isEven(myInteger iValue) {
		return myInteger.isEven(iValue);
	}

	public static boolean isOdd(myInteger iValue) {
		return myInteger.isOdd(iValue);
	}

	public static boolean isPrime(myInteger iValue) {
		return myInteger.isPrime(iValue);
	}


	public boolean equals(int tValue) {
		return iValue == tValue;
	}

	public boolean equals(myInteger tValue) {
		return equals(tValue.getiValue());
	}

	public static int parseInt(String s) {
		return Integer.parseInt(s);
	}
}


