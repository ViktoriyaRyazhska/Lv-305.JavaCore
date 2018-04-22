public class test {
	    public static void main(String[] args) {	
	        int a=2, b=3, k=4;
	        int sum=sum(a, b, k);
	        System.out.println("Sum of three numbers is equal "+sum);
	        System.out.println(a+ "	___111");
	        System.out.println(b+ "	___222");
	        System.out.println(k+ "	___333");
	    }
	    public static int sum (int a, int b, int c){
	        System.out.println(a+ "	___444");
	        System.out.println(b+ "	___555");
	        System.out.println(c+ "	___666");
	         return a+b+c;
	    }      
}
//?1 c==k ???
//?2 algorithm for information output???
////////result//////////////////////
//2	___444
//3	___555
//4	___666
//Сума трьох чисел дорівнює 9
//2	___111
//3	___222
//4	___333