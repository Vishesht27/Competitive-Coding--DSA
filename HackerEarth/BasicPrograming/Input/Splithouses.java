Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    String s = sc.next();
System.out.println(s.indexOf("HH") != -1 ? "NO" : "YES\n" +   s.replace('.', 'B'));
