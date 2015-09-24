package za.ac.PremierSoccerLeague.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by student on 2015/04/18.
 */
@Entity
public class Team implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String teamName;
    private String location;
    @Embedded
    private Broadcaster channel;
    @Embedded
    private TechnicalTeam coach;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "team_Id")
    private List<Player> players;

    private Team(){

    }

    public Long getId(){
        return id;
    }
    public String getTeamName(){
        return teamName;
    }
    public String getLocation(){
        return location;
    }
    public Broadcaster getChannel(){
        return channel;
    }
    public TechnicalTeam getCoach(){return coach;}
    public List<Player> getPlayers(){
        return players;
    }

    public Team(Builder builder){
        this.channel = builder.channel;
        this.id = builder.id;
        this.players = builder.players;
        this.teamName = builder.teamName;
        this.location = builder.location;
        this.coach = builder.coach;
    }

    public static class Builder{
        private Long id;
        private String teamName;
        private String location;
        private Broadcaster channel;
        private TechnicalTeam coach;
        private List<Player> players;

        public Builder(String name)
        {
            this.teamName = name;
        }
        public Builder id(Long value){
            this.id = value;
            return this;
        }
        public Builder channel(Broadcaster value){
            this.channel = value;
            return this;
        }
        public Builder coach(TechnicalTeam value){
            this.coach = value;
            return this;
        }
        public Builder players(List<Player> value){
            this.players = value;
            return this;
        }
        public Builder location(String value){
            this.location = value;
            return this;
        }

        public Builder copy(Team value){
            this.channel = value.channel;
            this.players = value.players;
            this.id = value.id;
            this.teamName = value.teamName;
            this.coach = value.coach;
            this.location = value.location;
            return this;
        }

        public Team build() {
            return new Team(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Team team = (Team) o;

        return !(id != null ? !id.equals(team.id) : team.id != null);

    }

    @Override
    public int hashCode()
    {
        return id != null ? id.hashCode() : 0;
    }
}
