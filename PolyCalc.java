public class PolyCalc {
    
    private int[] nums;
    private int divisor;
    
    public PolyCalc(){
        nums = {1, 2, 1};
    }
    public PolyCalc(int a, int b, int c){
        nums = {a, b, c};
    }
    
    public int getDivisor() {
        if (divisor != 0) return divisor;
        updateDivisor();
        return getDivisor();
    }
    public int getA() {
        return nums[0]/(divisor==0? 1 : divisor);
    }
    public int getB() {
        return nums[1]/(divisor==0? 1 : divisor);
    }
    public int getC() {
        return nums[2]/(divisor==0? 1 : divisor);
    }
    
    public int setA(int num) {
        int temp = nums[0];
        nums[0] = num;
        updateDivisor();
        return temp;
    }
    public int setB(int num) {
        int temp = nums[1];
        nums[1] = num;
        updateDivisor();
        return temp;
    }
    public int setC(int num) {
        int temp = nums[2];
        nums[2] = num;
        updateDivisor();
        return temp;
    }
    
    private int updateDivisor() {
        if (a<2) {
            divisor = 1;
            return divisor;
        }
        int i = 2;
        for(i; i <= a && !(a%i==0 && b%i==0 && c%i==0); i++) {
            System.out.println("Trying " + i)
        }
        divisor = i;
        return divisor;
    }
    
    public static void main(String args[]) {
        PolyCalc test = new PolyCalc();
        PolyCalc tes2 = new PolyCalc();
    }
}
