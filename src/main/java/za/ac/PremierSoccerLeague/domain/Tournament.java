package za.ac.PremierSoccerLeague.domain;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by student on 2015/04/18.
 */
@Entity
public class Tournament implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int numOfTeams;
    private double prize;

    private Tournament() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNumOfTeams() {
        return numOfTeams;
    }

    public double getPrize() {
        return prize;
    }

    public Tournament(Builder builder) {
        id = builder.id;
        name = builder.name;
        numOfTeams = builder.numOfTeams;
        prize = builder.prize;
    }

    public static class Builder {
        private Long id;
        private String name;
        private int numOfTeams;
        private double prize;

        public Builder(String name) {
            this.name = name;
        }

        public Builder id(Long value) {
            this.id = value;
            return this;
        }

        public Builder numOfTeams(int value) {
            this.numOfTeams = value;
            return this;
        }

        public Builder prize(double value) {
            this.prize = value;
            return this;
        }

        public Builder copy(Tournament value){
            this.id = value.id;
            this.name = value.name;
            this.numOfTeams = value.numOfTeams;
            this.prize = value.prize;
            return this;
        }

        public Tournament build(){
            return new Tournament(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tournament that = (Tournament) o;

        return !(id != null ? !id.equals(that.id) : that.id != null);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}