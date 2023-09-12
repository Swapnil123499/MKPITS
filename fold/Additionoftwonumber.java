public class Additionoftwonumber{
/**
*Add of two number1
*@param number1 - the number1 in integer
@param number2 - the number2 that going to Additionoftwonumber
*this is addition of two number1
*/
public int AddNumber(int number1,int number2){
return number1+number2;
}
public static void main(String[] arg){

Additionoftwonumber addnumber=new Additionoftwonumber();
 int answer= addnumber.AddNumber(15,10);
 System.out.println(answer);
}
}