class Test {
	public static void main (string args[]) {
		Cards c1 = new Cards('a', 'c');
		Cards c2 = new Cards('1', 'd');
	
		System.out.println(c1.getpip());
		System.out.println(c1.getSuit());
		System.out.println(c2.getpip());
		System.out.println(c2.getSuit());
	}
}
