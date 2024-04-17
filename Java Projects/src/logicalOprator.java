public class logicalOprator {
    public static void main(String[] args) {

        int num = 2;

        // LOGICAL OR
        boolean chuchu = (num < 1 || num < 3); // if one statement is true the output is true

        // LOGICAL AND
        System.out.println(num > 1 && num > 3); /*
                                                 * if one statement is false the output is false
                                                 * the only way you can get true is if 2 statement is true
                                                 */

        // LOGICAL NOT
        System.out.println(!(num > 1 && num > 3)); // reverse output

    }

}
