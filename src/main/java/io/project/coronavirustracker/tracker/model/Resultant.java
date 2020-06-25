package io.project.coronavirustracker.tracker.model;

public class Resultant {
    private String country;
    private int countryDeath;
    private int countryRecovery;
    private int countryConfirm;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCountryDeath() {
        return countryDeath;
    }

    public void setCountryDeath(int countryDeath) {
        this.countryDeath = countryDeath;
    }

    public int getCountryRecovery() {
        return countryRecovery;
    }

    public void setCountryRecovery(int countryRecovery) {
        this.countryRecovery = countryRecovery;
    }

    public int getCountryConfirm() {
        return countryConfirm;
    }

    public void setCountryConfirm(int countryConfirm) {
        this.countryConfirm = countryConfirm;
    }
}
