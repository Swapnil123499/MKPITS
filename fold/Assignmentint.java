class Assignmentint{
	int number1;
	int number2;
	
	public int Addition(){
		int result = number1+number2;
		return result;
	}
	public static void main(String[] args){
		
		Assignmentint assign= new Assignmentint();
		assign.number1=1;
		assign.number2=1;
		int answer=assign.Addition();
		System.out.println(answer);
	}
}

// result =2