public class TextDemo{
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		int max = a>b?(a>c?a:c):(b>c?b:c);
		int min = a<b?(a<c?a:c):(b<c?b:c);
		System.out.println(max);
		System.out.println(min);
	}

//数值交换
/*	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a);
		System.out.println(b);
	}*/
/*	public static void main(String[] args) {
				byte a=10;
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
	}*/

/*	public static void main(String[] args) {
		double a=10.0;
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
	}*/
	/*public static void main(String[] args) {
		final int a;
		a=10;
		a=20;
	}*/
/*	public static void main(String[] args) {
		double a=2.0;
		int b=4;
		a/=++b;
		System.out.println(a);
	}*/
	/*public static void main(String[] args) {
		int a = 0xffffffff;
System.out.printf("%x\n", a >>> 1);*/
/*	int a = 10;
	int b = 20;
	System.out.println(a<b&&b==b++);
	System.out.println(b);*/
	

	/*public static void main(String[] args) {
	float a=1.1f;
	a=a*a;
	double b=a;
	System.out.println(b);	
	}*/
	//CPU默认类型转换：数据存储（byte , short）小于四个字节进行运算，cpu默认转换四个字节
/*public static void main(String[] args) {
	byte a = 10+1;
	byte b = (byte)400;
	//a=(byte)b;
//	System.out.println(a);
	byte c=1;
	byte d=2;
	byte e=(byte)(c+d);
//	System.out.println(c+d);
}
*/
	//未完成二进制
/*	public static void main(String[] args) {
		int a = 7;
		int A(a){
			int v = a%2;
			System.out.println(v);
			return a/2;
		}
		return A(A(a));
	}*/

	//未完成素数
/*public static void main(String[] args) {
	 int a = 18;
	 for(int i = 2;i < a/2;i++){
	 	if(a%n==0){
	 		System.out.println("false");
	 		break;
	 	}
	 }
}*/
//打印年龄段
/*public static void main(String[] args) {
		int age = 18;
		if(age <= 18) {
			System.out.println("a");
		}
		else if(age >= 19 && age <= 28) {
			System.out.println("b");
		}
		else if (age >=29 && age <= 55) {
			System.out.println("c");
		}
		else {
			System.out.println("d");
		}
		
}*/
/*	public static void main(String[] args) {
		int age=18;
		switch(age){
			case (18):
			System.out.println("hfdkj");

		}
	}*/
/*	public static void main(String[] args) {
		boolean a = true;
	}*/

	//数据类型小细节
/*public static void main4(String[] args) {
	float a = 0.5f;
	float b = 0.5F;
	long  c = 10L;
	long  d = 10l;//别
	double e= 1.1;
	System.out.println(e*e);//1.2100000000000002
}*/
  	//字符型
/*	public static void main3(String[] args) {
		char ch ='a';
		System.out.println(ch);
		System.out.println(Character.MAX_VALUE);//输出‘？’
		System.out.println(Character.MIN_VALUE);//输出‘ ’
	}
*/
	//int类型范围
/*	public static void main2(String[] args) {
		int a=10;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		int b = Integer.MAX_VALUE+1;
		int c = Integer.MIN_VALUE-1;
		System.out.println(b);
		System.out.println(c);
	}*/
	//Hello World
	/*public static void main1(String[] args) {
		System.out.println("hello world");
	}
*/
}