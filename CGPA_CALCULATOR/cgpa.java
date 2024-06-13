import java.util.Scanner;
public class cgpa {
	public static void main(String[] args)throws Exception {
		while (true){
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the semester till which you want to calculate the CGPA=");
		int a=sc.nextInt();
		float r1=0;
		float r2=0;
		float r3=0;
		float r4=0;
		float r5=0;
		float r6=0;
		float r7=0;
		float r8=0;
		for(int n=1;n<=a;n++)
		{
		System.out.println("Semester="+n);
		if (n==1) {
			int c1=4;
			int c2=4;
			int c3=3;
			int c4=3;
			int c5=3;
			int c6=1;
			int c7=1;
			int c8=1;
			System.out.println("Enter the marks of 18MAT11=");
			int m1=sc.nextInt();
			System.out.println("Enter the marks of 18CHE12=");
			int m2=sc.nextInt();
			System.out.println("Enter the marks of 18CPS13=");
			int m3=sc.nextInt();
			System.out.println("Enter the marks of 18ELN14=");
			int m4=sc.nextInt();
			System.out.println("Enter the marks of 18ME15=");
			int m5=sc.nextInt();
			System.out.println("Enter the marks of 18CHEL16=");
			int m6=sc.nextInt();
			System.out.println("Enter the marks of 18CPL17=");
			int m7=sc.nextInt();
			System.out.println("Enter the marks of 18EGH18=");
			int m8=sc.nextInt();
			if(m1>=90) {m1=10;}
			else if(m1>=80) {m1=9;}
			else if(m1>=70) {m1=8;}
			else if(m1>=60) {m1=7;}
			else if(m1>=50) {m1=6;}
			else if(m1>=40) {m1=5;}
			else if(m1>=30) {m1=4;}
			else if(m1>=20) {m1=3;}
			else if(m1>=10) {m1=2;}
			else if(m1>0) {m1=1;}
			if(m2>=90) {m2=10;}
			else if(m2>=80) {m2=9;}
			else if(m2>=70) {m2=8;}
			else if(m2>=60) {m2=7;}
			else if(m2>=50) {m2=6;}
			else if(m2>=40) {m2=5;}
			else if(m2>=30) {m2=4;}
			else if(m2>=20) {m2=3;}
			else if(m2>=10) {m2=2;}
			else if(m2>0) {m2=1;}
			if(m3>=90) {m3=10;}
			else if(m3>=80) {m3=9;}
			else if(m3>=70) {m3=8;}
			else if(m3>=60) {m3=7;}
			else if(m3>=50) {m3=6;}
			else if(m3>=40) {m3=5;}
			else if(m3>=30) {m3=4;}
			else if(m3>=20) {m3=3;}
			else if(m3>=10) {m3=2;}
			else if(m3>0) {m3=1;}
			if(m4>=90) {m4=10;}
			else if(m4>=80) {m4=9;}
			else if(m4>=70) {m4=8;}
			else if(m4>=60) {m4=7;}
			else if(m4>=50) {m4=6;}
			else if(m4>=40) {m4=5;}
			else if(m4>=30) {m4=4;}
			else if(m4>=20) {m4=3;}
			else if(m4>=10) {m4=2;}
			else if(m4>0) {m4=1;}
			if(m5>=90) {m5=10;}
			else if(m5>=80) {m5=9;}
			else if(m5>=70) {m5=8;}
			else if(m5>=60) {m5=7;}
			else if(m5>=50) {m5=6;}
			else if(m5>=40) {m5=5;}
			else if(m5>=30) {m5=4;}
			else if(m5>=20) {m5=3;}
			else if(m5>=10) {m5=2;}
			else if(m5>0) {m5=1;}
			if(m6>=90) {m6=10;}
			else if(m6>=80) {m6=9;}
			else if(m6>=70) {m6=8;}
			else if(m6>=60) {m6=7;}
			else if(m6>=50) {m6=6;}
			else if(m6>=40) {m6=5;}
			else if(m6>=30) {m6=4;}
			else if(m6>=20) {m6=3;}
			else if(m6>=10) {m6=2;}
			else if(m6>0) {m6=1;}
			if(m7>=90) {m7=10;}
			else if(m7>=80) {m7=9;}
			else if(m7>=70) {m7=8;}
			else if(m7>=60) {m7=7;}
			else if(m7>=50) {m7=6;}
			else if(m7>=40) {m7=5;}
			else if(m7>=30) {m7=4;}
			else if(m7>=20) {m7=3;}
			else if(m7>=10) {m7=2;}
			else if(m7>0) {m7=1;}
			if(m8>=90) {m8=10;}
			else if(m8>=80) {m8=9;}
			else if(m8>=70) {m8=8;}
			else if(m8>=60) {m8=7;}
			else if(m8>=50) {m8=6;}
			else if(m8>=40) {m8=5;}
			else if(m8>=30) {m8=4;}
			else if(m8>=20) {m8=3;}
			else if(m8>=10) {m8=2;}
			else if(m8>0) {m8=1;}
			float n1=((c1*m1)+(c2*m2)+(c3*m3)+(c4*m4)+(c5*m5)+(c6*m6)+(c7*m7)+(c8*m8));
			float d=(c1+c2+c3+c4+c5+c6+c7+c8);
		    r1=n1/d;
			System.out.println("SGPA for First Semester="+r1);
		}
		if (n==2) {
			int c1=4;
			int c2=4;
			int c3=3;
			int c4=3;
			int c5=3;
			int c6=1;
			int c7=1;
			int c8=1;
			System.out.println("Enter the marks of 18MAT21=");
			int m1=sc.nextInt();
			System.out.println("Enter the marks of 18PHY22=");
			int m2=sc.nextInt();
			System.out.println("Enter the marks of 18ELE23=");
			int m3=sc.nextInt();
			System.out.println("Enter the marks of 18CIV24=");
			int m4=sc.nextInt();
			System.out.println("Enter the marks of 18EGDL25=");
			int m5=sc.nextInt();
			System.out.println("Enter the marks of 18PHYL26=");
			int m6=sc.nextInt();
			System.out.println("Enter the marks of 18ELEL27=");
			int m7=sc.nextInt();
			System.out.println("Enter the marks of 18EGH28=");
			int m8=sc.nextInt();
			if(m1>=90) {m1=10;}
			else if(m1>=80) {m1=9;}
			else if(m1>=70) {m1=8;}
			else if(m1>=60) {m1=7;}
			else if(m1>=50) {m1=6;}
			else if(m1>=40) {m1=5;}
			else if(m1>=30) {m1=4;}
			else if(m1>=20) {m1=3;}
			else if(m1>=10) {m1=2;}
			else if(m1>0) {m1=1;}
			if(m2>=90) {m2=10;}
			else if(m2>=80) {m2=9;}
			else if(m2>=70) {m2=8;}
			else if(m2>=60) {m2=7;}
			else if(m2>=50) {m2=6;}
			else if(m2>=40) {m2=5;}
			else if(m2>=30) {m2=4;}
			else if(m2>=20) {m2=3;}
			else if(m2>=10) {m2=2;}
			else if(m2>0) {m2=1;}
			if(m3>=90) {m3=10;}
			else if(m3>=80) {m3=9;}
			else if(m3>=70) {m3=8;}
			else if(m3>=60) {m3=7;}
			else if(m3>=50) {m3=6;}
			else if(m3>=40) {m3=5;}
			else if(m3>=30) {m3=4;}
			else if(m3>=20) {m3=3;}
			else if(m3>=10) {m3=2;}
			else if(m3>0) {m3=1;}
			if(m4>=90) {m4=10;}
			else if(m4>=80) {m4=9;}
			else if(m4>=70) {m4=8;}
			else if(m4>=60) {m4=7;}
			else if(m4>=50) {m4=6;}
			else if(m4>=40) {m4=5;}
			else if(m4>=30) {m4=4;}
			else if(m4>=20) {m4=3;}
			else if(m4>=10) {m4=2;}
			else if(m4>0) {m4=1;}
			if(m5>=90) {m5=10;}
			else if(m5>=80) {m5=9;}
			else if(m5>=70) {m5=8;}
			else if(m5>=60) {m5=7;}
			else if(m5>=50) {m5=6;}
			else if(m5>=40) {m5=5;}
			else if(m5>=30) {m5=4;}
			else if(m5>=20) {m5=3;}
			else if(m5>=10) {m5=2;}
			else if(m5>0) {m5=1;}
			if(m6>=90) {m6=10;}
			else if(m6>=80) {m6=9;}
			else if(m6>=70) {m6=8;}
			else if(m6>=60) {m6=7;}
			else if(m6>=50) {m6=6;}
			else if(m6>=40) {m6=5;}
			else if(m6>=30) {m6=4;}
			else if(m6>=20) {m6=3;}
			else if(m6>=10) {m6=2;}
			else if(m6>0) {m6=1;}
			if(m7>=90) {m7=10;}
			else if(m7>=80) {m7=9;}
			else if(m7>=70) {m7=8;}
			else if(m7>=60) {m7=7;}
			else if(m7>=50) {m7=6;}
			else if(m7>=40) {m7=5;}
			else if(m7>=30) {m7=4;}
			else if(m7>=20) {m7=3;}
			else if(m7>=10) {m7=2;}
			else if(m7>0) {m7=1;}
			if(m8>=90) {m8=10;}
			else if(m8>=80) {m8=9;}
			else if(m8>=70) {m8=8;}
			else if(m8>=60) {m8=7;}
			else if(m8>=50) {m8=6;}
			else if(m8>=40) {m8=5;}
			else if(m8>=30) {m8=4;}
			else if(m8>=20) {m8=3;}
			else if(m8>=10) {m8=2;}
			else if(m8>0) {m8=1;}
			float n1=((c1*m1)+(c2*m2)+(c3*m3)+(c4*m4)+(c5*m5)+(c6*m6)+(c7*m7)+(c8*m8));
			float d=(c1+c2+c3+c4+c5+c6+c7+c8);
			r2=n1/d;
			System.out.println("SGPA for Second Semester="+r2);
		}
		if (n==3) {
			int c1=3;
			int c2=4;
			int c3=3;
			int c4=3;
			int c5=3;
			int c6=3;
			int c7=2;
			int c8=2;
			int c9=1;
			System.out.println("Enter the marks of 18MAT31=");
			int m1=sc.nextInt();
			System.out.println("Enter the marks of 18EC32=");
			int m2=sc.nextInt();
			System.out.println("Enter the marks of 18EC33=");
			int m3=sc.nextInt();
			System.out.println("Enter the marks of 18EC34=");
			int m4=sc.nextInt();
			System.out.println("Enter the marks of 18EC35=");
			int m5=sc.nextInt();
			System.out.println("Enter the marks of 18EC36=");
			int m6=sc.nextInt();
			System.out.println("Enter the marks of 18ECL37=");
			int m7=sc.nextInt();
			System.out.println("Enter the marks of 18ECL38=");
			int m8=sc.nextInt();
			System.out.println("Enter the marks of 18KAK39=");
			int m9=sc.nextInt();
			if(m1>=90) {m1=10;}
			else if(m1>=80) {m1=9;}
			else if(m1>=70) {m1=8;}
			else if(m1>=60) {m1=7;}
			else if(m1>=50) {m1=6;}
			else if(m1>=40) {m1=5;}
			else if(m1>=30) {m1=4;}
			else if(m1>=20) {m1=3;}
			else if(m1>=10) {m1=2;}
			else if(m1>0) {m1=1;}
			if(m2>=90) {m2=10;}
			else if(m2>=80) {m2=9;}
			else if(m2>=70) {m2=8;}
			else if(m2>=60) {m2=7;}
			else if(m2>=50) {m2=6;}
			else if(m2>=40) {m2=5;}
			else if(m2>=30) {m2=4;}
			else if(m2>=20) {m2=3;}
			else if(m2>=10) {m2=2;}
			else if(m2>0) {m2=1;}
			if(m3>=90) {m3=10;}
			else if(m3>=80) {m3=9;}
			else if(m3>=70) {m3=8;}
			else if(m3>=60) {m3=7;}
			else if(m3>=50) {m3=6;}
			else if(m3>=40) {m3=5;}
			else if(m3>=30) {m3=4;}
			else if(m3>=20) {m3=3;}
			else if(m3>=10) {m3=2;}
			else if(m3>0) {m3=1;}
			if(m4>=90) {m4=10;}
			else if(m4>=80) {m4=9;}
			else if(m4>=70) {m4=8;}
			else if(m4>=60) {m4=7;}
			else if(m4>=50) {m4=6;}
			else if(m4>=40) {m4=5;}
			else if(m4>=30) {m4=4;}
			else if(m4>=20) {m4=3;}
			else if(m4>=10) {m4=2;}
			else if(m4>0) {m4=1;}
			if(m5>=90) {m5=10;}
			else if(m5>=80) {m5=9;}
			else if(m5>=70) {m5=8;}
			else if(m5>=60) {m5=7;}
			else if(m5>=50) {m5=6;}
			else if(m5>=40) {m5=5;}
			else if(m5>=30) {m5=4;}
			else if(m5>=20) {m5=3;}
			else if(m5>=10) {m5=2;}
			else if(m5>0) {m5=1;}
			if(m6>=90) {m6=10;}
			else if(m6>=80) {m6=9;}
			else if(m6>=70) {m6=8;}
			else if(m6>=60) {m6=7;}
			else if(m6>=50) {m6=6;}
			else if(m6>=40) {m6=5;}
			else if(m6>=30) {m6=4;}
			else if(m6>=20) {m6=3;}
			else if(m6>=10) {m6=2;}
			else if(m6>0) {m6=1;}
			if(m7>=90) {m7=10;}
			else if(m7>=80) {m7=9;}
			else if(m7>=70) {m7=8;}
			else if(m7>=60) {m7=7;}
			else if(m7>=50) {m7=6;}
			else if(m7>=40) {m7=5;}
			else if(m7>=30) {m7=4;}
			else if(m7>=20) {m7=3;}
			else if(m7>=10) {m7=2;}
			else if(m7>0) {m7=1;}
			if(m8>=90) {m8=10;}
			else if(m8>=80) {m8=9;}
			else if(m8>=70) {m8=8;}
			else if(m8>=60) {m8=7;}
			else if(m8>=50) {m8=6;}
			else if(m8>=40) {m8=5;}
			else if(m8>=30) {m8=4;}
			else if(m8>=20) {m8=3;}
			else if(m8>=10) {m8=2;}
			else if(m8>0) {m8=1;}
			if(m9>=90) {m9=10;}
			else if(m9>=80) {m9=9;}
			else if(m9>=70) {m9=8;}
			else if(m9>=60) {m9=7;}
			else if(m9>=50) {m9=6;}
			else if(m9>=40) {m9=5;}
			else if(m9>=30) {m9=4;}
			else if(m9>=20) {m9=3;}
			else if(m9>=10) {m9=2;}
			else if(m9>0) {m9=1;}
			float n1=((c1*m1)+(c2*m2)+(c3*m3)+(c4*m4)+(c5*m5)+(c6*m6)+(c7*m7)+(c8*m8)+(c9*m9));
			float d=(c1+c2+c3+c4+c5+c6+c7+c8+c9);
		    r3=n1/d;
			System.out.println("SGPA for Third Semester="+r3);
		}
		if (n==4) {
			int c1=3;
			int c2=4;
			int c3=3;
			int c4=3;
			int c5=3;
			int c6=3;
			int c7=2;
			int c8=2;
			int c9=1;
			System.out.println("Enter the marks of 18MAT41=");
			int m1=sc.nextInt();
			System.out.println("Enter the marks of 18EC42=");
			int m2=sc.nextInt();
			System.out.println("Enter the marks of 18EC43=");
			int m3=sc.nextInt();
			System.out.println("Enter the marks of 18EC44=");
			int m4=sc.nextInt();
			System.out.println("Enter the marks of 18EC45=");
			int m5=sc.nextInt();
			System.out.println("Enter the marks of 18EC46=");
			int m6=sc.nextInt();
			System.out.println("Enter the marks of 18ECL47=");
			int m7=sc.nextInt();
			System.out.println("Enter the marks of 18ECL48=");
			int m8=sc.nextInt();
			System.out.println("Enter the marks of 18CPC49=");
			int m9=sc.nextInt();
			if(m1>=90) {m1=10;}
			else if(m1>=80) {m1=9;}
			else if(m1>=70) {m1=8;}
			else if(m1>=60) {m1=7;}
			else if(m1>=50) {m1=6;}
			else if(m1>=40) {m1=5;}
			else if(m1>=30) {m1=4;}
			else if(m1>=20) {m1=3;}
			else if(m1>=10) {m1=2;}
			else if(m1>0) {m1=1;}
			if(m2>=90) {m2=10;}
			else if(m2>=80) {m2=9;}
			else if(m2>=70) {m2=8;}
			else if(m2>=60) {m2=7;}
			else if(m2>=50) {m2=6;}
			else if(m2>=40) {m2=5;}
			else if(m2>=30) {m2=4;}
			else if(m2>=20) {m2=3;}
			else if(m2>=10) {m2=2;}
			else if(m2>0) {m2=1;}
			if(m3>=90) {m3=10;}
			else if(m3>=80) {m3=9;}
			else if(m3>=70) {m3=8;}
			else if(m3>=60) {m3=7;}
			else if(m3>=50) {m3=6;}
			else if(m3>=40) {m3=5;}
			else if(m3>=30) {m3=4;}
			else if(m3>=20) {m3=3;}
			else if(m3>=10) {m3=2;}
			else if(m3>0) {m3=1;}
			if(m4>=90) {m4=10;}
			else if(m4>=80) {m4=9;}
			else if(m4>=70) {m4=8;}
			else if(m4>=60) {m4=7;}
			else if(m4>=50) {m4=6;}
			else if(m4>=40) {m4=5;}
			else if(m4>=30) {m4=4;}
			else if(m4>=20) {m4=3;}
			else if(m4>=10) {m4=2;}
			else if(m4>0) {m4=1;}
			if(m5>=90) {m5=10;}
			else if(m5>=80) {m5=9;}
			else if(m5>=70) {m5=8;}
			else if(m5>=60) {m5=7;}
			else if(m5>=50) {m5=6;}
			else if(m5>=40) {m5=5;}
			else if(m5>=30) {m5=4;}
			else if(m5>=20) {m5=3;}
			else if(m5>=10) {m5=2;}
			else if(m5>0) {m5=1;}
			if(m6>=90) {m6=10;}
			else if(m6>=80) {m6=9;}
			else if(m6>=70) {m6=8;}
			else if(m6>=60) {m6=7;}
			else if(m6>=50) {m6=6;}
			else if(m6>=40) {m6=5;}
			else if(m6>=30) {m6=4;}
			else if(m6>=20) {m6=3;}
			else if(m6>=10) {m6=2;}
			else if(m6>0) {m6=1;}
			if(m7>=90) {m7=10;}
			else if(m7>=80) {m7=9;}
			else if(m7>=70) {m7=8;}
			else if(m7>=60) {m7=7;}
			else if(m7>=50) {m7=6;}
			else if(m7>=40) {m7=5;}
			else if(m7>=30) {m7=4;}
			else if(m7>=20) {m7=3;}
			else if(m7>=10) {m7=2;}
			else if(m7>0) {m7=1;}
			if(m8>=90) {m8=10;}
			else if(m8>=80) {m8=9;}
			else if(m8>=70) {m8=8;}
			else if(m8>=60) {m8=7;}
			else if(m8>=50) {m8=6;}
			else if(m8>=40) {m8=5;}
			else if(m8>=30) {m8=4;}
			else if(m8>=20) {m8=3;}
			else if(m8>=10) {m8=2;}
			else if(m8>0) {m8=1;}
			if(m9>=90) {m9=10;}
			else if(m9>=80) {m9=9;}
			else if(m9>=70) {m9=8;}
			else if(m9>=60) {m9=7;}
			else if(m9>=50) {m9=6;}
			else if(m9>=40) {m9=5;}
			else if(m9>=30) {m9=4;}
			else if(m9>=20) {m9=3;}
			else if(m9>=10) {m9=2;}
			else if(m9>0) {m9=1;}
			float n1=((c1*m1)+(c2*m2)+(c3*m3)+(c4*m4)+(c5*m5)+(c6*m6)+(c7*m7)+(c8*m8)+(c9*m9));
			float d=(c1+c2+c3+c4+c5+c6+c7+c8+c9);
			r4=n1/d;
			System.out.println("SGPA for Fourth Semester="+r4);
		}
		if (n==5) {
			int c1=3;
			int c2=4;
			int c3=4;
			int c4=3;
			int c5=3;
			int c6=3;
			int c7=2;
			int c8=2;
			int c9=1;
			System.out.println("Enter the marks of 18ES51=");
			int m1=sc.nextInt();
			System.out.println("Enter the marks of 18EC52=");
			int m2=sc.nextInt();
			System.out.println("Enter the marks of 18EC53=");
			int m3=sc.nextInt();
			System.out.println("Enter the marks of 18EC54=");
			int m4=sc.nextInt();
			System.out.println("Enter the marks of 18EC55=");
			int m5=sc.nextInt();
			System.out.println("Enter the marks of 18EC56=");
			int m6=sc.nextInt();
			System.out.println("Enter the marks of 18ECL57=");
			int m7=sc.nextInt();
			System.out.println("Enter the marks of 18ECL58=");
			int m8=sc.nextInt();
			System.out.println("Enter the marks of 18CIV59=");
			int m9=sc.nextInt();
			if(m1>=90) {m1=10;}
			else if(m1>=80) {m1=9;}
			else if(m1>=70) {m1=8;}
			else if(m1>=60) {m1=7;}
			else if(m1>=50) {m1=6;}
			else if(m1>=40) {m1=5;}
			else if(m1>=30) {m1=4;}
			else if(m1>=20) {m1=3;}
			else if(m1>=10) {m1=2;}
			else if(m1>0) {m1=1;}
			if(m2>=90) {m2=10;}
			else if(m2>=80) {m2=9;}
			else if(m2>=70) {m2=8;}
			else if(m2>=60) {m2=7;}
			else if(m2>=50) {m2=6;}
			else if(m2>=40) {m2=5;}
			else if(m2>=30) {m2=4;}
			else if(m2>=20) {m2=3;}
			else if(m2>=10) {m2=2;}
			else if(m2>0) {m2=1;}
			if(m3>=90) {m3=10;}
			else if(m3>=80) {m3=9;}
			else if(m3>=70) {m3=8;}
			else if(m3>=60) {m3=7;}
			else if(m3>=50) {m3=6;}
			else if(m3>=40) {m3=5;}
			else if(m3>=30) {m3=4;}
			else if(m3>=20) {m3=3;}
			else if(m3>=10) {m3=2;}
			else if(m3>0) {m3=1;}
			if(m4>=90) {m4=10;}
			else if(m4>=80) {m4=9;}
			else if(m4>=70) {m4=8;}
			else if(m4>=60) {m4=7;}
			else if(m4>=50) {m4=6;}
			else if(m4>=40) {m4=5;}
			else if(m4>=30) {m4=4;}
			else if(m4>=20) {m4=3;}
			else if(m4>=10) {m4=2;}
			else if(m4>0) {m4=1;}
			if(m5>=90) {m5=10;}
			else if(m5>=80) {m5=9;}
			else if(m5>=70) {m5=8;}
			else if(m5>=60) {m5=7;}
			else if(m5>=50) {m5=6;}
			else if(m5>=40) {m5=5;}
			else if(m5>=30) {m5=4;}
			else if(m5>=20) {m5=3;}
			else if(m5>=10) {m5=2;}
			else if(m5>0) {m5=1;}
			if(m6>=90) {m6=10;}
			else if(m6>=80) {m6=9;}
			else if(m6>=70) {m6=8;}
			else if(m6>=60) {m6=7;}
			else if(m6>=50) {m6=6;}
			else if(m6>=40) {m6=5;}
			else if(m6>=30) {m6=4;}
			else if(m6>=20) {m6=3;}
			else if(m6>=10) {m6=2;}
			else if(m6>0) {m6=1;}
			if(m7>=90) {m7=10;}
			else if(m7>=80) {m7=9;}
			else if(m7>=70) {m7=8;}
			else if(m7>=60) {m7=7;}
			else if(m7>=50) {m7=6;}
			else if(m7>=40) {m7=5;}
			else if(m7>=30) {m7=4;}
			else if(m7>=20) {m7=3;}
			else if(m7>=10) {m7=2;}
			else if(m7>0) {m7=1;}
			if(m8>=90) {m8=10;}
			else if(m8>=80) {m8=9;}
			else if(m8>=70) {m8=8;}
			else if(m8>=60) {m8=7;}
			else if(m8>=50) {m8=6;}
			else if(m8>=40) {m8=5;}
			else if(m8>=30) {m8=4;}
			else if(m8>=20) {m8=3;}
			else if(m8>=10) {m8=2;}
			else if(m8>0) {m8=1;}
			if(m9>=90) {m9=10;}
			else if(m9>=80) {m9=9;}
			else if(m9>=70) {m9=8;}
			else if(m9>=60) {m9=7;}
			else if(m9>=50) {m9=6;}
			else if(m9>=40) {m9=5;}
			else if(m9>=30) {m9=4;}
			else if(m9>=20) {m9=3;}
			else if(m9>=10) {m9=2;}
			else if(m9>0) {m9=1;}
			float n1=((c1*m1)+(c2*m2)+(c3*m3)+(c4*m4)+(c5*m5)+(c6*m6)+(c7*m7)+(c8*m8)+(c9*m9));
			float d=(c1+c2+c3+c4+c5+c6+c7+c8+c9);
			r5=n1/d;
			System.out.println("SGPA for Fifth Semester="+r5);
		}
		if (n==6) {
			int c1=4;
			int c2=4;
			int c3=4;
			int c4=3;
			int c5=3;
			int c6=2;
			int c7=2;
			int c8=2;
			System.out.println("Enter the marks of 18EC61=");
			int m1=sc.nextInt();
			System.out.println("Enter the marks of 18EC62=");
			int m2=sc.nextInt();
			System.out.println("Enter the marks of 18EC63=");
			int m3=sc.nextInt();
			System.out.println("Enter the marks of 18EC646=");
			int m4=sc.nextInt();
			System.out.println("Enter the marks of 18XX65X=");
			int m5=sc.nextInt();
			System.out.println("Enter the marks of 18ECL66=");
			int m6=sc.nextInt();
			System.out.println("Enter the marks of 18ECL67=");
			int m7=sc.nextInt();
			System.out.println("Enter the marks of 18ECMP68=");
			int m8=sc.nextInt();
			if(m1>=90) {m1=10;}
			else if(m1>=80) {m1=9;}
			else if(m1>=70) {m1=8;}
			else if(m1>=60) {m1=7;}
			else if(m1>=50) {m1=6;}
			else if(m1>=40) {m1=5;}
			else if(m1>=30) {m1=4;}
			else if(m1>=20) {m1=3;}
			else if(m1>=10) {m1=2;}
			else if(m1>0) {m1=1;}
			if(m2>=90) {m2=10;}
			else if(m2>=80) {m2=9;}
			else if(m2>=70) {m2=8;}
			else if(m2>=60) {m2=7;}
			else if(m2>=50) {m2=6;}
			else if(m2>=40) {m2=5;}
			else if(m2>=30) {m2=4;}
			else if(m2>=20) {m2=3;}
			else if(m2>=10) {m2=2;}
			else if(m2>0) {m2=1;}
			if(m3>=90) {m3=10;}
			else if(m3>=80) {m3=9;}
			else if(m3>=70) {m3=8;}
			else if(m3>=60) {m3=7;}
			else if(m3>=50) {m3=6;}
			else if(m3>=40) {m3=5;}
			else if(m3>=30) {m3=4;}
			else if(m3>=20) {m3=3;}
			else if(m3>=10) {m3=2;}
			else if(m3>0) {m3=1;}
			if(m4>=90) {m4=10;}
			else if(m4>=80) {m4=9;}
			else if(m4>=70) {m4=8;}
			else if(m4>=60) {m4=7;}
			else if(m4>=50) {m4=6;}
			else if(m4>=40) {m4=5;}
			else if(m4>=30) {m4=4;}
			else if(m4>=20) {m4=3;}
			else if(m4>=10) {m4=2;}
			else if(m4>0) {m4=1;}
			if(m5>=90) {m5=10;}
			else if(m5>=80) {m5=9;}
			else if(m5>=70) {m5=8;}
			else if(m5>=60) {m5=7;}
			else if(m5>=50) {m5=6;}
			else if(m5>=40) {m5=5;}
			else if(m5>=30) {m5=4;}
			else if(m5>=20) {m5=3;}
			else if(m5>=10) {m5=2;}
			else if(m5>0) {m5=1;}
			if(m6>=90) {m6=10;}
			else if(m6>=80) {m6=9;}
			else if(m6>=70) {m6=8;}
			else if(m6>=60) {m6=7;}
			else if(m6>=50) {m6=6;}
			else if(m6>=40) {m6=5;}
			else if(m6>=30) {m6=4;}
			else if(m6>=20) {m6=3;}
			else if(m6>=10) {m6=2;}
			else if(m6>0) {m6=1;}
			if(m7>=90) {m7=10;}
			else if(m7>=80) {m7=9;}
			else if(m7>=70) {m7=8;}
			else if(m7>=60) {m7=7;}
			else if(m7>=50) {m7=6;}
			else if(m7>=40) {m7=5;}
			else if(m7>=30) {m7=4;}
			else if(m7>=20) {m7=3;}
			else if(m7>=10) {m7=2;}
			else if(m7>0) {m7=1;}
			if(m8>=90) {m8=10;}
			else if(m8>=80) {m8=9;}
			else if(m8>=70) {m8=8;}
			else if(m8>=60) {m8=7;}
			else if(m8>=50) {m8=6;}
			else if(m8>=40) {m8=5;}
			else if(m8>=30) {m8=4;}
			else if(m8>=20) {m8=3;}
			else if(m8>=10) {m8=2;}
			else if(m8>0) {m8=1;}
			float n1=((c1*m1)+(c2*m2)+(c3*m3)+(c4*m4)+(c5*m5)+(c6*m6)+(c7*m7)+(c8*m8));
			float d=(c1+c2+c3+c4+c5+c6+c7+c8);
			r6=n1/d;
			System.out.println("SGPA for Sixth Semester="+r6);
		}
		if (n==7) {
			int c1=3;
			int c2=3;
			int c3=3;
			int c4=3;
			int c5=3;
			int c6=2;
			int c7=2;
			int c8=1;
			System.out.println("Enter the marks of 18EC71=");
			int m1=sc.nextInt();
			System.out.println("Enter the marks of 18EC72=");
			int m2=sc.nextInt();
			System.out.println("Enter the marks of 18XX73X=");
			int m3=sc.nextInt();
			System.out.println("Enter the marks of 18XX74X=");
			int m4=sc.nextInt();
			System.out.println("Enter the marks of 18XX75X=");
			int m5=sc.nextInt();
			System.out.println("Enter the marks of 18ECL76=");
			int m6=sc.nextInt();
			System.out.println("Enter the marks of 18ECL77=");
			int m7=sc.nextInt();
			System.out.println("Enter the marks of 18ECP78=");
			int m8=sc.nextInt();
			if(m1>=90) {m1=10;}
			else if(m1>=80) {m1=9;}
			else if(m1>=70) {m1=8;}
			else if(m1>=60) {m1=7;}
			else if(m1>=50) {m1=6;}
			else if(m1>=40) {m1=5;}
			else if(m1>=30) {m1=4;}
			else if(m1>=20) {m1=3;}
			else if(m1>=10) {m1=2;}
			else if(m1>0) {m1=1;}
			if(m2>=90) {m2=10;}
			else if(m2>=80) {m2=9;}
			else if(m2>=70) {m2=8;}
			else if(m2>=60) {m2=7;}
			else if(m2>=50) {m2=6;}
			else if(m2>=40) {m2=5;}
			else if(m2>=30) {m2=4;}
			else if(m2>=20) {m2=3;}
			else if(m2>=10) {m2=2;}
			else if(m2>0) {m2=1;}
			if(m3>=90) {m3=10;}
			else if(m3>=80) {m3=9;}
			else if(m3>=70) {m3=8;}
			else if(m3>=60) {m3=7;}
			else if(m3>=50) {m3=6;}
			else if(m3>=40) {m3=5;}
			else if(m3>=30) {m3=4;}
			else if(m3>=20) {m3=3;}
			else if(m3>=10) {m3=2;}
			else if(m3>0) {m3=1;}
			if(m4>=90) {m4=10;}
			else if(m4>=80) {m4=9;}
			else if(m4>=70) {m4=8;}
			else if(m4>=60) {m4=7;}
			else if(m4>=50) {m4=6;}
			else if(m4>=40) {m4=5;}
			else if(m4>=30) {m4=4;}
			else if(m4>=20) {m4=3;}
			else if(m4>=10) {m4=2;}
			else if(m4>0) {m4=1;}
			if(m5>=90) {m5=10;}
			else if(m5>=80) {m5=9;}
			else if(m5>=70) {m5=8;}
			else if(m5>=60) {m5=7;}
			else if(m5>=50) {m5=6;}
			else if(m5>=40) {m5=5;}
			else if(m5>=30) {m5=4;}
			else if(m5>=20) {m5=3;}
			else if(m5>=10) {m5=2;}
			else if(m5>0) {m5=1;}
			if(m6>=90) {m6=10;}
			else if(m6>=80) {m6=9;}
			else if(m6>=70) {m6=8;}
			else if(m6>=60) {m6=7;}
			else if(m6>=50) {m6=6;}
			else if(m6>=40) {m6=5;}
			else if(m6>=30) {m6=4;}
			else if(m6>=20) {m6=3;}
			else if(m6>=10) {m6=2;}
			else if(m6>0) {m6=1;}
			if(m7>=90) {m7=10;}
			else if(m7>=80) {m7=9;}
			else if(m7>=70) {m7=8;}
			else if(m7>=60) {m7=7;}
			else if(m7>=50) {m7=6;}
			else if(m7>=40) {m7=5;}
			else if(m7>=30) {m7=4;}
			else if(m7>=20) {m7=3;}
			else if(m7>=10) {m7=2;}
			else if(m7>0) {m7=1;}
			if(m8>=90) {m8=10;}
			else if(m8>=80) {m8=9;}
			else if(m8>=70) {m8=8;}
			else if(m8>=60) {m8=7;}
			else if(m8>=50) {m8=6;}
			else if(m8>=40) {m8=5;}
			else if(m8>=30) {m8=4;}
			else if(m8>=20) {m8=3;}
			else if(m8>=10) {m8=2;}
			else if(m8>0) {m8=1;}
			float n1=((c1*m1)+(c2*m2)+(c3*m3)+(c4*m4)+(c5*m5)+(c6*m6)+(c7*m7)+(c8*m8));
			float d=(c1+c2+c3+c4+c5+c6+c7+c8);
			r7=n1/d;
			System.out.println("SGPA for Seventh Semester="+r7);
		}
		if (n==8) {
			int c1=3;
			int c2=3;
			int c3=8;
			int c4=1;
			int c5=3;
			System.out.println("Enter the marks of 18EC81=");
			int m1=sc.nextInt();
			System.out.println("Enter the marks of 18XX82X=");
			int m2=sc.nextInt();
			System.out.println("Enter the marks of 18ECP83=");
			int m3=sc.nextInt();
			System.out.println("Enter the marks of 18ECS84=");
			int m4=sc.nextInt();
			System.out.println("Enter the marks of 18ECI85=");
			int m5=sc.nextInt();
			if(m1>=90) {m1=10;}
			else if(m1>=80) {m1=9;}
			else if(m1>=70) {m1=8;}
			else if(m1>=60) {m1=7;}
			else if(m1>=50) {m1=6;}
			else if(m1>=40) {m1=5;}
			else if(m1>=30) {m1=4;}
			else if(m1>=20) {m1=3;}
			else if(m1>=10) {m1=2;}
			else if(m1>0) {m1=1;}
			if(m2>=90) {m2=10;}
			else if(m2>=80) {m2=9;}
			else if(m2>=70) {m2=8;}
			else if(m2>=60) {m2=7;}
			else if(m2>=50) {m2=6;}
			else if(m2>=40) {m2=5;}
			else if(m2>=30) {m2=4;}
			else if(m2>=20) {m2=3;}
			else if(m2>=10) {m2=2;}
			else if(m2>0) {m2=1;}
			if(m3>=90) {m3=10;}
			else if(m3>=80) {m3=9;}
			else if(m3>=70) {m3=8;}
			else if(m3>=60) {m3=7;}
			else if(m3>=50) {m3=6;}
			else if(m3>=40) {m3=5;}
			else if(m3>=30) {m3=4;}
			else if(m3>=20) {m3=3;}
			else if(m3>=10) {m3=2;}
			else if(m3>0) {m3=1;}
			if(m4>=90) {m4=10;}
			else if(m4>=80) {m4=9;}
			else if(m4>=70) {m4=8;}
			else if(m4>=60) {m4=7;}
			else if(m4>=50) {m4=6;}
			else if(m4>=40) {m4=5;}
			else if(m4>=30) {m4=4;}
			else if(m4>=20) {m4=3;}
			else if(m4>=10) {m4=2;}
			else if(m4>0) {m4=1;}
			if(m5>=90) {m5=10;}
			else if(m5>=80) {m5=9;}
			else if(m5>=70) {m5=8;}
			else if(m5>=60) {m5=7;}
			else if(m5>=50) {m5=6;}
			else if(m5>=40) {m5=5;}
			else if(m5>=30) {m5=4;}
			else if(m5>=20) {m5=3;}
			else if(m5>=10) {m5=2;}
			else if(m5>0) {m5=1;}
			float n1=((c1*m1)+(c2*m2)+(c3*m3)+(c4*m4)+(c5*m5));
			float d=(c1+c2+c3+c4+c5);
			r8=n1/d;
			System.out.println("SGPA for Eighth Semester="+r8);
		}
		System.out.println();
		Thread.sleep(2000);
		}
		
		float r=(r1+r2+r3+r4+r5+r6+r7+r8)/a;
		System.out.println("CGPA="+r);
		System.out.println();
		Thread.sleep(2000);
		}
	}

}
