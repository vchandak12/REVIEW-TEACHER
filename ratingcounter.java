package org.tec.rating;
import java.util.*;
import org.tch.hubteacher.teacher;

public class ratingcounter
{
  LinkedList teacherList=new LinkedList();
  public boolean isaddteacher(teacher teacher)
  {
	  boolean b=teacherList.add(teacher);
	       return b;
  }
  public void rateteacher(int rating,String name,int id,String textReview)
  {  boolean flag=false;
        teacher t=null;
        
	  for(Object obj:teacherList)
	  {
		     t=(teacher)obj;
		  String n=t.getName();
		  int i=t.getId();
		  if(n.equals(name) &&i==id)
		  {
			 flag=true;
			 break;
		  }
		  
		  
	  }
	   if(flag)
	   {   
		   ArrayList ratingArrayList=t.getRating();
		   if(ratingArrayList==null)
		   {
			   ratingArrayList=new ArrayList();
		   }
		   ratingArrayList.add(rating);
		   ArrayList textReviewlist=t.getTextReview();
		   if(textReviewlist==null)
		   {
			   textReviewlist=new ArrayList();
		   }
			   textReviewlist.add(textReview);
		   t.setRating(ratingArrayList);
		   t.setTextReview(textReviewlist);
	   }
	   else 
	   {
		   System.out.println("TEACHER NOT PRSENT IN TEACHER LIST........................");
	   }
  }
  public void viewAllRating()
  {
	  for(Object obj:teacherList)
	  { 
		  teacher t=(teacher)obj;
		  System.out.println(t.getId()+"\t"+t.getName()+"\t"+t.getRating()+"\t"+t.getTextReview());
		  
	  }
  }
  public void postivereview()
  {
	  String reviews[]= {"good","excrllent","better"};
	  for(Object obj:teacherList)
	  {  teacher t=(teacher)obj;
	     ArrayList reviewList=t.getTextReview();
	     Iterator i=reviewList.iterator();
	     System.out.println("view Postive Review");
	     while(i.hasNext())
	     {
	    	 String review=(String)i.next();
	    	 
	    	 if(review.equals("good")||review.equals("excllent")||review.equals("better"))
	    	 {
	    		 System.out.println(review);
	    	 }
	     }
	     
	  }
  }
  public void negtivereview()
  {
	  String reviews[]= {"bad","belowavg"};
	  for(Object obj:teacherList)
	  {  teacher t=(teacher)obj;
	     ArrayList reviewList=t.getTextReview();
	     Iterator i=reviewList.iterator();
	     System.out.println("view Negtive Review");
	     while(i.hasNext())
	     {
	    	 String review=(String)i.next();
	    	 
	    	 if(review.equals("bad")||review.equals("belowavg"))
	    	 {
	    		 System.out.println(review);
	    	 }
	     }
	     
	  }
  }
  public void Avaeagereview()
  {
	  String reviews[]= {"Average"};
	  for(Object obj:teacherList)
	  {  teacher t=(teacher)obj;
	     ArrayList reviewList=t.getTextReview();
	     Iterator i=reviewList.iterator();
	     System.out.println("view Average Review");
	     while(i.hasNext())
	     {
	    	 String review=(String)i.next();
	    	
	    	 if(reviews.equals("Average"))
	    	 {
	    		 System.out.println(review);
	    	 }
	     }
	     
	  }
  }
}
