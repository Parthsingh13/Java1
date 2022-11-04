class Test
{
    int a = 0;
    static int b = 0;
    
    void showData()
    {
        System.out.println("Value of a : "+ a);
        System.out.println("Value of b : "+ b);
    }
    
    static void displayData()
    {
        StaticMethodExample obj = new StaticMethodExample();
        System.out.println("Value of a : "+ obj.a);
        System.out.println("Value of b : "+ b);
    }
    
   
   public static void main(String arg[])
   {
      displayData();
      StaticMethodExample obj = new StaticMethodExample();
      obj.showData();
   }
}