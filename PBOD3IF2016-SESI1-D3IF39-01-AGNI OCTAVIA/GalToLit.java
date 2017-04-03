class GalToLit {
	private int numgallons = 0;
	private double converttoliters;
	
	public void setNumGallons (int numgallons){
		this.numgallons = numgallons;
	}
	public int getNumGallons () {
		return numgallons;
	}
	public double ConvertToLitters() {
		converttoliters = numgallons * 3.785 ;
		return converttoliters ; 
	}
}