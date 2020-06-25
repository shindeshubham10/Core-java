
import java.util.Scanner;



public class Main 
{
    public static void main(String a[])
    {
        int ch,ch1,ch2;
        int members=0;
        Scanner sc=new Scanner(System.in);
        Member_Management m[]=new Member_Management[20];
        Trainer t=new Trainer();
        //Administrator ad=new Administrator();
        
        //Administrator.initialize();
        do
        {
            System.out.println("\n***CHOOSE TOUR ROLE***\n1.ADMINISTRATOR\n2.TRAINER\n3.EXIT\nENTER YOUR CHOICE: ");
        
            ch1=sc.nextInt();
                if(ch1==1)
                {
                    do
                    {
                        System.out.println("\n***Administrator***\n1.ADD MEMBER\n2.DISPLAY PLAN\n3.DISPLAY Member\n4.ADD PLAN\n5.MODIFY PLAN\n6.REMOVE PLAN\n7.EXIT");
                        ch=sc.nextInt();
                        switch(ch)
                        {
                            case 1:
                                    Member_Management n=new Member_Management();
                                    n.add_member();

                                    m[members]=n;
                                    members++;
                                    break;
                            case 2:
                                    Administrator.display_plan();
                                    break;
                            case 3:

                                    for(int j=0;j<members;j++)
                                    {
                                        m[j].display_member();
                                        System.out.println("----------------------\n");
                                        
                                    }
                                    break;
                            case 4:
                                    System.out.println("How many plan do you want to add");
                                    int x=sc.nextInt();
                                    for(int i=0;i<x;i++)
                                    {
                                        
                                        Administrator.add_plan();
                                        System.out.println("--------");
                                    }
                                    break;
                            case 5:
                                    Administrator.modify_plan();
                                    break;
                                
                            case 6:
                                    Administrator.remove_plan();
                                    break;

                        }
                     }while(ch!=7);
                }
                else if(ch1==2)
                {
                    do
                    {
                        System.out.println("\n***TRAINER****\n\n1.CALCULATE BMI\n2.SUGGEST DIET PLAN\n3.EXIT");
                        ch2=sc.nextInt();
                       switch(ch2)
                       {
                           case 1:
                                    sc.nextLine();
                                    System.out.println("ENTER NAME OF CUSTOMER");
                                    String key=sc.nextLine();
                                    int flag2=0;
                                    for(int i=0;i<members;i++)
                                    {
                                        if(key.equals(m[i].name))
                                        {
                                            flag2=1;
                                            m[i].calculate_bmi();
                                        }

                                    }
                                    if(flag2==0)
                                    System.out.println("DATA NOT FOUND");
                                    break;
                           case 2:
                                    sc.nextLine();
                                    System.out.println("ENTER NAME OF CUSTOMER");
                                    key=sc.nextLine();
                                    int flag1=0;
                                      for(int i=0;i<members;i++)
                                    {
                                        if(key.equals(m[i].name))
                                        {
                                            flag1=1;
                                            double b=m[i].bmi;
                                            t.suggest_diet(b);
                                        }

                                    }
                                    if(flag1==0)
                                    System.out.println("DATA NOT FOUND");
                                    break;
                       }
                    }while(ch2!=3);
                }
                else
                System.out.println("INVALID INPUT");
            

        }while(ch1!=3);     
    }
}