public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.out.println("Usage: java -cp bin ProcessFile input_filename");
            System.exit(1);
        }

        if (args.length == 1) {
            System.out.println(processFile(args[0]));
        }
    }

