import java.util.*;
class base
{
	int select,select1,select2;
	int amount=0,ttl_amount=0,voucher=0,voucher_m=0,cashback;
	int pp,rp,tt,du,mb,isd,is;
	int q1,q2,q3;
	String q4;
	String c_name;
	short c_code;
	long u_p_num;
	String u_state,u_pd_name,sim_type;
	
	void putdata()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("------------------------------------------");
		System.out.println("					                      ");
		System.out.println("        Telephone Billing System          ");
		System.out.println("	        			                  ");
		System.out.println("------------------------------------------");

		System.out.println("\n Enter the Country Code :- ");
		System.out.print("+");
		c_code = sc.nextShort();

		if(c_code==91)
		{
			System.out.println("\nYour country is INDIA.");
			c_name="INDIA";
		}
		else
		{
		System.out.println("\n Enter the Country Name :- ");
		c_name = sc.next();
		}
		System.out.println("\n Enter the Customer Mobile Number :- ");
		System.out.print("+"+c_code );
		u_p_num = sc.nextLong();

		System.out.println("\n Enter the State Name :- ");
		u_state = sc.next();

		System.out.print("Your state "+u_state); 
		System.out.println(" has following service providers. Choose any one of these: ");
		System.out.println("1.Airtel");
		System.out.println("2.Bsnl");
		System.out.println("3.Jio");
		System.out.println("4.Vodafone");
		System.out.println("\n Enter the Service Provider Name :- ");
		u_pd_name = sc.next();

		
			System.out.println("\n Enter the Choice  : ");

			System.out.println("Press 1 for Post Paid.");

			System.out.println("Press 2 for Pre Paid.");

			System.out.println("Press 3 to become our Premium Customer.");

			System.out.println("Press 4 for the Feedback.");

			System.out.println("Press 5 to exit.");
			select = sc.nextInt();
		
