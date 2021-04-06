class Transport{
	/* void travel(){
			System.out.println("travel");
	}
    void travel(String type){
			System.out.println("type");
	} */
	String travel(){
			return "hello"; 
	}
	String travel(String type){
			
			System.out.println("type");
			return "hello";
	}
	public static void main(String a[]){
		Transport t = new Transport();
		//t.travel();
		t.travel("bus"); 
		String s1 = t.travel();
		System.out.println(s1); 
	}
}
