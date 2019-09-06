public class Node {
    private int id;
    private String name;
    private String message;
    private int fatherNode;
    private int level;
    private boolean isLeaf;

    public Node() {
    }

    public Node(int id, String name, String message, int fatherNode, int level, boolean isLeaf) {
        this.id = id;
        this.name = name;
        this.message = message;
        this.fatherNode = fatherNode;
        this.level = level;
        this.isLeaf = isLeaf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getFatherNode() {
        return fatherNode;
    }

    public void setFatherNode(int fatherNode) {
        this.fatherNode = fatherNode;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean getIsLeaf() {
        return isLeaf;
    }

    public void setLeaf(boolean leaf) {
        isLeaf = leaf;
    }
}
