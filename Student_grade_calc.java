import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of subjects : ");
        int num = sc.nextInt();
        int total=0;
        for(int i=1;i<=num;i++){
            System.out.println("Enter subject "+i+" marks : ");
            int marks = sc.nextInt();
            total+=marks;
        }
        System.out.println("Total marks : "+total+" / "+(num*100));
        float average = total/(float)num;
        System.out.printf("Average mark percentage : %.2f%%\n",average);
        System.out.print("Grade : ");
        if(average==100) System.out.println("O grade");
        else if(average>=90) System.out.println("A grade");
        else if(average>=80) System.out.println("B grade");
        else if(average>=70) System.out.println("C grade");
        else if(average>=60) System.out.println("D grade");
        else System.out.println("E grade");
    }
}
