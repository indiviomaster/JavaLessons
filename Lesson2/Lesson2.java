public class Lesson2 {

    public static int sumElemMass(int [] mx, int firstElem, int lastElem)
    {   int summa =0;
        for (int i = firstElem; i<lastElem; i++) summa += mx[i];
        return summa;
    }
    public static boolean findEdge(int mass[]){
        for (int i = 1; i<mass.length-1; i++){
            if (sumElemMass(mass,0, i+1) == sumElemMass(mass,i+1,mass.length)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;

        int firstMass [] = new int [] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Инвертируем");
        for (int i = 0; i<firstMass.length; i++)  System.out.print(firstMass[i]  + " ");
        System.out.println();
        for (int i = 0; i<firstMass.length; i++){
            if(firstMass[i] == 1){
                firstMass[i] = 0;
            } else{
                firstMass[i] = 1;
            }
        }
        for (int i = 0; i<firstMass.length; i++)  System.out.print(firstMass[i] + " ");
        System.out.println();

        //2. Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        int secondMass [] = new int [8];
        System.out.println("Заполняем масив через 3");
        for (int i = 0; i<secondMass.length; i++) System.out.print(secondMass[i]  + " ");
        System.out.println();
        int j = 0;
        for (int i = 0; i<secondMass.length; i++){
            secondMass[i] = j;
            j+=3;
        }
        System.out.println("Заполняем масив через 3");
        for (int i = 0; i<secondMass.length; i++) System.out.print(secondMass[i]  + " ");
        System.out.println();

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему
        // циклом, и числа меньшие 6 умножить на 2;

        System.out.println("Меньше 6 х2");
        int thirdMass [] = new int [] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i<thirdMass.length; i++) System.out.printf("%3d", thirdMass[i]);
        System.out.println();
        for (int i = 0; i<thirdMass.length; i++){
            if(thirdMass[i]<6) thirdMass[i] *= 2;
        }
        for (int i = 0; i<thirdMass.length; i++) System.out.printf("%3d", thirdMass[i]);
        System.out.println();

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        int diagonalMass [][] = new int[10][10] ;
        System.out.println("Диагонали");

        for (int i = 0; i<diagonalMass.length; i++) {
            for (int k = 0; k < diagonalMass.length; k++) {
                if (k == i) {
                    diagonalMass[i][k] = 1;
                } else if (k == (diagonalMass.length - i - 1)){
                    diagonalMass[i][k] = 1;
                } else {
                    diagonalMass[i][k] = 0;
                }
            }
        }

        for (int i = 0; i<diagonalMass.length; i++){
            for (int k = 0; k<diagonalMass.length; k++) {
                System.out.printf("%3d", diagonalMass[i][k]);
            }
            System.out.println();
        }

        //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        System.out.println("min max");
        int minMaxMass[] = new int [] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int minMass = minMaxMass[0];
        int maxMass = minMaxMass[0];
        for (int i = 0; i<minMaxMass.length; i++) System.out.printf("%4d",minMaxMass[i]);
        System.out.println();
        for (int i = 1; i<minMaxMass.length; i++){
            if (minMaxMass[i]<minMass) minMass = minMaxMass[i];
            if (minMaxMass[i]>maxMass) maxMass = minMaxMass[i];
        }
        System.out.println("min = "+minMass+" max = "+ maxMass);


        //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница
        // показана символами ||, эти символы в массив не входят.


        int sixMass[] = new int [] {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(findEdge(sixMass));

        //7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
        // или отрицательным), при этом метод должен сместить все элементымассива на n позиций.
        // Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        int sevenMass [] = new int [] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int count = 2;
        int eightMass [];
        //eightMass = shiftMass(sevenMass, count);
    }

    //private static int [] shiftMass(int[] sevenMass, int count) {    }
}
