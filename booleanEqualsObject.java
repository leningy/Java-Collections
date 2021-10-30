/** Condition of the method - being inside the RationalNumber class which has 
 * 1. private variable numerator, denominator
 * 2. getNumerator() & getDenominator() to access the private variables
 */

public boolean equals(Object other) {
        if (other instanceof RationalNumber) {
            RationalNumber r = (RationalNumber) other;
            return numerator == r.getNumerator() && denominator == r.getDenominator();
        } // to pass strings: numerator.equals(r.getNumerator);
        return false;
    }
