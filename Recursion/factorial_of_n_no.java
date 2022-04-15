static int fact(int i) 
{
        if (i == 1) 
        {

            return 1;
        }
        return i * fact(i - 1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(fact(n));
    }
}
