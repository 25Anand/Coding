 //METHOD 1: PARAMETERISED 
      static int sum1(int i, int sum1)
      {
        if (i < 1) 
      {
          return sum1;
      }
        return sum1(i - 1, sum1 + i);
      }
      
      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      sc.close();
      System.out.println(sum1(n, 0));
      }
     

    // METHOD 2: FUNCTIONAL
    static int sum1(int i) 
    {
        if (i == 0) 
        {
          return 0;
        }
        return i + sum1(i - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(sum1(n));
    }
}
