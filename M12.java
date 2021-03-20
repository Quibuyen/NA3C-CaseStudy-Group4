public int TRentTax() {
	int RentTax = (rent * 10 + OTAmount) -tax;
	return RentTax;	}

	public void result() {
	system.out.println("The Total Rent is: " +TRent());
	System.out.println("The Total Rent with Tax: " +TRentTax());
}
