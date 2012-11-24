package ro.faculate;

import java.util.ArrayList;
import java.util.List;

public class ATM {

	private List<Account> accounts;
	private List<Provider> providers;

	public ATM() {
		accounts = loadAccounts();
		providers = defineProviders();

	}

	public void insertCard(int cardNumber) {
		Card insertedCard = getCard(cardNumber);
		int insertedPin;
		do {
			insertedPin = readPin();
		} while (!insertedCard.checkPin(insertedPin));
		/* ++afis dat */
	}

	private Card getCard(int cardNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	private int readPin() {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Account> loadAccounts() {
		// dintr-un fisies extern...//
		return null;
	}

	public List<Provider> defineProviders() {
		List<Provider> providers = new ArrayList<Provider>();

		providers.add(new Provider("RDS"));
		providers.add(new Provider("GDF"));
		providers.add(new Provider("Electrica"));
		return providers;

	}
}
