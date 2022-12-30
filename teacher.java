package org.tch.hubteacher;
import java.util.*;
public class teacher
{
private String name;
private int id;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
public ArrayList getTextReview() {
	return textReview;
}
public void setTextReview(ArrayList textReview) {
	this.textReview = textReview;
}
public ArrayList getRating() {
	return rating;
}
public void setRating(ArrayList rating) {
	this.rating = rating;
}
private int count=0;
private ArrayList textReview;
private ArrayList rating;

}
