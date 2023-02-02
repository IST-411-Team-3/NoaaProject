package noaaproject;

/**
 *
 * @author Team 3
 */
class NoaaData {

    private Results results[];

    public NoaaData(Results[] results) {

        this.results = results;
    }


    public NoaaData() {
    }

    public Results[] getResults() {
        return results;
    }

    public void setResults(Results[] results) {
        this.results = results;
    }



}
