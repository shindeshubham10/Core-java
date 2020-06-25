/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Trainer extends Administrator
{
    
    private double weight,height;
    public double bmi;
    
    public void calculate_bmi()
    {
        System.out.println("ENTER HEIGHT(In meter)");
        height=sc.nextDouble();
        System.out.println("ENTER WEIGHT(In KG)");
        weight=sc.nextDouble();
        bmi=weight/(height*height);
        System.out.println("BMI IS: "+bmi);
    }
    public void suggest_diet(double bmi)
    {
        if(bmi==0)
        System.out.println("BMI is not calculated yet can't suggest plan ,First calculate BMI");
        
        else
        {
            if(bmi>18 && bmi<25)
            System.out.println("GOOD BMI Suggest Customer TO CONTINUE HIS REGULAR DIET PLAN");
        
            else if(bmi>0 && bmi<18)
            System.out.println("UNDERWEIGHT \nGIVE FOLLOWING DIET\n Milk\n" +"Rice\n" + "Nuts and Nut Butters\n" +
                                                                "Red Meats\n" +
                                                                "Potatoes and Starches\n" +
                                                                "Salmon and Oily Fish\n" +
                                                                "Protein Supplements");
            else if(bmi>25)
            System.out.println("\nOVERWEIGHT \nGIVE FOLLOWING DIET\nWhole grains (whole wheat, steel cut oats, brown rice, quinoa)\n" +
                                    "Vegetables (a colorful variety-not potatoes)\n" +
                                    "Whole fruits (not fruit juices)\n" +
                                    "Nuts, seeds, beans, and other healthful sources of protein (fish and poultry)\n" +
                                    "Plant oils (olive and other vegetable oils)");
        }
        
    }
}
