package noaaproject;

/**
 *
 * @author Team 3
 *
 * This is the result set that the metadata class contains
 *
 * No constructors are necessary for the GSON to operate
 */
public class ResultSet {

    /*
    *Variable names are case sensitive and must be exactly the same as
    *they appear in the JSON
     */
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
