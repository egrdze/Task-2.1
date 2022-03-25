package cs.vsu.ru.lyashenko_e_v;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        double ax = input.nextDouble();
        double ay = input.nextDouble();
        double az = input.nextDouble();
        double bx = input.nextDouble();
        double by = input.nextDouble();
        double bz = input.nextDouble();
        Vector3D vectorA = new Vector3D(ax,ay,az);
        Vector3D vectorB = new Vector3D(bx,by,bz);
        System.out.format("A vector's axis is %s.\n", vectorA);
        System.out.format("B vector's axis is %s.\n", vectorB);
        System.out.format("A vector's length is %s.\n", vectorA.getModule());
        System.out.format("B vector's length is %s.\n", vectorB.getModule());
        System.out.format("The sum of these vectors is %s.\n", vectorA.getAddition(vectorB));
        System.out.format("The subtraction of these vectors is %s.\n", vectorA.getSubtraction(vectorB));
        System.out.format("The scalar product of these vectors is %s.\n", vectorA.getScalar(vectorB));
        System.out.format("The vector product of these vectors is %s.\n", vectorA.getVector(vectorB));
    }
}

