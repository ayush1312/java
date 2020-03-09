package DynamicPrograming;

public class DecodingCombination
{

    // A Dynamic Programming based
// function to count decodings
    static int countDecodingDP(char digits[])
    {
        int count[] = new int[digits.length+1];
        count[0]=1;
        count[1]=1;
        for (int i = 2; i<=digits.length;i++){
            count[i]=0;
            if(digits[i-1]>'0'){
                count[i]=count[i-1];
            }
            if(digits[i-2]=='1' || (digits[i-2]=='2' && digits[i-1]<'7')){
                count[i] += count[i-2];
            }
        }
        return count[digits.length];
    }

    // Driver Code
    public static void main (String[] args)
    {
        char digits[] = {'1','7','3','4'};
        int n = digits.length;
        System.out.println("Count is " +
                countDecodingDP(digits));
    }
} 