package Ladder;

public class LadderParameters {
	private static int id;
	
	private String manufacturer;
	private double maximumLengthInMetres;
	private double maximumWeightInKilos;
	private String material;
	private String manufacturingPlace;
	private double priceInDollars;
	protected String color;
	protected double manufacturingPriceInDollars;
	
	public LadderParameters() {
		this(null, 0, 0, null);
	}

	public LadderParameters(String manufacturer, double maximumLengthInMetres, double maximumWeightInKilos,
			String material) {
		this(manufacturer, maximumLengthInMetres, maximumWeightInKilos, material, null, 0, null, 0);
	}

	public LadderParameters(String manufacturer, double maximumLengthInMetres, double maximumWeightInKilos,
			String material, String manufacturingPlace, double priceInDollars, String color,
			double manufacturingPriceInDollars) {
		this.manufacturer = manufacturer;
		this.maximumLengthInMetres = maximumLengthInMetres;
		this.maximumWeightInKilos = maximumWeightInKilos;
		this.material = material;
		this.manufacturingPlace = manufacturingPlace;
		this.priceInDollars = priceInDollars;
		this.color = color;
		this.manufacturingPriceInDollars = manufacturingPriceInDollars;
	}

	public static int printStaticId() {
		return id;
	}
	
	public int printId() {
		return id;
	}

	public static void setId(int id) {
		LadderParameters.id = id;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setMaximumLengthInMetres(double maximumLengthInMetres) {
		this.maximumLengthInMetres = maximumLengthInMetres;
	}
	
	public double getMaximumLengthInMetres() {
		return maximumLengthInMetres;
	}
	
	public void setMaximumWeightInKilos(double maximumWeightInKilos) {
		this.maximumWeightInKilos = maximumWeightInKilos;
	}
	
	public double getMaximumWeightInKilos() {
		return maximumWeightInKilos;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public void setManufacturingPlace(String manufacturingPlace) {
		this.manufacturingPlace = manufacturingPlace;
	}
	
	public String getManufacturingPlace() {
		return manufacturingPlace;
	}
	
	public void setPriceInDollars(double priceInDollars) {
		this.priceInDollars = priceInDollars;
	}
	
	public double getPriceInDollars() {
		return priceInDollars;
	}


	public void resetValues(String manufacturer, double maximumLengthInMetres, double maximumWeightInKilos,
			String material, String manufacturingPlace, double priceInDollars, String color,
			double manufacturingPriceInDollars) {
		this.manufacturer = manufacturer;
		this.maximumLengthInMetres = maximumLengthInMetres;
		this.maximumWeightInKilos = maximumWeightInKilos;
		this.material = material;
		this.manufacturingPlace = manufacturingPlace;
		this.priceInDollars = priceInDollars;
		this.color = color;
		this.manufacturingPriceInDollars = manufacturingPriceInDollars;
	}

	public String toString() {
		return "LadderParameters: [manufacturer=" + manufacturer + ", maximumLengthInMetres=" + maximumLengthInMetres
				+ ", maximumWeightInKilos=" + maximumWeightInKilos + ", material=" + material + ", manufacturingPlace="
				+ manufacturingPlace + ", priceInDollars=" + priceInDollars + ", color=" + color
				+ ", manufacturingPriceInDollars=" + manufacturingPriceInDollars + "]";
	}

}