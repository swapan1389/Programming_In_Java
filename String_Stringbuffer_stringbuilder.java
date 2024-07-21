public class String_Stringbuffer_stringbuilder{
    public static void main(String[] args) {
        //Using Normal String
        String str1=new String("Swapan");
        System.out.println(str1);
        str1=str1+" Kumar Shee";
        System.out.println(str1);

        //StringBuffer
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());
        StringBuffer sb1=new StringBuffer("Swapan Kumar Shee");
        System.out.println(sb1.capacity());

        //String Builder
        StringBuilder sb2=new StringBuilder();
        sb2.ensureCapacity(22);
        System.out.println(sb2.capacity());


    }

}