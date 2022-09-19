package BackjunCoding;

class Test15596 {
    public static long sum(int[] a) {
        long result = 0;
        for(int i =0; i<=a.length-1; i++) {
            result += a[i];

        }
        System.out.println(result);
        return result;
    }
}

