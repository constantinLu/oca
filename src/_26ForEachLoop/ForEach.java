package ForEachLoop;

public class ForEach {

    static String  namesS;

    public static void main(String[] args) {

        String[] names = {"Jimmy", "Jhon", "Tom", "Anthony"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }

        for (String str : names) {
            System.out.println(str);
        }

        for (String name : names) {
            namesS = name + " " + name;
        }



    // StringBulder
        System.out.println("------------");
    StringBuilder[] sbs = {new StringBuilder("For"), new StringBuilder("Loop")};

    for (StringBuilder sb : sbs) {
        System.out.println(sb);
    }

        for (StringBuilder sb : sbs) {
            sb.append("123");
            System.out.println(sb);
        }



    }
}
