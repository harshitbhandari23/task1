import java.util.*;
 class task1 {
    public static void gradecalculater()
    {ArrayList<Integer>l1=new ArrayList<>();
        int n;
        double  per=0.0;
        int a=0;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF SUBJECTS");
        n=sc.nextInt();
        System.out.println("ENTER NUMBERS");
        for(int i=0;i<n;i++)
        {a=sc.nextInt();
            l1.add(a);

        }
       for(int i=0;i<l1.size();i++)
           sum=sum+l1.get(i);
       per=(double)sum/(n*100);
       per=per*100;
       String s="";
       if(per>=75&&per<=100)
            s="A";
       else if(per>=50&&per<75)
           s="B";
       else if(per>=35&&per<50)
           s="C";
       else if(per>=20&&per<35)
           s="D";
       else
           s="E";
       System.out.println("Toatl marks:"+sum);
       System.out.println("Average percentage:"+per);
       System.out.println("Grade of student :"+s);

    }
    public static void main(String args[])
    {
           gradecalculater();
    }

}
