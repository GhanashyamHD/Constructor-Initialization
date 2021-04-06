class Calc{
 	int c=0;
	void add(){
		int a=7,b=9;
		c=a+b;
		System.out.println(c);
	}
	void add(int a, int b , int d){
		c=a+b+d;
		System.out.println(c);
	}
	int sub(){
		int a=6,b=5;
		c=a-b;
		return c;
	}
	void sub(int a, int b , int d){
		c=a-b-d;
		System.out.println(c);
	} 
	float mul(float a, float b){
		float c=a*b;
		System.out.println(c);
		return c;
	}
	 void mul(float a, float b , float d){
		float c=a*b*d;
		System.out.println(c);
	}
	void div(int a, int b){
		c=a/b;
		System.out.println(c);
	}
	void div(int a, int b , int  d){
		c=a/b/d;
		System.out.println(c);
	}
	
	
	public static void main(String a[]){
		Calc s = new Calc();
		s.add(5,6,7);
		int var = s.sub();
		System.out.println(var);
		s.mul(6.0f,5.0f);
		float val = s.mul(6.0f,5.0f);
		System.out.println(val);
	}
}