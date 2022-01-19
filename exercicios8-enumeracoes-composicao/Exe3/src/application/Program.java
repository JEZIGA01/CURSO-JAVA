package application;

import java.text.ParseException;
import java.text.SimpleDateFormat; 

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Nice !");
		Comment c2 = new Comment("Awe !");
		
		Post p = new Post(sdf.parse("19/01/2022 10:02:35"),"Title to post" ," visit , where u go ",23);
		p.addComment(c1);
		p.addComment(c2);
		
		System.out.println(p);
		
		Comment c3 = new Comment("wt hell!");
		Comment c4= new Comment("dont worry about it !");
		
		Post p2 = new Post(sdf.parse("19/01/2022 10:02:35"),"Look this cat" ," in my home ",345);
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p2);
	}

}
