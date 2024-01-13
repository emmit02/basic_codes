 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.lms.arrayoperation;
public class ArrayOperation {

    public static void main(String[] args) {
     int data [] = new int [10];
     Array arrayobject = new Array (data);
     arrayobject.addlast(10);
     arrayobject.addlast(20);
     arrayobject.addFirst(45);
     arrayobject.addlast(45);
     arrayobject.addlast(50);
     arrayobject.addlast(60);
    arrayobject.addFirst(30);
    arrayobject.addlast(70);
    arrayobject.View();
 
    
  //  arrayobject.update(2, 77);
   // arrayobject.addlast(80);
   // arrayobject.addlast(100);
      // arrayobject.addAnywhere(4, 40);
     //arrayobject.RemovingSpecificPlace(4);
     // arrayobject.RemoveFirst(0);
       
          System.out.println(".............................");
        
        for (int i : data)
            
        {
            System.out.println(i);    
        }
        
        arrayobject.sorting(0);
        System.out.println(".............................");
        
        for (int i : data)
            
        {
            System.out.println(i);    
        }
        
       
    }
    
}
