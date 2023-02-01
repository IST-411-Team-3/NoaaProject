package noaaproject;

/**
 *
 * @author Team 3
 */
public class Results {
    private String uid;
    private String minDate;
    private String maxDate;
    private String Name;
    private String dataCoverage;
    private String id;

    public Results(String uid, String minDate, String maxDate, String Name, String dataCoverage, String id) {
        this.uid = uid;
        this.minDate = minDate;
        this.maxDate = maxDate;
        this.Name = Name;
        this.dataCoverage = dataCoverage;
        this.id = id;
    }

    public Results() {
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getMinDate() {
        return minDate;
    }

    public void setMinDate(String minDate) {
        this.minDate = minDate;
    }

    public String getMaxDate() {
        return maxDate;
    }

    public void setMaxDate(String maxDate) {
        this.maxDate = maxDate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDataCoverage() {
        return dataCoverage;
    }

    public void setDataCoverage(String dataCoverage) {
        this.dataCoverage = dataCoverage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
}
