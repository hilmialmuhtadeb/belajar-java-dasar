public class Array {

    public static void main(String[] args) {

        // first way to create array
        String[] names1 = new String[3];
        names1[0] = "Dzakiya";
        names1[2] = "Ulya";

        // second way to create array
        String[] names2 = new String[]{
                "Hilmi", "Billah"
        };

        // third way to create array
        int[] ages = {
                20, 20
        };

        String greeting = "Hello, my name is " + names1[0] + ". I am " + ages[0] + " years old!";
        String response = "Hi, " + names1[0] + ". nice to know you! I am " + names2[0];

        System.out.println(greeting);
        System.out.println(response);

    }

}
