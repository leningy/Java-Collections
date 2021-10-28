/** 
 * Use Elucid's algorithm to reduce fractions to simplest form.
 * If there's negative sign in either denominator or numerator, move it to the numerator.
 */

private void reduce() { // TODO: didn't filp the sign of numer and denom.
        int temp = 0;
        int gcd = 0;
        int storeNumer = numerator;
        int storeDenom = denominator;
  
        while (denominator != 0) {
            temp = numerator;
            numerator = denominator;
            denominator = temp % numerator;
        }
  
        gcd = numerator;
        numerator = storeNumer / gcd;
        denominator = storeDenom / gcd;
    }
