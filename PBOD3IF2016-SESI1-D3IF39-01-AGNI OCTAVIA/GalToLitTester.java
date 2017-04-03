class GalToLitTester {
	public static void main (String[] args)
	{
		GalToLit obj1 = new GalToLit ();
		obj1.setNumGallons (5);
		System.out.println (obj1.getNumGallons() + " Galon = " + obj1.ConvertToLitters());
	}
}