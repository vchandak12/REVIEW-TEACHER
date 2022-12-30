package org.tec.clientapp;
import java.util.*;
import org.tch.hubteacher.teacher;
import org.tec.rating.ratingcounter;
public class RatingclientApplicaton {

	public static void main(String[] args) {
		ratingcounter r=new ratingcounter();
		do {
			
			Scanner abc =new Scanner(System.in);
			System.out.println("1:add new teacher");
			System.out.println("2: rate to teacher");
			System.out.println("3:view teacher rating");
			System.out.println("4:view postive rating");
			System.out.println("5:view negative rating");
			System.out.println("6: view avg rating");
			System.out.println("7: out the loop");
			System.out.println("Eneter the your choice");
			int choice =abc.nextInt();
			switch(choice)
			{
			case 1:
				abc.nextLine();
				System.out.println("ENTER THE NAME OF TEACHER");
				String name=abc.next();
				System.out.println("ENTER THE ID OF TEACHRE");
				int id=abc.nextInt();
				  teacher t=new teacher();
				  t.setId(id);
				  t.setName(name);
				  boolean b=r.isaddteacher(t);
				  if(b)
				  {
					  System.out.println("TEACHER ADDED SUCCEFULLY...................");
					  
				  }
				  else
				  {
					  System.out.println("TEACHER NOT ADDED SUCCEFULLY..............");
				  }
				 break;
			case 2: abc.nextLine();
			System.out.println("ENTER THE TEACHER NAME");
		      name=abc.next();
		      System.out.println("TEXT REVIEW OF TEACHER");
		      String textReview=abc.next();
		      System.out.println("ENTER THE ID OF TEACHER");
		      id=abc.nextInt();
		      System.out.println("ENTER THE RATING OF TEACHER");
		      int rating =abc.nextInt();
		      r.rateteacher(rating, name, id, textReview);
				break;
			case 3:r.viewAllRating();
				break;
			case 4:r.postivereview();
				break;
			case 5:r.negtivereview();
				break;
			case 6:r.Avaeagereview();
				 break;
			case 7:
				      System.exit(0);
				      break;
				      
				 default:
					 System.out.println("Wrong choice");
			}
		}while(true);

	}

}
