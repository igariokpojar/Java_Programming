package day30_inheritance.Sport;

public class Sport {

    private String name, rules;
    private int numberOfPlayers, numberOfReferee;

    public Sport(String name, String rules, int numberOfPlayers, int numberOfReferee) {
        setName(name);
        setRules(rules);
        setNumberOfPlayers(numberOfPlayers);
        setNumberOfReferee(numberOfReferee);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        if(numberOfPlayers <= 0){
            System.err.println("Invalid number for players " + numberOfPlayers);
            System.exit(1);
        }
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfReferee() {
        return numberOfReferee;
    }

    public void setNumberOfReferee(int numberOfReferee) {
        if(numberOfReferee <= 0){
            System.err.println("Invalid number for referees " + numberOfReferee);
            System.exit(1);
        }
    }

    public void play(){
        System.out.println("Everyone is playing " + name);
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferee=" + numberOfReferee +
                '}';
    }

}
/*
Create a class named Sport
			variables:
				name, numberOfPlayers, numberOfReferred, rules

			Encapsulate all the fields
					Conditions:
						1. numberOfPlayers can not be set to zero or negative
						2. numberOfReferred can not be set to zero or negative

			Add a constructor that can set all the fields

			methods:
				play()
				toString()

 */