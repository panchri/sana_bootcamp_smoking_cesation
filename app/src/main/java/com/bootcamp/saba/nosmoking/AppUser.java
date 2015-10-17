package com.bootcamp.saba.nosmoking;

/**
 * Created by Pan on 17/10/2015.
 */
public class AppUser
{
    private String name;

    private int days=0;
    private int longest_streak = 0;
    private double money_saved = 0.00;
    private double time_saved = 0.00;

    private double cig_cost = 0.00;


    public AppUser(String name, double cig_cost)
    {
        this.name = name;
        this.cig_cost = cig_cost;
    }

    public int get_days() {return this.days;}
    public int get_longest_streak(){return this.longest_streak;}
    public double get_money_saved(){return this.money_saved;}
    public double get_time_saved(){return  this.time_saved;}
}
