class Assignment5{

public static void main(String [] arg){

System.out.println();

 Assignment5 Assignment5=new Assignment5();
 Assignment5.Add();
 Assignment5.Sub();
 Assignment5.Mult();
 Assignment5.Div();
 Assignment5.Mod();
 

}

public void Add(){

int num1=4;
int num2=5;
int sum;
sum=num1+num2;

System.out.println(sum);
}

void Sub(){
	int num1=4;
int num2=5;
int sub;
sub=num1-num2;
System.out.println(sub);
}
void Mult(){
	int num1=4;
int num2=5;
int mult;
mult=num1*num2;
System.out.println(mult);
}
void Div(){
	int num1=4;
int num2=5;
int div;
div=num1/num2;
System.out.println(div);
}

void Mod(){
	int num1=4;
int num2=5;
int mod;
mod=num1%num2;
System.out.println(mod);
}
}

output:D:\demo\MKPITS\fold>javac Assignment5.java

D:\demo\MKPITS\fold>java Assignment5.java

9
-1
20
0
4