package noaaproject;

/**
 *
 * @author Team 3
 *
 * The metadata class houses the resultset that has info on the bulk of the data
 *  that is found in the results class
 * 
 * No constructors are necessary for the gson to operate
 */
public class Metadata {

    private ResultSet resultset;

    public ResultSet getResultset() {
        return resultset;
    }

    public void setResultset(ResultSet resultset) {
        this.resultset = resultset;
    }

}
