public class Lection14 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        int[] array2 = {1,2,3,4};

        System.out.println(compareArr(array1, array2) ? "true" : "felse");
        calcArr();

        String[] strings = {
            "Hello World",
            "Hallo Java",
            "hello John",
            "John",
            "That's it!",
            "Hello World",
            "Tomy"
        };
        printStringWith(strings, 4);
    }

    public static boolean compareArr(int[] array1, int[] array2){
        if(array1.length!=array2.length){
            return false;
        }
        for(int i = 0; i<array1.length; i++){
            if(array1[i] != array2[i]){
                return false;
            }
        }
        return true;
    }

    public static void calcArr(){
        int[] array3 = {1,0,4,6,2,7,3};
        int counter = 0;
        for(int elment : array3){
            if(elment%2==0){
                counter++; 
            }
        }
        System.out.println(counter);
    }

    public static void printStringWith(String[] strings, int length){
        boolean flag = false;
        for(String str : strings){
            if(str.length() == length){
                System.out.println(str);
                flag=true;
            }
        }
        if(!flag){
            System.out.println("gibts nichts");
        }
    }
}
