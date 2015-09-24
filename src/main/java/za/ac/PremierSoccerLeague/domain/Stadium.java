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
public class Stadium implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String location;

    private Stadium(){

    }

    public Stadium(Builder builder){
        id = builder.id;
        name = builder.name;
        location = builder.location;
    }

    public Long getId(){
        return id;
    }
    public String getName(){
        return  name;
    }
    public String getLocation(){
        return location;
    }

    public static class Builder{
        private Long id;
        private String name;
        private String location;

        public Builder(String name){
            this.name = name;
        }
        public Builder location(String value){
            this.location = value;
            return this;
        }
        public Builder id(Long value){
            this.id = value;
            return this;
        }

        public Builder copy(Stadium value){
            this.id = value.id;
            this.name = value.name;
            this.location = value.location;
            return this;
        }

        public Stadium build(){
            return new Stadium(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stadium stadium = (Stadium) o;

        return !(id != null ? !id.equals(stadium.id) : stadium.id != null);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
