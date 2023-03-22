package com.exceptionhandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
 
public class CheckedException 
   {
	
	    public static void main(String[] args) throws FileNotFoundException
	    {
	 
	        
	        FileInputStream DOC= null;
	
	        try 
	        {
	 	            DOC = new FileInputStream("D:/Lavanya/Task/document.txt");
	        }    
	 
	        catch (FileNotFoundException e) 
	        {
	 	      System.out.println("File does not exist");
	        }
	    }
	}
