public class TemperatureDemo
{
   public static void main(String[] args)
   {
      System.out.println("\nTest 4 constructors. . .");
      System.out.println("t1: created by no-arg constructor");
      Temperature t1 = new Temperature();

      System.out.println("t2: Created by 1-arg constructor with initial degree -40");
      Temperature t2 = new Temperature(-40);

      System.out.println("t3: Created by 1-arg constructor with initial scale 'F'");
      Temperature t3 = new Temperature('F');

      System.out.println("t4: Created by 2-arg constructor with initial temperature 32 F");
      Temperature t4 = new Temperature(32, 'F');


      System.out.println("\nTest 2 getter methods. . .");
      System.out.printf("t1 is %5.1f %s = %5.1f %s\n", t1.getDegreesC(), "C", t1.getDegreesF(), "F");

      System.out.printf("t2 is %5.1f %s = %5.1f %s\n", t2.getDegreesC(), "C", t2.getDegreesF(), "F");

      System.out.printf("t3 is %5.1f %s = %5.1f %s\n", t3.getDegreesC(), "C", t3.getDegreesF(), "F");

      System.out.printf("t4 is %5.1f %s = %5.1f %s\n", t4.getDegreesC(), "C", t4.getDegreesF(), "F");

      
      System.out.println("\nTest 3 comparison methods. . .");
      System.out.printf("is t1 (<, ==, >) t2? results are (%s, %s, %s) \n",
                        t1.lessThan(t2), t1.equals(t2), t1.greaterThan(t2)); 

      System.out.printf("is t2 (<, ==, >) t3? results are (%s, %s, %s) \n",
                        t2.lessThan(t3), t2.equals(t3), t2.greaterThan(t3));

      System.out.printf("is t1 (<, ==, >) t4? results are (%s, %s, %s) \n",
                        t1.lessThan(t4), t1.equals(t4), t1.greaterThan(t4));


      System.out.println("\nTest 3 setter methods...");
      System.out.println("changing t1 from 0 C to -40 C...");
      t1.setDegrees(-40.0);
      System.out.printf("t1 is %5.1f %s = %5.1f %s\n", t1.getDegreesC(), "C",
                         t1.getDegreesF(), "F");


      System.out.println("changing t3 from 0 F to 100 C...");
      t3.setDegrees(212.0);
      System.out.printf("t3 is %5.1f %s = %5.1f %s\n", t3.getDegreesC(), "C",
                         t3.getDegreesF(), "F");


      System.out.println("changing t4 from 32 F to 32 C...");
      t4.setScale('C');
      System.out.printf("t4 is %5.1f %s = %5.1f %s\n", t4.getDegreesC(), "C",
                         t4.getDegreesF(), "F");


      System.out.println("changing t2 scale to 'G'");
      t2.setScale('G');
      System.out.printf("t2 is %5.1f %s = %5.1f %s\n", t2.getDegreesC(), "C",
                         t2.getDegreesF(), "F");


   }
}
