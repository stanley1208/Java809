package package5;

import org.junit.Test;

public class ex3 {

	public static void main(String[] args) {
		 

	}

}


class RateOfInterest {
	
    public static void main(String[] args) {
        int rateOfInterest = 0;
        String accountType = "LOAN";
        switch (accountType) {
            case "RD":
                rateOfInterest = 5;
                break;
            case "FD":
                rateOfInterest = 10;
                break;
            default:
                assert false : "No interest for this account"; //line n1
        }
        System.out.println("Rate of interest:" + rateOfInterest);
    }
}
