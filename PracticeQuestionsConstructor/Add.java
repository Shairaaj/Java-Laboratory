class Main {
    static int add(int a, int b){ System.out.println("I add  :"); return a+b;}
    static String add(String a, String b){ System.out.println("I add Strings  :"); return a+b;}
    public static void main(String[] args) { 
        int a=5,b=10;
        String s1= "Hello";
        String s2="World";
        System.out.println("Result from add method"+add(a,b) +" End");
        System.out.println(" I add " + (s1+s2) +"  End");
        System.out.println(" I add " + s1+s2 );
        System.out.println(" Result :  " + add(s1,s2)  + "\n\n End" );
    }
} 
