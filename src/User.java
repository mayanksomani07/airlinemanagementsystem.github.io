
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mayan
 */
public class User {
    private String source,destination,name;
    private LocalDate date;
    
    public User(String source, String destination, String name, LocalDate date)
    {
        this.source=source;
        this.destination=destination;
        this.name=name;
        this.date=date;
    }
    public String getSource(){return source;}
    public String getDestination(){return destination;}
    public String getName(){return name;}
    public LocalDate getDate(){return date;}
    public void setSource(String source){this.source=source;}
    public void setDestination(String destination){this.destination=destination;}
    public void setName(String name){this.name=name;}
    public void setDate(LocalDate date){this.date=date;}
}
