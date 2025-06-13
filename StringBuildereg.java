public class StringBuildereg {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Vivek");

        sb.append(" Deshmukh");
        System.out.println("1) "+sb);

        sb.insert(6, "D. ");
        System.out.println("2) "+sb);

        sb.delete(6, 9);
        System.out.println("3) "+sb);

        sb.replace(6, 15, "Mane");
        System.out.println("4) "+sb);

        sb.reverse();
        System.out.println("5) "+sb);

        char ch = sb.charAt(0);
        System.out.println("6) "+ch);

        sb.setCharAt(0, 'D');
        System.out.println("7) "+sb);

        int len = sb.length();
        System.out.println("8) length is: "+len);

        String normalString = sb.toString();
        System.out.println("9) "+normalString);
    }
}

