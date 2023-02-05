public class intern {
    public static void main(String args[]){
        String s1=new String("rehman");
        String s2="shaik";
        String s3=s1.intern();
        System.out.println(s1==s2);
        System.out.println(s2==s3);
    }
}
