package za.ac.PremierSoccerLeague.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by student on 2015/04/18.
 */
@Entity
public class Sponsor implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String sponsors;

    private Sponsor(){

    }

    public Sponsor(Builder builder) {
        name = builder.name;
        sponsors = builder.sponsors;
       // players = builder.players;
        id = builder.id;
    }

    public String getName(){
        return name;
    }
    public String getSponsors(){
        return sponsors;
    }
   /* public List<Player> getPlayers()
    {
        return players;
    }*/
    public Long getId(){return id;}

    public static class Builder{
        private String name;
        private String sponsors;
        //private List<Player> players;
        private Long id;

        public Builder(String value){
            this.name = value;
        }

        public Builder sponsors(String value){
            this.sponsors = value;
            return this;
        }
     /*   public Builder players(List<Player> value){
            this.players = value;
            return this;
        }*/
        public Builder id(Long value){
            this.id = value;
            return this;
        }

        public Builder copy(Sponsor value){
           // this.players = value.players;
            this.id = value.id;
            this.name = value.name;
            this.sponsors = value.sponsors;
            return this;
        }

        public Sponsor build(){
            return new Sponsor(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sponsor sponsor = (Sponsor) o;

        return !(id != null ? !id.equals(sponsor.id) : sponsor.id != null);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
