class Assignmentlong{
	long number1;
	long number2;
	
	public long Addition(){
		long result = number1+number2;
		return result;
	}
	public static void main(String[] args){
		
		Assignmentint assign= new Assignmentint();
		assign.number1=1;
		assign.number2=1;
		long answer=assign.Addition();
		System.out.println(answer);
	}
}

// result =2