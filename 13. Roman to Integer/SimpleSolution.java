// Time complexity : 0(n)
// Space : 0(1)

class SimpleSolution {
    public int romanToInt(String s) {
        // Initialize a HashMap to store the Roman numeral characters and their
        // corresponding values
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        // Replace specific substrings in the input to handle subtraction
        s = s.replace("IV", "IIII");
        s = s.replace("IX", "VIIII");
        s = s.replace("XL", "XXXX");
        s = s.replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC");
        s = s.replace("CM", "DCCCC");

        // Iterate over each character in the modified string
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum = sum + map.get(c);
        }
        return sum;
    }
}
