public class Main {

    public static void main(String[] args)
    {
        int[] in = {1, 2, -2,-4,-5,12,10};

        int n = in.length;

        int[] input = new int[n*n*n];

        for(int i = 0;i<in.length;i++)
        {
            input[i] = in[i];
        }

        int[] results = new int[n*n*n];

        for(int i=n-1;i>=0;i--)
        {
            results[i] = Integer.max(results[i+1], Integer.max(results[i+1]+input[i], results[i+2]+(input[i]*input[i+1])));

        }

        System.out.println("The best score: "+results[0]);
    }
}