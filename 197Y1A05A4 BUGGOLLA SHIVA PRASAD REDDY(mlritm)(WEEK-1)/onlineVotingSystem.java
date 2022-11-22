import java.util.*;

class Nominee
{
  private int Nominee_Id; 
  private String Nominee_Name;
  private String Gender;
  private String Party_Name;

  Nominee(int Nominee_Id,String Nominee_Name,String Gender,String Party_Name)
  {
  	this.Nominee_Id=Nominee_Id;
  	this.Nominee_Name=Nominee_Name;
  	this.Gender=Gender;
  	this.Party_Name=Party_Name;
  }

  public int getNominee_Id()
  {
  	return Nominee_Id;
  }
  public String getNominee_Name()
  {
  	return Nominee_Name;
  }
  public String getGender()
  {
  	return Gender;
  }
  public String getParty_name()
  {
  	return Party_Name;
  }

   public String toString()
   {
		return  "     "+Nominee_Id+"        "+Nominee_Name+"      "+Gender+"      "+Party_Name;
	}

}

class Voters
{		private int Voter_id;
		private String Voter_Name;
		private String Gender;
		private String Voter_Dob;
		private String Voter_Address;

		Voters(int Voter_id,String Voter_Name,String Gender,String Voter_Dob,String Voter_Address)
		{
			this.Voter_id=Voter_id;
			this.Gender=Gender;
			this.Voter_Name=Voter_Name;
			this.Voter_Dob=Voter_Dob;
			this.Voter_Address=Voter_Address;
		}

		public int getVoter_id()
		{
			return Voter_id;
		}
		public String getVoter_Name()
		{
			return Voter_Name;
		}
		
		public String getGender()
		{
			return Gender;
		}
		public String getVoter_Dob()
		{
			return Voter_Dob;
		}
		public String getVoter_Address()
		{
			return Voter_Address;
		}
		
