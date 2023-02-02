package noaaproject;

/**
 *
 * @author Team 3
 *
 * This is the main set of data for the entire JSON. It contains info on the 11
 * datasets that can be found on the current section of the noaa site.
 *
 * No constructors are necessary for the gson to operate
 */
public class Results {

    //Variable names and types must be exactly the same as they appear in the JSON
    //  Capitolization matters
    private String uid;
    private String mindate;
    private String maxdate;
    private String name;
    private String datacoverage;
    private String id;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getMindate() {
        return mindate;
    }

    public void setMindate(String mindate) {
        this.mindate = mindate;
    }

    public String getMaxdate() {
        return maxdate;
    }

    public void setMaxdate(String maxdate) {
        this.maxdate = maxdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDatacoverage() {
        return datacoverage;
    }

    public void setDatacoverage(String datacoverage) {
        this.datacoverage = datacoverage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
