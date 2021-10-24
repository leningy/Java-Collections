    /**
     * Returns string with spaces collapsed
     *
     * @param line input string to collapse spaces
     * @return string with spaces collapsed
     */
    public static String collapseLine(String line) {
        String s = "";
        int i;

        for (i = 0; i < line.length(); i++) {
            if (/*i == 0 || */ i == line.length() - 1) {
                if (!Character.isWhitespace(line.charAt(i))) {
                    s += line.charAt(i);
                }
                else { // works for head spaces but produces two spaces after the first word. Couldn't elimintate tab.
                    if (i == 0) {
                        while (Character.isWhitespace(line.charAt(i))) {
                            i++;
                            s += "";
                      }
                      i--;
                    }
                }
                continue;
            }
            /* if (i == 0) { //does not work and creates a lot of errors
                while (Character.isWhitespace(line.charAt(i))) {
                    i++;
                }
                continue;
            }*/
            if (!Character.isWhitespace(line.charAt(i))) {
                s += line.charAt(i);
            }
            else if (Character.isWhitespace(line.charAt(i)) && !Character.isWhitespace(line.charAt(i + 1))) {
                s += line.charAt(i);
            }
            if (s.length() > 1 && Character.isWhitespace(s.charAt(0))) {
            s = s.substring(1);
            }
        }
        return s;
    }
