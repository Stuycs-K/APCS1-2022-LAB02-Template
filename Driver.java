public class Driver{
 public static void main(String[]args){
  String a;
  String b;
  String whole;
  String part;
  
  //Can you think of why the test cases use variables instead of literal strings?
  
  //Single test case myCompareTo:
  a="cat";
  b="dog";
  System.out.println("Expected "+ a.CompareTo(b) +" vs my function: "+StringMethods.myCompareTo(a,b)); 
   
  //Single test case myIndexOf:
  whole = "Hello";
  part = "He";
  System.out.println("Expected "+ whole.indexOf(part) +" vs my function: "+StringMethods.myIndexOf(whole,part));  
   
  
  String number;
  //Single test case parseInt:
  // number = "152";
  // int actual = Integer.parseInt(number);
  // int guess  = StringMethods.parseInt(number);
  // System.out.println("Expected "+ actual +" vs my function: "+ guess+" "+(actual==guess));
 }
}
