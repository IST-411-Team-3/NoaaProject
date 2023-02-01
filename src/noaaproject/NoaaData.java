package noaaproject;

/**
 *
 * @author Team 3
 */
class NoaaData {

    private Metadata metadata;
    private Results results[];

    public NoaaData(Metadata metaData, Results[] results) {
        this.metadata = metaData;
        this.results = results;
    }


    public NoaaData() {
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
