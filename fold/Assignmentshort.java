class Assignmentshort{
	short number1;
	short number2;
	
	public short Addition(){
		short result = number1+number2;
		return result;
	}
	public static void main(String[] args){
		
		Assignmentshort assign= new Assignmentshort();
		assign.number1=1;
		assign.number2=1;
		assign.Addition();
		System.out.println(assign.number1);
	}
}

//D:\demo\MKPITS\fold>javacAssignmentshort.java
'javacAssignmentshort.java' is not recognized as an internal or external command,
operable program or batch file.

D:\demo\MKPITS\fold>javac Assignmentshort.java
Assignmentshort.java:6: error: incompatible types: possible lossy conversion from int to short
                short result = number1+number2;
                                      ^
1 error