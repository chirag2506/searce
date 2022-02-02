class RabinKarpAlgorithm{
    public static void main(String[] args) {
        String txt = "WDHDEABGHJYABFRABAB";
        String pat = "AB";
        int q = 101;
        search(pat, txt, q);
    }

    public final static int d = 256;

    public static void search(String pat, String txt, int q){
        int M = pat.length();
        int N = txt.length();
        int i, j;
        int p = 0; // hash value for pattern
        int t = 0; // hash value for txt
        int h = 1;
     
        // the value of h would be "pow(d, M-1)%q"
        for (i = 0; i < M-1; i++)
            h = (h*d)%q;
     
        // calculate the hash value of pattern and first window of text
        for (i = 0; i < M; i++)
        {
            p = (d*p + pat.charAt(i))%q;
            t = (d*t + txt.charAt(i))%q;
        }
     
        // slide the pattern over text one by one
        for (i = 0; i <= N - M; i++)
        {
     
            if (p == t)
            {
                // checking for characters one by one
                for (j = 0; j < M; j++)
                {
                    if (txt.charAt(i+j) != pat.charAt(j))
                        break;
                }
     
                if (j == M)
                    System.out.println(i);
            }

            if (i < N-M)
            {
                t = (d*(t - txt.charAt(i)*h) + txt.charAt(i+M))%q;
     
                // if negative value, convert to positive
                if (t < 0){
                    t = (t + q);
                }
            }
        }
    }
}