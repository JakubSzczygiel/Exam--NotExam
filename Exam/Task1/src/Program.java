public class Program {

    public static void main(String[] args) {
    int[] intArray={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
        System.out.println("we have " + returnNumberOfEvenNumbers(intArray) + " even numbers");
        System.out.println("we have " + ((intArray.length)-returnNumberOfEvenNumbers(intArray))+ " odd numbers");

    }

    public static int returnNumberOfEvenNumbers(int[] intArray)
    {
        int numberOfEvenNumbers=0;
        for (int i=0;i<intArray.length;i++)
        {
            if(intArray[i]%2==0)
            {
                numberOfEvenNumbers++;
            }
        }
        return numberOfEvenNumbers;
    }
}
