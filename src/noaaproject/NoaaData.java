package noaaproject;

/**
 *
 * @author Team 3
 */
class NoaaData {

    private Metadata metaData;
    private Results results[];

    public NoaaData(Metadata metaData, Results[] results) {
        this.metaData = metaData;
        this.results = results;
    }


    public NoaaData() {
    }

    public Metadata getMetaData() {
        return metaData;
    }

    public void setMetaData(Metadata metaData) {
        this.metaData = metaData;
    }

    public Results[] getResults() {
        return results;
    }

    public void setResults(Results[] results) {
        this.results = results;
    }



}
