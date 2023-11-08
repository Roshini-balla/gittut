class FactorialLoop     //forward iteration
{
   public static void main(String args[])
   {
      int start=1,factorial=1,num=5;
      while(start<=num)
      {
         factorial=factorial*start;
         start++;
      }
         System.out.println("factorial of " +num+ " is " + factorial);
         System.out.println("--------------------------------------------");



       start=5;factorial=1;num=1;
       while(start>=num)       //
       {
          factorial=factorial*start;
         start--;
      }
         System.out.println("factorial of 5"+ " is " + factorial);
       
   }
 
}