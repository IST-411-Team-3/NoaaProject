package noaaproject;

/**
 *
 * @author Team 3
 */
public class ResultSet {

    private int offset;
    private int count;
    private int Limit;

    public ResultSet(int offset, int count, int Limit) {
        this.offset = offset;
        this.count = count;
        this.Limit = Limit;
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
        return Limit;
    }

    public void setLimit(int Limit) {
        this.Limit = Limit;
    }


}