			switch(select)
			{
				case 1:
					
					sim_type = "Post Paid";

					System.out.println("\nThe code for your Post-Paid plan was PP01.");
					System.out.println("The plan included of 75GB with rollover + Free UNLIMITED calling + No roaming charges + upto 100 SMS per day.");
					System.out.println("You have used 61.76GB of which the remaining 13.24GB will get rollover to the next month.");
					System.out.println("You also had talktime of 3000 minutes and an average of 20 messages per day.");
					System.out.println("The monthly rent for the same is stated at Rs.499/- for the month of September.");
					System.out.println("You are also provided with additional voucher worth Rs.100/- for FREE every month.");
					System.out.println("The due date of the bill is on 20/10/2019.");
					System.out.println("*If not paid before the due date additional charges may apply as per the terms and conditions of it.");
					System.out.println("As you have been our Post-Paid customer.So this DIWALI festive season "+ u_pd_name +" would like to given you cashback of 5% on total bil.");
					
					amount = amount + 499;
					voucher = voucher + 100;
					voucher_m =0;
					ttl_amount = ttl_amount +amount -voucher + voucher_m;
					cashback=ttl_amount/5;
					System.out.println("You have saved Rs."+cashback+"on this transaction.");
					ttl_amount=ttl_amount-cashback;
					break;
					

				case 2 :
					
					sim_type = "Pre Paid";

					System.out.println("\n Enter the Choice  : ");
					System.out.println("Press 1 for Popular plans.");
					System.out.println("Press 2 for Recommended plans.");
					System.out.println("Press 3 for Talk-Time based plans.");
					System.out.println("Press 4 for Data-Usage based plans.");
					System.out.println("Press 5 for Message based plans.");
					System.out.println("Press 6 for ISD plans.");
					select1 = sc.nextInt();
					switch(select1)
					{
					case 1: 	
						System.out.println("You have opted for Popular Plans.");
						System.out.println("Plan-1:");
						System.out.println("a) Daily Data-Usage of 2GB(56).Beyond it the speed gets reduced @64kbps.");
						System.out.println("b) Free talktime to other users of "+u_pd_name+".Non-"+u_pd_name+" FUP of 1,000 minutes.");
						System.out.println("c) Upto 100 daily messages.");
						System.out.println("d) Validity: 28days.");
						System.out.println(" Price:222/-");

						System.out.println("Plan-2:");
						System.out.println("a) Daily Data-Usage of 2GB(168).Beyond it the speed gets reduced @74kbps.");
						System.out.println("b) Free talktime to other users of "+u_pd_name+".Non-"+u_pd_name+" FUP of 3,000 minutes.");
						System.out.println("c) Upto 100 daily messages.");
						System.out.println("d) Validity: 84days.");
						System.out.println(" Price:555/-");

						System.out.println("Enter the choice of plan you want:");
						pp= sc.nextInt();
						if(pp == 1)
						{
							System.out.println("You have opted for Plan-1 from Popular Plans.");
							amount=amount + 222;
							voucher=0;
							voucher_m=0;
							ttl_amount=ttl_amount + amount + voucher + voucher_m;
						}
						else if(pp == 2)
						{
							System.out.println("You have opted for Plan-2 from Popular Plans.");
							amount=amount +555;
							voucher=0;
							voucher_m=0;
							ttl_amount=ttl_amount + amount + voucher + voucher_m;
						}
						else 
						{
							System.out.println("Invalid choice.");
						}
					break;

					case 2: 	
						System.out.println("You have opted for Recommended plans.");
						System.out.println("Plan-1:");
						System.out.println("a) Daily Data-Usage of 2GB(56).Beyond it unlimited Data-Usage @64kbps.");
						System.out.println("b) Free talktime to other users of "+u_pd_name+".");
						System.out.println("c)TRAI has compelled "+u_pd_name+" to recover IUC of 6 paise/minute for all mobile voice calls to other operators.");
						System.out.println("d) Rs.20/- (Top Up Voucher -IUC) 249 IUC Minutes");
						System.out.println("e) Upto 100 daily messages.");
						System.out.println("f) Validity: 28days.");
						System.out.println(" Price:198/-");

						System.out.println("Plan-2:");
						System.out.println("a) Daily Data-Usage of 2GB(56).Beyond it unlimited Data-Usage @64kbps.");
						System.out.println("b) Free talktime to other users of "+u_pd_name);
						System.out.println("c)TRAI has compelled "+u_pd_name+" to recover IUC of 6 paise/minute for all mobile voice calls to other operators.");
						System.out.println("d) Rs.50/- (Top Up Voucher -IUC) 656 IUC Minutes");
						System.out.println("e) Upto 100 daily messages.");
						System.out.println("f) Validity: 28days.");
						System.out.println(" Price:198/-");

						System.out.println("Enter the choice of plan you want:");
						rp= sc.nextInt();
						if(rp == 1)
						{
							System.out.println("You have opted for Plan-1 from Recommended Plans.");
							amount=amount +198;
							voucher=voucher + 20;
							voucher_m=0;
							ttl_amount=ttl_amount + amount + voucher + voucher_m;

						}
						else if(rp == 2)
						{
							System.out.println("You have opted for Plan-2 from Recommended Plans.");
							amount=amount +198;
							voucher=voucher + 50;
							voucher_m=0;
							ttl_amount=ttl_amount + amount + voucher + voucher_m;

						}
						else 
						{
							System.out.println("Invalid choice.");
						}
					break;

					case 3: 	
						System.out.println("You have opted for Talk-Time based Plans.");
						System.out.println("Plan-1:");
						System.out.println("a) Daily Data-Usage of 1.5GB(42).Beyond it unlimited Data-Usage @64kbps.");
						System.out.println("b) Free talktime to other users of "+u_pd_name+".");
						System.out.print("c)TRAI has compelled "+u_pd_name+"to recover IUC of 6 paise/minute for all mobile voice calls to other operators.");
						System.out.println("d) Rs.100/- (Top Up Voucher -IUC) 1362 IUC Minutes");
						System.out.println("e) Upto 100 daily messages.");
						System.out.println("f) Validity: 28days.");
						System.out.println(" Price:149/-");

						System.out.println("Plan-2:");
						System.out.println("a) Daily Data-Usage of 1.5GB(42).Beyond it unlimited Data-Usage @64kbps.");
						System.out.println("b) Free talktime to other users of "+u_pd_name+".");
						System.out.print("c)TRAI has compelled " +u_pd_name+"to recover IUC of 6 paise/minute for all mobile voice calls to other operators.");
						System.out.println("d) Rs.500/- (Top Up Voucher -IUC) 7012 IUC Minutes");
						System.out.println("e) Upto 100 daily messages.");
						System.out.println("f) Validity: 28days.");
						System.out.println(" Price:149/-");

						System.out.println("Plan-3:");
						System.out.println("a) Daily Data-Usage of 1.5GB(105).Beyond it unlimited Data-Usage @64kbps.");
						System.out.println("b) Free talktime to other users of "+u_pd_name+".");
						System.out.print("c)TRAI has compelled " +u_pd_name+"to recover IUC of 6 paise/minute for all mobile voice calls to other operators.");
						System.out.println("d) Rs.100/- (Top Up Voucher -IUC) 7012 IUC Minutes");
						System.out.println("e) Upto 100 daily messages.");
						System.out.println("f) Validity: 70days.");
						System.out.println(" Price:349/-");

						System.out.println("Enter the choice of plan you want:");
						tt= sc.nextInt();
						if(tt == 1)
						{
							System.out.println("You have opted for Plan-1 from Talk-Time based Plans.");
							amount=amount +149;
							voucher=voucher + 100;
							voucher_m=0;
							ttl_amount=ttl_amount + amount + voucher + voucher_m;

						}
						else if(tt == 2)
						{
							System.out.println("You have opted for Plan-2 from Talk-Time based Plans.");
							amount=amount +149;
							voucher=voucher + 500;
							voucher_m=0;
							ttl_amount=ttl_amount + amount + voucher + voucher_m;

						}
						else if(tt == 3) 
						{
							System.out.println("You have opted for Plan-3 from Talk-Time based Plans.");
							amount=amount +349;
							voucher=voucher + 100;
							voucher_m=0;
							ttl_amount=ttl_amount + amount + voucher + voucher_m;
						}
						else 
						{
							System.out.println("Invalid choice.");
						}
					break;

					case 4: 	
						System.out.println("You have opted for Data-Usage based plans.");
						System.out.println("Plan-1:");
						System.out.println("a) Daily Data-Usage of 3GB(84).Beyond it unlimited Data-Usage @64kbps.");
						System.out.println("b) Free talktime to other users of "+u_pd_name+".");
						System.out.println("c)TRAI has compelled "+u_pd_name+" to recover IUC of 6 paise/minute for all mobile voice calls to other operators.");
						System.out.println("d) Rs.50/- (Top Up Voucher -IUC) 656 IUC Minutes");
						System.out.println("e) Upto 100 daily messages.");
						System.out.println("f) Validity: 28days.");
						System.out.println(" Price:299/-");

						System.out.println("Plan-2:");
						System.out.println("a) Daily Data-Usage of 4GB(112).Beyond it unlimited Data-Usage @64kbps.");
						System.out.println("b) Free talktime to other users of "+u_pd_name);
						System.out.println("c)TRAI has compelled "+u_pd_name+" to recover IUC of 6 paise/minute for all mobile voice calls to other operators.");
						System.out.println("d) Rs.50/- (Top Up Voucher -IUC) 656 IUC Minutes");
						System.out.println("e) Upto 100 daily messages.");
						System.out.println("f) Validity: 28days.");
						System.out.println(" Price:509/-");

						System.out.println("Enter the choice of plan you want:");
						du= sc.nextInt();
						if(du == 1)
						{
							System.out.println("You have opted for Plan-1 from Data-Usage based Plans.");
							amount=amount +299;
							voucher=voucher + 50;
							voucher_m=0;
							ttl_amount=ttl_amount + amount + voucher + voucher_m;

						}
						else if(du == 2)
						{
							System.out.println("You have opted for Plan-2 from Data-Usage based Plans.");
							amount=amount +509;
							voucher=voucher + 50;
							voucher_m=0;
							ttl_amount=ttl_amount + amount + voucher + voucher_m;

						}
						else 
						{
							System.out.println("Invalid choice.");
						}
					break;	

					case 5: 	
						System.out.println("You have opted for Message based plans.");
						System.out.println("Plan-1:");
						System.out.println("a) Daily Data-Usage of 1.5GB(42).Beyond it unlimited Data-Usage @64kbps.");
						System.out.println("b) Free talktime to other users of "+u_pd_name+".");
						System.out.println("c)TRAI has compelled "+u_pd_name+" to recover IUC of 6 paise/minute for all mobile voice calls to other operators.");
						System.out.println("d) Rs.50/- (Top Up Voucher -IUC) 656 IUC Minutes");
						System.out.println("e) Upto 100 daily messages."+"Additional ");
						System.out.println("d) Rs.20/- (Top Up Voucher -Messages) 222 messages");
						System.out.println("f) Validity: 28days.");
						System.out.println(" Price:149/-");

						System.out.println("Plan-2:");
						System.out.println("a) Daily Data-Usage of 1.5GB(105).Beyond it unlimited Data-Usage @64kbps.");
						System.out.println("b) Free talktime to other users of "+u_pd_name);
						System.out.println("c)TRAI has compelled "+u_pd_name+" to recover IUC of 6 paise/minute for all mobile voice calls to other operators.");
						System.out.println("d) Rs.50/- (Top Up Voucher -IUC) 656 IUC Minutes");
						System.out.println("e) Upto 100 daily messages.");
						System.out.println("d) Rs.50/- (Top Up Voucher -Messages) 550 Messages");
						System.out.println("f) Validity: 70days.");
						System.out.println(" Price:349/-");

						System.out.println("Enter the choice of plan you want:");
						mb= sc.nextInt();
						if(mb == 1)
						{
							System.out.println("You have opted for Plan-1 from Message based Plans.");
							amount=amount +149;
							voucher=voucher + 50;
							voucher_m=voucher_m +20;
							ttl_amount=ttl_amount + amount + voucher + voucher_m;

						}
						else if(mb == 2)
						{
							System.out.println("You have opted for Plan-2 from Message based Plans.");
							amount=amount +349;
							voucher=voucher + 50;
							voucher_m=voucher_m +50;
							ttl_amount=ttl_amount + amount + voucher + voucher_m;

						}
						else 
						{
							System.out.println("Invalid choice.");
						}
					break;	

					case 6: 	
						System.out.println("You have opted for ISD Plans.");
						System.out.println("Press 1 for Plan.");
						System.out.println("Press 2 for other options.");
						select2 = sc.nextInt();
						
						switch(select2)
						{
						case 1:
							System.out.println("-] It is a global ISD plan.");
							System.out.println("a) ISD talk-time of Rs 501/- + additional ISD talk-time of Rs 54/-.");
							System.out.println("b) Equivalent ISD talk-time is Rs 555/-.");
							System.out.println("c) Validity: 28days.");
							System.out.println(" Price:501/-");
							amount= amount + 501;
							voucher=0;
							voucher_m=0;
							ttl_amount=ttl_amount + amount + voucher + voucher_m;
							break;
						case 2:
							System.out.println("For individual country benefits:-");
							System.out.println("1) Australia");
							System.out.println("2) United Kingdom");
							System.out.println("3) United States of America");
							System.out.println("We provide our services in above mentioned countries only.");
							System.out.println("Choose the country:");
							isd= sc.nextInt();
							if(isd == 1)
							{
								System.out.println("You have selected Australia for ISD calling.");
								System.out.println("Price(in Rs) is 4/min.");
								amount=amount + 501;
								voucher=0;
								voucher_m=0;
								ttl_amount=ttl_amount + amount + voucher + voucher_m;
						    	is=amount/4;
								System.out.println("Hence you would get "+ is +"minutes");
							}
							else if(isd == 2)
							{
								System.out.println("You have selected United Kingdom for ISD calling.");
								System.out.println("Price(in Rs) is 2/min.");
								amount=amount + 501;
								voucher=0;
								voucher_m=0;
								ttl_amount=ttl_amount + amount + voucher + voucher_m;
						    	is=amount/2;
								System.out.println("Hence you would get "+ is +"minutes");
							}
							else if(isd == 3)
							{
								System.out.println("You have selected United States of America for ISD calling.");
								System.out.println("Price(in Rs) is 1/min.");
								amount=amount + 501;
								voucher=0;
								voucher_m=0;
								ttl_amount=ttl_amount + amount + voucher + voucher_m;
						    	is=amount/1;
								System.out.println("Hence you would get "+ is +"minutes");
							}
							else 
							{
								System.out.println("Invalid choice.");
							}	
						break;

						default:
							System.out.println("Inappropriate choice.");
						}
					break;

					default:
					System.out.println("Wrong input");
					}
				break;
				case 3 :
					
					sim_type = "Post-Paid (Exclusively)";
					System.out.println("You have been one of the most faithful customer for our company.");
					System.out.println("As a result of this you are a premium customer of "+ u_pd_name +" network.\n Serving you is our no.1 priority.");
					System.out.println("We have brought a premium plan for the premium ones.\n It is a plan like never heard before.");
					System.out.println("a) Daily Data-Usage of 2.08GB(750).Beyond it unlimited Data-Usage @64kbps.");			
					System.out.println("b) Free talktime to other users of "+u_pd_name+".");
					System.out.println("c)TRAI has compelled "+u_pd_name+" to recover IUC of 6 paise/minute for all mobile voice calls to other operators.");
					System.out.println("d) Rs.1000/- (Top Up Voucher -IUC) 14321 IUC Minutes");
					System.out.println("e) Upto 100 daily messages.");
					System.out.println("f) Validity: 360days.");
					System.out.println(" Price:9999/-");
					System.out.println("As you have been our premium customer so we would like to given you cashback of 5% on total bil.\n Also additional 5% on the total bill as for DIWALI Festive Season.");
					System.out.println("Hence a total of 10% would be given as cashback on this transaction.");
					amount= amount + 9999;
					voucher=1000;
					voucher_m=0;
					ttl_amount=ttl_amount + amount + voucher + voucher_m;
					cashback=ttl_amount/10;
					System.out.println("You have saved Rs."+cashback+"on this transaction.");
					ttl_amount=ttl_amount-cashback;
					break;
					
				case 4 :           	
					System.out.println("Welcome to the FEEDBACK Section");
					System.out.println("Following are few questions rate them accordingly on a scale of 1-5.\n1.Very Bad\t\t2.Bad\t\t3.Satisfied\t\t4.Good\t\t5.Excellent");
					System.out.println("1.Helpful\nis our system helpful to you?");
					q1=sc.nextInt();
					if(q1==1) 
						{
							System.out.println("Very Bad-We will try to improve it.");
						}
					else if(q1==2) 
						{
							System.out.println("Bad-We will try to make it better.");
						}
					else if(q1==3) 
						{
							System.out.println("Satisfied-There is always room for improvement.");
						}
					else if(q1==4) 
						{
							System.out.println("Good-We would enchance it.");
						}
					else if(q1==5) 
						{
							System.out.println("Excellent-We were expecting this.");
						}
					else
						{
							System.out.println("Inappropriate choice for feedback.");
						}
					System.out.println("2.Ease of use\nHow easy is it to use?");
					q2=sc.nextInt();
					if(q2==1) 
						{
							System.out.println("Very Bad-We will try to improve it.");
						}
					else if(q2==2) 
						{
							System.out.println("Bad-We will try to make it better.");
						}
					else if(q2==3) 
						{
							System.out.println("Satisfied-There is always room for improvement.");
						}
					else if(q2==4) 
						{
							System.out.println("Good-We would enchance it.");
						}
					else if(q2==5) 
						{
							System.out.println("Excellent-We were expecting this.");
						}
					else
						{
							System.out.println("Inappropriate choice for feedback.");
						}
					System.out.println("3.Experience\nHow was your experience with us?");
					q3=sc.nextInt();
					if(q3==1) 
						{
							System.out.println("Very Bad-We will try to improve it.");
						}
					else if(q3==2) 
						{
							System.out.println("Bad-We will try to make it better.");
						}
					else if(q3==3) 
						{
							System.out.println("Satisfied-There is always room for improvement.");
						}
					else if(q3==4) 
						{
							System.out.println("Good-We would enchance it.");
						}
					else if(q3==5) 
						{
							System.out.println("Excellent-We were expecting this.");
						}
					else
						{
							System.out.println("Inappropriate choice for feedback.");
						}
					System.out.println("Write a feedback\n Type your comments here:");
					q4=sc.next();
					System.out.println("Thanks for giving your precious time in giving us feedback.");
					break;
				case 5 :
					
					System.out.println("\n  Exit ");
					break;
				default:
					System.out.println("Wrong input");
			
			}

		
		
	}

	void showdata()
	{
		System.out.println("\n  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _* TELEPHONE BILL *_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		System.out.println("\n |Country Name :-                "+ c_name +"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
		System.out.println("\n |                                                                                                                                              |");
		System.out.println("\n |Country Code :-               +"+ c_code +"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
		System.out.println("\n |                                                                                                                                              |");
		System.out.println("\n |Customer Mobile Number :       "+ c_code +" "+ u_p_num +"\t\t\t\t\t\t\t\t\t\t\t\t\t\t|"); 
		System.out.println("\n |                                                                                                                                              |");
		System.out.println("\n |State Name :-                  "+ u_state +"\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
		System.out.println("\n |                                                                                                                                              |");
		System.out.println("\n |Service Provider Name :-       "+ u_pd_name +"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
		System.out.println("\n |                                                                                                                                              |");
		System.out.println("\n |Customer Service Plan Type :-  " + sim_type +"\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
		System.out.println("\n |                                                                                                                                              |");
		System.out.println("\n |Voucher-IUC(in Rs.) :-         " + voucher +"/- \t\t\t\t\t" +"Voucher-Messages(in Rs.) :- "+ voucher_m +"/- \t\t\t\t\t|");
		System.out.println("\n |                                                                                                                                              |");
		System.out.println("\n |Amount(in Rs.) :-              "+ amount +"/- \t\t\t\t\t" +"Cashback(in Rs.) :- "+ cashback +"/- \t\t\t\t\t\t\t|");
		System.out.println("\n |                                                                                                                                              |");
		System.out.println("\n |Total Amount(in Rs.) :-        " + ttl_amount +"/-"+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
		System.out.println("\n |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ |");

	}
}

class project
{
	public static void main(String[] args) 
	{
		base b = new base();
		
		b.putdata();

		b.showdata();				
	}
}
