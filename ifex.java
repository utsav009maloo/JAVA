//It is a program of grading system for fail, D grade, C grade, B grade, A grade and A+. 
public class ifex
{ 
 public static void main (String args[])
 { 
  int n=65;
  if (n<10)
  { 
   System.out.print("Fail");
  }
  else if (n>10 && n<30)
  { 
   System.out.print(" D ");
  }
  else if (n>30 && n<50)
  { 
   System.out.print(" C ");
  }
  else if (n>50 && n<70)
  { 
   System.out.print(" B ");
  }
  else if (n>70 && n<90)
  { 
   System.out.print(" A ");
  }
  else if (n>90 && n<100)
  { 
   System.out.print(" A+ ");
  }
 } 
}   

