package org.example.lesson_12;

import java.util.*;

/**
 * Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах),
 * его цвет (красный, желтый, зеленый тд) и материал (деревянный, металлический, картонный и тд.). Найти:
 * - количество кубиков желтого цвета и их суммарный объем;
 * - количество деревянных кубиков с ребром 3 см
 */

public class main {
    public static void main(String[] args) {

        List<Cube> cubeList = new ArrayList<>(Arrays.asList(
                new Cube(3, "синий", "деревянный"),
                new Cube(3, "зеленый", "металлический"),
                new Cube(3, "желтый", "картонный"),
                new Cube(3, "желтый", "картонный"),
                new Cube(3, "красный", "силиконовый")
        ));
        int countColor = 0;
        int countMaterial = 0;
        int sumVol = 0;
        for (int i = 0; i < cubeList.size(); i++) {

            if (cubeList.get(i).getColor().equals("желтый")) {
                countColor++;
                sumVol += cubeList.get(i).getVolume();

            }
            if (cubeList.get(i).getMaterial().equals("деревянный") && cubeList.get(i).getLenght() == 3) {
                countMaterial++;
            }


        }
        System.out.println("count = " + countColor);
        System.out.println("sumVol = " + sumVol);
        System.out.println("countMaterial = " + countMaterial);
        String unicumCollection = null;
        System.out.println("unicumCollection =" + unicumCollection(cubeList));
    }
        private static Collection unicumCollection(List<Cube> cubeList){
            return new HashSet(cubeList);


    }

}