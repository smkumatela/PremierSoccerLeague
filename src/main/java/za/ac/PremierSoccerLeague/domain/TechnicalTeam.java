package za.ac.PremierSoccerLeague.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by student on 2015/04/18.
 */

@Embeddable
public class TechnicalTeam implements Serializable {

    private String name;
    private String coaching;

    private  TechnicalTeam(){}
    public TechnicalTeam (Builder builder){
        name = builder.name;
        coaching = builder.coaching;
    }

    public String getName(){
        return name;
    }

    public String getCoaching(){
        return coaching;
    }

    public static class Builder{
        private String name;
        private String coaching;

        public Builder (String name){
            this.name = name;
        }
        public Builder coaching (String value){
            this.coaching = value;
            return this;
        }
        public Builder id(Long id){
            return  this;
        }


        public Builder copy(TechnicalTeam value){
            this.coaching = value.coaching;
            this.name = value.name;
            return this;
        }

        public TechnicalTeam build(){
            return new TechnicalTeam(this);
        }
    }


}
