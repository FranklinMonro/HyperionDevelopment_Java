import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class MyFile_Revision_1 {

    public static void main(String[] args) throws IOException,FileNotFoundException {



        FileInputStream fileInput = new FileInputStream("C:\\Users\\FrancoGroenewald\\eclipse-workspace\\Task 12\\src\\input2.txt");//create variable for input of file
        FileOutputStream fileOutput = new FileOutputStream("C:\\Users\\FrancoGroenewald\\eclipse-workspace\\Task 12\\src\\output_optional.txt");//create variable for output of file
        BufferedReader bReader = new BufferedReader(new InputStreamReader(fileInput));//create variable of reading of input file
        BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(fileOutput));//create variable of writing of output file
        
        

        String strLine;
        while ((strLine = bReader.readLine()) != null)//while loop to start reading of input file   
        {
        	  
              String[] arr = strLine.split(":");//create string array and split
              String[] arr1 = arr[0].split(":");//create string array and split to get to get function word
              String[] arr2 = arr[1].split(",");//create string array and split to get number out of input file
              
              String numRange = arr[1].replaceAll(":", " ");//create a string to use later in writing of output file
              
             
              
              int[] arr3 = new int[arr2.length];//create a int array to use in functions
              String function =arr1[0];

              for(int i = 0; i < arr2.length; i++)//for loop for changing of string array to int array
      		{
            	  arr3[i] = Integer.parseInt(arr2[i]);//put string array into int array
      		}
              
             int smallest = arr3[0];//create variable as placeholder for min number
             int largest = arr3[0];//create variable as placeholder for max number
             double sum = 0;//create variable as placeholder for sum of number
             double avg;//create variable as placeholder for the avg of number
             int percentile = 0;//create variable as placeholder for the percentile of array
             
             
              if(function.equals("min"))//if function to start for loop to find min number
              {
            	  for(int i =0; i<arr3.length;i++)//for loop to run through number array
            	  {
            		  if(arr3[i] < smallest) smallest = arr3[i];//if statement to get min number and storing it into variable
            		  
            	  }
            	  String writeMin = "The min of [" + numRange + "] is: "+ smallest;//create variable to store answer in
            	  bWriter.write(writeMin);//write the answer to output file
            	  bWriter.newLine();//create new line in output file
              }
              if(function.equals("max"))//if function to start for loop to find max number
              {
            	  for(int i =0; i<arr3.length;i++)//for loop to run through number array
            	  {
            		  if(arr3[i] > largest) largest = arr3[i];//if statement to get max number and storing it into variable
            		  
            	  }
            	  String writeMax ="The max of [" + numRange + "] is: "+largest;//create variable to store answer in
            	  bWriter.write(writeMax);//write the answer to output file
            	  bWriter.newLine();//create new line in output file
              }
              
              if(function.equals("avg"))//if function to start for loop to find avg number
              {
            	  for(int i =0; i<arr3.length;i++)//for loop to run through number array
            	  {
            		  sum += arr3[i];//make a sum of all the numbers in array
            		  
            	  }
            	  avg = sum/arr3.length;//calculating the avg of array
            	  String writeAvg ="The avg of [" + numRange + "] is: "+avg;//create variable to store answer in
            	  bWriter.write(writeAvg);//write the answer to output file
            	  bWriter.newLine();//create new line in output file
              }
              
              if(function.equals("p90"))//if function to start for loop to find max number
              {
            	  for(int i =0; i<arr3.length;i++)//for loop to run through number array
            	  {
            		  percentile =  (int) Math.ceil(0.9 * arr3.length);//if statement to get max number and storing it into variable
            		  
            	  }
            	  String writeP90 ="The 90th percentile of [" + numRange + "] is: "+percentile;//create variable to store answer in
            	  bWriter.write(writeP90);//write the answer to output file
            	  bWriter.newLine();//create new line in output file
              }
              
              if(function.equals("sum"))//if function to start for loop to find max number
              {
            	  for(int i =0; i<arr3.length;i++)//for loop to run through number array
            	  {
            		  sum += arr3[i];//if statement to get max number and storing it into variable
            		  
            	  }
            	  String writeSum ="The sum of [" + numRange + "] is: "+ sum;//create variable to store answer in
            	  bWriter.write(writeSum);//write the answer to output file
            	  bWriter.newLine();//create new line in output file
              }
              	
              
              if(function.equals("p70"))//if function to start for loop to find max number
              {
            	  for(int i =0; i<arr3.length;i++)//for loop to run through number array
            	  {
            		  percentile =  (int) Math.ceil(0.7 * arr3.length);//if statement to get max number and storing it into variable
            		  
            	  }
            	  String writeP70 ="The 70th percentile of [" + numRange + "] is: "+percentile;//create variable to store answer in
            	  bWriter.write(writeP70);//write the answer to output file
            	  bWriter.newLine();//create new line in output file
              }
              		
              
           


    }
        bReader.close();//close reader
        bWriter.close();//close writer

    }
}
