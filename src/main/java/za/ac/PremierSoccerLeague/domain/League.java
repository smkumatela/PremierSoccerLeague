package za.ac.PremierSoccerLeague.domain;

/**
 * Created by student on 2015/04/18.
 */
//@Entity
/*public class League implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String country;
    @Embedded
    private Broadcaster channel;

    //@OneToMany (cascade = CascadeType.ALL)
    //@JoinColumn(name = "League")
    //private List<Team> teams;

    private League(){

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public Broadcaster getChannel() {
        return channel;
    }

   /* public List<Team> getTeams() {
        return teams;
    }*/

   /* public League(Builder builder){
        this.channel = builder.channel;
        //this.teams = builder.teams;
        this.id = builder.id;
        this.name = builder.name;
        this.country = builder.country;
    }

    public static class Builder {
        private Long id;
        private String name;
        private Broadcaster channel;
        private String country;
        //private List<Team> teams;

        public Builder(String name) {
            this.name = name;
        }

        public Builder id(Long value) {
            this.id = value;
            return this;
        }


        public Builder name(String value) {
            this.name = value;
            return this;
        }

        public Builder channel(Broadcaster value) {
            this.channel = value;
            return this;
        }

        /*public Builder team(List<Team> value) {
            this.teams = value;
            return this;
        }*/

     /*   public Builder country(String value) {
            this.country = value;
            return this;
        }

        public Builder copy(League value) {
            this.channel = value.channel;
            //this.teams = value.teams;
            this.id = value.id;
            this.name = value.name;
            this.country = value.country;
            return this;
        }

        public League build() {
            return new League(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Builder builder = (Builder) o;

            return !(id != null ? !id.equals(builder.id) : builder.id != null);

        }
        @Override
        public int hashCode() {
            return id != null ? id.hashCode() : 0;
        }
    }
}*/
