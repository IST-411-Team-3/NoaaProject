package noaaproject;

/**
 *
 * @author Team 3
 * 
 * This class houses the other 2 classes that gson pulls from the JSON
 * 
 * No constructors are needed for the gson to operate
 */
class NoaaData {

    //Name the variable exactly the same way that it is present in the JSON
    //  Even captilization needs to be taken into account
    private Metadata metadata;
    private Results results[];

    public NoaaData(Metadata metaData, Results[] results) {
        this.metadata = metaData;
        this.results = results;
    }

    public Metadata getMetaData() {
        return metadata;
    }

    public void setMetaData(Metadata metaData) {
        this.metadata = metaData;
    }

    public Results[] getResults() {
        return results;
    }

    public void setResults(Results[] results) {
        this.results = results;
    }

}
