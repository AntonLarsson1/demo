import java.util.*;
public class ArraySwitch{




public static void main(String[] args){
int[] test = {4,5,6,7,3,5,67,4};mer text

System.out.println(Arrays.toString(addAtIndex(test,100,3)));      // Main to test my method
}

public static int[] addAtIndex(int[] a ,int x ,int index){        // backwards loop trough the array

if(a[index]!=0){
for(int i = (a.length-1);i > index;i--){              // if the index spot isnt 0, set the value of i to the value befor it
   a[i]= a[i-1];

}
a[index] = x;                                         // then set the index spot to the given value
}
else
a[index] = x;                                         // if the index spot is 0 put the given value on the spot

return a;
}
} 