import java.util.*;
import java.util.Scanner;
class Assignment2 {
    public static void main(String[] args) {
        String str = input.next();
        for(int i=0;i<str.length();i++)
            str= str.toLowerCase();
        int[] arr = new int[26];
        for(int i=0;i<26;i++)
            arr[i]=0;
        for(int i=0;i<str.length();i++)
            arr[str[i]-'a']=1;

        for(int i=0;i<26;i++)
            if(arr[i]==0)
            {
                System.out.println("String does not contain all the alphabets");
                return;
            }

        System.out.println("String contains all the alphabets");
        return;
    }
}