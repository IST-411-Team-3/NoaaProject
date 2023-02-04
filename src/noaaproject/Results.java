package noaaproject;

/**
 *
 * @author Team 3
 *
 * This is the main set of data for the entire JSON. It contains info on the
 * eleven data sets that can be found on the current section of the NOAA site.
 *
 * No constructors are necessary for the GSON to operate
 */
public class Results {

    /*
    *Variable names are case sensitive and must be exactly the same as
    *they appear in the JSON
     */
    private String uid;
    private String mindate;
    private String maxdate;
    private String name;
    private String datacoverage;
    private String id;

    /*
    * Gettters & Setters for UID
    */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    /*
    * Gettters & Setters for MINDATE
    */
    public String getMindate() {
        return mindate;
    }

    public void setMindate(String mindate) {
        this.mindate = mindate;
    }
    
    /*
    * Gettters & Setters for MAXDATE
    */
    public String getMaxdate() {
        return maxdate;
    }

    public void setMaxdate(String maxdate) {
        this.maxdate = maxdate;
    }

    /*
    * Gettters & Setters for NAME
    */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
    * Gettters & Setters for DATACOVERAGE
    */
    public String getDatacoverage() {
        return datacoverage;
    }

    public void setDatacoverage(String datacoverage) {
        this.datacoverage = datacoverage;
    }

    /*
    * Gettters & Setters for ID
    */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
