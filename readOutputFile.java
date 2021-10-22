public static PrintWriter getOutput(Scanner console) {
        PrintWriter result = null;

        while (result == null) {
            System.out.print("output file name? ");
            String name = console.next();
            Path path = Path.of(name);
            try {
                if (!Files.exists(path)) {
                    result = new PrintWriter(new FileOutputStream(name));
                }
                else {
                    System.out.print("Output file already exists!");
                    return null;
                }
            }
            catch (FileNotFoundException e) {
                System.out.println("File not found. Please try again.");
            }
        }
        return result;
    }
