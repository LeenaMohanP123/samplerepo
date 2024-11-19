package samplemaven;

public class SampleMavenClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="It is a Program basic with maven Repository";
String w="Worke with java";
char c=s.charAt(6);
int length=s.length();
String result=s.concat(" ").concat(". ").concat(w);
String replace=w.replace("java","python");
System.out.println(s.equals(w));
System.out.println(replace);
System.out.println(w.isEmpty());
System.out.println(c);
System.out.println(length);
System.out.println(result);
System.out.println(s.equalsIgnoreCase(w));
System.out.println(s.contains("Program"));
	}

}
\