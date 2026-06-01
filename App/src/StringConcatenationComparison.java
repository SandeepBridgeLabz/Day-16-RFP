public class StringConcatenationComparison {

    public static void main(String[] args) {

        int iterations = 100000;

        long start;
        long end;

        start = System.nanoTime();

        String str = "";

        for (int i = 0; i < iterations; i++) {
            str += "A";
        }

        end = System.nanoTime();

        System.out.println("String: " +
                (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < iterations; i++) {
            sb.append("A");
        }

        end = System.nanoTime();

        System.out.println("StringBuilder: " +
                (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();

        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < iterations; i++) {
            buffer.append("A");
        }

        end = System.nanoTime();

        System.out.println("StringBuffer: " +
                (end - start) / 1_000_000.0 + " ms");
    }
}