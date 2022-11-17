package day32_finalKeyword.stateTask;

public class State {

    private String name, abbreviation, politicalParty, governor, senator;
    private double population, stateTax;

    public State(String name, String abbreviation, String politicalParty, String governor, String senator, double population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty() || name == null){
            System.err.println("Invalid name " + name);
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if(abbreviation.isEmpty() || abbreviation == null){
            System.err.println("Invalid abbreviation " + abbreviation);
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if(politicalParty.isEmpty() || politicalParty == null){
            System.err.println("Invalid name for the Political Party " + politicalParty);
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if(governor.isEmpty() || governor == null){
            System.err.println("Invalid name for governor" + name);
            System.exit(1);
        }
        this.governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if(senator.isEmpty() || senator == null){
            System.err.println("Invalid name for senator" + senator);
            System.exit(1);
        }
        this.senator = senator;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        if(population <= 0){
            System.err.println("Invalid number for population " + population);
            System.exit(1);
        }
        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if(stateTax < 0){
            System.err.println("Invalid tax rate " + stateTax);
            System.exit(1);
        }
        this.stateTax = stateTax;
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}
/*
StatesTask:
    1. Create a class named States:
            variables:
                name, abbreviation, politicalParty, Governor, senator, population, stateTax
            Encapsulate all the fields
            Add a constructor that can set all the fields
                        Conditions:
                            1. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
                            2. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
                            3. taxRate can not be negative
                            4. Population can not be zero or negative
 */