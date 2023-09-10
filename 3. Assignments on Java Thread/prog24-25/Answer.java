public class Answer {
    private int pos;
    private long threadId;

    Answer() {
        this.pos = -1;
    }

    public int getPos() {
        return this.pos;
    }

    public long getThreadId() {
        return this.threadId;
    }

    synchronized public void found(int pos) {
        this.pos = pos;
        this.threadId = Thread.currentThread().getId();
    }
}
