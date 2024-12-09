class S26{
	public static void main(String args[]){
	String x="welcome";
	char arr[]=x.toCharArray();
	System.out.println("Using for loop ");
	int i;
	for(i=0;i<arr.length;i++){
	System.out.println(arr[i]);
}	
	System.out.println("Using for each loop ");
	for(char s:arr){
	System.out.println(s);

}
	}
}

