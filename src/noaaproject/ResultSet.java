package noaaproject;

/**
 *
 * @author Team 3
 */
public class ResultSet {

    private int offset;
    private int count;
    private int limit;

    public ResultSet(int offset, int count, int Limit) {
        this.offset = offset;
        this.count = count;
        this.limit = Limit;
    }

    public ResultSet() {
    }

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
