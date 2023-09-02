package shoping_cart;
import java.util.Scanner;
public class products {
 public static void main(String[] args) throws Exception {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Welcome to our Shopping Application");
	 System.out.println("Enter your name");
	 String name=sc.next();
	 System.out.println("Enter your Phone no");
	 double p=sc.nextDouble();
	 System.out.println("Enter your City");
	 String city=sc.next();
	 System.out.println("Enter your State");
	 String state=sc.next();
	 while(true)
	 {
		 System.out.println("Welcome to our Shopping Cart");
	 System.out.println("Enter the Category\n"
			 +"1)Electronis \n"
			 +"2)Fashion\n"
			 +"3)Toys\n"
			 +"4)Cosmetics\n"
			 +"5)Books");
	 int c=1;
	 while(c!=0) {
		 c=sc.nextInt();
	 if(c==1) {
		 
			System.out.println("Enter the Sub-category \n"
					+"1)Laptops\n"
					+"2)Mobiles\n"
					+"3)Cameras\n"
					+"4)Headphones\n"
					+"5)Smart Watches");
			 int n1=1;
			 while(n1!=0)
				 {
				 n1=sc.nextInt();
			  if(n1==1)
			    {  System.out.println("Enter your choice \n"
					+"1)Apple 2023 MacBook Pro Laptop \n"
					+"2)Apple 2022 MacBook Air Laptop\n"
					+"3)HP Omen AMD Ryzen 7 6800H\n"
					+"4)HP Victus AMD Ryzen 7 5800H\n"
					+"5)HP Pavilion 14 AMD Ryzen 5 5625U");
			        int l=1;
			        while(l!=0)
				    {
			          l=sc.nextInt();
			         if(l==1)
			 		{
			 		System.out.println("Product Name=Apple 2023 MacBook Pro Laptop\n"
			 				+"Price=2,69,900\n");
			 		l=0;
			 		}
			 		else if(l==2)
			 		{
			 		System.out.println("Product Name=Apple 2022 MacBook Air Laptop\n"
			 				+"Price=1,35,900\n");
			 		l=0;
			 		}
			 		else if(l==3)
			 		{
			 		System.out.println("Product Name=HP Omen AMD Ryzen 7 6800H\n"
			 				+"Price=1,04,999\n");
			 		l=0;}
			 		else if(l==4)
			 		{
			 		System.out.println("Product Name=HP Victus AMD Ryzen 7 5800H\n"
			 				+"Price=72,990\n");
			 		l=0;}
			 		else if(l==5)
			 		{
			 		System.out.println("Product Name=HP Pavilion 14 AMD Ryzen 5 5625U\n"
			 				+"Price=52,990\n");
			 		l=0;}
			 		else {
			 			System.out.println("Invalid Input\n"
			 					+"Enter your choice again");
			 		}
				  }
			        n1=0;}
			  else if(n1==2)
				{System.out.println("Enter your choice \n"
						+"1)Apple iPhone 14 Pro \n"
						+"2)Apple iPhone 14 Plus \n"
						+"3)Samsung Galaxy Z Flip3 5G\n"
						+"4)Samsung Galaxy S20 FE 5G\n"
						+"5)Samsung Galaxy M33 5G");
				int m=1;
				while(m!=0)
				{
			     m=sc.nextInt();
				if(m==1)
				{
				System.out.println("Product Name=Apple iPhone 14 Pro \n"
						+"Price=1,69,900\n");
				m=0;}
				else if(m==2)
				{
				System.out.println("Product Name=Apple iPhone 14 Plus\n"
						+"Price=79,999\n");
				m=0;}
				else if(m==3)
				{
				System.out.println("Product Name=Samsung Galaxy Z Flip3 5G\n"
						+"Price=48,399\n");
				m=0;}
				else if(m==4)
				{
				System.out.println("Product Name=Samsung Galaxy S20 FE 5G\n"
						+"Price=29,999\n");
				m=0;}
				else if(m==5)
				{
				System.out.println("Product Name=Samsung Galaxy M33 5G"
						+"Price=17,999\n");
				m=0;}
				
				else {
					System.out.println("Invalid Input\n"
							+"Enter your choice again");
				}
					
				}n1=0;}
			  else if(n1==3)
			{System.out.println("Enter your choice \n"
					+"1)Sony Alpha ILCE-1 Mirrorless Full-Frame Camera \n"
					+"2)Sony Alpha a7IIK Mirrorless Digital Camera \n"
					+"3)Sony Alpha a6100 Mirrorless Digital Camera\n"
					+"4)Sony Premium Compact DSC-RX100M5A Advanced Digital 4K Camera\n"
					+"5)Sony Digital Vlog Camera");
			int s=1;
			while(s!=0)
			{
		     s=sc.nextInt();
			if(s==1)
			{
			System.out.println("Product Name=Sony Alpha ILCE-1 Mirrorless Full-Frame Camera \n"
					+"Price=4,99,990\n");
			s=0;}
			else if(s==2)
			{
			System.out.println("Product Name=Sony Alpha a7IIK Mirrorless Digital Camera\n"
					+"Price=2,14,999\n");
			s=0;}
			else if(s==3)
			{
			System.out.println("Product Name=Sony Alpha a6100 Mirrorless Digital Camera\n"
					+"Price=86,990\n");
			s=0;}
			else if(s==4)
			{
			System.out.println("Product Name=Sony Premium Compact DSC-RX100M5A Advanced Digital 4K Camera\n"
					+"Price=66,990\n");
			s=0;}
			else if(s==5)
			{
			System.out.println("Product Name=Sony Digital Vlog Camera\n"
					+"Price=58,989\n");
			s=0;}
			
			else {
				System.out.println("Invalid Input\n"
						+"Enter your choice again");
			}
				
			}n1=0;}
			  else if(n1==4)
			{System.out.println("Enter your choice \n"
					+"1)JBL Tune 230NC TWS Earbuds \n"
					+"2)REALME Buds Air 3 Neo True Wireless-In-Ear Earbuds\n"
					+"3)boAt Airdopes 141 Bluetooth Truely Wireless in Ear Earbuds\n"
					+"4)Boult Audio Z20 True Wireless In Ear Earbuds\n"
					+"5)pTron Bassbuds Tango ENC Bluetooth Truely Wireless in Ear Earbuds");
			int h=1;
			while(h!=0)
			{
		     h=sc.nextInt();
			if(h==1)
			{
			System.out.println("Product Name=JBL Tune 230NC TWS Earbuds \n"
					+"Price=5,990\n");
			h=0;}
			else if(h==2)
			{
			System.out.println("Product Name=REALME Buds Air 3 Neo True Wireless-In-Ear Earbuds\n"
					+"Price=1,999\n");
			h=0;}
			else if(h==3)
			{
			System.out.println("Product Name=boAt Airdopes 141 Bluetooth Truely Wireless in Ear Earbuds\n"
					+"Price=1,099\n");
			h=0;}
			else if(h==4)
			{
			System.out.println("Product Name=Boult Audio Z20 True Wireless In Ear Earbuds\n"
					+"Price=999\n");
			h=0;}
			else if(h==5)
			{
			System.out.println("Product Name=pTron Bassbuds Tango ENC Bluetooth Truely Wireless in Ear Earbuds\n"
					+"Price=849\n");
			h=0;}
			
			else {
				System.out.println("Invalid Input\n"
						+"Enter your choice again");
			}
				
			}n1=0;}
	        
			  else if(n1==5)
		{System.out.println("Enter your choice \n"
				+"1)Apple Watch Series 8 Smart Watch \n"
				+"2)Apple Watch SE Smart Watch\n"
				+"3)boAt Xtend Pro Smart Watch\n"
				+"4)boAt Wave Call Smart Watch\n"
				+"5)Fire-Boltt Ring 3 Smart Watch");
		int w=1;
		while(w!=0)
		{
	     w=sc.nextInt();
		if(w==1)
		{
		System.out.println("Product Name=Apple Watch Series 8 Smart Watch\n"
				+"Price=76,900\n");
		w=0;}
		else if(w==2)
		{
		System.out.println("Product Name=Apple Watch SE Smart Watch\n"
				+"Price=29,900\n");
		w=0;}
		else if(w==3)
		{
		System.out.println("Product Name=boAt Xtend Pro Smart Watch\n"
				+"Price=3,199\n");
		w=0;}
		else if(w==4)
		{
		System.out.println("Product Name=boAt Wave Call Smart Watch\n"
				+"Price=1,799\n");
		w=0;}
		else if(w==5)
		{
		System.out.println("Product Name=Fire-Boltt Ring 3 Smart Watch\n"
				+"Price=1,499\n");
		w=0;}
		
		else {
			System.out.println("Invalid Input\n"
					+"Enter your choice again");
		}
			
		}n1=0;}
     else {
			System.out.println("Invalid Input\n"
 					+"Enter the sub-Category again");
     }}c=0;}
	 else if(c==2) {
		 
			System.out.println("Enter the Sub-category \n"
					+"1)Fashion for Men's\n"
					+"2)Fashion for Women's\n"
					+"3)Fashion for kid's\n"
					);
			
			int n1=1;
			while(n1!=0) {
				n1=sc.nextInt();
			  if(n1==1)
			    {  System.out.println("Enter your choice \n"
					+"1)Casual shirts\n"
					+"2)T shirts\n"
					+"3)Jeans\n"
					+"4)Sportswear\n"
					+"5)Blazers");
			        int l=1;
			        while(l!=0)
				    {
			          l=sc.nextInt();
			         if(l==1)
			 		{
			 		System.out.println("Product Name=Casual shirts\n"
			 				+"Price=640\n");
			 		l=0;
			 		}
			 		else if(l==2)
			 		{
			 		System.out.println("Product Name=T shirts\n"
			 				+"Price=800\n");
			 		l=0;
			 		}
			 		else if(l==3)
			 		{
			 		System.out.println("Product Name=Jeans\n"
			 				+"Price=999\n");
			 		l=0;}
			 		else if(l==4)
			 		{
			 		System.out.println("Product Name=Sportswear\n"
			 				+"Price=990\n");
			 		l=0;}
			 		else if(l==5)
			 		{
			 		System.out.println("Product Name=Blazers\n"
			 				+"Price=990\n");
			 		l=0;}
			 		else {
			 			System.out.println("Invalid Input\n"
			 					+"Enter your choice again");
			 		}
				  }
			        n1=0; }
			  else if(n1==2)
				{System.out.println("Enter your choice \n"
						+"1)Dress\n"
						+"2)Kurtas\n"
						+"3)Sarees\n"
						+"4)Salwar suits\n"
						+"5)Jeans & Trousers");
				int m=1;
				while(m!=0)
				{
			     m=sc.nextInt();
				if(m==1)
				{
				System.out.println("Product Name=Dress\n"
						+"Price=500\n");
				m=0;}
				else if(m==2)
				{
				System.out.println("Product Name=Kurtas\n"
						+"Price=999\n");
				m=0;}
				else if(m==3)
				{
				System.out.println("Product Name=Sarees\n"
						+"Price=1,399\n");
				m=0;}
				else if(m==4)
				{
				System.out.println("Product Name=Salwar suits\n"
						+"Price=899\n");
				m=0;}
				else if(m==5)
				{
				System.out.println("Product Name=Jeans & Trousers"
						+"Price=799\n");
				m=0;}
				
				else {
					System.out.println("Invalid Input\n"
							+"Enter your choice again");
				}
					
				}n1=0;}
			  else if(n1==3)
			{System.out.println("Enter your choice \n"
					+"1)Dress\n"
					+"2)T-shirts & polos \n"
					+"3)Ethnic wear\n"
					+"4)Girls'clothing\n"
					+"5)Boys'clothing");
			int s=1;
			while(s!=0)
			{
		     s=sc.nextInt();
			if(s==1)
			{
			System.out.println("Product Name=Dress\n"
					+"Price=690\n");
			s=0;}
			else if(s==2)
			{
			System.out.println("Product Name=T-shirts & polos \n"
					+"Price=999\n");
			s=0;}
			else if(s==3)
			{
			System.out.println("Product Name=Ethnic wear\n"
					+"Price=890\n");
			s=0;}
			else if(s==4)
			{
			System.out.println("Product Name=Girls'clothing\n"
					+"Price=790\n");
			s=0;}
			else if(s==5)
			{
			System.out.println("Product Name=boys'clothing\n"
					+"Price=800\n");
			s=0;}
			
			else {
				System.out.println("Invalid Input\n"
						+"Enter your choice again");
			}
				
			}n1=0;}
	   else {
			System.out.println("Invalid Input\n"
 					+"Enter the sub-Category again");
 		}}c=0;}
	 else if(c==3) {
		 
			System.out.println("Enter the Sub-category \n"
					+"1)Toy Vehicals\n"
					+"2)Building Sets\n"
					+"3)Soft Toys\n"
					+"4)Games and Puzzels\n"
					+"5)Art and Craft");
			int n1=1;
			while(n1!=0) { 
				n1=sc.nextInt();
			  if(n1==1)
			    {  System.out.println("Enter your choice \n"
					+"1)TEC TAVAKKAL Plastic Battery Operated Car\n"
					+"2)Kiddie Galaxia Mini Metal Car\n"
					+"3)TECHNO BUZZ DEAL WITH DEVICE OF GLOB Pact of 6 Small mini cars\n"
					+"4)Hot Wheels Plastic Mega Hauler Truck\n"
					+"5)NHR Ben 10 Remote Control Car");
			        int l=1;
			        while(l!=0)
				    {
			          l=sc.nextInt();
			         if(l==1)
			 		{
			 		System.out.println("Product Name=TEC TAVAKKAL Plastic Battery Operated Car\n"
			 				+"Price=349\n");
			 		l=0;
			 		}
			 		else if(l==2)
			 		{
			 		System.out.println("Product Name=Kiddie Galaxia Mini Metal Car\n"
			 				+"Price=388\n");
			 		l=0;
			 		}
			 		else if(l==3)
			 		{
			 		System.out.println("Product Name=TECHNO BUZZ DEAL WITH DEVICE OF GLOB Pact of 6 Small mini cars\n"
			 				+"Price=499\n");
			 		l=0;}
			 		else if(l==4)
			 		{
			 		System.out.println("Product Name=Hot Wheels Plastic Mega Hauler Truck\n"
			 				+"Price=895\n");
			 		l=0;}
			 		else if(l==5)
			 		{
			 		System.out.println("Product Name=NHR Ben 10 Remote Control Car\n"
			 				+"Price=629\n");
			 		l=0;}
			 		else {
			 			System.out.println("Invalid Input\n"
			 					+"Enter your choice again");
			 		}
				  }
			        n1=0; }
			  else if(n1==2)
				{System.out.println("Enter your choice \n"
						+"1)FunBlast DIY Plastic Bilding Blocks \n"
						+"2)Adichai 250+ Building Blocks\n"
						+"3)Chocozone 81+ Building Blocks\n"
						+"4)Snaptron Magnetic Building Blocks\n"
						+"5)Toyztrend Expert Building Blocks");
				int m=1;
				while(m!=0)
				{
			     m=sc.nextInt();
				if(m==1)
				{
				System.out.println("Product Name=FunBlast DIY Plastic Bilding Blocks \n"
						+"Price=347\n");
				m=0;}
				else if(m==2)
				{
				System.out.println("Product Name=Adichai 250+ Building Blockss\n"
						+"Price=349\n");
				m=0;}
				else if(m==3)
				{
				System.out.println("Product Name=Chocozone 81+ Building Blocks\n"
						+"Price=599\n");
				m=0;}
				else if(m==4)
				{
				System.out.println("Product Name=Snaptron Magnetic Building Blocks\n"
						+"Price=2,224\n");
				m=0;}
				else if(m==5)
				{
				System.out.println("Product Name=Toyztrend Expert Building Blocks"
						+"Price=510\n");
				m=0;}
				
				else {
					System.out.println("Invalid Input\n"
							+"Enter your choice again");
				}
					
				}n1=0;}
			  else  if(n1==3)
			{System.out.println("Enter your choice \n"
					+"1)Babique Plush Soft Toy \n"
					+"2)Babique Unicorn Teddy Bear Plush Soft Toy\n"
					+"3)Toyzmania Plush Soft Toys - Tiger\n"
					+"4)Toyzmania Plush Soft Toys - Monkey Small \n"
					+"5)Toyzmania Plush Soft Toys - Panda");
			int s=1;
			while(s!=0)
			{
		     s=sc.nextInt();
			if(s==1)
			{
			System.out.println("Product Name=Babique Plush Soft Toy  \n"
					+"Price=179\n");
			s=0;}
			else if(s==2)
			{
			System.out.println("Product Name=Babique Unicorn Teddy Bear Plush Soft Toy\n"
					+"Price=175\n");
			s=0;}
			else if(s==3)
			{
			System.out.println("Product Name=Toyzmania Plush Soft Toys - Tiger\n"
					+"Price=249\n");
			s=0;}
			else if(s==4)
			{
			System.out.println("Product Name=Toyzmania Plush Soft Toys - Monkey Small\n"
					+"Price=249\n");
			s=0;}
			else if(s==5)
			{
			System.out.println("Product Name=Toyzmania Plush Soft Toys - Panda\n"
					+"Price=399\n");
			s=0;}
			
			else {
				System.out.println("Invalid Input\n"
						+"Enter your choice again");
			}
				
			}n1=0;}
			  else  if(n1==4)
			{System.out.println("Enter your choice \n"
					+"1)Brain Bogglers: Over 100 Games and Puzzles to Reveal the Mysteries of Your Mind \n"
					+"2)BRAIN GAMES FOR YOUNG MIND - 1\n"
					+"3)Word Search Puzzle Game\n"
					+"4)Brain Game Puzzels for Competitive Exams\n"
					+"5)Block Puzzel Game 54 pcs");
			int h=1;
			while(h!=0)
			{
		     h=sc.nextInt();
			if(h==1)
			{
			System.out.println("Product Name=Brain Bogglers: Over 100 Games and Puzzles to Reveal the Mysteries of Your Mind \n"
					+"Price=242\n");
			h=0;}
			else if(h==2)
			{
			System.out.println("Product Name=BRAIN GAMES FOR YOUNG MIND - 1\n"
					+"Price=128\n");
			h=0;}
			else if(h==3)
			{
			System.out.println("Product Name=Word Search Puzzle Game\n"
					+"Price=199\n");
			h=0;}
			else if(h==4)
			{
			System.out.println("Product Name=Brain Game Puzzels for Competitive Exams\n"
					+"Price=121\n");
			h=0;}
			else if(h==5)
			{
			System.out.println("Product Name=Block Puzzel Game 54 pcs\n"
					+"Price=899\n");
			h=0;}
			
			else {
				System.out.println("Invalid Input\n"
						+"Enter your choice again");
			}
				
			}n1=0;}
	        
			  else  if(n1==5)
		{System.out.println("Enter your choice \n"
				+"1)KraFun Sewing Kit for Kids Age 7 8 9 10 11 12 Beginner My First Art & Craft  \n"
				+"2)ALEX Toys Craft Knot A Lot\n"
				+"3)Leisure Arts-Huggable Amigurumi\n"
				+"4)Skillmatics Art & Craft Activity\n"
				+"5)Yes Bosss 6 Pcs Emoji Stamper for Kids -Plastic Stamper Toys Art and Craft ");
		int w=1;
		while(w!=0)
		{
	     w=sc.nextInt();
		if(w==1)
		{
		System.out.println("Product Name=KraFun Sewing Kit for Kids Age 7 8 9 10 11 12 Beginner My First Art & Craft \n"
				+"Price=6,900\n");
		w=0;}
		else if(w==2)
		{
		System.out.println("Product Name=ALEX Toys Craft Knot A Lot\n"
				+"Price=6\n");
		w=0;}
		else if(w==3)
		{
		System.out.println("Product Name=Leisure Arts-Huggable Amigurumi\n"
				+"Price=4,199\n");
		w=0;}
		else if(w==4)
		{
		System.out.println("Product Name=Skillmatics Art & Craft Activity\n"
				+"Price=949\n");
		w=0;}
		else if(w==5)
		{
		System.out.println("Product Name=Yes Bosss 6 Pcs Emoji Stamper for Kids -Plastic Stamper Toys Art and Craft \n"
				+"Price=699\n");
		w=0;}
		
		else {
			System.out.println("Invalid Input\n"
					+"Enter your choice again");
		}
			
		}n1=0;}
   else {
		System.out.println("Invalid Input\n"
					+"Enter the sub-Category again");
		}}c=0;}
	 else  if(c==4) {
		 
			System.out.println("Enter the Sub-category \n"
					+"1)luxury beauty\n"
					+"2)Skin care\n"
					+"3)Hair care\n"
				
					);
			int n1=1;
			while(n1!=0) {
				n1=sc.nextInt();
			  if(n1==1)
			    {  System.out.println("Enter your choice \n"
					+"1)L'Oréal Professionnel Xtenso Care Shampoo For Straightened Hair, 250 ML |Xtenso Care mask, 196 gm\n"
					+"2)Lotus Herbals Safe Sun 3-In-1 Matte Look Daily Sunblock Lotion SPF 40 | 100g\n"
					+"3)L’Oréal Professionnel Scalp Advanced Anti-Oiliness 2-In-1 Deep Purifier Clay | For Oily Hair\n"
					+"4)L'Oréal Professionnel Vitamino Color Shampoo For Coloured Hair, 300ML|\n"
					+"5)The Derma Co 2% Niacinamide Hydrating BB Cream with SPF 30 PA++ Enriched with 1% Hyaluronic");
			        int l=1;
			        while(l!=0)
				    {
			          l=sc.nextInt();
			         if(l==1)
			 		{
			 		System.out.println("Product Name=L'Oréal Professionnel Xtenso Care Shampoo For Straightened Hair, 250 ML |Xtenso Care mask, 196 gm\n"
			 				+"Price=1,200\n");
			 		l=0;
			 		}
			 		else if(l==2)
			 		{
			 		System.out.println("Product Name=Lotus Herbals Safe Sun 3-In-1 Matte Look Daily Sunblock Lotion SPF 40 | 100g\n"
			 				+"Price=325\n");
			 		l=0;
			 		}
			 		else if(l==3)
			 		{
			 		System.out.println("Product Name=L’Oréal Professionnel Scalp Advanced Anti-Oiliness 2-In-1 Deep Purifier Clay | For Oily Hair\n"
			 				+"860\n");
			 		l=0;}
			 		else if(l==4)
			 		{
			 		System.out.println("Product Name=L'Oréal Professionnel Vitamino Color Shampoo For Coloured Hair, 300ML|\n"
			 				+"Price=695\n");
			 		l=0;}
			 		else if(l==5)
			 		{
			 		System.out.println("Product Name=The Derma Co 2% Niacinamide Hydrating BB Cream with SPF 30 PA++ Enriched with 1% Hyaluronic\n"
			 				+"Price=398\n");
			 		l=0;}
			 		else {
			 			System.out.println("Invalid Input\n"
			 					+"Enter your choice again");
			 		}
				  }
			        n1=0; }
			  else if(n1==2)
				{System.out.println("Enter your choice \n"
						+"1)Sponsored Gentle Beast Charcoal Face Wash 100ml\n"
						+"2)Garnier Skin Naturals Bright Complete Vitamin C Face Wash, 150g \n"
						+"3)Himalaya Purifying Neem Face Wash, 400 Ml\n"
						+"4)Nivea Men Face Wash, Dark Spot Reduction, For Clean & Clear Skin With 10X Vitamin C Effect, 100 G\n"
					
						+"5)HK VITALS by HealthKart Vitamin E Face Wash, Deeply Cleanses & Brightens Skin, All Skin Types, 100 ml");
				int m=1;
				while(m!=0)
				{
			     m=sc.nextInt();
				if(m==1)
				{
				System.out.println("Product Name=Sponsored Gentle Beast Charcoal Face Wash 100ml\n"
						+"Price=345\n");
				m=0;}
				else if(m==2)
				{
				System.out.println("Product Name=Garnier Skin Naturals Bright Complete Vitamin C Face Wash, 150g\n"
						+"Price=399\n");
				m=0;}
				else if(m==3)
				{
				System.out.println("Product Name=Himalaya Purifying Neem Face Wash, 400 Ml\n"
						+"Price=199\n");
				m=0;}
				else if(m==4)
				{
				System.out.println("Product Name=Nivea Men Face Wash, Dark Spot Reduction, For Clean & Clear Skin With 10X Vitamin C Effect, 100 G\n"
						+"Price=99\n");
				m=0;}
				else if(m==5)
				{
				System.out.println("Product Name=HK VITALS by HealthKart Vitamin E Face Wash, Deeply Cleanses & Brightens Skin, All Skin Types, 100 ml"
						+"Price=299\n");
				m=0;}
				
				else {
					System.out.println("Invalid Input\n"
							+"Enter your choice again");
				}
					
				}n1=0;}
			  else  if(n1==3)
			{System.out.println("Enter your choice \n"
					+"1)Dove Hair Fall Rescue Shampoo For Weak Hair, 1 Ltr \n"
					+"2)Parachute Coconut Oil 600 ml - Bottle \n"
					+"3)L'Oreal Paris Shampoo, For Damaged and Weak Hair, With Pro-Keratin + Ceramide, Total Repair 5, 1ltr\n"
					+"4)Garnier, Hair Colouring Creme, Long-lasting Colour, Smoothness & Shine, Color Naturals, Shade: 1 Natural Black, 70ml + 60g Lotion\n"
					+"5)Parachute Advansed Aloe Vera Enriched Coconut Hair Oil, 250ml + 75ml | For Soft, Strong Hair");
			int s=1;
			while(s!=0)
			{
		     s=sc.nextInt();
			if(s==1)
			{
			System.out.println("Product Name=Dove Hair Fall Rescue Shampoo For Weak Hair, 1 Ltr\n"
					+"Price=499\n");
			s=0;}
			else if(s==2)
			{
			System.out.println("Product Name=Parachute Coconut Oil 600 ml - Bottle\n"
					+"Price=199\n");
			s=0;}
			else if(s==3)
			{
			System.out.println("Product Name=L'Oreal Paris Shampoo, For Damaged and Weak Hair, With Pro-Keratin + Ceramide, Total Repair 5, 1ltr\n"
					+"Price=490\n");
			s=0;}
			else if(s==4)
			{
			System.out.println("Product Name=Garnier, Hair Colouring Creme, Long-lasting Colour, Smoothness & Shine, Color Naturals, Shade: 1 Natural Black, 70ml + 60g Lotion\n"
					+"Price=390\n");
			s=0;}
			else if(s==5)
			{
			System.out.println("Product Name=Parachute Advansed Aloe Vera Enriched Coconut Hair Oil, 250ml + 75ml | For Soft, Strong Hair\n"
					+"Price=89\n");
			s=0;}
			
			else {
				System.out.println("Invalid Input\n"
						+"Enter your choice again");
			}
				
			}n1=0;}
	 else {
			System.out.println("Invalid Input\n"
 					+"Enter the sub-Category again");
 		}}c=0;}
	 else if(c==5) {
		 
			System.out.println("Enter the Sub-category \n"
					+"1)Health, Family & Personal Development\n"
					+"2)Literature & Fiction\n"
					+"3)Analysis & Strategy\n"
					);
			int n1=1;
			while(n1!=0) {
				n1=sc.nextInt();
			  if(n1==1)
			    {  System.out.println("Enter your choice \n"
					+"1)LIFES AMAZING SECRETS\n"
					+"2)Ikigai: The Japanese secret to a long and happy life \n"
					+"3)The Psychology of Money\n"
					+"4)Do It Today: Overcome procrastination, improve productivity and achieve more meaningful things [Paperback] Foroux, Darius\n"
					+"5)Energize Your Mind: Learn the Art of Mastering Your Thoughts, Feelings and Emotions");
			        int l=1;
			        while(l!=0)
				    {
			          l=sc.nextInt();
			         if(l==1)
			 		{
			 		System.out.println("Product Name=LIFES AMAZING SECRETS\n"
			 				+"Price=169\n");
			 		l=0;
			 		}
			 		else if(l==2)
			 		{
			 		System.out.println("Product Name=Ikigai: The Japanese secret to a long and happy life\n"
			 				+"Price=629\n");
			 		l=0;
			 		}
			 		else if(l==3)
			 		{
			 		System.out.println("Product Name=The Psychology of Money\n"
			 				+"Price=210\n");
			 		l=0;}
			 		else if(l==4)
			 		{
			 		System.out.println("Product Name=Do It Today: Overcome procrastination, improve productivity and achieve more meaningful things [Paperback] Foroux, Darius\n"
			 				+"Price=109\n");
			 		l=0;}
			 		else if(l==5)
			 		{
			 		System.out.println("Product Name=Energize Your Mind: Learn the Art of Mastering Your Thoughts, Feelings and Emotions\n"
			 				+"Price=105\n");
			 		l=0;}
			 		else {
			 			System.out.println("Invalid Input\n"
			 					+"Enter your choice again");
			 		}
			        
				  }
			        n1=0;}
			  else if(n1==2)
				{System.out.println("Enter your choice \n"
						+"1)Think Straight: Change your thoughts, Change your life \n"
						+"2)THE SILENT PATIENT\n"
						+"3)Beyond Something\n"
						+"4)Harry Potter 1–3 Box Set: A Magical Adventure Begins\n"
						+"5)Learning How to Fly: Life Lessons for the Youth");
				int m=1;
				while(m!=0)
				{
			     m=sc.nextInt();
				if(m==1)
				{
				System.out.println("Product Name=Think Straight: Change your thoughts, Change your life \n"
						+"Price=109\n");
				m=0;}
				else if(m==2)
				{
				System.out.println("Product Name=THE SILENT PATIENT\n"
						+"Price=299\n");
				m=0;}
				else if(m==3)
				{
				System.out.println("Product Name=Beyond Something\n"
						+"Price=229\n");
				m=0;}
				else if(m==4)
				{
				System.out.println("Product Name=Harry Potter 1–3 Box Set: A Magical Adventure Begins\n"
						+"Price=699\n");
				m=0;}
				else if(m==5)
				{
				System.out.println("Product Name=Learning How to Fly: Life Lessons for the Youth"
						+"Price=199\n");
				m=0;}
				
				else {
					System.out.println("Invalid Input\n"
							+"Enter your choice again");
				}
					
				}n1=0;}
			  else  if(n1==3)
			{System.out.println("Enter your choice \n"
					+"1)Rich Dad Poor Dad\n"
					+"2)DEEP WORK: RULES FOR FOCUSED SUCCESS IN A DISTRACTED WORLD \n"
					+"3)Communication Book, The: 44 Ideas for Better Conversations Every Day\n"
					+"4)The Almanack Of Naval Ravikant: A Guide to Wealth and Happiness\n"
					+"5)ReWork: Change the Way You Work Forever");
			int s=1;
			while(s!=0)
			{
		     s=sc.nextInt();
			if(s==1)
			{
			System.out.println("Product Name=Rich Dad Poor Dad\n"
					+"Price=290\n");
			s=0;}
			else if(s==2)
			{
			System.out.println("Product Name=DEEP WORK: RULES FOR FOCUSED SUCCESS IN A DISTRACTED WORLD \n"
					+"Price=219\n");
			s=0;}
			else if(s==3)
			{
			System.out.println("Product Name=Communication Book, The: 44 Ideas for Better Conversations Every Day\n"
					+"Price=190\n");
			s=0;}
			else if(s==4)
			{
			System.out.println("Product Name=The Almanack Of Naval Ravikant: A Guide to Wealth and Happiness\n"
					+"Price=390\n");
			s=0;}
			else if(s==5)
			{
			System.out.println("Product Name=ReWork: Change the Way You Work Forever\n"
					+"Price=300\n");
			s=0;}
			
			else {
				System.out.println("Invalid Input\n"
						+"Enter your choice again");
			}
				
			}n1=0;}

	        else {
				System.out.println("Invalid Input\n"
	 					+"Enter the sub-Category again");
	 		}}c=0;}
     else {
			System.out.println("Invalid Input\n"
					+"Enter the Category again");
		} }
	

	 System.out.println("Type yes if you wish to buy the product or Type no if you want to go back to the Categories");
	 String b=sc.next();
	 if(b.equalsIgnoreCase("yes")==true)
	 {
		 System.out.println("Thank You for purchasing our product\n");
		 Thread.sleep(2000);
	 }
	
}}}
