package noaaproject;

/**
 *
 * @author Team 3
 *
 * This is the resultset that the metadata class contains
 *
 * No constructors are necessary for the gson to operate
 */
public class ResultSet {

    //Name the variable exactly the same way that it is present in the JSON
    //  Even captilization needs to be taken into account
    private int offset;
    private int count;
    private int limit;

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int Limit) {
        this.limit = Limit;
    }

}
