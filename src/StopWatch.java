public class StopWatch {

    private double startTime, endTime;

    public StopWatch() {}

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }
//
//    public double getStartTime() {
//        return startTime;
//    }
//
//    public double getEndTime() {
//        return endTime;
//    }

    public double getElapsedTime() {
        return (endTime - startTime);
    }
}
