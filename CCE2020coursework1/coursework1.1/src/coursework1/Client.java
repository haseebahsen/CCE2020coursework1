/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework1;

import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Client {
 public static void main(String argv[]) throws Exception {
     Scanner in = new Scanner(System.in);
     int Choicedimension =0;
     int Choiceshape = 0;

  Socket clientSocket = new Socket("localhost", 6789);
  
  DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
  BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
  
  
  
  while(true){
      
      System.out.println("Enter Your Choice: \n 1. 2D Shapes \n 2. 3D shapes \n 3.Exit");
      Choicedimension = in.nextInt();
  if (Choicedimension == 1)
  {
      System.out.println("1. Rectanle \n 2. Circle \n 3. Triangle");
      Choiceshape = in.nextInt();
      
      if (Choiceshape == 1)
      {
          System.out.println("You have selected Rectangle");
          
       }
      
      
      if (Choiceshape == 2)
      {
          System.out.println("You have selected Circle");
       }
      
      
      if (Choiceshape == 3)
      {
          System.out.println("You have selected Triangle");
       }
  }
  
if (Choicedimension == 2)
  {
      System.out.println("1. Sphere \n 2. Cylinder \n");
      Choiceshape = in.nextInt();
      if (Choiceshape == 1)
      {
          System.out.println("You have selected Sphere");
      }
      
      if (Choiceshape == 2)
      {
          System.out.println("You have selected Cyliinder");
      }
      
      if (Choiceshape == 3)
      {
          System.out.println("You have selected Triangle");
      }
      
}

if (Choicedimension == 3){
   System.out.print("Exiting...");
   TimeUnit.SECONDS.sleep(2);
   break;
}
 }
//sentence = inFromUser.read Line();
  //outToServer.writeBytes(sentence + '\n');
  //modifiedSentence = inFromServer.readLine();
  //System.out.println("FROM SERVER: " + modifiedSentence);
  clientSocket.close();
 
}}
