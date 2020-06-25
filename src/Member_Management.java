
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Member_Management extends Trainer
{
    public String name,phno,address;
    private int age;
    public String diet;
    
    private Double batch_time;
    private String gender;
   
    
    LinkedList<Plan> pl=new LinkedList();
    //Scanner sc1=new Scanner(System.in);
    
    public Member_Management()
    {
        
    }
    
    @Override
    public void add_member()
    {
        System.out.println("ENTER NAME:");
        name=sc.nextLine();
        System.out.println("ENTER PHONE.NO:");
        phno=sc.nextLine();
        System.out.println("ENTER YOUR AGE");
        age=sc.nextInt();
        System.out.println("ENTER GENDER");
        sc.nextLine();
        gender=sc.nextLine();
        System.out.println("ENTER ADDRESS DETAILS");
        address=sc.nextLine();
        
        System.out.println("CHOOSE YOUR PLAN \n (*Enter code of Plan which you want to choose)");
        display_plan();
        int ch=sc.nextInt();
        plan_duration=p[ch-1].duration;
        plan_amount=p[ch-1].cost;
        
        sc.nextLine();
        System.out.println("ENTER START DATE");
        start_date=sc.nextLine();
        System.out.println("ENTER End DATE");
        end_date=sc.nextLine();
        
        
        
       // this.Choose_plan();
    }
    @Override
    public void display_member()
    {
        System.out.println("NAME: "+name);
        System.out.println("PHONE NO : "+phno);
        System.out.println("AGE :" +age);
        System.out.println("GENDER : "+gender);
        System.out.println("ADDRESS DETAILS : "+address);
        System.out.println("CURRENT PLAN : "+plan_duration);
        System.out.println("PLAN AMOUNT : "+plan_amount);
        System.out.println("STARTING DATE : "+start_date);
        System.out.println("ENDING DATE : "+end_date);
        System.out.print("BMI : "+bmi);
        System.out.println("   (*BMI:0 Indicate BMI not calculated yet)");
    }
    
    
    
    
}
