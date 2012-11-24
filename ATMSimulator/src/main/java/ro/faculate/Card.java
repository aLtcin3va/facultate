package ro.faculate;

class Card {
	private String titular;
	private int pin;

	public Card(String titular, int pin) {
		this.titular = titular;
		this.pin = pin;
	}



	public int getPin() {
		return pin;
	}

	public String getTitular() {
		return titular;
	}

	public void setPin(int pin) {

	}
}