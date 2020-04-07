package shop.order;

public class OrderPaymentMethod {
	String iban;
	String bic;
	String bankName;

	public OrderPaymentMethod(String iban, String bic, String bankName) {
		super();
		this.iban = iban;
		this.bic = bic;
		this.bankName = bankName;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

}
