import java.util.Arrays;
public class Sortieren 
{
  //declaring array with numbers of fields
  private int[] numbers = new int[100];
  
  public Sortieren()    
    {    
     
    }
    
  //creating the array
  public int[] createNum(){
    int randomNum;
    for(int i = 0; i < numbers.length; i++){
      randomNum = (int) (Math.random() * 100 + 1);
      for(int x = 0; x < i; x++){
        if(numbers[x] == randomNum)
        {
          randomNum = (int) (Math.random() * 100 + 1);
          x = -1;
        }
      }
      numbers[i] = randomNum;
    }      
    return numbers;
  }
    
  //linear   
  public int linearSearch(int pGesuchtNum)
  {
     for(int i=0; i< numbers.length; i++)
     {
       if( numbers[i]== pGesuchtNum)
       {
           return i;
       }
     }
     return -1;
  }
  
  //binaer
  public int binarysearch(int pGesuchtNum)
  {
      createNum();
   Arrays.sort(numbers);
   int firstNum=0;
   int lastNum=numbers.length;
   int middlepart= (firstNum+lastNum)/2;
   while(firstNum<=lastNum)
   {
       middlepart= (firstNum+lastNum)/2;
       if(numbers[middlepart]==pGesuchtNum)
       {
          return middlepart; 
       }
       else
       {
           if(numbers[middlepart]< pGesuchtNum)
           {
               firstNum=middlepart+1;
           }
           else 
           {
               lastNum=middlepart-1;
           }
       }
   }
   return -1;
  }
} 