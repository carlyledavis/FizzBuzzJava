public class FizzBuzz {
    
    public String run(int[] numbers) {
        return "";
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int[] numbers = new int[100];
        
        String fizzBuzzedNumbers = fizzBuzz.run(numbers);
        System.out.println(fizzBuzzedNumbers);
    }
}