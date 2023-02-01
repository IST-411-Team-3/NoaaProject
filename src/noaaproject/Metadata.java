package noaaproject;

/**
 *
 * @author Team 3
 */
public class Metadata {

    private ResultSet resultset;

    public Metadata(ResultSet resultset) {
        this.resultset = resultset;
    }

    public ResultSet getResultset() {
        return resultset;
    }

    public void setResultset(ResultSet resultset) {
        this.resultset = resultset;
    }

}
