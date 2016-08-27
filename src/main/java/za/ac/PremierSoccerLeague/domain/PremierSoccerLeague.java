package za.ac.PremierSoccerLeague.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by student on 2015/04/18.
 */
@Entity
public class PremierSoccerLeague implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String LeagueName;
    @Column(unique = true)
    private String abbreviation;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "stadiumsID")
    private List<Stadium> stadiums;

    private PremierSoccerLeague(){

    }

    public PremierSoccerLeague(Builder builder){
        id = builder.id;
        LeagueName = builder.Leaguename;
        abbreviation = builder.abbreviation;
        stadiums = builder.stadiums;
    }

    public Long getId(){
        return id;
    }
    public String getLeagueName(){
        return LeagueName;
    }
    public String getAbbreviation(){
        return abbreviation;
    }
    public List<Stadium> getStadiums(){
        return stadiums;
    }

    public static class Builder{
        private String Leaguename;
        private String abbreviation;
        private Long id;
        private List<Stadium> stadiums;

        public Builder(String abbreviation){
            this.abbreviation = abbreviation;
        }

        public Builder Leaguename(String value){
            this.Leaguename = value;
            return this;
        }

        public Builder id(Long value){
            this.id = value;
            return this;
        }

        public Builder stadiums(List<Stadium> value){
            this.stadiums = value;
            return this;
        }

        public Builder copy(PremierSoccerLeague value){
            this.Leaguename = value.LeagueName;
            this.abbreviation = value.abbreviation;
            this.id = value.id;
            this.stadiums = value.getStadiums();
            return this;
        }

        public PremierSoccerLeague build(){
            return new PremierSoccerLeague(this);
        }


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PremierSoccerLeague that = (PremierSoccerLeague) o;

        return !(id != null ? !id.equals(that.id) : that.id != null);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
