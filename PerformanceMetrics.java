public class PerformanceMetrics {
    public static void measureRuntime(Runnable function) {
        long startTime = System.nanoTime();

        Runtime runtime = Runtime.getRuntime();
        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();

        function.run();

        long endTime = System.nanoTime();

        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();

        long timeTaken = (endTime - startTime) / 1000000;

        long memoryUsed = memoryAfter - memoryBefore;

        System.out.println("Time taken: " + timeTaken + " nanoseconds");
        System.out.println("Memory used: " + memoryUsed + " bytes");
    }
}
