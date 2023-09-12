class Assignmentbyte{
	byte number1;
	byte number2;
	
	public byte Addition(){
		byte result = number1+number2;
		return result;
	}
	public static void main(String[] args){
		
		Assignmentint assign= new Assignmentint();
		assign.number1=1;
		assign.number2=1;
		byte answer=assign.Addition();
		System.out.println(answer);
	}
}

//D:\demo\MKPITS\fold>javac Assignmentbyte.java
Assignmentbyte.java:6: error: incompatible types: possible lossy conversion from int to byte
                byte result = number1+number2;
                                     ^
Assignmentbyte.java:14: error: incompatible types: possible lossy conversion from int to byte
                byte answer=assign.Addition();
                                           ^
2 errors