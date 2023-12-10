package Lectione.Lection22.RailWay;

import java.util.Arrays;

public class Platforms {

    public static void main(String[] args) {
        Platforms platforms = new Platforms();
        int[] arrival = {100, 140, 150, 200, 215,400};
        int[] departue = {110, 300, 220, 230, 315, 600};

        
        System.out.println(platforms.findNumberPlatforms(arrival, departue));
    }

    /*
    Написать метод , находящий минимальное количество платформ, необходимых для пр
    иема поездов
    на станции в каждый момент времени. Известно время прибытия и отправления поездов ( расписание)
 
     int[] arrival = {100, 140, 150, 200};
     int[] departue = {110, 300, 220, 230, 315, 600};

     Алгоритм решения:
    1. Сортируем массивы прибытие и отправление
    2. Сравниваем в цикле текущие элементы массивов и выбираем меньший.
        Если элемент выбран из массива  прибытия - увеличиваем количество платформ.
        Если из отправления - уменьшаем
    3. Необходимо записывать текущее количество платформ в специально созданной для этого переменной.
    4. В конце возвращаем максимальное значение полученное для количества платформ.
    */

    public int findNumberPlatforms( int arr[], int dep[]){
        Arrays.sort(arr);
        Arrays.sort(dep);
         int platformsCurrent = 0;
         int platformMax = 0;
         int i = 0;
         int j = 0;
         while (i < arr.length && j < dep.length) {
            
            if(arr[i] < dep[j]){
                platformsCurrent++;
                i++;
                    if(platformsCurrent > platformMax){
                        platformMax = platformsCurrent;
                }
            }else {
                platformsCurrent --;
                j++;
            }
        
         }
         return platformMax;
    }
    


    
}
