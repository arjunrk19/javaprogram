import java.lang.Math;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class RandomNumberExample1  
{   
public static void main(String args[])   
{
System.out.println("Please Enter Command: ");
Scanner sc=new Scanner(System.in);
String input=sc.nextLine();
String[] words=input.split(" ");
String part1=words[0];
String part2=words[1];
int count=0;
HashMap urls = new HashMap();
urls.put(part2,word1);
word1=part2.hashCode();
count=count+1;
word2=part2.hashCode();
count=count+1;

if(part1=="storeurl"){
	System.out.println(urls);
	count=count+1;
}
else if(part1=="get"){
	System.out.println(word2);
	count=count+1;
}
else if(part1=="count"){
	count=count+1;
	System.out.println(count);
}
else if(part1=="list"){
	Gson gson = new GsonBuilder().disableHtmlEscaping().create();
	String jsonString = gson.toJson(urls);
	System.out.println(jsonString);
}
else if(part1=="exit"){
	System.exit(0);
}
}
}     