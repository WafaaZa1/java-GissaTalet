import java.io.*;

public class GissaTalet
{
    private static int slumptal(int max)
    {
        return (int)(Math.random() * max);
    }

    private static int läsSvar()
    {
        byte[] tal = new byte[30];
        try { System.in.read(tal); } catch (IOException e) { }
        return Integer.parseInt(new String(tal).trim());
    }

    public static void main(String[] args)
    {
        int gissning;

        /**
         * Be datorn tänka på ett tal mellan noll och 100.
         * Siffran 100 nedan kan du ändra om du vill ha en annan övre gräns.
         */
        int tal = slumptal( 100 );

        /**
         * Ge lite startvärden för att det ska bli bra.
         * Prova att ändra antal och se vad som händer.
         */
        int antal = 0;

        do {
            System.out.print("Gissa ett tal: ");
            gissning = läsSvar();
            antal++; // Räkna upp antalet gissningar ett steg

            // Om gissningen är större än talet.
            if (gissning > tal) {
                System.out.println("För högt!");
            }

            // Om gissningen är mindre än talet.
            else if (gissning < tal) {
                System.out.println("För lågt!");
            }

            // Om gissningen är större eller mindre då måste den vara rätt.
            else {
                System.out.println("Du van!!");
            }

            // Fortsätt tills spelaren gissar rätt.
        } while (gissning != tal);

        System.out.println("Du behövde " + antal + " gissningar.");
    }
}