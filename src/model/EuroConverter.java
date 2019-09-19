package model;

public class EuroConverter {

	private double currency;
	private double usDollar;
	private double euro;
	private double euroConvert;
	private double pound;
	private double poundConvert;

	
	public EuroConverter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EuroConverter(double currency) {
		super();
		this.usDollar = currency;
		this.euro = currency;
		dollarToEuro(usDollar);
		euroToPound(usDollar);
	}

	public double getEuroConvert() {
		return euroConvert;
	}

	public void setEuroConvert(double euroConvert) {
		this.euroConvert = euroConvert;
	}

	public double getPoundConvert() {
		return poundConvert;
	}

	public void setPoundConvert(double poundConvert) {
		this.poundConvert = poundConvert;
	}

	
	public double getUsDollar() {
		return usDollar;
	}

	public void setUsDollar(double currency) {
		this.usDollar = currency;

	}

	public double getEuro() {
		return euro;
	}

	public void setEuro(double currency) {
		this.euro = euro;

	}

	public double getPound() {
		return pound;
	}

	public void setPound(double pound) {
		this.pound = pound;

	}

	public void dollarToEuro(double usDollar) {
		final double EURO = .9; // 1 dollar is worth .9 euros
		setEuroConvert(usDollar * EURO);

	}

	public void euroToPound(double euro) {
		final double POUND = .88; // 1 euro is worth .88 pounds
		setPoundConvert(POUND * euro);
	}

	@Override
	public String toString() {
		return "EuroConverter [usDollar=" + usDollar + ", euro=" + euro + ", pound=" + pound + "]";
	}

}
