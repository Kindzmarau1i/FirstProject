import java.util.List;


public class ApiTests {
    @Test
    public void test() {
        List<String> myList = List.of("aaabccc", "abaaa", "ccccccccccc", "bbbb");

        String maxText = "";
        int max = 0;
        int minCount = 1000;
        for (String s : myList) {
            int a = 0;
            int b = 0;
            int c = 0;
            int total = 0;
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                char d = s.charAt(i);
                if (d == 'a') {
                    a += 1;
                    count += 1;
                }
                if (d == 'b') {
                    b += 1;
                    count += 1;
                }
                if (d == 'c') {
                    c += 1;
                    count += 1;
                }
                total = a * 3 + b * 2 + c;
            }
            if (total >= max) {
                max = total;
                if (count < minCount) {
                    minCount = count;
                    maxText = s;
                }
            }

        }
        System.out.println(maxText);
    }
}
