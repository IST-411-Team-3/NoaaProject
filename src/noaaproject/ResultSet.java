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

    /*
    * Gettters & Setters for offset
    */
    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    /*
    * Gettters & Setters for count
    */
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    /*
    * Gettters & Setters for limit
    */
    public int getLimit() {
        return limit;
    }

    public void setLimit(int Limit) {
        this.limit = Limit;
    }

}
