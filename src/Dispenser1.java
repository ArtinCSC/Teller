
import java.util.*;

public class Dispenser1 {
	
	public Teller.Result dispense(double request) {
		ArrayList<Double> coin = new ArrayList();
		coin.add((double) ((int) request));
		coin.add((double) (((int) roundUp((request - coin.get(0)) / 0.25))));
		coin.add((double) ((int) roundUp((request - coin.get(0) - (coin.get(1) * 0.25)) / 0.1)));
		coin.add((double) ((int) roundUp((request - coin.get(0) - (coin.get(1) * 0.25) - (coin.get(2) * 0.1)) / 0.05)));
		coin.add((double) ((int) roundUp(
				(request - coin.get(0) - (coin.get(1) * 0.25) - (coin.get(2) * 0.1) - (coin.get(3) * 0.05)) / 0.01)));
		double total = coin.get(0) + roundUp(coin.get(1) * 0.25) + roundUp(coin.get(2) * 0.1) + roundUp(coin.get(3) * 0.05)
				+ roundUp(coin.get(4) * 0.01);
		total = roundUp(total);
		double dollar = coin.get(0);
		double quarters = coin.get(1);
		double dimes = coin.get(2);
		double nickles = coin.get(3);
		double penies = coin.get(4);
		int[] coins = { (int) dollar, (int) quarters, (int) dimes, (int) nickles, (int) penies };

		return new Teller.Result(coins, total);
	}

	private double roundUp(double r) {
		double result = 0;
		r = r * 100;
		result = Math.round(r);
		result = result / 100;
		return result;
	}
}
/**
 * public Teller.Result dispense(double request) {
		int dollars = (int) request;
		double remainder1 = request - dollars;
		int quarters = (int) (roundUp(remainder1) / 0.25);
		double remainder2 = roundUp(remainder1) - quarters * 0.25;
		int dimes = (int) (roundUp(remainder2) / 0.1);
		double remainder3 = roundUp(remainder2) - dimes * 0.1;
		int nickels = (int) (roundUp(remainder3) / 0.05);
		double remainder4 = roundUp(remainder3) - nickels * 0.05;
		int pennies = (int) (roundUp(remainder4) / 0.01);
		int coins[] = { dollars, quarters, dimes, nickels, pennies };
		double total = roundUp(coins[0] * 1.0) + roundUp(coins[1] * 0.25) + roundUp(coins[2] * 0.1)
				+ roundUp(coins[3] * 0.05) + roundUp(coins[4] * 0.01);
		total = roundUp(total);
		return new Teller.Result(coins, total);
	}
 */

/**
 * 	public Teller.Result dispense(double request) {
		ArrayList<Double> coin = new ArrayList();
		coin.add((double) ((int) request));
		coin.add((double) (((int) roundUp((request - coin.get(0)) / 0.25))));
		coin.add((double) ((int) roundUp((request - coin.get(0) - (coin.get(1) * 0.25)) / 0.1)));
		coin.add((double) ((int) roundUp((request - coin.get(0) - (coin.get(1) * 0.25) - (coin.get(2) * 0.1)) / 0.05)));
		coin.add((double) ((int) roundUp(
				(request - coin.get(0) - (coin.get(1) * 0.25) - (coin.get(2) * 0.1) - (coin.get(3) * 0.05)) / 0.01)));
		double total = coin.get(0) + roundUp(coin.get(1) * 0.25) + roundUp(coin.get(2) * 0.1) + roundUp(coin.get(3) * 0.05)
				+ roundUp(coin.get(4) * 0.01);
		total = roundUp(total);
		double dollar = coin.get(0);
		double quarters = coin.get(1);
		double dimes = coin.get(2);
		double nickles = coin.get(3);
		double penies = coin.get(4);
		int[] coins = { (int) dollar, (int) quarters, (int) dimes, (int) nickles, (int) penies };

		return new Teller.Result(coins, total);
	}
	*/
