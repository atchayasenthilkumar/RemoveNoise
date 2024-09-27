import java.util.*;

import java.lang.*;

 public class removenoise 
{
 
 public static void main(String[] args)
{
  
  String text = " apple#$5is@39a+*@fruit";
  
 
  String text1 = text.replaceAll("[^a-zA-Z0-9]", "");

 
  String text2 = text1.replaceAll("\\d","");
    

    System.out.println(text2);
 
 }

}

