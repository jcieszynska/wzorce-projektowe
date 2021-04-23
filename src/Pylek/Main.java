package Pylek;

public class Main {
    public static void main(String[] args) throws Exception {
        int externalData = 42;
        DustFactory dustFactory = new DustFactory();
        dustFactory.getDust("Q").sampleMethod(--externalData);
        dustFactory.getDust("W").sampleMethod(--externalData);
        dustFactory.getDust("E").sampleMethod(--externalData);
        dustFactory.getDust("Q").sampleMethod(--externalData);
        dustFactory.getDust("W").sampleMethod(--externalData);
        dustFactory.getDust("W").sampleMethod(--externalData);
    }
}
