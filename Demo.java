package nomor4;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Demo {
    public static void main(String[] args) {


       Instructor myInstructor = new Instructor("CHAN", "Eun Woo", "BF029S");





       TextBook myTextBook;
        myTextBook = new TextBook("The Lord Of The Rings","J.R.R Tolkien", "HarperCollins");





       Course myCourse = new Course("Self Motivation", myInstructor, myTextBook);





       System.out.println(myCourse);
    }
    
}
