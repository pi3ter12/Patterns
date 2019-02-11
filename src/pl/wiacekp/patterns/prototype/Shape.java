package pl.wiacekp.patterns.prototype;

public abstract class Shape implements Cloneable {
    private String key;
    protected String type;

    public abstract void draw();

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getType() {
        return type;
    }

    @Override
    protected Object clone() {
        Object result = null;

        try {
            result = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return result;
    }
}
