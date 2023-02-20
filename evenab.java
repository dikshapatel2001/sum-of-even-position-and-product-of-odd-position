import java.util.*;
 class number{
public static void main(String args[]){
int sum=0;
int odd=1;
int myNum[]={5,6,4,9};
for(int i=0;i<=3;i++)
{
  if(myNum[i]%2==0)
  {
  sum = sum+myNum[i];  
}
else
{
  odd = odd*myNum[i];
}
}
System.out.println("the sum of even posiotion:"+sum);
System.out.println("the product of odd positon:"+odd);
}
}