package passwordgenarator;

public class sheet {
    

    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS    = "0123456789";
    private static final String SPECIAL   = "!@#$%^&*()-_=+[]{}|;:,.<>?";

    StringBuilder charset = new StringBuilder();
if (useUpper)   charset.append(UPPERCASE);
if (useLower)   charset.append(LOWERCASE);
if (useDigits)  charset.append(DIGITS);
if (useSpecial) charset.append(SPECIAL);
}
