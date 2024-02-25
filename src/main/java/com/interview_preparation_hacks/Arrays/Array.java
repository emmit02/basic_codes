
package com.lms.arrayoperation;


public class Array
{
    private int list [];
    private int locator = -1;

    public Array(int list[]) {
        this.list = list;
    }
    //1)AddLast
    public int [] addlast(int element)
    {
        if (locator==(list.length-1))
        {
            System.out.println("array is full");
        return list;
    }
   else 
   {
    locator++;
    list [locator]=element;
    return list;
    } 
    }
    //2)AddFirst
     public int [] addFirst(int element)
    {
         if (locator==(list.length-1))
        {
            System.out.println("array is full");
        return list;
    }
         else
         {
       for(int i =list.length-2; i>0;i-- )
       {
         list[i]=list[i-1];  
       }     
   locator++;
          list[0]=element;
    } 
        return list; 
       }
     //3)AddAnyWhere
     public int [] addAnywhere(int index,int element)
    {
     if (locator==(list.length-1))
        {
            System.out.println("array is full");
        return list;
        }   
       
    else
         {
         for(int i =list.length-2; i>index;i-- )
       {
         list[i]=list[i-1];  
       }
       
          locator++;
          list[index]=element;
          
        return list; 
       } 
    }
     //4)RemoveFirst
     public int [] RemoveFirst(int element)
     {
         if (locator==-1)
        {
            System.out.println("array is full");
        return list;
    }
         else 
         {
            for(int i =0; i <locator-1;i++){
                list[i]=list[i+1];
            } 
            list [locator]=0;
            locator--;
            return list;
         }
     }
     //5)RemoveSpecificPlace
     public int []RemovingSpecificPlace(int index)
     {
          if (locator == -1) {
            System.out.println("List is empty");
            return list;
        } else {
            for (int i = index; i < (list.length - 1); i++) {
                list[i] = list[i + 1];
            }
            list[locator] = 0;
            locator--;
            return list;
        }

     }
     //6)RemoveLast
     public int [] RemoveLast(int element)
{
 if (locator==(list.length-1))
        {
            System.out.println("array is full");
        return list;
    }
 else
 {
     list [locator]=0;
     locator--;
     return list;
 } 
 }
     //7)update
public int [] update(int index, int value)
{
  if( index<=locator) 
  list [index]=value;
  return list;
}
//8)sorting
public int[] sorting(int value)
{
    if (locator ==( list.length-1))
    {
        System.out.println("array is empty");
        return list;
    }
for (int i = 0; i <list.length; i++)
{     
            for (int j = i+1; j < list.length; j++)
            {     
               if(list[i] > list[j]) {    
                   value = list[i];    
                   list[i] = list[j];    
                   list[j] = value;    
               }     
            }     
        }
return list;
}
//9)view
public void View() 
{
        for (int i : list)
        {
            System.out.println(i);
        }
    }
//10)mergeSecond
    public int[] mergeSecond(int firstList[], int secondList[]) {
        int firstListLength = firstList.length;
        int secondListLength = secondList.length;
        int totalLength = firstListLength + secondListLength;

        int newList[] = new int[totalLength];
        int index = 0;
        for (int i : secondList) {
            newList[index] = i;
            index++;
        }
        for (int i : firstList) {
            newList[index] = i;
            index++;
        }

        return newList;
    
    }

}