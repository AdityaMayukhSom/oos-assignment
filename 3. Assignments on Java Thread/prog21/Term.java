class Term implements Runnable {
    Counter ctr;

    Term(Counter ctr) {
        this.ctr = ctr;
    }

    public void run() {
        System.out.println("Term Thread Started.");
        try {
            ctr.createTerm();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
