import java.util.Scanner;

/**
 * This is a class that prints customer input message for shop.
 *
 * @author Laura Yang
 */


public class PrintShop {

    /** Integer for the lower width bound. */
    public static final int WIDTH_LOW_BOUND = 15;

    /** Integer for the higher width bound. */
    public static final int WIDTH_TOP_BOUND = 55;

    /** Integer that the address width should minus to
     * in order to get the intended visual effects. */
    public static final int ADDRESS_WIDTH_MINUS = 5;


    /**
     * Starts the program.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String selectOption = "";
        int width = 0;
        int exit = 0;

        while(exit == 0) {
            System.out.println();
            System.out.println("Print Shop - Please choose an option.");
            System.out.println();
            System.out.println("A - Address Label");
            System.out.println("T - Event Ticket");
            System.out.println("Q - Quit");
            System.out.println();

            System.out.print("Option: ");
            selectOption = scan.next();
            selectOption = selectOption.toLowerCase();

            if (!selectOption.equals("a") && !selectOption.equals("t")
                    && !selectOption.equals("q")) {
                System.out.println("Invalid option");
                continue;
            }

            else if (selectOption.equals("a")) {
                String name = "";
                String streetAddress = "";
                String city = "";
                String state = "";
                String zipcode = "";

                System.out.print("Width: ");
                if (!scan.hasNextInt()) {
                    scan.next();
                    System.out.println("Invalid width");
                    continue;
                }
                width = scan.nextInt();
                if (width < WIDTH_LOW_BOUND || width > WIDTH_TOP_BOUND) {
                    System.out.println("Invalid width");
                    continue;
                }

                System.out.print("Name: ");
                name = scan.nextLine();
                name = scan.nextLine();
                name = name.toUpperCase();
                if (name.length() > width - 2) {
                    System.out.println("Too long");
                    continue;
                }

                System.out.print("Street Address: ");
                streetAddress = scan.nextLine();
                if (streetAddress.length() > width - 2) {
                    System.out.println("Too long");
                    continue;
                }

                System.out.print("City: ");
                city = scan.nextLine();
                System.out.print("State: ");
                state = scan.nextLine();
                state = state.toUpperCase();
                System.out.print("Zipcode: ");
                zipcode = scan.next();

                if ((city + state + zipcode).length() > width - ADDRESS_WIDTH_MINUS) {
                    System.out.println("Too long");
                    continue;
                }

                String addressLine = city + ", " + state + " " + zipcode;

                System.out.println(top(width));
                System.out.println(center(width, name));
                System.out.println(center(width, streetAddress));
                System.out.println(center(width, addressLine));
                System.out.println(bottom(width));

            }

            else if (selectOption.equals("t")) {
                String org = "";
                String eventName = "";
                String dateAndTime = "";
                String location = "";

                System.out.print("Width: ");
                if (!scan.hasNextInt()) {
                    scan.next();
                    System.out.println("Invalid width");
                    continue;
                }
                width = scan.nextInt();
                if (width < WIDTH_LOW_BOUND || width > WIDTH_TOP_BOUND) {
                    System.out.println("Invalid width");
                    continue;
                }

                System.out.print("Organization: ");
                org = scan.nextLine();
                org = scan.nextLine();
                if (org.length() > width - 2) {
                    System.out.println("Too long");
                    continue;
                }

                System.out.print("Event Name: ");
                eventName = scan.nextLine();
                eventName = eventName.toUpperCase();
                if (eventName.length() > width - 2) {
                    System.out.println("Too long");
                    continue;
                }

                System.out.print("Date/Time: ");
                dateAndTime = scan.nextLine();
                System.out.print("Location: ");
                location = scan.nextLine();
                if ((dateAndTime + location).length() > width - 2) {
                    System.out.println("Too long");
                    continue;
                }

                System.out.println(top(width));
                System.out.println(center(width, org));
                System.out.println(blankLine(width));
                System.out.println(center(width, eventName));
                System.out.println(blankLine(width));
                System.out.println(leftRightJustify(width, dateAndTime, location));
                System.out.println(bottom(width));

            }

            else if (selectOption.equals("q")) {
                exit = 1;
            }
        }

    }


    /**
     * Returns the top String of the label.
     *
     * @param width of the label.
     * @return top string that prints the top of the label.
     * @throws IllegalArgumentException (with message "Invalid width")
     *             if the width is less than 2.
     */
    public static String top(int width) {
        if (width < 2) {
            throw new IllegalArgumentException("Invalid width");
        }

        String top = " ";
        for (int i = 0; i < width - 2; i++) {
            top += "_";
        }
        top += "\n/";

        for (int i = 0; i < width - 2; i++) {
            top += " ";
        }
        top += "\\";

        return top;
    }



