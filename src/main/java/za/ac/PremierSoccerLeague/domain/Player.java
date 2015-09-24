package za.ac.PremierSoccerLeague.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by student on 2015/04/18.
 */
@Entity
public class Player implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String lastName;
    private String position;
    private int age;
//    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//    @JoinColumn(name = "name_id")
    private String sponsor;


    private Player(){

    }

    public String getLastName(){
        return lastName;
    }
    public String getPosition(){
        return position;
    }
    public int getAge(){
        return age;
    }
    public Long getId(){return id;}
    public String getSponsor(){
        return sponsor;
    }

    public Player(Builder builder) {
        lastName = builder.lastName;
        position = builder.position;
        id = builder.id;
        age = builder.age;
        sponsor = builder.sponsor;
    }

     public static class Builder{
         private String lastName;
         private String position;
         private int age;
         private Long id;
         private String sponsor;

        public Builder(String position){
              this.position = position;
        }
        public Builder lastName(String value){
            this.lastName = value;
            return this;
        }
         public Builder age(int value){
             this.age = value;
             return this;
         }
         public Builder sponsor(String value){
             this.sponsor = value;
             return this;
         }
         public Builder id(Long value){
             this.id = value;
             return this;
         }


         public Builder copy(Player value){
             this.sponsor = value.sponsor;
             this.lastName = value.lastName;
             this.position = value.position;
             this.age = value.age;
             this.id = value.id;
             return this;
         }

         public Player build()
         {
             return new Player(this);
         }
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        return !(id != null ? !id.equals(player.id) : player.id != null);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
