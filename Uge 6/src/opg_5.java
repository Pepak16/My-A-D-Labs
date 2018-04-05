import java.util.ArrayList;

public class opg_5 {

    /**
     *  Opgave 5:
     *
     *  Lav en algoritme som tæller antal kredse i en permutation.
     *  Hvad er køretiden for din algoritme som funktion af n?
     *  Implementer din algoritme i Java. Kør dit program mange gange p̊a en tilfældig permutation
     *  (se opgaven ovenfor) og gem output fra alle kørsler.
     *
     *  Brug data fra disse eksperimenter til at give et bud p̊a sandsynligheden for
     *  at der i en tilfældig permutation med n = 12 er k kredse, for k = 1,2,...,12.
     *  Dvs. lav din egen version af figur 3 i noterne, men med n lig 12 og ikke 64.
     */


        private static int cycles = 0;
        public static final int SIZE = 10;
        static boolean[] checked = new boolean[SIZE];

        //Så egentlig går opgaven meget kort ud på at lave en metode, der udfører

        public static void main(String[] args){
            opg_4 opg4 = new opg_4();
            ArrayList<Integer> arr = opg4.getRandomizedList(SIZE);
            checkCycle(arr);

        }

        public static void checkCycle(ArrayList<Integer> arr) {

            // Her sætter for-loopet alle elementerne i boolean-arrayet til at være false
            for (int i =0;i<SIZE;i++) {
                checked[i] = false;
            }

            // Vi itererer igennem alle elementerne i boolean-arrayet
            for (int i =0;i<SIZE;i++) {
                // Vi tjekker om det nuværende element i iterationen er sat til at være false
                // og hvis det er tilfældet, udføres følgende
                if(checked[i]==false){
                    int num = i;
                    int numInArr = arr.get(i);

                    if(numInArr==num) {
                        System.out.println(num);
                        checked[num]=true;
                        cycles++;
                        continue;
                    }

                    do {
                        int temp = arr.get(numInArr);
                        checked[numInArr] = true;
                        System.out.print(numInArr + " - ");
                        numInArr = temp;
                    } while (numInArr!=num);

                    cycles++;
                    System.out.println(numInArr);
                }
            }

            System.out.println("\n\nNumbers of cycles is: " + cycles);

        }
    }


