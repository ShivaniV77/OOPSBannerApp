public class OOPSBannerApp {

    public static void main(String[] args) {

        String[][] letters = {
                createO(),
                createO(),
                createP(),
                createS()
        };

        for (int i = 0; i < 7; i++) {
            String line = "";

            for (String[] letter : letters) {
                line += letter[i] + "  ";
            }

            System.out.println(line);
        }
    }

    // Method to create O
    public static String[] createO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Method to create P
    public static String[] createP() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Method to create S
    public static String[] createS() {
        return new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };
    }
}