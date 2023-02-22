
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mayan
 */
public class Flight {
    private String source,destination;
    private int price;
    private LocalDate date;
    
    public Flight(String source, String destination, int price, LocalDate date)
    {
        this.source=source;
        this.destination=destination;
        this.price=price;
        this.date=date;
    }
    public String getSource(){return source;}
    public String getDestination(){return destination;}
    public int getPrice(){return price;}
    public LocalDate getDate(){return date;}
    public void setSource(String source){this.source=source;}
    public void setDestination(String destination){this.destination=destination;}
    public void setPrice(int price){this.price=price;}
    public void setDate(LocalDate date){this.date=date;}
}
