package noaaproject;

/**
 *
 * @author Team 3
 *
 * This class houses the other 2 classes that GSON pulls from the JSON
 *
 * No constructors are needed for the GSON to operate
 */
class NoaaData {

    /*
    *Variable names are case sensitive and must be exactly the same as
    *they appear in the JSON
     */
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
