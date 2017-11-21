/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework1;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

class Server {
    
    DataInputStream in;
    DataOutputStream out;
    ServerSocket server;
    Socket socket;
    
 public static void main(String argv[]) throws Exception {
  //String clientSentence;
  //String capitalizedSentence;
  ServerSocket welcomeSocket = new ServerSocket(6789);
  Socket connectionSocket = welcomeSocket.accept();
   

    ObjectInputStream objin=new ObjectInputStream(connectionSocket.getInputStream());
   ObjectOutputStream objout=new ObjectOutputStream(connectionSocket.getOutputStream());
   
  
   
   ArrayList<Object> clientin = new ArrayList<Object>();
   
  while (true) {
       Shape shape = (Shape)objin.readObject();
       clientin.add(shape);
   if (shape instanceof Shape2d){
       Shape2d s2d = (Shape2d)shape;
       double area = s2d.getArea();
       double perimeter = s2d.getPerimeter();
            
            if (s2d instanceof Rectangle){
                Rectangle r = (Rectangle) s2d;
                System.out.println("Length of rectangle from Client: " + r.length +  "\n Breadth of rectangle recieved from client" + r.breadth);
            }
            else if (s2d instanceof Circle){
                Circle c1 =(Circle) s2d;
                System.out.println("Radius received from Client: "+ c1.Radius);
             }
            else if (s2d instanceof Triangle){
               Triangle t = (Triangle)s2d;
               System.out.println("side 1 of trinangle: " + t.side1);
               System.out.println("side 2 of trinangle: " + t.side2);
               System.out.println("side 3 of trinangle: " + t.side3);
            }
            System.out.println("The area of the shape is :" + area);
            System.out.println("The perimeter of the shape is :" + perimeter + "\n \n");
            
   }
   
    else if(shape instanceof Shape3d){
                Shape3d s3d=(Shape3d)shape;
                double surfarea=s3d.getSa();
                double vol=s3d.getVolume();
                if (s3d instanceof Sphere){
                    Sphere s = (Sphere)s3d;
                    System.out.println("Radius of sphere from client:  "+s.Radius);
                }
                else if (s3d instanceof Cylinder){
                    Cylinder c = (Cylinder)s3d;
                    System.out.println("Radius of cylinder from client: "+c.Radius);
                    System.out.println("Height of cylinder from client: "+c.Height);
                    
                }
                
                System.out.println("Surface Area: " + surfarea);
                System.out.println("Volume: " + vol + "\n \n");
                objout.writeObject(clientin);
                
                
   //BufferedReader inFromClient =
   //new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
   //DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
   //clientSentence = inFromClient.readLine();
   //System.out.println("Received: " + clientSentence);
   //capitalizedSentence = clientSentence.toUpperCase() + '\n';
   //outToClient.writeBytes(capitalizedSentence);
  }
 }
 }}