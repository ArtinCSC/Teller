import java.util.ArrayList;

/*
 * Copyright (c) 2015-2017 Annie Hui @ NVCC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// A dispenser that IMPROPERLY handles currency. Find the bugs and fix them.

/**
 * Edited by Artin Malekian 
 * 01/27/2017
 */
import java.util.*;

public class Dispenser {

	private double roundUp(double r) {
		double result = 0;
		r = r * 100;
		result = Math.round(r);
		result = result / 100;
		return result;
	}

	public Teller.Result dispense(double request) {
		ArrayList<Double> coin = new ArrayList();
		coin.add((double) ((int) request));
		coin.add((double) (((int) roundUp((request - coin.get(0)) / 0.25))));
		coin.add((double) ((int) roundUp((request - coin.get(0) - (coin.get(1) * 0.25)) / 0.1)));
		coin.add((double) ((int) roundUp((request - coin.get(0) - (coin.get(1) * 0.25) - (coin.get(2) * 0.1)) / 0.05)));
		coin.add((double) ((int) roundUp(
				(request - coin.get(0) - (coin.get(1) * 0.25) - (coin.get(2) * 0.1) - (coin.get(3) * 0.05)) / 0.01)));
		double total = coin.get(0) + roundUp(coin.get(1) * 0.25) + roundUp(coin.get(2) * 0.1)
				+ roundUp(coin.get(3) * 0.05) + roundUp(coin.get(4) * 0.01);
		total = roundUp(total);
		double dollar = coin.get(0);
		double quarters = coin.get(1);
		double dimes = coin.get(2);
		double nickles = coin.get(3);
		double penies = coin.get(4);
		int[] coins = { (int) dollar, (int) quarters, (int) dimes, (int) nickles, (int) penies };

		return new Teller.Result(coins, total);
	}

}
