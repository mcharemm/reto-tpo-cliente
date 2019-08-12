package pe.promart.model;

public class Statistics {

    Double averageAge;
    Double standardDeviation;

    public Statistics(Double averageAge, Double standardDeviation) {
        this.averageAge = averageAge;
        this.standardDeviation = standardDeviation;
    }

    public Double getAverageAge() {
        return averageAge;
    }

    public void setAverageAge(Double averageAge) {
        this.averageAge = averageAge;
    }

    public Double getStandardDeviation() {
        return standardDeviation;
    }

    public void setStandardDeviation(Double standardDeviation) {
        this.standardDeviation = standardDeviation;
    }
}