    /**
     * Returns the bottom String of the label.
     *
     * @param width of the label.
     * @return bottom string that prints the bottom of the label.
     * @throws IllegalArgumentException (with message "Invalid width")
     *             if the width is less than 2.
     */
    public static String bottom(int width) {
        if (width < 2) {
            throw new IllegalArgumentException("Invalid width");
        }
        String bottom = "\\";
        for (int i = 0; i < width - 2; i++) {
            bottom += "_";
        }
        bottom += "/";

        return bottom;
    }



    /**
     * Returns a blank line with vertical borders of the label.
     *
     * @param width of the label.
     * @return bars string that prints the border of the label.
     * @throws IllegalArgumentException (with message "Invalid width")
     *             if the width is less than 2.
     */
    public static String blankLine(int width) {
        if (width < 2) {
            throw new IllegalArgumentException("Invalid width");
        }
        String bars = "|";
        for (int i = 0; i < width - 2; i++) {
            bars += " ";
        }
        bars += "|";

        return bars;
    }



    /**
     * Returns a string that put texts in the center of the label.
     *
     * @param width width of the label.
     * @param item the string that will be centered.
     * @return testAtCenter string that prints the center of the label.
     * @throws IllegalArgumentException (with message "Invalid width")
     *             if the width is less than 2.
     * @throws IllegalArgumentException (with message "Too long")
     *             if the item length is more than width - 2.
     */
    public static String center(int width, String item) {
        if (width < 2) {
            throw new IllegalArgumentException("Invalid width");
        }
        if (item.length() > width - 2) {
            throw new IllegalArgumentException("Too long");
        }
        String testAtCenter = "|";
        if ((width - 2 - item.length()) % 2 != 0) {
            testAtCenter += " ";
        }
        for (int i = 0; i < (width - 2 - item.length()) / 2; i++) {
            testAtCenter += " ";
        }
        testAtCenter += item;
        for (int i = 0; i < (width - 2 - item.length()) / 2; i++) {
            testAtCenter += " ";
        }
        testAtCenter += "|";

        return testAtCenter;
    }



    /**
     * Returns a string that put texts to the left and right of the label.
     *
     * @param width width of the label.
     * @param leftItem the string that will be put to the left.
     * @param rightItem the string that will be put to the right.
     * @return leftRight string that prints the left and right of the label.
     * @throws IllegalArgumentException (with message "Invalid width")
     *             if the width is less than 2.
     * @throws IllegalArgumentException (with message "Too long")
     *             if the length of leftItem plus rightItem is more than width - 2.
     */
    public static String leftRightJustify(int width, String leftItem, String rightItem) {
        if (width < 2) {
            throw new IllegalArgumentException("Invalid width");
        }
        if ((leftItem + rightItem).length() > width - 2) {
            throw new IllegalArgumentException("Too long");
        }
        String leftRight = "|" + leftItem;
        for (int i = 0; i < (width - 2 - leftItem.length() - rightItem.length()); i++) {
            leftRight += " ";
        }
        leftRight += rightItem + "|";
        return leftRight;
    }



}
