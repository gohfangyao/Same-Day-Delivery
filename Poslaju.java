import java.util.Scanner;
public class Samedaydelivery
{
public static void main(String args[])
{

double wt=0;

while (true)
{
wt=calculateweight();

if (wt<0) {
System.out.println("exiting program");
break;
}
else
{
	System.out.println("Enter 1 for local town, 2 for cross town");
	Scanner sc = new Scanner(System.in);
	
    String a;
    a = sc.nextLine();
    System.out.println("The entered integer is" + a);
    
    
    if ("1".equals(a)){
        System.out.println("Call calculate local town");
        calculateLocalTownCharge(wt);
      }
      else if ("2".equals(a)){
        System.out.println("Call calculate cross town");
        calculateCrossTownCharge(wt);
      }
      else
        System.out.println("Invalid try again"); 
   }
	

}

}


static double calculateweight()
{

System.out.println("enter number amount of weight. Enter negative weight to exit.");

Scanner sc=new Scanner(System.in);

double weight = sc.nextDouble();

System.out.println("Weigth : " + weight);

return weight;



}

static void calculateLocalTownCharge(double weight1)
{
double charge=0;

if((weight1>=0)&&(weight1<500)){
double domesticCharge=4.90;
double surcharge=6.90;
System.out.println(domesticCharge+ surcharge);
}


else if((weight1>=500)&&(weight1<=750)){
double domesticCharge=5.70;
double surcharge=6.00;
System.out.println(domesticCharge+ surcharge);
}


else if((weight1>=750)&&(weight1<=1000)){
double domesticCharge=6.50;
double surcharge=6.00;
System.out.println(domesticCharge+ surcharge);
}


else{
System.out.println("No rates available");

}
}

static void calculateCrossTownCharge(double weight1)
{
double charge=0;

if((weight1>=0)&&(weight1<500)){
double domesticCharge=5.40;
double surcharge=7.50;
System.out.println(domesticCharge+ surcharge);
}


else if((weight1>=500)&&(weight1<=750)){
double domesticCharge=6.40;
double surcharge=7.50;
System.out.println(domesticCharge+ surcharge);
}


else if((weight1>=750)&&(weight1<=1000)){
double domesticCharge=7.40;
double surcharge=7.50;
System.out.println(domesticCharge+ surcharge);
}


else{
System.out.println("No rates available");

}



}
}
