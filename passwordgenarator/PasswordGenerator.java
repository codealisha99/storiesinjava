package passwordgenarator;


    

   import java.security.SecureRandom;
   import java.util.Scanner;
   
   public class PasswordGenerator {
   
       // Character pools
       private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
       private static final String DIGITS    = "0123456789";
       private static final String SPECIAL   = "!@#$%^&*()-_=+[]{}|;:,.<>?";
   
       private static final SecureRandom random = new SecureRandom();
   
     
       public static String generatePassword(int length, boolean useUpper,
                                             boolean useLower, boolean useDigits,
                                             boolean useSpecial) {
         
           StringBuilder charset = new StringBuilder();
           if (useUpper)   charset.append(UPPERCASE);
           if (useLower)   charset.append(LOWERCASE);
           if (useDigits)  charset.append(DIGITS);
           if (useSpecial) charset.append(SPECIAL);
   
           if (charset.isEmpty())
               throw new IllegalArgumentException("Select at least one character type.");
   
           StringBuilder password = new StringBuilder();
   
          
           if (useUpper)   password.append(UPPERCASE.charAt(random.nextInt(UPPERCASE.length())));
           if (useLower)   password.append(LOWERCASE.charAt(random.nextInt(LOWERCASE.length())));
           if (useDigits)  password.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
           if (useSpecial) password.append(SPECIAL.charAt(random.nextInt(SPECIAL.length())));
   
           // Step 2: Fill remaining length randomly
           for (int i = password.length(); i < length; i++)
               password.append(charset.charAt(random.nextInt(charset.length())));
   
           // Step 3: Shuffle using Fisher-Yates algorithm
           char[] pwArray = password.toString().toCharArray();
           for (int i = pwArray.length - 1; i > 0; i--) {
               int j = random.nextInt(i + 1);
               char temp = pwArray[i];
               pwArray[i] = pwArray[j];
               pwArray[j] = temp;
           }
   
           return new String(pwArray);
       }
   
       // ─── Password Strength Checker ────────────────────────────────────
       public static String checkStrength(String password) {
           boolean hasUpper   = password.chars().anyMatch(Character::isUpperCase);
           boolean hasLower   = password.chars().anyMatch(Character::isLowerCase);
           boolean hasDigit   = password.chars().anyMatch(Character::isDigit);
           boolean hasSpecial = password.chars().anyMatch(c -> SPECIAL.indexOf(c) >= 0);
           int length         = password.length();
   
           int score = 0;
           if (hasUpper)         score++;
           if (hasLower)         score++;
           if (hasDigit)         score++;
           if (hasSpecial)       score++;
           if (length >= 12)     score++;
           if (length >= 16)     score++;
   
           if (score <= 2) return "Weak";
           if (score <= 4) return "Moderate";
           return "Strong";
       }
   
       // ─── Display Result ───────────────────────────────────────────────
       public static void printPassword(String password) {
           System.out.println("\n╔══════════════════════════════════╗");
           System.out.printf( "║  Password : %-22s║%n", password);
           System.out.printf( "║  Strength : %-22s║%n", checkStrength(password));
           System.out.printf( "║  Length   : %-22s║%n", password.length());
           System.out.println("╚══════════════════════════════════╝");
       }
   
       // ─── Interactive CLI ──────────────────────────────────────────────
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
   
           System.out.println("╔══════════════════════════════════╗");
           System.out.println("║      Java Password Generator     ║");
           System.out.println("╚══════════════════════════════════╝");
   
           while (true) {
               // Get password length
               int length = 0;
               while (length < 4) {
                   System.out.print("\nEnter password length (min 4): ");
                   try {
                       length = Integer.parseInt(scanner.nextLine().trim());
                       if (length < 4) System.out.println("  ✗ Length must be at least 4.");
                   } catch (NumberFormatException e) {
                       System.out.println("  ✗ Please enter a valid number.");
                   }
               }
   
               // Get character type preferences
               System.out.print("Include UPPERCASE letters? (y/n): ");
               boolean useUpper = scanner.nextLine().trim().equalsIgnoreCase("y");
   
               System.out.print("Include lowercase letters? (y/n): ");
               boolean useLower = scanner.nextLine().trim().equalsIgnoreCase("y");
   
               System.out.print("Include DIGITS (0-9)?        (y/n): ");
               boolean useDigits = scanner.nextLine().trim().equalsIgnoreCase("y");
   
               System.out.print("Include SPECIAL characters?  (y/n): ");
               boolean useSpecial = scanner.nextLine().trim().equalsIgnoreCase("y");
   
               // Validate at least one type is selected
               if (!useUpper && !useLower && !useDigits && !useSpecial) {
                   System.out.println("  ✗ You must select at least one character type. Try again.");
                   continue;
               }
   
               // How many passwords to generate
               int count = 1;
               System.out.print("How many passwords to generate? (default 1): ");
               String countInput = scanner.nextLine().trim();
               if (!countInput.isEmpty()) {
                   try { count = Math.max(1, Integer.parseInt(countInput)); }
                   catch (NumberFormatException e) { count = 1; }
               }
   
               // Generate and display
               System.out.println("\nGenerating " + count + " password(s)...");
               for (int i = 0; i < count; i++)
                   printPassword(generatePassword(length, useUpper, useLower, useDigits, useSpecial));
   
               // Ask to generate again
               System.out.print("\nGenerate another? (y/n): ");
               if (!scanner.nextLine().trim().equalsIgnoreCase("y")) break;
           }
   
           System.out.println("\nGoodbye! Stay secure. 🔐");
           scanner.close();
       }
   }

