//Zakwan Berlin
// Purpose: To convert lengths from meters to miles, feet, and inches

public class LengthConverter {
    /** Convert from feet to meters */
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    /** Convert from meters to feet */
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        System.out.println("Feet to Meters Conversion:");
        System.out.println("| Feet | Meters |");
        System.out.println("|------|--------|");

        for (int i = 1; i <= 10; i++) {
            double feet = i;
            double meters = footToMeter(feet);
            System.out.printf("| %4.1f | %6.2f |\n", feet, meters);
        }

        System.out.println("\nMeters to Feet Conversion:");
        System.out.println("| Meters |  Feet  |");
        System.out.println("|--------|--------|");

        for (int i = 1; i <= 10; i++) {
            double meters = i;
            double feet = meterToFoot(meters);
            System.out.printf("| %6.2f | %6.2f |\n", meters, feet);
        }
    }
}
