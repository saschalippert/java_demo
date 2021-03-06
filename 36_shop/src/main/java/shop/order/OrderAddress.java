package shop.order;

public class OrderAddress {
	String street;
	String zip;
	String place;
	String country;

	public OrderAddress(String street, String zip, String place, String country) {
		super();
		this.street = street;
		this.zip = zip;
		this.place = place;
		this.country = country;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "OrderAddress [street=" + street + ", zip=" + zip + ", place=" + place + ", country=" + country + "]";
	}

}
