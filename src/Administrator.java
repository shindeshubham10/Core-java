
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Administrator 
{
    String start_date,end_date,plan_duration;
     int plan_amount;
     Double batch_time;
     
     static Plan p[]=new Plan[20];
     static int cnt=0;
     
     static Scanner sc1=new Scanner(System.in);
     static String new_duration;
     static int new_cost;
     
     
     
    public static void initialize()
    {
            for(int i=0;i<4;i++)
            {
                Plan np=new Plan();
                p[i]=np;
            }
           
            p[0].duration="YEARLY";
           p[0].cost=5500;
           p[1].duration="6 MONTHS";
           p[1].cost=2800;
           p[2].duration="3 MONTHS";
           p[2].cost=1400;
           p[3].duration="PER MONTH";
           p[3].cost=500; 
           /*Plan np1=new Plan();
           np1.duration="YEARLY";
           np1.cost=5500;
           p[0]=np1;
           Plan np2=new Plan();
           np2.duration="6 MONTHS";
           np1.cost=2800;
           p[1]=np1;
           Plan np3=new Plan();
           np3.duration="3 MONTHS";
           np3.cost=1400;
           p[2]=np3;
           Plan np4=new Plan();
           np4.duration="PER MONTH";
           np4.cost=500;
           p[3]=np4;
                   */
    }
    
    Scanner sc=new Scanner(System.in);
    
    public void add_member()
    {
    }
    public void display_member()
    {
    }
    
    
    
    
    
    public static void modify_plan()
    {
        int flag=0;
        System.out.println("ENTER PLAN NAME TO MODIFY");
        display_plan();
        sc1.nextLine();
        String key=sc1.nextLine();
        
        for(int i=0;i<cnt;i++)
        {
            if(key.equals(p[i].duration))
            {
                flag=1;
                System.out.println("PLAN FOUND");
                System.out.println("ENTER NEW DURATION ");
               String new_duration1=sc1.nextLine();
                System.out.println("ENTER NEW COST OF PLAN ");
                int new_cost1=sc1.nextInt();
                p[i].cost=new_cost1;
                p[i].duration=new_duration1;
            }
        }
        if(flag==0)
        {
            System.out.println("PLAN NOT FOUND");
        }
    }
    public static void add_plan()
    {
        
        //System.out.println("ENTER NEW PLAN ");
        sc1.nextLine();
        System.out.println("ENTER DURATION OF  PLAN(eg. yearly)");
        new_duration=sc1.nextLine();
        System.out.println("ENTER COST OF PLAN");
        new_cost=sc1.nextInt();
        
        
        
        Plan nn=new Plan();
        
        nn.duration=new_duration;
        nn.cost=new_cost;
        
        p[cnt]=nn;
        
        cnt++;
        
    }
    public static void display_plan()
    {
        if(cnt==0)
        {
            System.out.println("NO PLAN ADDED YET , FIRST ADD THE PLAN");
        }
        else
        {
            System.out.println("code\t\tDuration      Cost");
            for(int i=0;i<cnt;i++)
            {              
                if(p[i].flag!=0)
                {
                    System.out.println(i+1+"\t\t"+p[i].duration+"      "+p[i].cost);
                }
            }
        }
    }
    public static void remove_plan()
    {
        int flag=0;
        System.out.println("ENTER PLAN NAME TO REMOVE");
        display_plan();
        sc1.nextLine();
        String key=sc1.nextLine();
        
        for(int i=0;i<cnt;i++)
        {
            if(key.equals(p[i].duration))
            {
                flag=1;
                System.out.println("PLAN REMOVED");
                p[i].flag=0;
            }
        }
        if(flag==0)
        {
            System.out.println("PLAN NOT FOUND");
        }
    }
    
    
}
