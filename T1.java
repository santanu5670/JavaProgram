import java.io.*;
import java.util.Scanner;
class Animal
{  
int leg=4; 
void display()
{
System.out.println("here leg is 4");
} 
}  
class Dog extends Animal
{  
int leg=8;  
void display()
{
System.out.println("here leg is8 ");
}
void print()
{
display(); 
super.display();
}  
}
class T1{  
public static void main(String args[]){  
Dog d=new Dog();  
d.print();  
}
}