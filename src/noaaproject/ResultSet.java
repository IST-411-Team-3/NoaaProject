package noaaproject;

/**
 *
 * @author Team 3
 */
public class ResultSet {

    private String offset;
    private String count;
    private String Limit;

    public ResultSet(String offset, String count, String Limit) {
        this.offset = offset;
        this.count = count;
        this.Limit = Limit;
    }

    public ResultSet() {
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getLimit() {
        return Limit;
    }

    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

}
