public static Scanner getInput(Scanner console) { // scanner supposedly created in main
        Scanner result = null; // null signifies NO object reference
        while (result == null) {
            System.out.print("input file name? ");
            String name = console.next();
            try {
                result = new Scanner(new FileInputStream(name));
            } catch (FileNotFoundException e) {
                System.out.println("File not found. Please try again.");
            }
        }
        return result;
    }
