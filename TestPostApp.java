import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class TestPostApp {

public TestPostApp(){}

public void test1(){

Post test1 = new Post("Alex Adam","Help with JavaE","Hi, could anyone help me I need to learn how to code in java!");

System.out.println(test1.toString());



}
public static void main(String[]args) {
TestPostApp test = new TestPostApp();

test.test1();


}




}