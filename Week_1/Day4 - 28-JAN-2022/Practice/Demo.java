public class Demo{  
   public static void main( String[] args )
    {
       String s1 = new String("hello");
       String s2 = new String("Hello");
       String s3 = "hello";
       System.out.println("HashCode of s1 is "+s1.hashCode());
       System.out.println("HashCode of s2 is "+s2.hashCode());
       System.out.println("HashCode of s3 is "+s3.hashCode());
    }
}