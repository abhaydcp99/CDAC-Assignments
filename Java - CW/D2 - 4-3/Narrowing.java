class Narrowing{
    public static void main(String args[]){
	double d = 99999.99;
	int num = (int) d; // explicit narrowing : double -> int
	System.out.println(d); // 99999.99
	System.out.println(num); // 99999

	}
}