		public String toString()
		{
			return "   "+Voter_id+"       "+Voter_Name+"      "+Gender+"      "+Voter_Dob+"     "+Voter_Address;
		}


}
class onlineVotingSystem
{
	public static void main(String[] args) 
	{
		List<Nominee> leaders_list=new ArrayList<Nominee>();
		List<Voters> voter_list=new ArrayList<Voters>();
	
		Scanner sc=new Scanner(System.in);
		int My_choice;
	    System.out.println("-----------------------------------------------");
	    System.out.println();
	    System.out.println("--------please enter your options------------");

		do{
			System.out.println("1.add_nominee_detailes");
			System.out.println("2.update_nominee_detailes");
			System.out.println("3.show_all_nominee_list");
			System.out.println("4.search_one_nominee_detailes");
			System.out.println("5.delete_nominee_detailes");
			System.out.println("6.add_voter_detailes");
			System.out.println("7.update_voter_detailes");
			System.out.println("8.show_voters_list");
			System.out.println("9.search_single_voter_detailes");
			System.out.println("10.delete_voter_detailes");
			System.out.println("0.EXIT");

			My_choice=sc.nextInt();

			Iterator<Voters> itr_v;
			Iterator<Nominee> itr_n;
			ListIterator<Nominee> itr_u;

			switch(My_choice)
			{
			case 1: System.out.println("enter nominee id");
					int num_id=sc.nextInt();
					System.out.println("please enter nominee name");
					String nominee_name=sc.next();
					System.out.println("enter the gender");
					String gender=sc.next();
					System.out.println("enter the Party_Name");
					String party_name=sc.next();
					leaders_list.add(new Nominee(num_id,nominee_name,gender,party_name));
					System.out.println("information added succesfully......");
					break;
			case 2:
				 System.out.println("please enter the nominee id to update the data");
				 int update_num=sc.nextInt();
				 itr_u=leaders_list.listIterator();
				 boolean update=false;
				 while(itr_u.hasNext())
				 {
				 	Nominee data_update=itr_u.next();
				 	if(update_num==data_update.getNominee_Id())
				 	{
				 		System.out.println("enter the new nominee name");
				 		nominee_name=sc.next();
				 		System.out.println("enter the gender");
				 		gender=sc.next();
				 		System.out.println("enter the new party name");
				 		party_name=sc.next();
				 		itr_u.set(new Nominee(update_num,nominee_name,gender,party_name));
				 		update=true;
				 		break;
				 	}

				 }
				 if(update==false)
				 {
				 	System.out.println("no record found to update");
				 }
				 
				 else{
				 	System.out.println("data updated succesfully......");
				 }
				 break;

			case 3:
				System.out.println("-----------------------------------------------");
				
				itr_n=leaders_list.iterator();
				if(leaders_list.isEmpty())
				{
					System.out.println("soryy no record found");
				}
				else{
					System.out.println("nominee id"+"   "+"Nominee_Name"+"   "+"Gender"+"   "+"party_name");
					System.out.println("-----------------------------------------------");

					while(itr_n.hasNext())
					{
						Nominee detailes=itr_n.next();
						System.out.println(detailes);

					}
			   }

				System.out.println("-----------------------------------------------");
				break;
			case 4:
				  System.out.println("please enter the nominee id to search");
				  int search_id=sc.nextInt();
				  itr_n=leaders_list.iterator();
				  boolean search=false;
				  while(itr_n.hasNext())
				  {
				  	Nominee data_search=itr_n.next();
				  	if(search_id==data_search.getNominee_Id())
				  	{
				  		search=true;
				  		System.out.println("data found! detailes of the nominee are...");
				  		System.out.println(data_search);
				  		break;
				  	}
				  }
				  if(search==false)
				  {
				  	System.out.println("no data found");
				  }
				  break;

				  


			case 5:
					System.out.println("please enter the nominee id to delete");
					int del_num=sc.nextInt();
					boolean flag1=false;
					itr_n=leaders_list.iterator();
					while(itr_n.hasNext())
					{
						Nominee data=itr_n.next();
						if(data.getNominee_Id()==del_num)
						{
							flag1=true;
							itr_n.remove();
							System.out.println("record deleted succusfully");
						}

					}
					if(flag1==false)
					{
						System.out.println("No record found");
					}
					break;
			case 6:System.out.println("enter voter id");
					int vot_id=sc.nextInt();
					System.out.println("please enter voter name");
					String voter_name=sc.next();
					System.out.println("enter the gender");
					String v_gender=sc.next();
					System.out.println("enter the date_of_Birth");
					String voter_dob=sc.next();
					System.out.println("enter the address");
					String voter_Address=sc.next();
					voter_list.add(new Voters(vot_id,voter_name,v_gender,voter_dob,voter_Address));

					System.out.println("-----------------------------------------------");

					System.out.println("information added succesfully......");
					break;
			case 7:
				 System.out.println("please enter the voter id to update the data");
				 int update_vot=sc.nextInt();
				 ListIterator<Voters>itr_vot=voter_list.listIterator();
				 boolean update_v=false;
				 while(itr_vot.hasNext())
				 {
				 	Voters data_update_vot=itr_vot.next();
				 	if(update_vot==data_update_vot.getVoter_id())
				 	{
				 		System.out.println("enter the new voter name");
				 		voter_name=sc.next();
				 		System.out.println("enter the gender");
				 		v_gender=sc.next();
				 		System.out.println("enter the new date of birth");
				 		voter_dob=sc.next();
				 		System.out.println("enter the new voter_Address");
				 		voter_Address=sc.next();
				 		itr_vot.set(new Voters(update_vot,voter_name,v_gender,voter_dob,voter_Address));
				 		update_v=true;
				 		break;
				 	}
				 }
				 if(update_v==false)
				 {
				 	System.out.println("no record found to update");
				 }
				 
				 else{
				 	System.out.println("-----------------------------------------------");
				 	System.out.println("data updated succesfully......");
				 }
				 break;
			case 8:
				System.out.println("--------------------------------------------------------------------------------------");
				itr_v=voter_list.iterator();
				if(voter_list.isEmpty())
				{
				  System.out.println("sorry no record found");
				}
				else{
				System.out.println("voter id"+"   "+"voter_Name"+"     "+"Gender"+"      "+"voter_DOb"+"      "+"Voter_Address");
				System.out.println("--------------------------------------------------------------------------------------");

				while(itr_v.hasNext())
				{
					Voters detailes=itr_v.next();
					System.out.println(detailes);
				}
					}
				System.out.println("---------------------------------------------------------------------------------------");
				break;

			case 9:
				  System.out.println("please enter the voter id to search");
				  int search_id_v=sc.nextInt();
				  itr_v=voter_list.iterator();
				  boolean search_v=false;
				  while(itr_v.hasNext())
				  {
				  	Voters data_search_v=itr_v.next();
				  	if(search_id_v==data_search_v.getVoter_id())
				  	{
				  		search_v=true;
				  		System.out.println("data found! detailes of the voter are...");
				  		System.out.println(data_search_v);
				  		break;
				  	}
				  }
				  if(search_v==false)
				  {
				  	System.out.println("no data found");
				  }
				  break;

			case 10:
					System.out.println("please enter the voter id to delete");
					int del_vot=sc.nextInt();
					boolean flag2=false;
					itr_v=voter_list.iterator();
					while(itr_v.hasNext())
					{
						Voters data_v=itr_v.next();
						if(data_v.getVoter_id()==del_vot)
						{
							flag2=true;
							itr_v.remove();
							System.out.println("-----------------------------------------------");
							System.out.println("record deleted succusfully");
						}

					}
					if(flag2==false)
					{
						System.out.println("No record found");
					}

					break;

			
			case 0: System.out.println("Thank you for the day bye...");
				 	System.exit(0);
			
			default:
					System.out.println("-----------------------------------------------");
					System.out.println("Invalid input");
					break;
				

			}


		}
		while(My_choice!=0);
	}
}