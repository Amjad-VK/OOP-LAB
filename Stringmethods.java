class Stringmethods{
 public static void main(String args[]){


System.out.println("-------FINDING LENGTH OF THE STRING------");
String txt="ABCD";
System.out.println("The length of the string is:" + txt.length());

System.out.println("-------CHANGING CASES--------------------");
String txt1="Hello World";
System.out.println(txt1.toUpperCase());
System.out.println(txt1.toLowerCase());

System.out.println("---------FINDING THE CHARACTER-----------");
String txt2="Please locate where cat occurs";
System.out.println(txt2.indexOf("cat"));

System.out.println("-------CONCAT-----");
String firstname="John";
String lastname="Doe";
System.out.println(firstname + " "+ lastname);
System.out.println(firstname.concat(lastname));

System.out.println("--------PRINTING SPECIAL CHARACTERS--------");
String txt3="This is a \"Good\" place.";
System.out.println(txt3);
String txt4="It\'s far from here";
System.out.println(txt4);
String txt5="The \\ backlash character";
System.out.println(txt5);

}
}