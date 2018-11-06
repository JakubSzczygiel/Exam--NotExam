public class Program {
    public static void main(String[] args) {
        String[] stringArray={"a","b"};
        int nTimes=5;
        stringArray=duplicateStringArray(stringArray, nTimes);

        for (int i=0;i<stringArray.length;i++)
        {
            System.out.print(stringArray[i].toString() + " ");
        }

    }

    public static String[] duplicateStringArray(String[] stringArray,int nTimes)
    {
        int numberOfIterations=0;
        String[] tempStringArray= new String[stringArray.length*nTimes];

        for (int i=0;i<stringArray.length;i++)
        {
                for(int j=0;j<nTimes;j++) {
                    tempStringArray[i + j + numberOfIterations] = stringArray[i];
                }
                numberOfIterations+=(nTimes-1);
        }
        return tempStringArray;
    }


}
