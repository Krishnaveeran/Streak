    public class Practise2 
    {  
    int s;  

    public static void main(String [] args)  
    {  
  
    Practise2 obj = new Practise2();  
      int result=obj.add(12,13);
      System.out.println("The sum is:" +result);
 //   System.out.println("The sum is: "+obj.add(12, 13));  
    }  

    public int add(int a, int b)  
    {  
    s = a+b;   
    return s;  
    }  
    }  

