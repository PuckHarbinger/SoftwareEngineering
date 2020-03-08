import java.lang.reflect.*;
import java.util.stream.*；
import java.time.LocalDate;
import java.time.Clock;
import java.time.MonthDay;

//Prints the declared methods of java.lang.String that take a variable number of arguments;
String str = "abc";

//Prints the declared methods of java.lang.String that return an array;
char[].class;
String myString="abcdef";
char myChar[]=myString.toCharArray();
System.out.println("myChar[0]="+myChar[0]); 

//Prints the declared two-parameter methods of java.lang.String that accept two ints;
String str1="1990906".substring(0,4);
String str2="19990906".substring(4,8);

//Prints the non-abstract methods of the java.stream.Stream interface;
ArrayList<Integer> list = Lists.list(2, 0, 2, 0);
IntStream intStream = list.stream().mapToInt(i -> i);
List<Integer> collect = intStream.boxed().collect(Collectors.toList()); 
System.out.println(collect);
    
// Prints the methods of the java.stream.Stream interface whose name starts with "map" ;
private List<Integer> integers = Lists.list(30, 40, 10, 20);
List<String> collect = integers.stream().map(i -> i + "test").collect(Collectors.toList());
assertEquals(Lists.list("hello", "world1", "bye", "world2"), collect);

//Prints the declared two-parameter methods of java.lang.String one of whose parameters is a char array;
char[] getBytes;
char[].class;
String myString="abcdef";
char myChar[]=myString.toCharArray();
System.out.println("myChar[0]="+myChar[0]); 

//Prints the declared two-parameter methods that are marked as deprecated;


//Prints the deprecated constructors of java.util.Date;
java.util.Date date = new java.util.Date (120,2,8);

//Prints the declared private instance (i.e., non-static) fields of java.lang.String;


//Stores the value of the private field named "value" of the string "Hello, World!";
String i = "Hello,World!";
String str = String.valueOf(i); 

//Prints the declared methods of java.lang.String with a single-word name (e.g., length, repeat);
String str = "Hello,World!";
System.out.println("length of string =  " + str.length());

//Prints the declared methods of java.lang.String that may throw an exception;
System.out.println(1/0);

//Prints the declared methods of java.lang.String that may throw a NoSuchMethodException;
throw new RunTimeException;

//Prints the declared methods of java.lang.String that take a string as the first parameter;


//Prints the declared two-parameter methods of java.lang.String that are marked as deprecated for removal;


//Prints the declared methods of java.lang.String with two or more parameters where the first and the last parameters are of the same type;


//Prints the declared single parameter methods of java.util.Stream that accept an object implementing a functional interface as a parameter;


//Calls the private method indexOfNonWhitespace() of java.util.String on the string "Hello, World!" and stores the result;


//Prints the functional interfaces implemented by java.time.LocalDate;
LocalDate today = LocalDate.now();
System.out.println(today);

//Prints the enum constants of java.time.Month whose name contain only a single English vowel (i.e., A, E, I, O, U);
MonthDay time = MonthDay.now(Clock.systemUTC());
System.out.println(time);  

