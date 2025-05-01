import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);

        int numerosCorrespondentes = 0;
        int[] vetorA = {1,2,3,4,5,6};
        int[] vetorB = {9,9,9,9,6,9};


        System.out.print("Vetor A: ");
        for(int i=0;i<6;i++){
            System.out.print(vetorA[i]);
        }
        System.out.println("");


        System.out.print("Vetor B: ");
        for(int i=0;i<6;i++){
            System.out.print(vetorB[i]);
        }
        System.out.println("");


        int[] vetorC = new int[6];

        for (int i=0; i< vetorA.length; i++) {
            for (int j = 0; j < vetorB.length; j++) {
                if (vetorA[i] == vetorB[j]) {
                    vetorC[i] = vetorA[i];
                    break;
                }
            }
        }

        System.out.print("Vetor C: ");
        for(int i=0;i<vetorC.length;i++){
            System.out.print(vetorC[i]);
        }

    }
}