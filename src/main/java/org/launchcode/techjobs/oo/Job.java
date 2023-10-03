package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }



    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job job)) return false;
        return getId() == job.getId() && Objects.equals(getName(), job.getName()) && Objects.equals(getEmployer(), job.getEmployer()) && Objects.equals(getLocation(), job.getLocation()) && Objects.equals(getPositionType(), job.getPositionType()) && Objects.equals(getCoreCompetency(), job.getCoreCompetency());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    // Getters:
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Employer getEmployer() {
        return employer;
    }
    public Location getLocation() {
        return location;
    }
    public PositionType getPositionType() {
        return positionType;
    }
    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }
    // Setters:
    public void setName(String name) {
        this.name = name;
    }
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }
    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String defaultOutput = "Data not available.";
        StringBuilder result = new StringBuilder();

        // ID
        result.append(System.lineSeparator() + "ID: " + getId() + System.lineSeparator());

        // job name
        String tempOutput = this.getName();
        if (tempOutput == null || tempOutput.isEmpty()) {
            tempOutput = defaultOutput;
        }
        result.append("Name: " + tempOutput + System.lineSeparator());

        // employer
        tempOutput = "";
        Employer employer = this.getEmployer();
        if (employer != null) {
            tempOutput = employer.getValue();
        }
        if (tempOutput == null || tempOutput.isEmpty()) {
            tempOutput = defaultOutput;
        }
        result.append("Employer: " + tempOutput + System.lineSeparator());

        // location
        tempOutput = "";
        Location location = this.getLocation();
        if (location != null) {
            tempOutput = location.getValue();
        }
        if (tempOutput == null || tempOutput.isEmpty()) {
            tempOutput = defaultOutput;
        }
        result.append("Location: " + tempOutput + System.lineSeparator());

        // position type
        tempOutput = "";
        PositionType pt = this.getPositionType();
        if (pt != null){
            tempOutput = pt.getValue();
        }
        if (tempOutput == null || tempOutput.isEmpty()){
            tempOutput = defaultOutput;
        }
        result.append("Position Type: " + tempOutput + System.lineSeparator());

        // core competency
        tempOutput = "";
        CoreCompetency cc = this.getCoreCompetency();
        if (cc != null){
            tempOutput = cc.getValue();
        }
        if (tempOutput == null || tempOutput.isEmpty()){
            tempOutput = defaultOutput;
        }
        result.append("Core Competency: " + tempOutput);
        result.append(System.lineSeparator());

        return result.toString();
    }
}
