package Day1_ProgrammingElements;

public class answer2 {
    public static void main(String[] args) {
        double radiusKm = 6378.0;
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMi3 = volumeKm3 * 0.239913;
        System.out.printf("Volume of the Earth in cubic kilometers: %.2f km³\n", volumeKm3);
    }

}
