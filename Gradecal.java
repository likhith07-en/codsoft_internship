import java.util.*;
public class Gradecal {
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float S1,S2,S3,S4,S5,S6;
        System.out.println("Enter the valid details ");
        System.out.println("Student id");
        String Id,Name;
        Id=sc.nextLine();
        System.out.println("Student Name :");
        Name=sc.nextLine();
        System.out.println("Enter subject wise marks");
        System.out.print("Enter English marks\t");
        S1=sc.nextFloat();    
        if ((S1<0)||(S1>100)) {
            System.out.println("Enter valid Marks");
            S1=sc.nextFloat();           
         }
        System.out.print("Enter Language II marks\t");
         S2=sc.nextFloat(); 
         if ((S2<0)||(S2>100)) {
            System.out.println("Enter valid Marks");
            S2=sc.nextFloat();           
         }         
         System.out.print("Enter Mathematics marks\t");
         S3=sc.nextFloat();
         if ((S3<0)||(S3>100)) {
            System.out.println("Enter valid Marks");
            S3=sc.nextFloat();           
         }          
         System.out.print("Enter Science marks\t");
         S4=sc.nextFloat(); 
         if ((S4<0)||(S4>100)) {
            System.out.println("Enter valid Marks");
            S4=sc.nextFloat();           
         }
         System.out.print("Enter Social marks\t");
         S5=sc.nextFloat(); 
         if ((S5<0)||(S5>100)) {
            System.out.println("Enter valid Marks");
            S5=sc.nextFloat();           
         }         
         System.out.print("Enter IT marks\t\t");
         S6=sc.nextFloat(); 
         if ((S6<0)||(S6>100)) {
            System.out.println("Enter valid Marks");
            S6=sc.nextFloat();           
         }
         float Total=S1+S2+S3+S4+S5+S6;
         float Average=(Total/6); 
         char Grade='F';
        if((Average<=100)&&(Average>=91)){
         Grade='S';
        }
        else if((Average<=90)&&(Average>=81)){
            Grade='A';
           }
        else if((Average<=80)&&(Average>=71)){
            Grade='B';
           }
        else if((Average<=70)&&(Average>=61)){
            Grade='C';
           }
           else if((Average<=60)&&(Average>=51)){
            Grade='D';
           }
        else if((Average<=50)&&(Average>=33)){
            Grade='E';
           }
        else if((Average<=32)&&(Average>=0)){
            Grade='F';
           }           
      //  System.out.println(S1+""+S2+""+S3+""+S4+""+S5+""+S6+""+Total+""+Average);
        //System.out.println(Grade);
        System.out.println("---------------------------------------------------");
        System.out.println("\t\t\tReport Card");
        System.out.println("Student id :"+Id+"\tName : "+Name);
        System.out.println("S.Rno\t\tSubject\t\t\t Marks obtained");
        System.out.println("1.\t\tEnglish\t\t\t"+S1);
        System.out.println("2.\t\tLang II \t\t"+S2);
        System.out.println("3.\t\tMathematics\t\t"+S3);
        System.out.println("4.\t\tSCience\t\t\t"+S4);
        System.out.println("5.\t\tSocial\t\t\t"+S5);
        System.out.println("6.\t\tIT  \t\t\t"+S6);
        System.out.println("\t\t Total\t\t\t"+Total+" / 600");
        System.out.println("\t\tGrade obtained\t"+Grade);
        System.out.println("---------------------------------------------------");
    sc.close();
    }
}
