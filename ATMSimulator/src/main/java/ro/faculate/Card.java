package ro.faculate;

class Card {
	private String titular;
	private int pin;
	private int cardnumber;

	public boolean checkPin(int pinIntrodus) {
		return pin == pinIntrodus;
	}

	public Card(String titular, int pin) {
		this.titular = titular;
		this.pin = pin;
	}

	public String getTitular() {
		return titular;
	}

	public void setPin(int pin) {

	}

}