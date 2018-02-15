import java.text.DecimalFormat;
import java.util.Scanner;

public class Statistics {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Player Name: ");
		String PN = reader.nextLine();
		System.out.println("At Bat: ");
		double AB = reader.nextDouble();
		System.out.println("Hits: ");
		double H = reader.nextDouble();
		System.out.println("Doubles: ");
		double twoB = reader.nextDouble();
		System.out.println("Triples: ");
		double threeB = reader.nextDouble();
		System.out.println("Home Runs: ");
		double HR = reader.nextDouble();
		System.out.println("Runs: ");
		double R = reader.nextDouble();
		System.out.println("Walks: ");
		double BB = reader.nextDouble();
		reader.close();
		
		double bA= BA(AB, H);
		double oBP = OBP(H,BB,AB);
		double tB = TB(H,twoB,threeB,HR);
		double sLG = SLG(tB,AB);
		double oBS = OBS(oBP,sLG);
		
		DecimalFormat df1 = new DecimalFormat("0.000");
		DecimalFormat df2 = new DecimalFormat("0");
		
		System.out.println(PN);
		System.out.println("Batting Average: " + df1.format(bA));
		System.out.println("On Base Percentage: " + df1.format(oBP));
		System.out.println("Slugging Percentage: " + df1.format(sLG));
		System.out.println("On Base + Slugging Percentage: " + df1.format(oBS));
		System.out.println("Total Bases: " + df2.format(tB));
	}
	
	public static double BA(double ab, double h) {
		double ba = h / ab;
		return ba;		
	}
	public static double OBP(double h, double bb, double ab) {
		double obp = (h + bb) / (ab + bb);
		return obp;		
	}
	public static double SLG(double tb, double ab) {
		double slg = tb / ab;
		return slg;		
	}
	public static double OBS(double obp, double slg) {
		double obs = obp + slg;
		return obs;		
	}
	public static double TB(double h, double twob, double threeb, double hr) {
		double tb = h + twob + 2*threeb + 3*hr;
		return tb;		
	}

}
