class S27{
	public static void main(String args[]){
	int nums[]={10,20,30,40,50};
	int sum=0;
	for(int x:nums){
	sum=sum+x;
}
	System.out.println("sum :"+sum);
	System.out.println("Average :"+(sum/nums.length));
}
}